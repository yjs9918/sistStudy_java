package com.sist;
/*
 *   �߻�Ŭ���� : �������� ����Ǵ� �޼ҵ带 �����ϰ�
 *            �ʿ�ø��� �����ؼ� ����ϴ� ��
 *            1) ���� �ٸ� Ŭ������ �����ؼ� ���
 *            2) ����
 *               public abstract class className
 *               {
 *                 ==============================
 *                     ���� (����)
 *                 ==============================
 *                     �����ȵ� �޼ҵ�
 *                     �߻� �޼ҵ�
 *                     abstract void display();
 *                 ==============================
 *                     ������ �޼ҵ�
 *                 ==============================
 *               }
 *               �߻� Ŭ������ ����ϱ� ���ؼ��� �ݵ��
 *               ��ӹ޾� ������ ���� Ŭ������ �ּҸ� �޾Ƽ� ���
 *               
 *               public abstract class A
 *               class B extends A
 *               
 *               ==> A a=new B();
 *                   B b=new B();
 *               ����) ���� ���
 */
abstract class ����
{
	abstract void draw();
}
class �� extends ����
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");
	}
	
}
class �׸� extends ����
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("�׸� �׸���");
	}
	
}
class �ﰢ�� extends ����
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޸� 3�� ����
		�� c=new ��();
		c.draw();
		�ﰢ�� t=new �ﰢ��();
		t.draw();
		�׸� r=new �׸�();
		r.draw();
		
		//�޸� 1�� ����
		System.out.println("\n�߻�Ŭ���� ����");
		���� g=new ��();
		g.draw();
		g=new �ﰢ��();
		g.draw();
		g=new �׸�();
		g.draw();
	}

}
