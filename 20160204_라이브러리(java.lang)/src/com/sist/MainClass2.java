package com.sist;
// Date: �ý����� �ð��� �о� �´� => ����� (�Խ���, ȸ������)
import java.util.*;
import java.text.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		
		// java.text.SimpleDateFormat sdf
		//                    =new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// import java.text ������� ������ �̷��� �����
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// ��¥ ���� ������
		/*
		 *  yyyy => �⵵ yy,yyy
		 *  MM ==> �� => 02 => M (08,09)8����ǥ�������� ������ : 01 ~ 07 
		 *      M
		 *  dd ==> ��
		 *      d
		 *  hh ==> �ð�
		 *  mm ==> ��
		 *  ss ==> ��
		 */
		System.out.println(sdf.format(date));
	}

}
