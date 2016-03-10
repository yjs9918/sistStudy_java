package com.sist.server;
import java.net.*;
import java.io.*;
public class Server implements Runnable{ //Runnable : 쓰레드
	ServerSocket ss; //접속을 받음
	OutputStream out;
	public Server()
	{
		try
		{
			ss=new ServerSocket(5555);
			// => socket : 전화기 (전화선(port), 전화번호(ip))
			// 포트번호 0~65535 (0~1024까지는 이미 사용중(oracle:1521))
			// 개통 : bind(ip,port)
			// 대기 : listen()
			System.out.println("Server Start...");
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				Socket s=ss.accept(); //접속자 정보(client 정보-ip번호,port번호)
				System.out.println("Client IP:"+s.getInetAddress().getHostAddress());
				//접속한 사람의 ip번호 출력할 때 4자리로 출력요청
				System.out.println("Client PORT:"+s.getPort());
				OutputStream out=s.getOutputStream(); //s:client //client의 값을 보내주겠다
				out.write((s.getInetAddress().getHostAddress()+"님 접속을 환영합니다").getBytes());
				//getBytes() : 문자열을 byte로 변환 (%ED%34...이런식으로 표현=>인코딩) 따라서 받을때는 UTF-8로 받는다.(유니코드) => 디코딩
				//input output 붙은 애들은 1byte로 데려옴. reader,write 붙은애들은 2byte로 데려옴
			}
		}catch(Exception ex){}
	}
	

}
