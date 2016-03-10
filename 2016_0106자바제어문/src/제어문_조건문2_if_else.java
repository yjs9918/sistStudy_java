/*
 *   if ~ else
 *   if => 조건문이 true
 *   else => 조건문이 false
 */

public class 제어문_조건문2_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=(int)(Math.random()*100)+1;
		//1~100 난수 : 컴퓨터에서 임의로 숫자를 추출
		if(num%2==0)
			System.out.println(num+"는(은) 짝수다");
		else
			System.out.println(num+"는(은) 홀수다");
		*/
		
		// 절대값
		int num=-1;
		if(num<0)
			System.out.println("절대값:"+(num*-1));
		else
			System.out.println("절대값:"+num);
		System.out.println("절대값:"+Math.abs(num));
		

	}

}
