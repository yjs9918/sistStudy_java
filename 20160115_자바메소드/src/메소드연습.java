/*
 *   메소드
 *   1) 형식
 *     결과값(리턴) 메소드명(사용자 요청값:매개변수)
 *     {
 *         사용자 요청에 대한 처리
 *         => 결과값을 보내준다 (한개)
 *         return 결과값
 *     }
 *     결과값 : 모든 데이터형(int,long,double,boolean...)
 *           배열, 클래스
 *   2) 메소드 호출
 *      static : 공통으로 사용함
 *      
 *                      new를 써야 새로운 메모리를 지정하여 저장할 수 있음.
 *      => Scanner scan=new Scanner()
 *                      malloc(sizeof(Scanner)) <= 예전엔 new 대신에 이렇게 썼었음
 *         scan.nextInt() : 
 *         
 *         Math.random() : static(자동으로 저장)
 */
import java.util.Scanner;
/*
 *   사칙연산 => 정수
 *         int plus(int a, int b)
 *         int minus(int a, int b)
 *         int gop(int a, int b)
 *         int div(int a, int b)
 */
public class 메소드연습 {
	static int plus(int a,int b)
	{
		return a+b;
	}
	static int minus(int a,int b)
	{
		return a-b;
	}
	static int gop(int a,int b)
	{
		return a*b;
	}
	static int div(int a,int b)
	{
		return a/b;
	}
	// 조립
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		System.out.print("정수 입력:");
		int b=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		//결과값
		int result=0;
		switch(scan.next())
		{
		case "+":
			result=plus(a,b);
			break;
		case "-":
			result=minus(a,b);
			break;
		case "*":
			result=gop(a,b);
			break;
		case "/":
			result=div(a,b);
			break;
		}
		System.out.println("결과값:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
