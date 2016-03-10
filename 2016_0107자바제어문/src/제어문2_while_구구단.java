// while => 횟수가 지정이 없는 경우 (무한루프 =<> while(true))
/*
 *   초기값
 *   while(조건식)
 *   {
 *     문장
 *     증가식; ==> i++; i+=2;
 *   }
 */
// 정수값을 입력받아서 구구단
import java.util.Scanner;
public class 제어문2_while_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		// 입력한 값을 메모리에 저장
		int dan=scan.nextInt();
		// 결과값 => 구구단 출력
		int i=1; // 1~9 (루프변수) => 하나씩 증가하는 변수
		while(i<=9)
		{
			System.out.printf("%-2d * %-2d = %-2d\n",dan,i,dan*i);
			i++;
		}

	}

}
