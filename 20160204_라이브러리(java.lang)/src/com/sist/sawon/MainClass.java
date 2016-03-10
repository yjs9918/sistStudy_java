package com.sist.sawon;
import java.util.*;
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			FileReader in= new FileReader("c:\\image\\sawon.csv");//���Ͽ��� ���� �о��
			String data="";
			int i=0;
			//EOF => -1 ������ ��
			while((i=in.read())!=-1) //�ѱ��ھ� ����(2byte) fileInputStream:1byte�� �����Ƿ� �ѱ��� ����
			{
				data+=String.valueOf((char)i);
			}
			in.close();
			System.out.println(data);
			String[] datas=data.split("\n");
			Sawon[] sawon=new Sawon[datas.length];
			for(i=0;i<datas.length;i++)
			{
				sawon[i]=new Sawon();
				StringTokenizer st=new StringTokenizer(datas[i],",");
				sawon[i].setSabun(Integer.parseInt(st.nextToken()));
				sawon[i].setName(st.nextToken());
				sawon[i].setDept(st.nextToken());
				sawon[i].setJob(st.nextToken());
				sawon[i].setHiredate(st.nextToken());
				sawon[i].setPay(Integer.parseInt(st.nextToken().trim()));
			}
			//���
			for(i=0;i<sawon.length;i++)
			{
				System.out.println("���:"+sawon[i].getSabun());
				System.out.println("�̸�:"+sawon[i].getName());
				System.out.println("�μ�:"+sawon[i].getDept());
				System.out.println("����:"+sawon[i].getJob());
				System.out.println("�Ի���:"+sawon[i].getHiredate());
				System.out.println("����:"+sawon[i].getPay());
				System.out.println("============================");
			}
		} catch (Exception ex) {}
	}

}
