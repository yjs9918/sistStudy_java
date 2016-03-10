/*
 *   야구게임
 *   1) 난수 발생 int[] com
 *   =================
 *   2) 사용자 입력 int[] user
 *   3) 비교           com, user => s,b
 *   4) 힌트           s,b
 *   5) 종료 여부    s
 *   =================루프
 *   매개변수 : 사용자 요청값, 데이터를 다른 메소드로 전송
 */
// 메소드 : 데이터 전송 (Call by Reference, Call by Value)
// Call by Reference : 배열, 클래스
// Call by Value: 일반데이터(int,double...)
public class 일반메소드 {
	static void getRand(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	static int[] getRand2(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	static void process()
	{
		int[] arr={1,2,3,4,5};
		getRand(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int[] arr2=getRand2(arr);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
