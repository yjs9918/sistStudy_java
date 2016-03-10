/*
 *   올림차순(작은게 앞으로)
 *   50 40 10 20 30
 *   == ==
 *   40 50
 *   ==    ==
 *   10    40
 *   ==       ==
 *   10       20
 *   ==          == 1 round
 *   10          30
 *   =======================
 *   10 50 40 20 30
 *      == ==
 *      40 50
 *      ==    ==
 *      20    40
 *      ==       == 2 round
 *      20       30
 *   =======================
 *   10 20 50 40 30
 *         == ==
 *         40 50
 *         ==    == 3 round
 *         30    40
 *   =======================
 *   10 20 30 50 40
 *            == == 4 round
 *            40 50
 *   =======================
 *   10 20 30 40 50
 *         
 */
public class 선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬전:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("정렬후:");
		//정렬
		/*
		 *  int a=10;
		 *  int b=20;
		 *  a=b; ==> a=20
		 *  b=a; ==> b=20
		 *  
		 *  int temp=a; temp=10
		 *  a=b; a=20
		 *  b=temp; b=10
		 */
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}













