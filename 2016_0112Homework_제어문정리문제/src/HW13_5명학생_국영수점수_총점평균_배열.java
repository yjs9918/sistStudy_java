import java.util.Scanner;

public class HW13_5���л�_����������_�������_�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] kor=new int[5];
		int[] eng=new int[5];
		int[] math=new int[5];
		int[] total=new int[5];
		double[] avg=new double[5];
		char[] hak=new char[5];
		int[] rank=new int[5];
		//���� �Է� => ����, ���
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d��° ���� ����:",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d��° ���� ����:",i+1);
			eng[i]=scan.nextInt();
			System.out.printf("%d��° ���� ����:",i+1);
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//����
		char c='A';
		for(int i=0;i<5;i++)
		{
			/*if(avg[i]>90)
				c='A';
			else if(avg[i]>=80)
				c='B';
			else if(avg[i]>=70)
				c='C';
			else if(avg[i]>60)
				c='D';
			else
				c='F';*/
			switch(total[i]/30)
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			}
			hak[i]=c;
		}
		//��� (�ٽ�)
		for(int i=0;i<5;i++)
		{
			rank[i]=1;
			for(int j=0;j<5;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//���
		for(int i=0;i<5;i++)
		{
			System.out.printf("%5d%5d%5d%7d%7.2f%5c%5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],hak[i],rank[i]);
		}
		

	}

}
