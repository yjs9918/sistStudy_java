package com.sist;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance(); //�޼ҵ带 ���� �޸� ���� : �߻�Ŭ���� or �������̽�
		//�̱��� ����
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH); // 0~11
		int day=cal.get(Calendar.DATE); 
		int week=cal.get(Calendar.DAY_OF_WEEK); //1~7	
		String[] strWeek={"��","��","ȭ","��","��","��","��"};
		System.out.println("�⵵:"+year);
		System.out.println("��:"+(month+1));
		System.out.println("��:"+day);
		System.out.println("����:"+strWeek[week-1]);
	}

}
