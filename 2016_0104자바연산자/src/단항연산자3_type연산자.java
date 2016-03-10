/*
 *   타입연산자 : 캐스트연산자(형변환)
 *     예)  (int) , (char) , (double)...
 *        ==> (boolean) X
 *        ==> 클래스도 형변환이 존재
 *   upcasting : 자동 형변환
 *   downcasting : 강제 형변환
 *   
 *   (char)65 => int => char (downcasting)
 *   10.5 + 10
 *          ==
 *          10.0  ==> 10.5 + 10.0 = 20.5 (upcasting)
 *                                  ====
 *                                  (int)20.5 ==> 20
 */
public class 단항연산자3_type연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A');
		System.out.println((char)65);
		System.out.println((double)10);
		System.out.println((int)10.6);
		System.out.println(3/(double)2);
		// 정수/정수 = 정수
		// 정수/실수 = 실수

	}

}
