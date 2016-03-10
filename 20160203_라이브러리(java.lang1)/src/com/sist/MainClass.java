package com.sist;
/*
 *   Wrapper : �Ϲ� �������� (int,double..)
 *             ������ �� �ְ� Ŭ����ȭ�� ��Ų��
 *             int => Integer
 *             double => Double
 *             --
 *             --
 *             boolean => Boolean
 *             
 *             if("1") 1 ==> 42�� 4õ��...
 *       ==> Boxing, UnBoxing
 *       Integer i=10; ==> Boxing(Ŭ���� �ȿ� ������ ���� direct�� ����)
 *       Integer i=new Integer(10); //������ �̷��� �����
 *       
 *       int ii=i; ==> UnBoxing (�Ϲ� �����Ϳ� Ŭ�������� ����)
 *       
 *       
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in=100; //(�÷��ǿ��� ���)
		System.out.println("In:"+in);
		int i=in;
		Boolean b=true;
		System.out.println("i="+i);
		/*
		 * Integer => parseInt : ���ڿ��� ����
		 * Double => parseDouble : ���ڿ��� �Ǽ�
		 * 
		 * �ڹ� => ��(���ڰ���x) ������ ���ڿ�
		 * "1" => 1
		 * a.jsp ==> b.jsp
		 * b.jsp?page=1
		 */
	}

}
