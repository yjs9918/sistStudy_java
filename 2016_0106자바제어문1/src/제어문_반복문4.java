// 1~100까지 => 홀수의 합, 짝수의 합, 총합

public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0; //짝수
		int odd=0; //홀수
		int sum=0; //총합
		for(int i=1;i<=100;i++)
		{
			if (i%2==0)
				even+=i;
			else
				odd+=i;
			sum+=i;
		}
		//결과값 출력
		System.out.println("1~100까지 짝수의 합: "+even);
		System.out.println("1~100까지 홀수의 합: "+odd);
		System.out.println("1~100까지 전체 합: "+sum);
		
		
	}

}
