/*
 *   ��������
 *     ���� && ���� : ������ �� �� true�϶��� true 
 *     ���� || ���� : ������ �� �߿� �ϳ��� true�� true
 *     ==    ==
 *      1     2
 *        ==
 *         3
 *         
 *     && ( ~�̰� )
 *     ======================
 *      true true => true
 *     ======================
 *      true false => false
 *     ======================
 *      false true => false
 *             ����
 *     ======================
 *      false false => false
 *             ����
 *     ======================
 *     ==> �տ� �ִ� ������ false => �ڿ� �ִ� ������ ó������ �ʴ´�
 *     
 *     || ( ~�̰ų� )
 *     ======================
 *      true true => true
 *            ����
 *     ======================
 *      true false => true
 *            ����
 *     ======================
 *      false true => true
 *     ======================
 *      false false => false
 *     ======================
 *     ==> �տ� �ִ� ������ true => �ڿ� �ִ� ������ ó������ �ʴ´�
 *     
 *     ==> && => �����ȿ� �ִ� ���
 *          score >= 0 && score <= 100
 *         || => ������ ����� ���
 *          score < 0 || score > 100
 *               ��
 *          if database
 *          BETWEEN ~ AND �� ǥ��
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		boolean result= (a<b && ++b==a);
		//                f => �� ���� ó��X
		System.out.println("result="+result);
		System.out.println("b="+b);
		// a=10, b=9
		result=(a>b && ++b==a);
		System.out.println("result="+result);
		System.out.println("b="+b);
		// a=10, b=10
		result=(a>b || ++b==a);
		//       f        f
		// b==11 (if a==b || ++b==a��� b==10)
		System.out.println("result="+result);
		System.out.println("b="+b);
		// a=10, b=11
				

	}

}
