/*
 *   3���� �л�
 *     ����, ����, ����
 *     => 1) ����
 *        2) ���
 *        3) ����
 */
import java.util.Scanner;

public class �迭3_new_����������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; //0
		int[] eng=new int[3]; //0
		int[] math=new int[3]; //0
		// ����, ���, ����
		int[] total=new int[3]; //���� 0
		double[] avg=new double[3]; //��� 0.0
		char[] hak=new char[3]; //���� '\0'
		
		Scanner scan=new Scanner(System.in);
		// �Է� length ==> �迭 ����
		for(int i=0;i<kor.length;i++)
		{
			/*kor[i]=(int)(Math.random()*100)+1;
			eng[i]=(int)(Math.random()*100)+1;
			math[i]=(int)(Math.random()*100)+1;	*/
			System.out.printf("%d��° ���� ����:",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d��° ���� ����:",i+1);
			math[i]=scan.nextInt();
			System.out.printf("%d��° ���� ����:",i+1);
			eng[i]=scan.nextInt();
		}
		//����
		for(int i=0;i<kor.length;i++)
		{
			total[i]=kor[i]+math[i]+eng[i];
		}
		//���
		for(int i=0;i<kor.length;i++)
		{
			avg[i]=total[i]/3.0;
		}
		//����
		char score='A';
		for(int i=0;i<kor.length;i++)
		{
			switch(total[i]/30)
			{
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
			}
			hak[i]=score;
		}
		//���
		System.out.printf("%6s%6s%6s%8s%10s%10s\n","����","����","����","����","���","����");
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%4d%4d%4d%5d%7.2f%3c\n",
					kor[i],math[i],eng[i],total[i],avg[i],hak[i]);
		}

	}

}
