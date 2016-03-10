/*
 *   논리연산자
 *     조건 && 조건 : 조건이 둘 다 true일때만 true 
 *     조건 || 조건 : 조건이 둘 중에 하나라도 true면 true
 *     ==    ==
 *      1     2
 *        ==
 *         3
 *         
 *     && ( ~이고 )
 *     ======================
 *      true true => true
 *     ======================
 *      true false => false
 *     ======================
 *      false true => false
 *             무시
 *     ======================
 *      false false => false
 *             무시
 *     ======================
 *     ==> 앞에 있는 조건이 false => 뒤에 있는 조건은 처리하지 않는다
 *     
 *     || ( ~이거나 )
 *     ======================
 *      true true => true
 *            무시
 *     ======================
 *      true false => true
 *            무시
 *     ======================
 *      false true => true
 *     ======================
 *      false false => false
 *     ======================
 *     ==> 앞에 있는 조건이 true => 뒤에 있는 조건은 처리하지 않는다
 *     
 *     ==> && => 범위안에 있는 경우
 *          score >= 0 && score <= 100
 *         || => 범위를 벗어나는 경우
 *          score < 0 || score > 100
 *               ↓
 *          if database
 *          BETWEEN ~ AND 로 표현
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		boolean result= (a<b && ++b==a);
		//                f => 뒤 조건 처리X
		System.out.println("result="+result);
		System.out.println("b="+b);
		// a=10, b=9
		result=(a>b && ++b==a);
		System.out.println("result="+result);
		System.out.println("b="+b);
		// a=10, b=10
		result=(a>b || ++b==a);
		//       f        f
		// b==11 (if a==b || ++b==a라면 b==10)
		System.out.println("result="+result);
		System.out.println("b="+b);
		// a=10, b=11
				

	}

}
