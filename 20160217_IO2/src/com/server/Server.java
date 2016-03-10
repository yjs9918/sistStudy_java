package com.server;
import java.util.*;// 저장 공간 (Vector)
import java.io.*;// BufferedReader , OutputStream
import java.net.*;// Socket , ServerSocket
/*
 *     Server : 접속시 처리
 *     ====================
 *     
 *     Client => Thread : client마다 통신
 *     ====================
 *     
 *     => Socket
 *        ======
 *        통신 장비(장비 셋팅)  => IP,PORT
 *        전화기 ==> 개통(유심-전화번호:IP,전화선:PORT)
 *        
 *        1) 교환 담당  : ServerSocket
 *        2) 통신 담당  : 상대방과 통신(Socket)
 *        
 *        => 서버 만드는 방법
 *        1) 서버 가동
 *           ServerSocket ss= new ServerSocket(PORT번호);
 *           1. bind() : 개통 (Socket안에 IP,PORT 넣어줌)
 *           2. listen() : 접속시까지 대기    // ServerSocket은 위 두가지를 포함하고 있다
 *           PORT => 0~65535 
 *                   =======
 *                   이미 사용중인 포트(0~1023)
 *                   80 : http
 *                   23 : telnet
 *                   21 : ftp
 *                   25 : smtp
 *                   1521 : oracle
 *                   4000 : 머드서버
 *                   8080 : 프록시서버
 *                   20000번대 : 음성채팅에서 우수 (짝수만 가능)
 *                   30000번대 : 화상채팅에서 우수 (짝수만 가능)
 *        2) 접속처리 :
 *             ss.accept() => 발신자 정보(Socket)
 *             Socket s=ss.accept()
 *             s => 접속한 클라이언트(IP,PORT)
 *             => s를 메모리에 저장
 *        3) 접속이 되었다면 => 통신이 가능하게 만든다
 *           (Thread)  ==> JSP, JDBC(오라클)
 *        
 *        
 *  ***서버는 한번만 실행되야 하므로 new로 객체를 생성하는것보다 
 *     static을 이용하거나 내부클래스를 이용한다
 */
// 접속을 받을 경우
public class Server implements Runnable{
	Vector<Client> waitVc=new Vector<Client>();
	//통신 준비
	ServerSocket ss;
	final int PORT=7777;
	public Server()
	{
		//소켓 생성  => ip, port를 첨부 => 전화기 개통
		//bind() => listen()
		try {
			ss=new ServerSocket(PORT); 
			//default :50명까지만 접근 가능    / 더 많은 인원을 받기 위해서는 (PORT,원하는인원)으로 사용
			// 인터넷(X), 인트라넷(사내메신저)
			System.out.println("Server Start...");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	//접속시 처리
	public void run()
	{
		while(true)
		{
			try
			{
				Socket s=ss.accept();//발신자 정보
				// s => client의 정보 (ip,port)
				Client client=new Client(s);
				client.start();
				// 저장
				waitVc.addElement(client);
			}catch(Exception ex){}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}
	//통신 프로그램
	class Client extends Thread
	{
		Socket s;
		// 통신 준비
		// 요청
		BufferedReader in;
		// 결과 응답
		OutputStream out;
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//읽어오는 위치 잡음
				out=s.getOutputStream();
			}catch(Exception ex){}
		}
		//통신 시작
		public void run()
		{
			while(true)
			{
				try
				{
					//요청값 읽기
					String msg=in.readLine();
					for(Client client:waitVc)
					{
						client.out.write((msg+"\n").getBytes()); //채팅창
					}
				}catch(Exception ex){}
			}
		}
	}

}











