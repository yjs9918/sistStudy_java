/*
 *   다중 조건문
 *   형식)
 *       if(조건문)
 *         문장 ==> 조건문이 true면 문장을 수행 => 종료
 *                조건문이 false면 다음 조건으로 이동
 *       else if(조건문)
 *         문장 ==> 조건문이 true면 문장을 수행 => 종료
 *                조건문이 false면 다음 조건으로 이동
 *       else if(조건문)
 *         문장 ==> 조건문이 true면 문장을 수행 => 종료
 *                조건문이 false면 다음 조건으로 이동
 *       else if(조건문)
 *         문장 ==> 조건문이 true면 문장을 수행 => 종료
 *                조건문이 false면 다음 조건으로 이동
 *       else
 *         문장 ==> 해당하는 조건이 없는 경우에 수행 
 */
// 3개의 점수를 입력받아서 총점, 평균, 학점을 출력
import java.util.Scanner;
public class 제어문_조건문3_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수:");
		int kor=scan.nextInt();
		System.out.print("영어점수:");
		int eng=scan.nextInt();
		System.out.print("수학점수:");
		int math=scan.nextInt();
		
		//총점
		int total = kor+eng+math;
		//평균
		double avg = total/3.0;
		//학점
		char hak='A';
		if((int)avg>=90)
			hak='A';
		else if((int)avg>=80)
			hak='B';
		else if((int)avg>=70)
			hak='C';
		else if((int)avg>=60)
			hak='D';
		else
			hak='F';
		
		//출력
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("평균:"+avg);
		/*
		 *   %d  : 정수
		 *   %f  : 실수
		 *   %c  : 문자
		 *   %s  : 문자열
		 *   
		 *   \n ==> 다음줄에 출력 (new line)
		 *   \t ==> 일정간격 (tab)
		 */
		System.out.println("학점:"+hak);

	}

}
