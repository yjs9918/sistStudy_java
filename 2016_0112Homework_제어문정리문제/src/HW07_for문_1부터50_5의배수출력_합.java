//5�� ��� => ����
public class HW07_for��_1����50_5�ǹ�����_�� {
	public static void main(String[] args) {
		
		int num5=0; //5�ǹ��
		for (int i=1;i<=50;i++)
		{
			if(i%5==0)
			{
				num5+=i;
				System.out.print(i+" ");
			}
		}
//		System.out.println();
		System.out.println("\n1~50���� 5�� ��� ��:"+num5);				
	}

}
