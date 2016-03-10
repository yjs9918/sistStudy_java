package com.sist;
/*
 *   Ŭ���� : ������ ���, ������ (��� �и�) => ĸ��ȭ
 *   ��� : ������ Ŭ������ Ȯ���ؼ� ����, �߰��� �����ϴ�
 *       ����)
 *           class A
 *           class B extends A
 *                   =======
 *                     ���
 *           A : ���� Ŭ����(���̽� Ŭ����,superŬ����,�θ�Ŭ����)
 *           B : ���� Ŭ����(�Ļ� Ŭ����,subŬ����,�ڽ�Ŭ����)
 *       1) ����� ������ ��� ���� Ŭ������ ��� ���� �޴´�
 *          ����) static(�������� ����� �� �ְ� �����)
 *               private (������ �� ����)
 *               ������
 *       2) ��ӹ��� ������ �����ؼ� ��� �� �� �ִ�(�������̵�)
 *       3) ����� �ް� �Ǹ� => �ڵ��� �� �ʿ䰡 ����(�ߺ�����)
 *       4) �߰��ؼ� ��� �� �� �ִ�
 *       5) ����� ������ ==> Ŭ������ ũ�⸦ ���� �� �ִ�
 *          instanceof
 *          ���� ==> boolean (true/false)
 *          String str
 *          StringBuffer sb
 *          Object obj
 *          
 *          if( str instanceof Object ) true //������ ���� �� ũ�ų� ���ƾ���
 *          if ( sb instanceof Object ) true
 *          if ( Object instanceof Sting ) false
 *          if ( sb instanceof String ) error (��Ӱ���x => ũ���x)
 *          ==> ��Ӱ� ������� Ŭ������ ũ�⸦ ����� �� ����
 *       6) ����
 *            = ��� : ����� �����ؼ� ��� (���� ���)
 *            = ���� : �ִ� �״�� ���
 *                   (�͸��� Ŭ����)
 *                   
 *       ***** �ڹ�����
 *          => �Ѱ��� ���� �ȿ� �������� Ŭ������ ���� ����
 *             1) public Ŭ������ �Ѱ��� ����� ����
 *             2) main �Ѱ��� ���
 *          => class A
 *             class B
 *             Public class C ==> C.java
 *             *** Ŭ������� �����̸� ����
 */
class A
{
	int a=10;
	int b=20;
	String str="Hello";
}
class B extends A
{
	/*
	 * int a=10;  ==> 30
	   int b=20;  ==> 50
	   String str="Hello";  ==> "Java"
	 */
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str=new String();
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		if(obj instanceof String)
		{
			
		}*/
		A a=new A();
		System.out.println("a.a:"+a.a);
		System.out.println("a.b:"+a.b);
		System.out.println("a.str:"+a.str);
		
		B b=new B();
		System.out.println("b.a:"+b.a);
		System.out.println("b.b:"+b.b);
		System.out.println("b.str:"+b.str);
		
		b.a=30;
		b.b=50;
		b.str="Java";
		
		System.out.println("������");
		System.out.println("a.a:"+a.a);
		System.out.println("a.b:"+a.b);
		System.out.println("a.str:"+a.str);
		
		System.out.println("b.a:"+b.a);
		System.out.println("b.b:"+b.b);
		System.out.println("b.str:"+b.str);
		
		A c=new B();
		/*
		 *   A c = new B()
		 *   ===   =======
		 *   1) ���� ==> Ŭ���� Ÿ��(�ڽ��� ������ �ִ� ������ ����)
		 *   2) �޼ҵ� ==> ������ Ÿ��(�����ڿ� ���� �޼ҵ� ȣ���� �޶�����)
		 */
		System.out.println("c.a:"+c.a);
		System.out.println("c.b:"+c.b);
		System.out.println("c.str:"+c.str);
	}

}
