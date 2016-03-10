/*
 *   �߱�����
 *   1) ���� �߻� int[] com
 *   =================
 *   2) ����� �Է� int[] user
 *   3) ��           com, user => s,b
 *   4) ��Ʈ           s,b
 *   5) ���� ����    s
 *   =================����
 *   �Ű����� : ����� ��û��, �����͸� �ٸ� �޼ҵ�� ����
 */
// �޼ҵ� : ������ ���� (Call by Reference, Call by Value)
// Call by Reference : �迭, Ŭ����
// Call by Value: �Ϲݵ�����(int,double...)
public class �Ϲݸ޼ҵ� {
	static void getRand(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	static int[] getRand2(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	static void process()
	{
		int[] arr={1,2,3,4,5};
		getRand(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int[] arr2=getRand2(arr);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
