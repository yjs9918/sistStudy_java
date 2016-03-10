/*
 *   1. year, month 입력 : 리턴 int , 매개변수 X(nextInt)
 *   2. 요일 계산
 *       => 1) 전년도까지 합 : int , int(year)
 *          2) 전달까지 합 : int , int(year)윤년인지 확인하기 위해 넣음,int(month)
 *          3) +1 ===> 요일 => int, int(total:전년도+전달 합)
 *          ==> 윤년  => boolean year (요일 구할때 호출)
 *   3. 달력 출력
 *       => void (year,month,week)
 */
import java.util.Scanner;
public class 메소드달력 {
	static int dateInput()
	{
		Scanner scan=new Scanner(System.in);
		return scan.nextInt();
	}
	// 전년도까지 합
	static int dateTotal(int year)
	{
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400; // 윤년 계산
		return total;
	}
	//전달
	static int dateLastDay(int year, int month)
	{
		int[] lastDay={31,28,31,30,31,30,
					   31,31,30,31,30,31};
		//boolean bCheck=isYear(year);
		//if(bCheck)... (but 한줄 더 길어지므로 바로 넣는 방식 이용)
		if(isyear(year))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		return lastDay[month-1]; //배열이기 때문에 입력값 -1 을 입력해야 요청한 달을 불러올 수 있다.
	}
	// 윤년 확인
	static boolean isyear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
			bCheck=true;
		return bCheck;
	}
	//전달까지의 합
	static int dateMonthCount(int year, int month)
	{
		int count=0;
		for(int i=1;i<=month-1;i++)
		{
			count+=dateLastDay(year,month);
		}
		return count;
	}
	//요일
	static int getWeek(int total)
	{
		return total%7;
	}
	//호출
	static void print(int year, int month,int week)
	{
		System.out.println(year+"년도 "+month+"월");
		char[] strWeek={'일','월','화','수','목','금','토'};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		//1,2,3,...
		for(int i=1;i<=dateLastDay(year, month);i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.print(i+"\t");
			week++;
			if(week>6)
			{
				System.out.println();
				week=0;
			}
		}
	}
	static void process()
	{
		System.out.print("년도 입력:");
		int year=dateInput();
		System.out.print("월 입력:");
		int month=dateInput();
		
		int total=dateTotal(year);
		total+=dateMonthCount(year, month);
		total++; //각 달의 1일을 구함
		int week=getWeek(total);
		//출력
		print(year, month, week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
