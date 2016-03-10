/*
 *   단항연산자
 *     = 증감연산자 (++,--)
 *       => 1개 증가, 1개 감소
 *          int a = 10;
 *          a++;
 *          => a=a+1;
 *          *** 전치 연산자
 *          예)
 *             int a=10;
 *             int b=++a
 *                == ===
 *                2번    1번   (연산순서)
 *             1) a를 1개 증가한다
 *             2) 증가된 a값을 b에 대입한다
 *                a=11,b=11
 *          *** 후치 연산자
 *              int a=10;
 *              int b=a++;
 *                 == ===
 *                 1번   2번   (연산순서)   
 *              1) a값을 b에 대입한다
 *              2) a값을 1개 증가
 *                 a=11,b=10
 *     = 부정연산자 ( ! )
 *     
 *     = 반전연산자 ( ~ )
 *     = 캐스트연산자 ( (데이터형) ) ->형변환
 */
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 저장
		int a = 10;
		int b = ++a;
		System.out.println("a="+a); //11
		System.out.println("b="+b); //11
		//문자열 => ""
		/*
		 * 7+"7"+7 ==> "777"
		 * 숫자 + 숫자 = 숫자(산술) / 문자열 + 숫자 = 문자의 결합
		 */
		a=10;
		b=a++;
		System.out.println("a="+a); //11
		System.out.println("b="+b); //10
		
		a=10;
		b=a++ + a++ + a++;
		// a=10 , +1, a=11, + 1, a=12
		// a=13, 33
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=10;
		b=++a + ++a + ++a;
		// 11   12     13
		System.out.println("a="+a); //13
		System.out.println("b="+b); //36

	}

}
