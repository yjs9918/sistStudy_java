
public class HW11_임의의수입력_합구하기_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		// 누적 저장 변수
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println("sum:"+sum);
		
		sum=0;
		int i=1;
		while(i<=a)
		{
			sum+=i;
			i++;		
		}
		System.out.println("sum"+sum);
		
		sum=0;
		i=1;
		do
		{
			sum+=i;
			i++;
		}while(i<=a);
		System.out.println("sum"+sum);
		

	}

}
