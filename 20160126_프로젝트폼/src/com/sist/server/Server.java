package com.sist.server;
import java.net.*;
import java.io.*;
public class Server implements Runnable{ //Runnable : ������
	ServerSocket ss; //������ ����
	OutputStream out;
	public Server()
	{
		try
		{
			ss=new ServerSocket(5555);
			// => socket : ��ȭ�� (��ȭ��(port), ��ȭ��ȣ(ip))
			// ��Ʈ��ȣ 0~65535 (0~1024������ �̹� �����(oracle:1521))
			// ���� : bind(ip,port)
			// ��� : listen()
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
				Socket s=ss.accept(); //������ ����(client ����-ip��ȣ,port��ȣ)
				System.out.println("Client IP:"+s.getInetAddress().getHostAddress());
				//������ ����� ip��ȣ ����� �� 4�ڸ��� ��¿�û
				System.out.println("Client PORT:"+s.getPort());
				OutputStream out=s.getOutputStream(); //s:client //client�� ���� �����ְڴ�
				out.write((s.getInetAddress().getHostAddress()+"�� ������ ȯ���մϴ�").getBytes());
				//getBytes() : ���ڿ��� byte�� ��ȯ (%ED%34...�̷������� ǥ��=>���ڵ�) ���� �������� UTF-8�� �޴´�.(�����ڵ�) => ���ڵ�
				//input output ���� �ֵ��� 1byte�� ������. reader,write �����ֵ��� 2byte�� ������
			}
		}catch(Exception ex){}
	}
	

}
