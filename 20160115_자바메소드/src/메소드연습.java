/*
 *   �޼ҵ�
 *   1) ����
 *     �����(����) �޼ҵ��(����� ��û��:�Ű�����)
 *     {
 *         ����� ��û�� ���� ó��
 *         => ������� �����ش� (�Ѱ�)
 *         return �����
 *     }
 *     ����� : ��� ��������(int,long,double,boolean...)
 *           �迭, Ŭ����
 *   2) �޼ҵ� ȣ��
 *      static : �������� �����
 *      
 *                      new�� ��� ���ο� �޸𸮸� �����Ͽ� ������ �� ����.
 *      => Scanner scan=new Scanner()
 *                      malloc(sizeof(Scanner)) <= ������ new ��ſ� �̷��� �����
 *         scan.nextInt() : 
 *         
 *         Math.random() : static(�ڵ����� ����)
 */
import java.util.Scanner;
/*
 *   ��Ģ���� => ����
 *         int plus(int a, int b)
 *         int minus(int a, int b)
 *         int gop(int a, int b)
 *         int div(int a, int b)
 */
public class �޼ҵ忬�� {
	static int plus(int a,int b)
	{
		return a+b;
	}
	static int minus(int a,int b)
	{
		return a-b;
	}
	static int gop(int a,int b)
	{
		return a*b;
	}
	static int div(int a,int b)
	{
		return a/b;
	}
	// ����
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int a=scan.nextInt();
		System.out.print("���� �Է�:");
		int b=scan.nextInt();
		
		System.out.print("������ �Է�(+,-,*,/):");
		//�����
		int result=0;
		switch(scan.next())
		{
		case "+":
			result=plus(a,b);
			break;
		case "-":
			result=minus(a,b);
			break;
		case "*":
			result=gop(a,b);
			break;
		case "/":
			result=div(a,b);
			break;
		}
		System.out.println("�����:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
