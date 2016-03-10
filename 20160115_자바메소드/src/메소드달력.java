/*
 *   1. year, month �Է� : ���� int , �Ű����� X(nextInt)
 *   2. ���� ���
 *       => 1) ���⵵���� �� : int , int(year)
 *          2) ���ޱ��� �� : int , int(year)�������� Ȯ���ϱ� ���� ����,int(month)
 *          3) +1 ===> ���� => int, int(total:���⵵+���� ��)
 *          ==> ����  => boolean year (���� ���Ҷ� ȣ��)
 *   3. �޷� ���
 *       => void (year,month,week)
 */
import java.util.Scanner;
public class �޼ҵ�޷� {
	static int dateInput()
	{
		Scanner scan=new Scanner(System.in);
		return scan.nextInt();
	}
	// ���⵵���� ��
	static int dateTotal(int year)
	{
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400; // ���� ���
		return total;
	}
	//����
	static int dateLastDay(int year, int month)
	{
		int[] lastDay={31,28,31,30,31,30,
					   31,31,30,31,30,31};
		//boolean bCheck=isYear(year);
		//if(bCheck)... (but ���� �� ������Ƿ� �ٷ� �ִ� ��� �̿�)
		if(isyear(year))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		return lastDay[month-1]; //�迭�̱� ������ �Է°� -1 �� �Է��ؾ� ��û�� ���� �ҷ��� �� �ִ�.
	}
	// ���� Ȯ��
	static boolean isyear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
			bCheck=true;
		return bCheck;
	}
	//���ޱ����� ��
	static int dateMonthCount(int year, int month)
	{
		int count=0;
		for(int i=1;i<=month-1;i++)
		{
			count+=dateLastDay(year,month);
		}
		return count;
	}
	//����
	static int getWeek(int total)
	{
		return total%7;
	}
	//ȣ��
	static void print(int year, int month,int week)
	{
		System.out.println(year+"�⵵ "+month+"��");
		char[] strWeek={'��','��','ȭ','��','��','��','��'};
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
		System.out.print("�⵵ �Է�:");
		int year=dateInput();
		System.out.print("�� �Է�:");
		int month=dateInput();
		
		int total=dateTotal(year);
		total+=dateMonthCount(year, month);
		total++; //�� ���� 1���� ����
		int week=getWeek(total);
		//���
		print(year, month, week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
