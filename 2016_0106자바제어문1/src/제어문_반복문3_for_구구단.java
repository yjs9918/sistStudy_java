//������ �Է� �޾Ƽ� => �������� ���
import java.util.Scanner;
public class ���_�ݺ���3_for_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("2~9������ ���� �Է�:");
		int dan=scan.nextInt();
		// �������� ���
		for (int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}

	}

}
