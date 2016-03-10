/*
 *   버블정렬
 *   50 40 10 20 30
 *   == ==
 *   40 50
 *      == ==
 *      10 50
 *         == ==
 *         20 50
 *            == ==
 *            30 50
 *   ================= 1 round
 *   40 10 20 30 50(고정)
 *   == ==
 *   10 40
 *      == ==
 *      20 40
 *         == ==
 *         30 40
 *   ================= 2 round
 *   10 20 30 (40,50)
 *   == ==
 *   10 20
 *      == ==
 *      20 30
 *   ================= 3 round
 *   10 20 (30,40,50)
 *   == ==
 *   10 20
 *   ================= 4 round
 *   10 (20,30,40,50)
 */
public class 버블정렬 {

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
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
