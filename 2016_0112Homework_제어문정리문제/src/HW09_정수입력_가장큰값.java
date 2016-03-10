
import java.util.Scanner;
public class HW09_정수입력_가장큰값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("1번째 정수를 입력하세요:");
		int num1=scan.nextInt();
		System.out.print("2번째 정수를 입력하세요:");
		int num2=scan.nextInt();
		System.out.print("3번째 정수를 입력하세요:");
		int num3=scan.nextInt();
		
		int max=0;
		
		if(num1>num2)             -최대값을 구하는 방법을 몰랐음
			max=num1;
		else if(num1>num3)
			max=num3;
		else
			max=num2;
		
		System.out.print("세 수중 가장 큰 값은:"+max);
*/
		int[] arr=new int[3];
		int max=0;
		//int min=100;
		//배열의 초기값 부여
		for(int i=0;i<3;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//배열중에 최대값 구하기
		int min=arr[0];
		for(int i=0;i<3;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		//출력
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
