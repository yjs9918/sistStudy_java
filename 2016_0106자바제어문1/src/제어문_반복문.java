/*
 *   �ݺ���
 *     => for : �ݺ� Ƚ���� ����
 *        while : �ݺ� Ƚ���� ������ ���� ���
 *        do~while : �ݵ�� �ѹ� �̻� ������ ��  
 *        
 *     => for
 *        ����)
 *                   1     2    4
 *              for(�ʱⰪ;���ǽ�;������)
 *                  �ݺ� ���๮��  3
 *                  
 *              �ʱⰪ => ���� �˻� => true : �ݺ����� ����
 *                                => ������
 *                               false : ����
 *              1 => 2 => 3 => 4
 *                   2 => 3 => 4
 *                   2 => 3 => 4
 *                   2������ false�� ����
 *                   
 *              for(int i=1;i<=10;i++)
 *                        ���
 */
public class ���_�ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10���� ���
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		// for
		System.out.println("for�� �̿�");
		for(int i=1;i<=10;i++)
			System.out.println(i);
		/*
		 *   for : {}�� ���� ��� => �ٷ� �ؿ� �ִ� ���� �Ѱ��� ����
		 *   
		 *   for()
		 *   {
		 *     ���� ==> for�� �Ҽӹ���
		 *     ���� ==> for�� �Ҽӹ���
		 *   }
		 *   for()
		 *     ����1 ==> for�� �Ҽӹ���
		 *     ����2 ==> ������ ����
		 *     
		 *   => for(;;) => ���ѷ��� => break
		 */
		

	}

}










