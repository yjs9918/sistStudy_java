
public class 메소드데이터전달방식 {
	// Call By Value
	static void swap1(int a, int b)
	{
		System.out.println("a="+a+" ,b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경후:a="+a+" ,b="+b);
	}
	// Call By Reference
	static void swap2(int[] arr)
	{
		System.out.println("변경전:arr[0]="+arr[0]+" ,arr[1]="+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("변경후:arr[0]="+arr[0]+" ,arr[1]="+arr[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		swap1(a,b);
		System.out.println("Main:a="+a+" ,b="+b);
		int[] arr={10,20};
		swap2(arr);
		System.out.println("Main:arr[0]="+arr[0]+" ,arr[1]="+arr[1]);
	}

}
