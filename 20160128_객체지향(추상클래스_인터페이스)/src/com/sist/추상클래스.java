package com.sist;
/*
 *   �߻� Ŭ���� : �������� ��Ƽ� ����
 *     �߻� : �繰������ �������� �����Ѵ�
 *                ====
 *   ��) ��, ����, ����� ==> ����(�߻� Ŭ����) : ����� ���� �ȴ�
 *      �Ｚ, ����, LG, SK ==> ȸ��(�߻� Ŭ����)
 *   �߻� Ŭ���� : �������� ����ϴ� ������, �޼ҵ�
 *             ======================
 *               ��ӹ޾Ƽ� ��üȭ
 *      
 *      ����� ==== ������
 *      
 *       ����                      �߻�Ŭ����
 *        |  ���
 *    ��   ������   ��              ����Ŭ����
 *    1) �뵵
 *       �����ִ� Ŭ������ ��Ƽ� ����
 *       ���� Ŭ���� ���۽� �ð��� ����
 *       => ���������� ���Ǵ� �޼ҵ带 ���α׷��� �°� ����
 *          (�������̵�)
 *       => ��� �߰�
 *       => ����
 *          public abstract class className
 *          {
 *             ==> �������� ����� �޼ҵ尡 ����
 *             (�߻� �޼ҵ�)
 *             public abstract void disp();
 *          }
 *    �������̽�
 *       1) �߻��� �����̴� (�߻� Ŭ���� ���� ����)
 *       2) ���� ����� ����
 *       3) ����
 *          public interface interfaceName
 *          {
 *             ���� ======> ��� (public static final) ����
 *             ����� �޼ҵ� ==> (public abstract) ����
 *             ������ �޼ҵ� ==> default, static (JDK 1.8~)
 *          }
 *    =======================================================
 *    ���
 *      interface === interface
 *               extends
 *      interface === class
 *              implements
 *      class === class
 *           extends
 *      class === interface (X)
 *      
 *      **** interface A
 *           interface B
 *           class C implements A,B
 *                             ===== ���߻��
 *           class A
 *           class B
 *           class C extends A,B (error)
 *           
 *           class A
 *           class B extends A
 *           class C extends B ===> ���ϻ��
 *           
 *           ����� �ִ� ���
 *           class A
 *           {
 *              a,b,c (static, private (X))
 *           }
 *           class B extends A
 *           {
 *              d (a,b,c)
 *           }
 *           
 *           A a= new A() ==> A(a,b,c)
 *           B b= new B() ==> B(a,b,c,d)
 *           A c= new B() ==> A(a,b,c)
 *               ========
 *               ����� �޼ҵ常 ȣ��
 *           B b= new A() ==> error (���� Ŭ������ ����Ŭ������ ���� �� ����)
 *           B b= (B) new A() ==> �� ��ȯ �Ͽ� ����ؾ��� -> �Ŀ� ���׸� ����(�ڵ�����ȯ)
 *           
 *     public abstract class A
 *     {
 *        abstract void disp();
 *     }
 *     class B extends A
 *     {
 *        public void disp(){1}  ... �������̵� (default<public)
 *     }
 *     class C extends A
 *     {
 *        protected void disp(){2} ... �������̵� (default<protected)
 *     }
 *     
 *     A a=new B(); ==> a.disp(); B(1)
 *     a=new C();   ==> a.disp(); C(2)
 */
abstract class A
{
	abstract void disp();
}
class B extends A
{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("B:disp() Call...");
	}
	
}
class C extends A
{

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		System.out.println("C:disp() Call...");
	}
	
}
public class �߻�Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.disp();
		a=new C();
		a.disp();
	}

}
