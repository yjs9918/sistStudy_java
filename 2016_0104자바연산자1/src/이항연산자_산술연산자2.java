
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=20;
		int c=3;
		int d= a+(b*c); //70         ������� : *,/,% => +,-
		// ()�� �̿��Ѵ� => �ֿ켱 ���� ������
		System.out.println("d="+d);*/
		//int a=10;
		//double d=30.5;
		// a+d=double
		//double d2= a+d;
		// double a2=a+d;
		/*
		 *       a+d
		 *      ==
		 *      10.0 (int => double) �ڵ� ����ȯ
		 *      10.0 + 30.5 ==> 40.5
		 *      *** ������ ���� ������������ �Ѵ�
		 *      
		 *       a+(int)d => int
		 *       (int)(a+d)
		 *       =========== ���� ����ȯ
		 *       
		 *       double => int : �Ҽ��� ��ü ����(�ݿø�X)
		 *       10.5 + 10.5 ==> 21.0
		 *       (int)10.5 + (int)10.5 ==> 20
		 *       =========   ==========
		 *           1            2
		 *                 + (3)
		 *       (int)(10.5+10.5) ==> 21
		 *           ============ 1
		 *       ==== 2
		 */
			
		//System.out.println("d2="+d2);
		int a=10;
		int b=3;
		int c=a/b; // ����/���� = ����
		System.out.println("c="+c); // �Ҽ��� ����
		System.out.println("5%2="+5%2); //1
		System.out.println("-5%2="+ -5%2); //-1
		System.out.println("5%-2="+ 5%-2); //1
		System.out.println("-5%-2="+ -5%-2); //-1
		
	}

}
