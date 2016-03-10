//정수를 입력 받아서 => 구구단을 출력
import java.util.Scanner;
public class 제어문_반복문3_for_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("2~9사이의 정수 입력:");
		int dan=scan.nextInt();
		// 구구단을 출력
		for (int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}

	}

}
