/*
 *   메소드(Method)
 *     : 한가지 기능을 수행하는 명령문의 집합
 *     : 반복 수행시에 주로 사용되는 기능
 *     : 연산자 + 제어문 = 메소드
 *     : 구성요소 : 결과값, 입력값(사용자)
 *     방식
 *     =======================
 *      결과값                입력값
 *     =======================
 *       O         O
 *     =======================
 *       O         X           => double random()
 *     =======================
 *       X         O           => void printf(""), print("") //결과값이 없을때 void
 *     =======================
 *       X         X           => void println()
 *     =======================
 *     
 *     형식)
 *         10 20 => plus 결과값 10+20=30
 *         int add(int a, int b)
 *         {
 *            return a+b;
 *         }
 *         ==> 호출
 *         int a=10;
 *         int b=20;
 *         int c=add(a,b);
 *         
 *         => id => 중복여부
 *         boolean isIdCheck(id)
 *         {
 *           return true/false
 *         }
 *         ==> 호출
 *         boolean bCheck = isIdCheck("admin")
 *         
 *         데이터형(리턴형) 메소드명(입력값,.....) => 선언부           //입력값은 여러개 들어갈 수 있다.
 *         {
 *            구현부
 *            결과값을 전송
 *            return 데이터형  ==> 반드시 1개
 *            ==> 결과값이 여러개 (배열,클래스)
 *         }
 *         
 *         ==> 1) 단을 받아서 해당 단을 출력하는 메소드
 *                리턴형, 매개변수
 *                void   int          //결과값을 출력하라 = void (데이터값이 많을때 주로 사용)
 */
public class 메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
