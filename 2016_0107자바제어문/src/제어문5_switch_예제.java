import java.util.Scanner;
// 두개 정수 => 연산자 ==> 처리
public class 제어문5_switch_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("1' 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("2' 정수입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자(+,-,*,/):");
		// 처리
		switch(scan.next())  //next:문자 받을때 씀   nextInt:정수값 받을때 씀
		{
		case "+" :
			System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
			break;
		case "-" :
			System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
			break;
		case "*" :
			System.out.printf("%d*%d=%d\n", num1,num2,num1*num2);
			break;
		case "/" :
			if(num2==0)
				System.out.println("0으로 나눌 수 없다");
			else
			System.out.printf("%d/%d=%d\n", num1,num2,num1/num2);
			break;
		default : 
			System.out.println("잘못된 연산자입니다");
			
		
		}

	}

}
