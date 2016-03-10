// 년도, 월, 일 입력을 받아서 ==> 요일을 출력
/*
 *   1년도 1월 1일 ~~ 입력한 날까지 (총 날수를 구하고)
 *     총 날수%7 ==> 요일을 구하기 가능 (0 ~6)
 *     
 *   => 전년도까지 총합 2016 ~~ 2015*365
 *   => 전달까지 총합 2015*265+31+...
 *   => 입력한 날       1
 *   =============== +
 *   => 윤년
 *      1) 4년마다
 *      2) 100년마다 제외
 *      3) 400년마다 포함
 */
import java.util.Scanner;
public class 배열5_달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력");
		int year=scan.nextInt();
		
		System.out.print("월 입력");
		int month=scan.nextInt();
		
		/*System.out.print("일 입력");
		int day=scan.nextInt();*/
		
		// 총 날수
		// 전 년도 까지 총 날수를 구한다
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		//전달까지 합
		int[] lastDay={31,28,31,30,31,30,
				31,31,30,31,30,31};
		if((year%4==0 && year%100!=0 || (year%400==0)))
			//윤년이면
		{
			lastDay[1]=29;
		}
		else
		{
			lastDay[1]=28;
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
//		total+=day;
		total++; // 각 달의 1일자
		char[] strWeek={'일','월','화','수','목','금','토'};
		// 요일 구하기
		int week=total%7; // 요일 (1년도 1월 1일 =>월)
		//출력
		/*System.out.printf("%d년도 %d월 %d일은 %c요일입니다",year,month,day,strWeek[week]);*/
		System.out.println(year+"년도 "+month+"월");
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastDay[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}// 요일 전까지 제외(공백)
			System.out.printf("%2d\t",i);
			week++; //요일 확인 => 일요일이면
			if(week>6)
			{
				System.out.println(); // 다음줄에 출력
				week=0;
			}
		}

	}

}
