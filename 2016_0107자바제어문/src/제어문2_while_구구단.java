// while => Ƚ���� ������ ���� ��� (���ѷ��� =<> while(true))
/*
 *   �ʱⰪ
 *   while(���ǽ�)
 *   {
 *     ����
 *     ������; ==> i++; i+=2;
 *   }
 */
// �������� �Է¹޾Ƽ� ������
import java.util.Scanner;
public class ���2_while_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		// �Է��� ���� �޸𸮿� ����
		int dan=scan.nextInt();
		// ����� => ������ ���
		int i=1; // 1~9 (��������) => �ϳ��� �����ϴ� ����
		while(i<=9)
		{
			System.out.printf("%-2d * %-2d = %-2d\n",dan,i,dan*i);
			i++;
		}

	}

}
