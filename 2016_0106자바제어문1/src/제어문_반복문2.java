/*
 *   1~100까지의 합을 출력
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; //더하기 누적값의 초기값은 0부터 , 곱하기 누적값의 초기값은 1부터
		for(int i=1;i<=100;i++)
		{
			sum+=i; // sum=sum+i
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("1~100까지의 합:"+sum);

	}

}
