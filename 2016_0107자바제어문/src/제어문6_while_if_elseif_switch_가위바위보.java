/*
 *   while ==> if
 *   10�� ==> ��ǻ�Ϳ� ����ڰ� ���� ���� ��
 *      => 10�� 4�� 5�� 1��
 */
import java.util.Scanner;
public class ���6_while_if_elseif_switch_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է�
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		//����
		int i=1;
		while(i<=10)
		{
			//��ǻ�� => ����������
			int com=(int)(Math.random()*3);
			//����� => ����������
			System.out.print("����(0),����(1),��(2):");
			int user=scan.nextInt();
			if(user<0 || user>2)
			{
				System.out.println("������������ �Է��ϼ���");
				continue;
			}
			// ���
			if(com==0)
			{
				System.out.println("��ǻ��:����");
			}
			else if(com==1)
			{
				System.out.println("��ǻ��:����");
			}
			else
			{
				System.out.println("��ǻ��:��");
			}
			//�����
			if(user==0)
			{
				System.out.println("�����:����");
			}
			else if(user==1)
			{
				System.out.println("�����:����");
			}
			else
			{
				System.out.println("�����:��");
			}
			//���
			switch(com-user)
			{
			case -1: //if(a==-1 || a==2)
			case 2:
				System.out.println("����ڰ� �̰��");
				win++;
				break;
			case 1:
			case -2:
				System.out.println("��ǻ�Ͱ� �̰��");
				lose++;
				break;
			case 0:
				System.out.println("����");
				same++;
			}
			i++;
		}
		// 10������ ����
		System.out.printf("����:%d�� %d�� %d��\n", win,lose,same);
		

	}

}
