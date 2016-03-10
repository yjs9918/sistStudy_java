/*
 *  20160113 HW
 *  1) 1~45까지 중복없는 난수 발생 => 7개 발생
 *  2) 사용자가 6개 입력
 *  3) 비교 => 3(5등)
 *           4(4등)
 *           5(3등)
 *           6(2등) ==> 마지막 숫자가 포함
 *           6(1등)
 *  ================================
 *  0,1,2 ==> 난수 1발생
 *  X O X
 *  
 *  데이터 저장 ==> 연산처리, 제어 ===> 화면에 출력
 *  ======
 *    단일 데이터 저장: 변수
 *    다중 데이터 저장: 배열
 *    
 *  처리
 *   연산자
 *   제어문 ===> 결합 
 */
import java.util.Scanner;
public class 야바위게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 발생
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
		System.out.print("1,2,3 중에 1개를 선택하세요");
		int user=scan.nextInt();
		//결과
		for(int i=0;i<3;i++)
		{
			System.out.print(dap[i]+" ");
			
		}
		System.out.println();
		if(dap[user-1]=='O')
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("다음 기회에~~");
		}
				

	}

}
