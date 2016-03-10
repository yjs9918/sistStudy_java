import java.util.Scanner;
/*
 *   문자열 ==> 정수 입력을 받는다
 *   배열에 저장
 *   저장된 값을 나누기
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("1' 정수입력:");
			String num1=scan.next();
			System.out.print("2' 정수입력:");
			String num2=scan.next();
			//정수 변환
			int a=Integer.parseInt(num1); //error
			int b=Integer.parseInt(num2);
			
			//배열에 저장
			int[] arr=new int[2];
			arr[0]=a;
			arr[1]=b;
			
			System.out.println(arr[0]/arr[1]);
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없다:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의 범위를 초과:"+e.getMessage());
		}catch(NumberFormatException e)
		{
			System.out.println("정수 변환을 할 수 없다:"+e.getMessage());
		}
	}

}
