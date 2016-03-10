/*
 *   2*1=2 ==== 9*1=9  ==>2차 for(가로로 들어가는데 2차for)
 *   ==
 *   ==
 *   2*9=18     9*9=81
 *   1차
 *   
 *   1###
 *   #2##
 *   ##3#
 *   ###4
 *   
 *   A
 *   BC
 *   DEF
 *   GHIJ
 *   
 *   A
 *   AB
 *   ABC
 *   ABCD
 */
public class 배열7_구구단_별찍기응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%d*%d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();*/
		
		/*char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=4;i++)
		{   char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}

	}

}
