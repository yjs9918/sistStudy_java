
import java.util.Scanner;
public class HW09_�����Է�_����ū�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("1��° ������ �Է��ϼ���:");
		int num1=scan.nextInt();
		System.out.print("2��° ������ �Է��ϼ���:");
		int num2=scan.nextInt();
		System.out.print("3��° ������ �Է��ϼ���:");
		int num3=scan.nextInt();
		
		int max=0;
		
		if(num1>num2)             -�ִ밪�� ���ϴ� ����� ������
			max=num1;
		else if(num1>num3)
			max=num3;
		else
			max=num2;
		
		System.out.print("�� ���� ���� ū ����:"+max);
*/
		int[] arr=new int[3];
		int max=0;
		//int min=100;
		//�迭�� �ʱⰪ �ο�
		for(int i=0;i<3;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//�迭�߿� �ִ밪 ���ϱ�
		int min=arr[0];
		for(int i=0;i<3;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		//���
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
