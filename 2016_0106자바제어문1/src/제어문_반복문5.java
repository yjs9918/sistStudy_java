//1~100 -> 3의 배수의 합, 5의 배수의 합, 7의 배수의 합 출력
//1-2+3-4+5-6+7-8+9-10 의 합 출력
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100 -> 3의배수의합, 5의배수의합, 7의배수의합 출력
		int num3=0; //3의배수 합
		int num5=0; //5의배수 합
		int num7=0; //7의배수 합
		for(int i=1;i<=100;i++)
		{
			if (i%3==0)
				num3+=i;
			if (i%5==0)
				num5+=i;
			if (i%7==0)
				num7+=i;
			
		}
		//결과값 출력
		System.out.println("1~100까지의 3의 배수의 합:"+num3);
		System.out.println("1~100까지의 5의 배수의 합:"+num5);
		System.out.println("1~100까지의 7의 배수의 합:"+num7);
		
		
		//1-2+3-4+5-6+7-8+9-10 의 합 출력
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("sum="+sum);

	}

}
