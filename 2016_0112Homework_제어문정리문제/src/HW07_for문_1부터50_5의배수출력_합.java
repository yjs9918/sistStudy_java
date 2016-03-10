//5의 배수 => 변수
public class HW07_for문_1부터50_5의배수출력_합 {
	public static void main(String[] args) {
		
		int num5=0; //5의배수
		for (int i=1;i<=50;i++)
		{
			if(i%5==0)
			{
				num5+=i;
				System.out.print(i+" ");
			}
		}
//		System.out.println();
		System.out.println("\n1~50까지 5의 배수 합:"+num5);				
	}

}
