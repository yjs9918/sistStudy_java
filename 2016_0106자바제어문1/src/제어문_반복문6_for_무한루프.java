//UPDOWN���� 
import java.util.Scanner; //Scanner �ڸ� ��ſ�  *�� ���� ���� �� �����´�.(������ �� �� �̿�)
//��Ű�� : ���õ� Ŭ������ ����
public class ���_�ݺ���6_for_���ѷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �߻�(1~100)
		int com=(int)(Math.random()*100)+1;
		//Math.random() 0.0 ~ 0.99  => 0~99 => +1 1~100
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;)
		{
			System.out.print("1~100���� ���� �Է�:");
			int user=scan.nextInt();
			// count++  �����󰪺��� �Է�Ƚ���� count�Ѵ�
			// ����ڰ� �Է��� ������ �޴´�
			if(user<1 || user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�");
				continue;
				/*
				 *   for => ���������� �̵�
				 *   while => ���ǽ����� �̵�
				 */
			}
			// count++;  ���󰪺��� �Է�Ƚ���� count�Ѵ�
			// �� �Ŀ� ��Ʈ�� �ش�
			count++;
			if(com>user)
			{
				System.out.println("�Է°����� ū ���� �Է��ϼ���");
			}
			else if(com<user)
			{
				System.out.println("�Է°����� ���� ���� �Է��ϼ���");
			}
			else //����
			{
				System.out.println("Game Over!!");
				System.out.println("�Է�Ƚ��:"+count);
				break;
			}
		}

	}

}















