/*
 *   무한루프 => while(true)
 */
import java.util.Scanner;
public class 제어문3_while_무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor=0;
		while(true)
		{
			System.out.print("국어 점수(0~100):");
			kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				System.out.println("잘못된 입력입니다");
				continue;// while문의 조건문으로 이동
			}
			break; // while문을 종료 (정상수행)
		}
		
		int eng=0;
		while(true)
		{
			System.out.print("영어 점수(0~100):");
			eng=scan.nextInt();
			if(eng<0 || eng>100)
			{
				System.out.println("잘못된 입력입니다");
				continue;
			}
			break;
		}
			
			int math=0;
			while(true)
			{
				System.out.print("수학 점수(0~100):");
				math=scan.nextInt();
				if(math<0 || math>100)
				{
					System.out.println("잘못된 입력입니다");
					continue;
				}
				break;
			}
			System.out.println("국어점수:"+kor);
			System.out.println("영어점수:"+eng);
			System.out.println("수학점수:"+math);
			System.out.println("총점:"+(kor+eng+math));
			System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
			
		}

	}


