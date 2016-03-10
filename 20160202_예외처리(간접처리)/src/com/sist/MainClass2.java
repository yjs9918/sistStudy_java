package com.sist;
import java.net.*;
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url=new URL("http://www.daum.net");
		HttpURLConnection conn=(HttpURLConnection)url.openConnection(); //연결
		if(conn!=null)
		{
			//System.out.println("다음 서버에 접속 완료");
			BufferedReader br= new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			//UTF-8:유니코드 불러옴
			//BufferedReader : 저장된 데이터 읽어들임
			while(true)
			{
				String data=br.readLine();
				if(data==null)
					break;
				System.out.println(data);
			} //daum 인덱스 페이지의 html을 다 긁어 불러옴
		}
	}

}
