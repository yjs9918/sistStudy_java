/*
 *   관계연산자
 *     종류) == (같다)
 *         != (다르다)
 *         <  (작다)
 *         >  (크다)
 *         <= 작거나 같다 ( < || == )
 *         >= 크거나 같다 ( > || == )
 *     => 결과값은 항상 boolean (true/false)
 *     예)
 *         10<11 true
 *         10==11 false
 *         10<=11 true ( 10<11 || 10==11 )
 */
public class 이항연산자_관계연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=11;
		boolean result= a<b;
		System.out.println("result="+result);
		result= (a == b);
		System.out.println("result="+result);
		result=(a++ != b); //a
		// a=11
		System.out.println("result="+result);
		result= (a==b);
		System.out.println("result="+result);
		result=(a<=b); // a=11, b=11 (a<b || a==b)
		System.out.println("result="+result);
		result=(a>=b); // a=11, b=11 (a>b || a==b)
		System.out.println("result="+result);

	}

}
