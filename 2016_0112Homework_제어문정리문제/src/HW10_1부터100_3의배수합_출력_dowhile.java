/*
 *   �ʱⰪ  => 1
 *   do
 *   {
 *     ����  => 2
 *     ������ => 3
 *   }while(���ǽ�); ==> 4 => true:����, false:����
 */
public class HW10_1����100_3�ǹ����_���_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;//3�� ����� �����ϴ� ����
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
				a+=i;
			}
		}
		System.out.println("\n3�� ��� ��:"+a);
		
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
		System.out.println("\n3�� ��� ��:"+a);
		
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
		System.out.println("\n3�� ��� ��:"+a);

	}

}
