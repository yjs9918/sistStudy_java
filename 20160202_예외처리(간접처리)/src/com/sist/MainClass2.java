package com.sist;
import java.net.*;
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url=new URL("http://www.daum.net");
		HttpURLConnection conn=(HttpURLConnection)url.openConnection(); //����
		if(conn!=null)
		{
			//System.out.println("���� ������ ���� �Ϸ�");
			BufferedReader br= new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			//UTF-8:�����ڵ� �ҷ���
			//BufferedReader : ����� ������ �о����
			while(true)
			{
				String data=br.readLine();
				if(data==null)
					break;
				System.out.println(data);
			} //daum �ε��� �������� html�� �� �ܾ� �ҷ���
		}
	}

}
