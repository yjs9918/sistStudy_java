/*
 *   ���׿�����
 *     = ���������� (++,--)
 *       => 1�� ����, 1�� ����
 *          int a = 10;
 *          a++;
 *          => a=a+1;
 *          *** ��ġ ������
 *          ��)
 *             int a=10;
 *             int b=++a
 *                == ===
 *                2��    1��   (�������)
 *             1) a�� 1�� �����Ѵ�
 *             2) ������ a���� b�� �����Ѵ�
 *                a=11,b=11
 *          *** ��ġ ������
 *              int a=10;
 *              int b=a++;
 *                 == ===
 *                 1��   2��   (�������)   
 *              1) a���� b�� �����Ѵ�
 *              2) a���� 1�� ����
 *                 a=11,b=10
 *     = ���������� ( ! )
 *     
 *     = ���������� ( ~ )
 *     = ĳ��Ʈ������ ( (��������) ) ->����ȯ
 */
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		int a = 10;
		int b = ++a;
		System.out.println("a="+a); //11
		System.out.println("b="+b); //11
		//���ڿ� => ""
		/*
		 * 7+"7"+7 ==> "777"
		 * ���� + ���� = ����(���) / ���ڿ� + ���� = ������ ����
		 */
		a=10;
		b=a++;
		System.out.println("a="+a); //11
		System.out.println("b="+b); //10
		
		a=10;
		b=a++ + a++ + a++;
		// a=10 , +1, a=11, + 1, a=12
		// a=13, 33
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=10;
		b=++a + ++a + ++a;
		// 11   12     13
		System.out.println("a="+a); //13
		System.out.println("b="+b); //36

	}

}
