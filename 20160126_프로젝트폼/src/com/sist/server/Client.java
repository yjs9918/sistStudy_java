package com.sist.server;
import java.net.*;
import java.io.*;
public class Client implements Runnable{
	BufferedReader in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Socket s=new Socket("211.238.142.76",5555); //s = 서버정보
			BufferedReader in= new BufferedReader (new InputStreamReader(s.getInputStream()));
			System.out.println(in.readLine());
		} catch (Exception ex) {}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				System.out.println();
			}
		}catch(Exception ex){}
	}

}
