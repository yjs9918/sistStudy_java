/*
 *   ���� for
 *        1    2   4
 *   for(�ʱⰪ;���ǽ�;������)  ==> �ټ�
 *   {
 *     ======================= 3
 *          1    2   4
 *          2=> true �������
 *           => false => 1�� for�� 4
 *     for(�ʱⰪ;���ǽ�;������) ==> ������ �ݺ� ����
 *     {
 *       ����  3
 *     }
 *     ================================
 *   }
 */
public class HW04_for��_1����100���_����10�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=100;i++)
		{
			System.out.printf("%-4d%-4d%-4d%-4d%-4d%-4d%-4d%-4d%-4d%-4d\n",
								i,i,i,i,i,i,i,i,i,i);
		}*/
		
		/*
		 * 2�� for��
		 *      1    2    7
		 * for(�ʱⰪ;���ǽ�;������)
		 * {       3    4   6
		 *    for(�ʱⰪ;���ǽ�;������)
		 *    {     5
		 *        ���๮��
		 *    }
		 * }
		 */ 
		/*for(int i=1;i<=100;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		 
	}

}

