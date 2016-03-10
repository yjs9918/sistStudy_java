import java.util.Scanner;

public class HW13_5명학생_국영수점수_총점평균_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] kor=new int[5];
		int[] eng=new int[5];
		int[] math=new int[5];
		int[] total=new int[5];
		double[] avg=new double[5];
		char[] hak=new char[5];
		int[] rank=new int[5];
		//점수 입력 => 총점, 평균
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d번째 국어 점수:",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d번째 영어 점수:",i+1);
			eng[i]=scan.nextInt();
			System.out.printf("%d번째 수학 점수:",i+1);
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//학점
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
		//등수 (핵심)
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
		//출력
		for(int i=0;i<5;i++)
		{
			System.out.printf("%5d%5d%5d%7d%7.2f%5c%5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],hak[i],rank[i]);
		}
		

	}

}
