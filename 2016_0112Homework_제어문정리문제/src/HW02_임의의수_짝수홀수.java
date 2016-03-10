/*
 *   if ~ else
 *   if(조건문)
 *     문장 ==> 조건이 true일 때 수행
 *   else
 *     문장 ==> 조건이 false일 떄 수행
 */
import java.util.Scanner;
public class HW02_임의의수_짝수홀수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+"는(은) 짝수");
		}
		else
		{
			System.out.println(num+"는(은) 홀수");
		}
		//중괄호 생략해도 가능*/	
		
		int a=(int)(Math.random()*100)+1;
		if(a%2==0)//짝수
			System.out.println(a+"은(는) 짝수");
		else
			System.out.println(a+"은(는) 홀수");
		
	}

}
