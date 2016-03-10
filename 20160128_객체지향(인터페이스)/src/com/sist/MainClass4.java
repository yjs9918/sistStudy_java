package com.sist;
/*
 *     j
 *     =================================
 *  i                  1
 *     =================================
 *                 2   3   4 
 *     =================================
 *             5   6   7   8   9 
 *     =================================
 *                 10  11  12
 *     =================================
 *                     13
 *     =================================
 *     
 *     i      j-s      j-e
 *     0       2        2
 *     1       1        3
 *     2       0        4
 *     
 *        i+(j-s)=2 ==> (j-s)=2-i  시작점
 *        i+2=(j-e) ==> (j-e)=i+2
 *     ===================
 *     3       1        3
 *     4       2        2
 *        i=(j-s)+2 ==> (j-s)=i-2
 *        (j-e)+i=6 ==> (j-e)=6-i
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5];
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=2-i;j<=i+2;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=3;i<=4;i++)
		{
			for(int j=i-2;j<=6-i;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		//출력
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]==0)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println("\n");
		}
	}

}
