import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

//�ٸ� ���������� ����
/*  67
 *  2���� => 1 0 0 0 0 1 1
 *  8���� => 0103 (2�������� �ڿ��� 3���� ������ ���)
 *  16���� => 0x43 (2�������� �ڿ��� 4���� ������ ���)
 * 
 *  163
 *  2���� => 1 0 1 0 0 0 1 1
 *  8���� => 0243
 *  16���� =>0xA3
 *  
 *  ����ǥ�� (2�� ����) ������ ������� +1 �� ������ ������ �ȴ�.
 *  5
 *  => 00000101
 *  ===========
 *     11111010
 *    +       1
 *    =========
 *     11111011
 *  6
 *  => 00000110
 *  => 11111010
 *     ========
 *     00000101 => 5
 *    +       1 => 6 ==> -6
 */
public class �ڹٵ�������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 'A'; // 65
		char charValue = 65; // 'A'
		double doubleValue = 10; // 10.0
		// �ڵ�����ȯ (upcasting)
		int intValue2 = (int)10L;
		int intValue3 = 0243; // 163
		int intValue4 = 0xA3; // 163
		// ��������ȯ (downcasting)
		int a = 100;
		System.out.println(intValue);
		System.out.println(charValue);
		System.out.println(doubleValue);
		System.out.println(intValue2);
		System.out.println(intValue3);
		System.out.println(intValue4);
		System.out.println(0xA3); //16������ �ٷ� ��� ����
		System.out.println(0243); //8������ �ٷ� ��� ����
		System.out.println(10100011); //2������ �ٷ� ��� �Ұ��� => �ٸ� �Լ� ���
		System.out.println(~a); // ~ ǥ�ô� ����ǥ��
	}

}
