/*
 *   �ݺ���
 *     for
 *       ����)
 *                1    2   4=>2
 *           for(�ʱⰪ;���ǹ�;������)
 *               �ݺ� ���๮��  3
 *     while
 *       ����)
 *           �ʱⰪ    ====> 1
 *           while(���ǽ�) => 2 (true=>3, false=>����
 *           {
 *             �ݺ� ���๮�� => 3
 *             ������ => 4 ==> 2������ �̵�
 *           }
 *     do~while
 *       ����)
 *           �ʱ� ��=> 1
 *           do
 *           {
 *             �ݺ� ���๮��  => 2
 *             ������ => 3
 *           }while(���ǽ�);  => 4 ==>2������ �̵�
 *               true=>2�� �̵�, false=>����
 */
public class ���_for_while_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for�̿�");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nwhile�̿�");
		int i=1; //�������� �ٽ� ����
		while(i<=10)
		{
			System.out.print((i+" "));
			i++;
		}
		System.out.println("\ndo~while�̿�");
		i=1; //�������� �ٽ� ����
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		

	}

}

















