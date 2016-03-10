/*
 *   국어, 영어, 수학 => 입력
 *   총점 평균 구하기
 *   
 *   변수 ==> 5개 (국어,영어,수학,총점,평균)
 */
import java.util.Scanner;
public class HW01_국어영어수학_총점평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("국어");
		int kor=scan.nextInt();
		System.out.print("영어");
		int eng=scan.nextInt();
		System.out.print("수학");
		int math=scan.nextInt();
		
		int total=(kor+eng+math);
		int avg= (total/3);
		System.out.println("총점은:"+total+"입니다.");
		System.out.println("평균은:"+avg+"입니다.");*/
		
		//배열 응용
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hak=new char[3];
		int[] rank=new int[3];
		//점수 입력 => 총점, 평균
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
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
		for(int i=0;i<3;i++)
		{
			if(avg[i]>90)
				c='A';
			else if(avg[i]>=80)
				c='B';
			else if(avg[i]>=70)
				c='C';
			else if(avg[i]>60)
				c='D';
			else
				c='F';
			/*switch(total[i]/30)
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
			hak[i]=c;*/
		}
		//등수 (핵심)
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//출력
		for(int i=0;i<3;i++)
		{
			System.out.printf("%5d%5d%5d%7d%7.2f%5c%5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],hak[i],rank[i]);
		}
		

	}

}
