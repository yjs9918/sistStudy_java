import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

//다른 데이터형을 저장
/*  67
 *  2진법 => 1 0 0 0 0 1 1
 *  8진법 => 0103 (2진법에서 뒤에서 3개씩 나눠서 계산)
 *  16진법 => 0x43 (2진법에서 뒤에서 4개씩 나눠서 계산)
 * 
 *  163
 *  2진법 => 1 0 1 0 0 0 1 1
 *  8진법 => 0243
 *  16진법 =>0xA3
 *  
 *  음수표현 (2의 보수) 음수는 양수에서 +1 된 값에서 음수가 된다.
 *  5
 *  => 00000101
 *  ===========
 *     11111010
 *    +       1
 *    =========
 *     11111011
 *  6
 *  => 00000110
 *  => 11111010
 *     ========
 *     00000101 => 5
 *    +       1 => 6 ==> -6
 */
public class 자바데이터형2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 'A'; // 65
		char charValue = 65; // 'A'
		double doubleValue = 10; // 10.0
		// 자동형변환 (upcasting)
		int intValue2 = (int)10L;
		int intValue3 = 0243; // 163
		int intValue4 = 0xA3; // 163
		// 강제형변환 (downcasting)
		int a = 100;
		System.out.println(intValue);
		System.out.println(charValue);
		System.out.println(doubleValue);
		System.out.println(intValue2);
		System.out.println(intValue3);
		System.out.println(intValue4);
		System.out.println(0xA3); //16진법은 바로 사용 가능
		System.out.println(0243); //8진법은 바로 사용 가능
		System.out.println(10100011); //2진법은 바로 사용 불가능 => 다른 함수 사용
		System.out.println(~a); // ~ 표시는 음수표현
	}

}
