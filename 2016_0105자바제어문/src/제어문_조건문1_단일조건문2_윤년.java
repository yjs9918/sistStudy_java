/*
 *   �⵵�� �Է��� �޾Ƽ� �������� Ȯ��
 *   ���� => 4�⸶�� 1��
 *         100�⸶�� ����
 *         400�⸶�� ����
 */
import java.util.Scanner;
public class ���_���ǹ�1_�������ǹ�2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year = scan.nextInt();
		// �Է��� �޾Ƽ� �޸𸮿� ����
		// ó��
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"�⵵�� �����Դϴ�");
		if(!((year%4==0 && year%100!=0)||(year%400==0)))
			System.out.println(year+"�⵵�� ������ �ƴմϴ�");

	}

}
