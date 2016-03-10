/*
 *    ������
 *     => ��������� �ʱ�ȭ
 *        ==========
 *        1) ���� ó��
 *           class A
 *           {
 *             int a=10;
 *             Ŭ���� ����: ����(������ �� �� ����)
 *           }
 *        =======================
 *        2) ������ �̿�
 *        3) �ʱ�ȭ ��
 *        ======================= ���� �Ŀ� �� ����
 *        
 *        add(int a,int b, int c)
 *        add(char c, int b, double d)
 *        add(char c, float f, double d)
 *        ***add(double d1, double d2, double d3)
 *        
 *        add('a',10.5,10)
 *            char double int (4��°���� ����) 1. ������ ã�´� -> 2. ��ü�� ���� �� �ִ� �����͸� ã�´�.(������ ū��)
 *            
 *        add(double)
 *        
 *        add(10) add('a')
 *        
 *        int a='A'; a=65
 *        double d=10;
 *        
 *        2. �ʱ�ȭ : �Է��� �޾Ƽ� ó��
 *           => �����ڴ� �Ű������� ������ �ִ�
 *           => �����ڴ� �������� ���� ����� �� �ִ�
 *              ===============
 *                 �����ε� : �ߺ��Լ� ����
 *                 =====
 *                 Ư¡ : 1) ���� Ŭ����
 *                      2) ���� �̸��� �޼ҵ�
 *                      3) �Ű������� �ٸ���
 *                      4) �������� �ٸ���
 *                 ������ :
 *                   Ư¡ : �������� ����.
 *                        Ŭ���� ��� ���� 
 *            
 */
public class Student {
	int hakbun=1;
	int kor=90;
	int eng=50;
	int math=70;
	Student() // defualt ������(�Ű����� ���� ������)
	{ 
		hakbun=2;
		kor=70;
		eng=80;
		math=80;
	}
	Student(int h, int k, int e, int m) //�����ε�
	{
		hakbun=h;
		kor=k;
		eng=e;
		math=m;
	}
	Student(int h) //�����ε�
	{
		hakbun=3;
	}
	Student(int k, int e, int m) //�����ε�
	{
		kor=k;
		eng=e;
		math=m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		// �ڵ� ����(JVM) (�����ڰ� �ƿ� �������� defualt ������ ����� �� �ִ�)
		// s=> hakbun, kor, eng, math
		System.out.println("s:"+s);
		System.out.println("�й�:"+s.hakbun);
		System.out.println("����:"+s.kor);
		System.out.println("����:"+s.eng);
		System.out.println("����:"+s.math);
		
		System.out.println();
		System.out.println("s:"+s);
		s=new Student(3);
		System.out.println("�й�:"+s.hakbun);
		System.out.println("����:"+s.kor);
		System.out.println("����:"+s.eng);
		System.out.println("����:"+s.math);
		
		System.out.println();
		System.out.println("s:"+s);
		s=new Student(70,60,90);
		System.out.println("�й�:"+s.hakbun);
		System.out.println("����:"+s.kor);
		System.out.println("����:"+s.eng);
		System.out.println("����:"+s.math);
		
		System.out.println();
		s=new Student(5,88,99,77);
		Student s1=s; //�����ؼ� �� �� �ִ�(�ּҰ�)
		System.out.println("s:"+s);
		System.out.println("�й�:"+s1.hakbun);
		System.out.println("����:"+s1.kor);
		System.out.println("����:"+s1.eng);
		System.out.println("����:"+s1.math);
	}

}
