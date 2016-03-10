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
				StringBuffer sb=new StringBuffer(); // 임시저장 후 한번에 데려오기
				while(true)
				{
					String str=in.readLine(); //한줄씩 읽기
					sb.append(str+"\n"); //append : 저장
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
