/*
 *   년도를 입력을 받아서 윤년인지 확인
 *   윤년 => 4년마다 1번
 *         100년마다 제외
 *         400년마다 윤년
 */
import java.util.Scanner;
public class 제어문_조건문1_단일조건문2_윤년 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		// 입력을 받아서 메모리에 저장
		// 처리
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년입니다");
		if(!((year%4==0 && year%100!=0)||(year%400==0)))
			System.out.println(year+"년도는 윤년이 아닙니다");

	}

}
