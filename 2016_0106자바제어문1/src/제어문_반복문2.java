/*
 *   1~100������ ���� ���
 */
public class ���_�ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; //���ϱ� �������� �ʱⰪ�� 0���� , ���ϱ� �������� �ʱⰪ�� 1����
		for(int i=1;i<=100;i++)
		{
			sum+=i; // sum=sum+i
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("1~100������ ��:"+sum);

	}

}
