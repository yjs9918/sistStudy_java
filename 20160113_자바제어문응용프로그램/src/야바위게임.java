/*
 *  20160113 HW
 *  1) 1~45���� �ߺ����� ���� �߻� => 7�� �߻�
 *  2) ����ڰ� 6�� �Է�
 *  3) �� => 3(5��)
 *           4(4��)
 *           5(3��)
 *           6(2��) ==> ������ ���ڰ� ����
 *           6(1��)
 *  ================================
 *  0,1,2 ==> ���� 1�߻�
 *  X O X
 *  
 *  ������ ���� ==> ����ó��, ���� ===> ȭ�鿡 ���
 *  ======
 *    ���� ������ ����: ����
 *    ���� ������ ����: �迭
 *    
 *  ó��
 *   ������
 *   ��� ===> ���� 
 */
import java.util.Scanner;
public class �߹������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �߻�
		char[] dap=new char[3];
		int rnd=(int)(Math.random()*3);
		for(int i=0;i<3;i++)
		{
			if(i==rnd)
				dap[i]='O';
			else
				dap[i]='X';
		}
		Scanner scan=new Scanner(System.in);
		System.out.print("1,2,3 �߿� 1���� �����ϼ���");
		int user=scan.nextInt();
		//���
		for(int i=0;i<3;i++)
		{
			System.out.print(dap[i]+" ");
			
		}
		System.out.println();
		if(dap[user-1]=='O')
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("���� ��ȸ��~~");
		}
				

	}

}
