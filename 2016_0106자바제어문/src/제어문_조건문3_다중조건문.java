/*
 *   ���� ���ǹ�
 *   ����)
 *       if(���ǹ�)
 *         ���� ==> ���ǹ��� true�� ������ ���� => ����
 *                ���ǹ��� false�� ���� �������� �̵�
 *       else if(���ǹ�)
 *         ���� ==> ���ǹ��� true�� ������ ���� => ����
 *                ���ǹ��� false�� ���� �������� �̵�
 *       else if(���ǹ�)
 *         ���� ==> ���ǹ��� true�� ������ ���� => ����
 *                ���ǹ��� false�� ���� �������� �̵�
 *       else if(���ǹ�)
 *         ���� ==> ���ǹ��� true�� ������ ���� => ����
 *                ���ǹ��� false�� ���� �������� �̵�
 *       else
 *         ���� ==> �ش��ϴ� ������ ���� ��쿡 ���� 
 */
// 3���� ������ �Է¹޾Ƽ� ����, ���, ������ ���
import java.util.Scanner;
public class ���_���ǹ�3_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("��������:");
		int kor=scan.nextInt();
		System.out.print("��������:");
		int eng=scan.nextInt();
		System.out.print("��������:");
		int math=scan.nextInt();
		
		//����
		int total = kor+eng+math;
		//���
		double avg = total/3.0;
		//����
		char hak='A';
		if((int)avg>=90)
			hak='A';
		else if((int)avg>=80)
			hak='B';
		else if((int)avg>=70)
			hak='C';
		else if((int)avg>=60)
			hak='D';
		else
			hak='F';
		
		//���
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		System.out.println("���:"+avg);
		/*
		 *   %d  : ����
		 *   %f  : �Ǽ�
		 *   %c  : ����
		 *   %s  : ���ڿ�
		 *   
		 *   \n ==> �����ٿ� ��� (new line)
		 *   \t ==> �������� (tab)
		 */
		System.out.println("����:"+hak);

	}

}
