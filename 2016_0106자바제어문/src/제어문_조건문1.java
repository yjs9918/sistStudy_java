/*
 *   if
 *    형식)
 *        if(조건문)
 *           문장 ==> 조건문이 true일 경우에 수행하는 문장
 *        여러개 문장 제어 => {} 이용
 *        
 *        if(조건문)
 *          문장 => 조건문이 true
 *        else
 *          문장 => 조건문이 false
 *          
 *   가위바위보
 *     1) 컴퓨터가 가위바위보를 수행 (난수)
 *     2) 사용자가 입력
 *     3) 비교
 *         com       user
 *          0(가위)   
 *                    0(가위)
 *                    1(바위)
 *                    2(보)
 *          1(바위)
 *                    0(가위)
 *                    1(바위)
 *                    2(보)
 *          2(보)
 *                    0(가위)
 *                    1(바위)
 *                    2(보)
 *     4) 결과 출력
 *           
 */
import java.util.Scanner; // 입력(사용자)
public class 제어문_조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*3);
		// 0.0 ~ 0.99 ==> 0.0 ~ 2.9... => 0~2
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		/*
		 *   System.in : 키보드 입력값을 저장
		 *   System.out : 저장된 데이터를 화면 출력
		 *   =============================
		 *   자바 표준 입출력
		 */
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();
		// 비교
/*		if (com==0)
			System.out.println("컴퓨터:가위");
		if (com==1)
			System.out.println("컴퓨터:바위");
		if (com==2)
			System.out.println("컴퓨터:보");
		
		if (user==0)
			System.out.println("사용자:가위");
		if (user==1)
			System.out.println("사용자:바위");
		if (user==2)
			System.out.println("사용자:보");
		
		//비교 => 중첩 조건문
		if (com==0)//가위
		{
			if(user==0)//가위
				System.out.println("결과:비겼다");
			if(user==1)//바위
				System.out.println("결과:사용자가 이겼다");
			if(user==2)//보
				System.out.println("결과:컴퓨터가 이겼다");
		}
		if (com==1)//바위
		{
			if(user==0)//가위
				System.out.println("결과:컴퓨터가 이겼다");
			if(user==1)//바위
				System.out.println("결과:비겼다");
			if(user==2)//보
				System.out.println("결과:사용자가 이겼다");
		}
		if (com==2)//보
		{
			if(user==0)//가위
				System.out.println("결과:사용자가 이겼다");
			if(user==1)//바위
				System.out.println("결과:컴퓨터가 이겼다");
			if(user==2)//보
				System.out.println("결과:비겼다");
		}*/
		/*
		 *   0(com)  user  ==> com-user
		 *     0  => S   0
		 *     1  => P  -1
		 *     2  => C  -2
		 *   1
		 *     0  => C   1
		 *     1  => S   0
		 *     2  => P  -1
		 *   2
		 *     0  => P   2
		 *     1  => C   1
		 *     2  => S   0
		 *     
		 *     => s => 0
		 *        p => -1,2
		 *        c => 1,-2
		 */
		int res=com-user;
		if(res==1 || res==-2)
		{
			System.out.println("컴퓨터가 이겼다");
		}
		if(res==-1 || res==2)
		{
			System.out.println("사용자가 이겼다");
		}
		if(res==0)
		{
			System.out.println("비겼다");
		}
		
	}

}















