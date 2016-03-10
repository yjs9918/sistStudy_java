/*
 *   초기값  => 1
 *   do
 *   {
 *     문장  => 2
 *     증가식 => 3
 *   }while(조건식); ==> 4 => true:문장, false:종료
 */
public class HW10_1부터100_3의배수합_출력_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;//3의 배수를 누적하는 변수
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
				a+=i;
			}
		}
		System.out.println("\n3의 배수 합:"+a);
		
		a=0;
		int i=1;
		do
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
				a+=i;
			}
			i++;
		}while(i<=100);
		System.out.println("\n3의 배수 합:"+a);
		
		a=0;
		i=1;
		while(i<=100)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
				a+=i;
			}
			i++;
		}
		System.out.println("\n3의 배수 합:"+a);

	}

}
