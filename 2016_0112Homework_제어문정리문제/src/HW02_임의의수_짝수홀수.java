/*
 *   if ~ else
 *   if(���ǹ�)
 *     ���� ==> ������ true�� �� ����
 *   else
 *     ���� ==> ������ false�� �� ����
 */
import java.util.Scanner;
public class HW02_�����Ǽ�_¦��Ȧ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+"��(��) ¦��");
		}
		else
		{
			System.out.println(num+"��(��) Ȧ��");
		}
		//�߰�ȣ �����ص� ����*/	
		
		int a=(int)(Math.random()*100)+1;
		if(a%2==0)//¦��
			System.out.println(a+"��(��) ¦��");
		else
			System.out.println(a+"��(��) Ȧ��");
		
	}

}
