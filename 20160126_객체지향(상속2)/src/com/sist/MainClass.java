package com.sist;
/*
 *   ��� : ����Ŭ���� ������ �޴´� (�ߺ� �ڵ��� ���� �� �ִ�)
 *        1) �ִ� �״�� ���
 *        2) �����ؼ� ���
 *           ========
 *             �������̵�
 *             ����)
 *                 1. ���
 *                 2. �޼ҵ���� ����
 *                 3. �Ű������� ����
 *                 4. �������� ����
 *                 5. ��������� Ȯ��(��Ҵ� �Ұ���)
 *                 
 *        ��� => ����Ŭ������ ���ؼ� ���� Ŭ���� ����
 *              => �������̵��� �޼ҵ常 ����
 *        class A
 *        class B extends A
 *        A a=new B();
 *        ==> ��� Ŭ������ �ѹ��� ��Ƽ� ���� : Object
 */
class �Խ���
{
	int a=100;
	public void write()
	{
		System.out.println("�Խ��� �۾���");
	}
	public void list()
	{
		System.out.println("�Խ��� ����� ���");
	}
}
class �亯���Խ��� extends �Խ���
{
	int a=200;
	public void list() //�������̵�
	{
		System.out.println("�亯�� �����ؼ� ���");
	}
}
class ������Խ��� extends �Խ���
{
	int a=300;
	public void list()
	
	{
		System.out.println("����� �����ؼ� ���");
	}
}
class �������Խ��� extends �Խ���
{
	int a=400;
	public void write()
	{
		System.out.println("�۾���� �׸� ���ε� �Ѵ�");
	}
	public void list()
	{
		System.out.println("�׸��� �����ؼ� ���");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�Խ��� board = new �亯���Խ���();
		System.out.println(board.a);
		board.write();
		board.list();
		board = new �������Խ���();
		board.write();
		board.list();
		board = new ������Խ���();
		board.write();
		board.list();
	}

}
