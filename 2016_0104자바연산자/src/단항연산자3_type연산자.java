/*
 *   Ÿ�Կ����� : ĳ��Ʈ������(����ȯ)
 *     ��)  (int) , (char) , (double)...
 *        ==> (boolean) X
 *        ==> Ŭ������ ����ȯ�� ����
 *   upcasting : �ڵ� ����ȯ
 *   downcasting : ���� ����ȯ
 *   
 *   (char)65 => int => char (downcasting)
 *   10.5 + 10
 *          ==
 *          10.0  ==> 10.5 + 10.0 = 20.5 (upcasting)
 *                                  ====
 *                                  (int)20.5 ==> 20
 */
public class ���׿�����3_type������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A');
		System.out.println((char)65);
		System.out.println((double)10);
		System.out.println((int)10.6);
		System.out.println(3/(double)2);
		// ����/���� = ����
		// ����/�Ǽ� = �Ǽ�

	}

}
