/*
 *   문자열 데이터
 *   ========
 *   char[] ==> 제어하는 클래스 제공 String
 *   String : 문자열을 저장해서 사용이 가능
 *            문자열을 제어할 수 있는 메소드가 존재한다
 *   1) 저장하는 방법
 *      int[] arr={1,2,3,4,5};
 *      String str1="Hello Java!!"; //주소값으로 저장
 *      String str2="Hello Java!!"; // 이렇게 쓰면 str1,str2의 주소값은 같다.(같은문자열은 주소값이 같다)
 *      char[] str1={'H','e'......);
 *      "" => 문자열은 그 자체가 주소
 *      str1==str2
 *      String str2=new String("Hello Java!!"); //주소값으로 저장
 *      윈도우와 웹은 정수라는 개념이 없다. only 문자열
 */
public class 문자열데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello Java";
		String str2="Hello Java";
		if(str1==str2)
		{
			System.out.println("str1과 str2은 같은 주소를 가지고 있다.");
		}
		String str3=new String("hello java");
		if(str1==str3)
		{
			System.out.println("str1==str3");
		}
		else
		{
			System.out.println("str1!=str3");
		}
		
		if(str1.equalsIgnoreCase(str3)) // equals => 가지고 있는 값 비교(대소문자 구분)
			                            // equalsIgnoreCase => 대소문자 구분X
		{
			System.out.println("str1==str3");
		}
		
		System.out.println(str1.toUpperCase()); // toUpperCase => 값을 읽어와서 대문자로 바꿔서 출력
		System.out.println(str1.toLowerCase()); // toLowerCase => 값을 읽어와서 소문자로 바꿔서 출력
		// 원래 저장했던 데이터는 그대로 유지된다. 출력만 바꿔서 출력
		// str1=str1.toLowerCase(); //값을 바꿔줬기 때문에 소문자로 출력된다.
		System.out.println(str1);
	}

}
