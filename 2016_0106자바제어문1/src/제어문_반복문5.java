//1~100 -> 3�� ����� ��, 5�� ����� ��, 7�� ����� �� ���
//1-2+3-4+5-6+7-8+9-10 �� �� ���
public class ���_�ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100 -> 3�ǹ������, 5�ǹ������, 7�ǹ������ ���
		int num3=0; //3�ǹ�� ��
		int num5=0; //5�ǹ�� ��
		int num7=0; //7�ǹ�� ��
		for(int i=1;i<=100;i++)
		{
			if (i%3==0)
				num3+=i;
			if (i%5==0)
				num5+=i;
			if (i%7==0)
				num7+=i;
			
		}
		//����� ���
		System.out.println("1~100������ 3�� ����� ��:"+num3);
		System.out.println("1~100������ 5�� ����� ��:"+num5);
		System.out.println("1~100������ 7�� ����� ��:"+num7);
		
		
		//1-2+3-4+5-6+7-8+9-10 �� �� ���
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
