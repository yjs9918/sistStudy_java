// ����,����
/*
 *   ���� ==> O O O O O X O X O X O X
 */
import java.util.Scanner;
public class ����ó�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] dap=new char[10];
		char[] user=new char[10];
		for(int i=0;i<dap.length;i++)
		{
			int rnd=(int)(Math.random()*2);
			if(rnd==0)
				dap[i]='O';
			else
				dap[i]='X';
		}
		//����� �Է�
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print("O(0),X(1) �Է�:");
			int input=scan.nextInt();
			if(input<0 || input>1)
			{
				System.out.println("0,1�� �Է��ϼ���");
				i--;
				continue; //���������� �̵�
			}
			if(input==0)
				user[i]='O';
			else
				user[i]='X';
		}
		System.out.println("����:");
		//���
		for(int i=0;i<dap.length;i++)
		{
			System.out.print(dap[i]+" ");
		}
		System.out.println();
		System.out.println("����� �Է°�:");
		for(int i=0;i<user.length;i++)
		{
			System.out.print(user[i]+" ");
		}
		//��
		int count=0;
		for(int i=0;i<user.length;i++)
		{
			if(dap[i]==user[i])
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("����:"+(count*10)+"��");

	}

}














