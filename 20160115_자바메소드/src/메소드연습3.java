/*
 *   최대값, 최소값 ==> 정수 5개
 *   int max(int[] arr)
 *   int min(int[] arr)
 */
public class 메소드연습3 {
	static int max(int[] arr)
	{
		int m=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(m<arr[i])
				m=arr[i];
		}
		return m;
	}
	static int min(int[] arr)
	{
		int m=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(m>arr[i])
				m=arr[i];
		} 
		return m;
	}
	static void process()
	{
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
		}
		int m1=max(arr);
		int m2=min(arr);
		System.out.println("max:"+m1);
		System.out.println("min:"+m2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
