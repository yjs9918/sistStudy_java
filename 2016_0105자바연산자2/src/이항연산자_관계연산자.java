/*
 *   ���迬����
 *     ����) == (����)
 *         != (�ٸ���)
 *         <  (�۴�)
 *         >  (ũ��)
 *         <= �۰ų� ���� ( < || == )
 *         >= ũ�ų� ���� ( > || == )
 *     => ������� �׻� boolean (true/false)
 *     ��)
 *         10<11 true
 *         10==11 false
 *         10<=11 true ( 10<11 || 10==11 )
 */
public class ���׿�����_���迬���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=11;
		boolean result= a<b;
		System.out.println("result="+result);
		result= (a == b);
		System.out.println("result="+result);
		result=(a++ != b); //a
		// a=11
		System.out.println("result="+result);
		result= (a==b);
		System.out.println("result="+result);
		result=(a<=b); // a=11, b=11 (a<b || a==b)
		System.out.println("result="+result);
		result=(a>=b); // a=11, b=11 (a>b || a==b)
		System.out.println("result="+result);

	}

}
