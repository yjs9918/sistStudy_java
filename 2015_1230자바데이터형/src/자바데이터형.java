/*
 *   자바에서 제공하는 데이터형
 *   정수형
 *     byte  (1byte)  -128 ~ 127만 저장이 가능
 *     short (2byte)  -32768 ~ 32767만 저장이 가능
 *     int   (4byte)  -21억4천 ~ 21억 4천
 *      ==> 평상시에 사용하는 모든 정수는 int를 인식
 *          (default)
 *     long  (8byte)  -2^63 ~ 2^63-1
 *        ******* int, long의 구분은(l,L)
 *        10 : int
 *        10L : long
 *        10l : long
 *   실수형
 *     float (4byte) => 소수점 이하 6자리
 *     double (8byte) => 소수점 이하 15자리
 *       => default
 *       ******** float, double => F,f
 *       10.5F (4byte) float
 *       10.5f float
 *       10.5  double
 *       10.5D double (D가 생략이 가능)
 *   문자형
 *     char (2byte) = 0 ~ 65535 (모든 캐릭터는 고유번호를 가지고 있다)
 *        'A' = 65
 *        'a' = 97
 *        '0' = 48  '0' != 0
 *        1byte(single byte) => ASC
 *        2byte(multi byte) => unicode(자바)
 *   논리형
 *     boolean (1byte) : true / false
 *      => 조건식을 만들 경우에 주로 사용
 *   참조형 (배열,클래스) => 메모리 주소를 참조
 *   
 *   =====================================================
 *   데이터를 저장 (변수) => 식별자
 *   변수를 만드는 방법
 *   1) 알파벳, 한글로 시작한다
 *      (단 알파벳은 대소문자를 구분한다)
 *   2) 숫자사용이 가능 (단 앞에 사용 할 수는 없다)
 *   3) 특수문자 사용이 가능 ($,_)
 *   4) 키워드(예약어)는 사용 할 수 없다
 *      => 예약어는 자바에서 이미 사용중인 단어
 */
public class 자바데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 선언
		/*
		 *   1) 선언
		 *     데이터형 변수명;
		 *     정수값 10을 저장
		 *     int a;
		 *   2) 값을 대입
		 *     a = 10; ==> ;는 문장의 종료 (명령문)
		 *   =================
		 *   1) 선언과 동시에 값 대입
		 *     int a = 10;
		 *     
		 *     int a = 10;
		 *     int b = 20;
		 *     int c = 30;
		 *     
		 *     int a,b,c;
		 *     a = 10;
		 *     b = 20;
		 *     c = 30;
		 *     
		 *     int a = 10,  b = 20, c = 30;
		 *     데이터형이 같을 경우에만 , 로 구분하여 사용
		 *     
		 *     큰데이터형에는 작은 데이터형을 첨부 가능
		 *     long l = 10;
		 *     ----     --
		 *      8       4
		 *      
		 *     int i = 10L (X)
		 *     int i = 'A';
		 *     
		 *     ****** char는 정수다
		 *     char c = 65; 'A'
		 *  
		 *     'A' + 1
		 *     ===  ===
		 *      2    4
		 *      
		 *      'A' ==> 65
		 *      65 + 1 ==> 66 (int)
		 *      
		 *      10.5 + 10
		 *      ====  ====
		 *       8     4
		 *            ====
		 *            8 (10.0)
		 */
       byte byteValue = (byte) 127;
       // 1바이트 메모리 할당 => 127을 첨부 => 이름 byteValue
       short shortValue = 32767;
       int intValue = 2147000000;
       long longValue = 2000000000;
       
       char charValue = 'A';
       
       float floatValue = 10.5F;
       double doubleValue = 10.5;
       
       boolean bCheck = false;
       
       System.out.println(byteValue);
       System.out.println(intValue);
       System.out.println(longValue);
       System.out.println(charValue);
       System.out.println(floatValue);
       System.out.println(doubleValue);
       System.out.println(bCheck);
       
	}

}
