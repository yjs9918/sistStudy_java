package com.sist;
import java.net.*;
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		try
		{
			URL url=new URL("http://www.daum.net");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null)
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
				StringBuffer sb=new StringBuffer(); // �ӽ����� �� �ѹ��� ��������
				while(true)
				{
					String str=in.readLine(); //���پ� �б�
					sb.append(str+"\n"); //append : ����
					if(str==null)
						break;
				}
				System.out.println(sb.toString());
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
