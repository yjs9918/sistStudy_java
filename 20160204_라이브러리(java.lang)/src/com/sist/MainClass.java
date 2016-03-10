package com.sist;
/*
 *   java.land => import를 생략
 *   Object, String, StringBuffer, Wrapper, Thread
 *   ======  ======  ============  =======  ======
 *   Object
 *     finalize()
 *     toString()
 *     equals()
 *     clone()
 *   String
 *     equals()
 *     substring(0
 *     index(),lastIndexOf()
 *     trim(), length()
 *     startsWith(), endsWith()
 *   StringBuffer
 *     append()
 *   Wrapper
 *     Integer,Double
 *     => Integer.parseInt()
 *     => Double.ParseDouble()
 *   Thread
 *     => start(), run(), interrupt()
 *        join(), wait()...(<=얘네는 잘 사용안함)
 *        
 *     java.util
 *       Date,Calendar,StringTokenizer,Collection
 */
// StringBuffer : 문자열 결합
import java.util.*;
import java.net.*;//
import java.io.*;//예외처리
// ==> JSoup
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			URL url=new URL("http://www.daum.net");
			//연결
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null)
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
				StringBuffer sb=new StringBuffer();
				while(true)
				{
					String data=in.readLine();//한줄씩 읽어옴
					if(data==null)
					{
						break;
					}
					else
					{
						sb.append(data+"\n");
					}
					FileWriter fw=new FileWriter("c:\\image\\daum.txt");
					fw.write(sb.toString());
					fw.close();
				}
			}
		} catch (Exception e) {}
	}

}














