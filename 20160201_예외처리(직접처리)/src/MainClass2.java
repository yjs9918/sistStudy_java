import java.util.Scanner;
/*
 *   ���ڿ� ==> ���� �Է��� �޴´�
 *   �迭�� ����
 *   ����� ���� ������
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("1' �����Է�:");
			String num1=scan.next();
			System.out.print("2' �����Է�:");
			String num2=scan.next();
			//���� ��ȯ
			int a=Integer.parseInt(num1); //error
			int b=Integer.parseInt(num2);
			
			//�迭�� ����
			int[] arr=new int[2];
			arr[0]=a;
			arr[1]=b;
			
			System.out.println(arr[0]/arr[1]);
		}catch(ArithmeticException e)
		{
			System.out.println("0���� ���� �� ����:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�迭�� ������ �ʰ�:"+e.getMessage());
		}catch(NumberFormatException e)
		{
			System.out.println("���� ��ȯ�� �� �� ����:"+e.getMessage());
		}
	}

}
