package com.server;
import java.util.*;// ���� ���� (Vector)
import java.io.*;// BufferedReader , OutputStream
import java.net.*;// Socket , ServerSocket
/*
 *     Server : ���ӽ� ó��
 *     ====================
 *     
 *     Client => Thread : client���� ���
 *     ====================
 *     
 *     => Socket
 *        ======
 *        ��� ���(��� ����)  => IP,PORT
 *        ��ȭ�� ==> ����(����-��ȭ��ȣ:IP,��ȭ��:PORT)
 *        
 *        1) ��ȯ ���  : ServerSocket
 *        2) ��� ���  : ����� ���(Socket)
 *        
 *        => ���� ����� ���
 *        1) ���� ����
 *           ServerSocket ss= new ServerSocket(PORT��ȣ);
 *           1. bind() : ���� (Socket�ȿ� IP,PORT �־���)
 *           2. listen() : ���ӽñ��� ���    // ServerSocket�� �� �ΰ����� �����ϰ� �ִ�
 *           PORT => 0~65535 
 *                   =======
 *                   �̹� ������� ��Ʈ(0~1023)
 *                   80 : http
 *                   23 : telnet
 *                   21 : ftp
 *                   25 : smtp
 *                   1521 : oracle
 *                   4000 : �ӵ弭��
 *                   8080 : ���Ͻü���
 *                   20000���� : ����ä�ÿ��� ��� (¦���� ����)
 *                   30000���� : ȭ��ä�ÿ��� ��� (¦���� ����)
 *        2) ����ó�� :
 *             ss.accept() => �߽��� ����(Socket)
 *             Socket s=ss.accept()
 *             s => ������ Ŭ���̾�Ʈ(IP,PORT)
 *             => s�� �޸𸮿� ����
 *        3) ������ �Ǿ��ٸ� => ����� �����ϰ� �����
 *           (Thread)  ==> JSP, JDBC(����Ŭ)
 *        
 *        
 *  ***������ �ѹ��� ����Ǿ� �ϹǷ� new�� ��ü�� �����ϴ°ͺ��� 
 *     static�� �̿��ϰų� ����Ŭ������ �̿��Ѵ�
 */
// ������ ���� ���
public class Server implements Runnable{
	Vector<Client> waitVc=new Vector<Client>();
	//��� �غ�
	ServerSocket ss;
	final int PORT=7777;
	public Server()
	{
		//���� ����  => ip, port�� ÷�� => ��ȭ�� ����
		//bind() => listen()
		try {
			ss=new ServerSocket(PORT); 
			//default :50������� ���� ����    / �� ���� �ο��� �ޱ� ���ؼ��� (PORT,���ϴ��ο�)���� ���
			// ���ͳ�(X), ��Ʈ���(�系�޽���)
			System.out.println("Server Start...");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	//���ӽ� ó��
	public void run()
	{
		while(true)
		{
			try
			{
				Socket s=ss.accept();//�߽��� ����
				// s => client�� ���� (ip,port)
				Client client=new Client(s);
				client.start();
				// ����
				waitVc.addElement(client);
			}catch(Exception ex){}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}
	//��� ���α׷�
	class Client extends Thread
	{
		Socket s;
		// ��� �غ�
		// ��û
		BufferedReader in;
		// ��� ����
		OutputStream out;
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//�о���� ��ġ ����
				out=s.getOutputStream();
			}catch(Exception ex){}
		}
		//��� ����
		public void run()
		{
			while(true)
			{
				try
				{
					//��û�� �б�
					String msg=in.readLine();
					for(Client client:waitVc)
					{
						client.out.write((msg+"\n").getBytes()); //ä��â
					}
				}catch(Exception ex){}
			}
		}
	}

}











