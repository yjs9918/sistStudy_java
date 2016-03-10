/*
 *   이항연산자 (피연산자가 2개인 경우)
 *     => *** 산술연산자 ( + , - , * , / , % ) 
 *        : 결과값 : 숫자 (정수 , 실수)
 *        주의점)
 *              모든 연산은 데이터형이 큰 것으로 변경된다
 *              int + double => double
 *              char + int => int
 *              *** int이하 데이터형(byte,short,char)
 *                  연산 결과값 int
 *                  byte + byte = int
 *                  char + byte = int
 *                  short + char = int...
 *              1) /
 *                 0으로 나눌 수 없다 10/0 (error)
 *                 정수 / 정수 = 정수
 *                  3 / 2 = 1 , 3 / 2.0 => 1.5
 *              2) %
 *                 5%2 ==> 1
 *                 => 5%2 => 1
 *                    1 + 4/2
 *                   -5%2 => -1
 *                    -1 -4/2
 *                   -5%-2 => -1
 *                    -1 -4/-2
 *                    5%-2 => 1
 *                    1 +4/-2
 *                 *** 나누고 나머지의 부호는 왼쪽편 부호를 따라간다
 *                 *** 배수 구하기 (3의배수, 2의배수, 짝수홀수) 
 *     => 비트이동연산자(쉬프트연산자) ( << , >> , >>>)
 *     => 비트연산자 ( & , | , ^ )
 *        : 결과값 : 정수
 *     => *** 관계연산자  ( == , != , < , > , <= , >= )
 *     => *** 논리연산자  ( && , || )
 *        : 결과값 : boolean (true / false)
 *     => *** 대입연산자 ( = , += , -=, *= ... op= )
 *                   ============= 3개가 주요
 */
import java.util.Scanner; //자바 폴더 -> 패키지
// 기존에 자바나 만들어진 클래스를 불러올 때
// Scanner => 입력값을 받을 수 있게 해줌
/*
 *   자바 : import
 *   C : include
 *   C# : using
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //System.in => 키보드 입력값을 받음
				// new : 동적메모리 할당
				// 클래스 저장 시 => new (malloc)
				// heap영역에 저장
		System.out.print("정수값 입력:");
		int a=scan.nextInt();
		//        ==========
		//           메소드
		/*
		 *   nextInt() 정수
		 *   nextDouble() 실수
		 *   next() 문자열
		 */
		System.out.println("a="+a);
		

	}

}
