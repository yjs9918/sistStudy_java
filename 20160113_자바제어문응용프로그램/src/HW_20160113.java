/*
 *  20160113 HW
 *  1) 1~45���� �ߺ����� ���� �߻� => 7�� �߻�
 *  2) ����ڰ� 6�� �Է�
 *  3) �� => 3(5��)
 *           4(4��)
 *           5(3��)
 *           6(2��) ==> ������ ���ڰ� ����
 *           6(1��)
 *  ================================*/

import java.util.Scanner;
public class HW_20160113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[7];
		int[] user=new int[6];
		boolean bDash=true;
		int jumsu=0;
		int lastjumsu=0;
		
		//�����߻�
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*45)+1;
			bDash=true;
			while(bDash) //�ߺ�ó��
			{
				com[i]=(int)(Math.random()*45)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[i]==com[j])
					{
						bDash=true;
						break;
					}
				}
			}
		}
		for(int k=0;k<com.length;k++)
		{
			System.out.print(com[k]+" ");
		}
		//������ �ޱ�
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print("\n1~45������ ������ �Է��ϼ���:");
			user[i]=scan.nextInt();
			//����ó��
			if(user[i]<1 || user[i]>45)
			{
				System.out.printf("%d��° ���� �ٽ� �Է��� �ּ���.",i+1);
				i--;
				continue;
			}
			//�ߺ�ó��
			bDash=true;
			while(bDash)
			{
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(user[i]==user[j])
					{
						System.out.println("�ߺ��� ���� �ԷµǾ����ϴ�.");
						System.out.printf("%d��° ���� �ٽ� �Է����ּ���.",i+1);
						user[i]=scan.nextInt();
						j--;
						break;
					}
				}
			}
		}
					
		for(int i=0;i<user.length;i++)
		{
			for(int j=0;j<user.length;j++)
			{
				if(user[j]==com[6])
				{
					lastjumsu=1;
				}
				if(user[j]==com[i])
				{				
					jumsu+=1;
				}

			}

		}
		
		System.out.print("��ǻ���� �� : ");
		for(int i=0;i<com.length;i++)
		{
			System.out.print(com[i]+" ");
		}
		System.out.println();
		System.out.print("������� �� : ");
		for(int i=0;i<user.length;i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
		
		if(jumsu==1){
			System.out.printf("%d���� ���߼ż� Ż���Դϴ�",jumsu);
		}
		else if(jumsu==2){
			System.out.printf("%d���� ���߼ż� Ż���Դϴ�",jumsu);
		}
		else if(jumsu==3){
			System.out.printf("%d���� ���߼ż� 5���Դϴ�",jumsu);
		}
		else if(jumsu==4){
			System.out.printf("%d���� ���߼ż� 4���Դϴ�",jumsu);
		}
		else if(jumsu==5){
			System.out.printf("%d���� ���߼ż� 3���Դϴ�",jumsu);
		}
		else if(jumsu+lastjumsu==6){
			System.out.printf("���ʽ� ���� ���� %d���� ���߼ż� 2���Դϴ�",jumsu+lastjumsu);
		}
		else if(jumsu==6){
			System.out.printf("%d���� ���߼ż� 1���Դϴ�",jumsu);
		}
		else
		{System.out.print("�ϳ��� ������ ���߽��ϴ�.");
		
	}
}
}
		
		