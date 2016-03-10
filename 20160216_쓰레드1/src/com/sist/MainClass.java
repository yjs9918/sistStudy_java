package com.sist;
/*
 *   Thread�� �����ֱ�
 *   
 *   NEW    ====    Runnable    ====    Running
 *                                      = Blocked
 *                                      = Dead
 *   NEW : new Thread()
 *         1) �̸� �ο�
 *            Thread - 0
 *            Thread - 1
 *            ..
 *            ..
 *            getName() : �ο��� �̸����� �ҷ���
 *            setName() : �� ����
 *         2) �켱���� �ο�
 *            1~10
 *            1: MIN_PRIORITY
 *            5: NORM_PRIORITY
 *            10:MAX_PRIORITY
 *            getPriority()
 *            setPriority()
 *   Runnable : ������ (�ʿ��� �ڿ��� Ȯ��)
 *     => start()
 *   Running : �������� ����
 *     => run() : ������� �ݵ�� �Ѱ��� �ϸ� ����
 *        =====
 *         = ���� : interrupt()
 *         = �Ͻ����� : sleep(),join()
 *         
 *   ***** run() ����
 *     1) run() ����
 *     2) ���� => Runnable
 *   ***** CPU�� �ð��� �й��ؼ� => ������
 *         
 */
//Thread ���� : Thread���
class MyThread extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(100);
				// 1000���� 1�� ����
				
			}
		} catch (Exception ex) {}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		System.out.println("�̸�:"+t1.getName());
		System.out.println("�켱����:"+t1.getPriority());
		
		MyThread t2=new MyThread();
		System.out.println("�̸�:"+t2.getName());
		System.out.println("�켱����:"+t2.getPriority());
		
		MyThread t3=new MyThread();
		System.out.println("�̸�:"+t3.getName());
		System.out.println("�켱����:"+t3.getPriority());
		
		//���� ���
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		t1.start();// t1,t2,t3�� �ѹ��� ����Ǹ鼭 �����Ѵ�. (���: 111,222,333.....)
		t2.start();
		t3.start();
	}

}



















