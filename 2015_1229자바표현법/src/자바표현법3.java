/*
 * 출력방법
 *   System.out.println() => new line
 *     System.out.println("Hello");
 *     System.out.println("Java");
 *     Hello
 *     Java
 *   System.out.print()
 *     System.out.print("Hello");
 *     System.out.print("Java");
 *     HelloJava
 *   System.out.printf()
 *   
 *   (int)((123456.78-123456)*100)
 */
public class 자바표현법3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Java");
		System.out.print("Hello\t"); 
		// \n => (new line : 다음줄 출력)
		// \t => (tab : 일정 간격)
		System.out.print("Java");
		/*
		System.out.printf(); 서식이 있는 출력
		JDK => 1.5이상 (C언어에서 도입)
		*/
		System.out.println(86/3.0);
		System.out.printf("%.2f", 86/3.0);
		/*
		 *   %d : 정수 출력
		 *   %s : 문자열 출력
		 *   %c : 문자 출력
		 *   %f : 실수 출력
		 *   
		 *   %f   ==> %5.2f  소수점 2자리 출력 (소수점 앞 자리는 칸 간격) 
		 *   5이상일 땐 반올림 하므로 조심해서 사용해야 한다.
		 */
		System.out.printf("%5d%5d%5d",85,89,90); 
		// 앞의 숫자가 칸 간격 => 5칸 중 정수 2자리가 칸 차지 후 나머지 3칸 띄어쓰기
		// - 값 : 왼쪽 정렬   + 값: 오른쪽 정렬
		
		//System.out.println((int)((123456.78f-123456)*100)); => byte 수를 맞춰줘야 우리가 예상한 값이 나온다.
	}
}
