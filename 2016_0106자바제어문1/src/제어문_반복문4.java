// 1~100���� => Ȧ���� ��, ¦���� ��, ����

public class ���_�ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0; //¦��
		int odd=0; //Ȧ��
		int sum=0; //����
		for(int i=1;i<=100;i++)
		{
			if (i%2==0)
				even+=i;
			else
				odd+=i;
			sum+=i;
		}
		//����� ���
		System.out.println("1~100���� ¦���� ��: "+even);
		System.out.println("1~100���� Ȧ���� ��: "+odd);
		System.out.println("1~100���� ��ü ��: "+sum);
		
		
	}

}
