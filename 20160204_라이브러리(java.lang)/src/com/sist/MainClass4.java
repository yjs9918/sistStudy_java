package com.sist;
//StringTokenizer : ���ڿ��� ���� (�ܾ��)
/*
 *   hasMoreTokens() : �� �ܾ� ����
 *   nextToken() : �ڸ� �ܾ� ������
 */
import java.util.*;
public class MainClass4 {
	public static void main(String[] args) {
		String data="red|black|green|cyan|yellow|pink";
		StringTokenizer st= new StringTokenizer(data, "|");
		
		/*String[] datas=data.split("|"); //regex:���Խ� => "|"�� ���ؾ��Ѵ�
		for(int i=0;i<datas.length;i++)
		{
			System.out.println(datas[i]);
		} // �ѱ��ھ� �ڸ�*/
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
