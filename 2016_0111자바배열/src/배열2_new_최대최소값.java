
public class �迭2_new_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// �� ����
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// ó�� (�ִ밪, �ּҰ�)
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<5;i++)
		{
			//�ִ밪
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		// ���
		System.out.println("���� ������");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);
		

	}

}
