package com.sist;
/*
 *   java.land => import�� ����
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
 *        join(), wait()...(<=��״� �� ������)
 *        
 *     java.util
 *       Date,Calendar,StringTokenizer,Collection
 */
// StringBuffer : ���ڿ� ����
import java.util.*;
import java.net.*;//
import java.io.*;//����ó��
// ==> JSoup
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			URL url=new URL("http://www.daum.net");
			//����
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null)
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
				StringBuffer sb=new StringBuffer();
				while(true)
				{
					String data=in.readLine();//���پ� �о��
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














