/*
 *  정수
 *    10진법 : 일반 숫자 (10,34,56...)
 *    8진법 : 012,013,014... (0숫자)
 *    16진법 : 0x55,0x88...(0x..)
 *  실수
 *    10.34 (8byte) ==> 소숫점이하 15자리 , 10.34F (4byte)  ==> 소숫점이하 6자리
 *    4 byte는 21억 4천 정도의 숫자까지만 표현 가능
 *  문자
 *  	'' ==> 한글자만 저장 => 고유번호를 가지고 있다
 *				연산시에 항상 고유번호로 변경해서 연산
 *			   'A' => 65
 *			   'a' => 97
 *			   '7' => 55
 *			   '0' => 48
 *    
 *  논리 : true / false
 *  문자열 : ""
 *  	한글자 이상 사용
 *  	"a", "aabbba", "adsldad"
 */
public class 자바표현법2 {
	
	public static void main(String[] args) {
	System.out.println(012);
	System.out.println(0xFF);
	System.out.println("A"+1); //A1
	System.out.println('A'+1); //66
	System.out.println('7'+1); //56
	System.out.println("7"+1); //71
	
	// 'A' ==> 65 ,L '7' ==> 55 (ASC) 아스키코드값 에서 ==> 유니코드로 넘어옴
	// ASC ==> 255문자 , 유니코드 : 65535문자
	System.out.println(10.34);
	System.out.println(10.34F);
	System.out.println(10000000000000000L);  // 일반 숫자는 4byte ,L을 붙여줌으로써 8byte로 변환
	/*
	 * 일반 정수 : 4byte => 21억 4천
	 * 			~L , l => (8byte)
	 * 일반 실수 : 8byte
	 * 		  4byte로 변경 ~F , f
	 */
	System.out.println((int)'A');
	System.out.println((int)'0');
	System.out.println((char)65);
	System.out.println(true);
	System.out.println(false);
	System.out.println("홍길동");
	// "홍길동"
	System.out.println("\"홍길동\""); 
	System.out.println("c:\\javaDev\\javaStudy"); 
	// \ => \\ , " => \"
	}
}
