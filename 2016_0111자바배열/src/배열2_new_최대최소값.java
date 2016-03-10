
public class 배열2_new_최대최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// 값 변경
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 처리 (최대값, 최소값)
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<5;i++)
		{
			//최대값
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		// 출력
		System.out.println("원래 데이터");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		

	}

}
