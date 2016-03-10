/*
 * 구구단 짜기 (총 줄수는 6줄)
 * =====================
 * 2*1=1  3*1=1    4*1
 * .
 * .
 * 2*9=18
 * ======================
 * 3줄
 * ======================
 * 5*1=2  6*1=6  7*1=7
 * 
 * 
 * ======================
 * 3줄
 * ======================
 * 8*1=8  9*1=9
 * 
 * ======================
 * 
 */
public class HW20160114_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*for(int k=2;k<=9;k+=3)
			{			
				for(int i=1;i<10;i++)
				{
					for(int j=0;j<=2 && (k*j)<16;j++)
					{
						System.out.printf("%d*%d=%d\t",(k+j),i,(k+j)*i);
					}
					System.out.println();
				}
			System.out.println("\n\n");	
			}
		*/
		  
		for(int i=2;i<=9;i+=3)
		{
			for(int j=1;j<10;j++)
			{
				for(int k=i;k<=i+2 && k!=10;k++)
				{
					System.out.printf("%d*%d=%2d\t",k,j,(k*j));
				}
				System.out.printf("\n");
			}
			System.out.println("\n\n");
		}
		 
		
	}

}
