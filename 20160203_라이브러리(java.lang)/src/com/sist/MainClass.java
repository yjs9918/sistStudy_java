package com.sist;
/*
 *    �޸� ����
 *       void disp(){} (�޼ҵ� ����) ==> �޸𸮿� ���� 
 *       void disp();  (�޼ҵ� ����) ==> �޸𸮿� ������ �ȵȴ�
 *         ��� Ŭ������ �޼ҵ尡 ���ǰ� �Ǿ�� �����ؼ� ����� �� �ִ�
 *           => �������̽�, �߻� Ŭ����(�޸𸮿� ������ �� ����)
 *           interface A
 *           {
 *              void disp();
 *           }
 *           class B implements A
 *           {
 *              void disp(){}
 *           }
 *           class C
 *           {
 *              public void aaa()
 *              {
 *                 A a=new A(){
 *                    public void disp(){} => �̰� ������ ����(A�� interface�Ƿ� �޸� ����x)
 *                 };
 *              }
 *           }
 *    ==============
 *       Method����       => Method,static����
 *    ==============
 *        Stack     => �Ű�����, �������� ({}������ ���)
 *        			=> ������ : �޸�
 *    ==============
 *         heap     => ��ü(�ν��Ͻ�) => new
 *         			=> ������ : ���α׷��� (GC)
 *    ==============
 *    
 *     ���̺귯�� : �ڹٿ��� �����ϴ� Ŭ����
 *             ����� ���� ���̺귯��
 *             
 *      => ��Ű���� ���� �ִ� (���õ� Ŭ����) ==> Ŭ������ �о ����� ���� import
 *         java.lang (import�� ������ �� �ִ�)
 *           => Object : �ֻ��� Ŭ���� (��� Ŭ������ Object�� ��ӹ޾Ƽ� ���)
 *                = ���� (clone)
 *                = ��ü�� ���ڿ��� ��ȯ (toString)
 *                = ��ü �� (equals)
 *                = ��ü�� �Ҹ��� Ȯ�� (finalize)
 *              String
 *              Math
 *              System
 *              StringBuffer
 *              Wrapper (�������� �����ϱ� ���� Ŭ����ȭ)
 *                int => Integer
 *                double => Double
 *                float => Float
 *                byte => Byte
 *                char[] => String
 *                boolean => Boolean
 *         java.util
 *         java.io
 *         java.net
 *         java.awt
 *         java.awt.event
 *         javax.swing
 *         javax.xml................
 */
class Student
{
	String name;
	// ������ �Լ�
	public Student() 
	{
		System.out.println("��ü ���� �Ϸ�...");  //����
	}
	public void display()
	{
		System.out.println("Name:"+name);  //Ȱ��
	}
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("��ü�� �޸𸮿��� ����...");  //����
	}
	// �Ҹ��� �Լ�
	
}
interface A
{
	void disp();
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A a=new A(){
			public void disp(){System.out.println("aaa");} //�͸��� Ŭ����
		};
		a.disp();*/
		
		Student s=new Student();
		s.name="ȫ�浿";
		s.display();
		s=null;
		System.gc();
	}

}












