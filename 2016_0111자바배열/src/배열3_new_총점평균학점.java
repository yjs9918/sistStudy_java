/*
 *   3명의 학생
 *     국어, 영어, 수학
 *     => 1) 총점
 *        2) 평균
 *        3) 학점
 */
import java.util.Scanner;

public class 배열3_new_총점평균학점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; //0
		int[] eng=new int[3]; //0
		int[] math=new int[3]; //0
		// 총점, 평균, 학점
		int[] total=new int[3]; //총점 0
		double[] avg=new double[3]; //평균 0.0
		char[] hak=new char[3]; //학점 '\0'
		
		Scanner scan=new Scanner(System.in);
		// 입력 length ==> 배열 갯수
		for(int i=0;i<kor.length;i++)
		{
			/*kor[i]=(int)(Math.random()*100)+1;
			eng[i]=(int)(Math.random()*100)+1;
			math[i]=(int)(Math.random()*100)+1;	*/
			System.out.printf("%d번째 국어 점수:",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d번째 수학 점수:",i+1);
			math[i]=scan.nextInt();
			System.out.printf("%d번째 영어 점수:",i+1);
			eng[i]=scan.nextInt();
		}
		//총점
		for(int i=0;i<kor.length;i++)
		{
			total[i]=kor[i]+math[i]+eng[i];
		}
		//평균
		for(int i=0;i<kor.length;i++)
		{
			avg[i]=total[i]/3.0;
		}
		//학점
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
		//출력
		System.out.printf("%6s%6s%6s%8s%10s%10s\n","국어","수학","영어","총점","평균","학점");
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%4d%4d%4d%5d%7.2f%3c\n",
					kor[i],math[i],eng[i],total[i],avg[i],hak[i]);
		}

	}

}
