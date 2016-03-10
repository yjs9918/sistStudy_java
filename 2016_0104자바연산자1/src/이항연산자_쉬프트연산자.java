/*
 *   쉬프트 연산자
 *   (비트이동연산자) << (왼쪽) , >> (오른쪽)
 *   10<<2
 *    1010
 *  1010(00) ==>40
 *    13<<3
 *    1101
 *    1101000 ==> 104
 *    64+32+8 ==> 104
 *    
 *    X<<Y -->X*2^Y
 *    >>
 *    10>>2 ==> 2개를 버린다
 *    10(10)제외 ==> 2
 *    13>>>3 ==> 
 *    1(101) ==> 1
 *    
 *    X>>Y ==> X/2^Y
 */
public class 이항연산자_쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10<<2="+(10<<2));
		System.out.println("13<<3="+(13<<3));
		
		System.out.println("10>>2="+(10>>2));
		System.out.println("13>>3="+(13>>3));
		

	}

}
