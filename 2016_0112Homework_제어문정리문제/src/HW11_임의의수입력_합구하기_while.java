
public class HW11_�����Ǽ��Է�_�ձ��ϱ�_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		// ���� ���� ����
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
