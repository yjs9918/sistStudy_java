
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=20;
		int c=3;
		int d= a+(b*c); //70         연산순서 : *,/,% => +,-
		// ()를 이용한다 => 최우선 순위 연산자
		System.out.println("d="+d);*/
		//int a=10;
		//double d=30.5;
		// a+d=double
		//double d2= a+d;
		// double a2=a+d;
		/*
		 *       a+d
		 *      ==
		 *      10.0 (int => double) 자동 형변환
		 *      10.0 + 30.5 ==> 40.5
		 *      *** 연산은 같은 데이터형끼리 한다
		 *      
		 *       a+(int)d => int
		 *       (int)(a+d)
		 *       =========== 강제 형변환
		 *       
		 *       double => int : 소숫점 전체 삭제(반올림X)
		 *       10.5 + 10.5 ==> 21.0
		 *       (int)10.5 + (int)10.5 ==> 20
		 *       =========   ==========
		 *           1            2
		 *                 + (3)
		 *       (int)(10.5+10.5) ==> 21
		 *           ============ 1
		 *       ==== 2
		 */
			
		//System.out.println("d2="+d2);
		int a=10;
		int b=3;
		int c=a/b; // 정수/정수 = 정수
		System.out.println("c="+c); // 소숫점 제외
		System.out.println("5%2="+5%2); //1
		System.out.println("-5%2="+ -5%2); //-1
		System.out.println("5%-2="+ 5%-2); //1
		System.out.println("-5%-2="+ -5%-2); //-1
		
	}

}
