/*
 *   �ڹٿ��� �����ϴ� ��������
 *   ������
 *     byte  (1byte)  -128 ~ 127�� ������ ����
 *     short (2byte)  -32768 ~ 32767�� ������ ����
 *     int   (4byte)  -21��4õ ~ 21�� 4õ
 *      ==> ���ÿ� ����ϴ� ��� ������ int�� �ν�
 *          (default)
 *     long  (8byte)  -2^63 ~ 2^63-1
 *        ******* int, long�� ������(l,L)
 *        10 : int
 *        10L : long
 *        10l : long
 *   �Ǽ���
 *     float (4byte) => �Ҽ��� ���� 6�ڸ�
 *     double (8byte) => �Ҽ��� ���� 15�ڸ�
 *       => default
 *       ******** float, double => F,f
 *       10.5F (4byte) float
 *       10.5f float
 *       10.5  double
 *       10.5D double (D�� ������ ����)
 *   ������
 *     char (2byte) = 0 ~ 65535 (��� ĳ���ʹ� ������ȣ�� ������ �ִ�)
 *        'A' = 65
 *        'a' = 97
 *        '0' = 48  '0' != 0
 *        1byte(single byte) => ASC
 *        2byte(multi byte) => unicode(�ڹ�)
 *   ����
 *     boolean (1byte) : true / false
 *      => ���ǽ��� ���� ��쿡 �ַ� ���
 *   ������ (�迭,Ŭ����) => �޸� �ּҸ� ����
 *   
 *   =====================================================
 *   �����͸� ���� (����) => �ĺ���
 *   ������ ����� ���
 *   1) ���ĺ�, �ѱ۷� �����Ѵ�
 *      (�� ���ĺ��� ��ҹ��ڸ� �����Ѵ�)
 *   2) ���ڻ���� ���� (�� �տ� ��� �� ���� ����)
 *   3) Ư������ ����� ���� ($,_)
 *   4) Ű����(�����)�� ��� �� �� ����
 *      => ������ �ڹٿ��� �̹� ������� �ܾ�
 */
public class �ڹٵ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� ����
		/*
		 *   1) ����
		 *     �������� ������;
		 *     ������ 10�� ����
		 *     int a;
		 *   2) ���� ����
		 *     a = 10; ==> ;�� ������ ���� (��ɹ�)
		 *   =================
		 *   1) ����� ���ÿ� �� ����
		 *     int a = 10;
		 *     
		 *     int a = 10;
		 *     int b = 20;
		 *     int c = 30;
		 *     
		 *     int a,b,c;
		 *     a = 10;
		 *     b = 20;
		 *     c = 30;
		 *     
		 *     int a = 10,  b = 20, c = 30;
		 *     ���������� ���� ��쿡�� , �� �����Ͽ� ���
		 *     
		 *     ū������������ ���� ���������� ÷�� ����
		 *     long l = 10;
		 *     ----     --
		 *      8       4
		 *      
		 *     int i = 10L (X)
		 *     int i = 'A';
		 *     
		 *     ****** char�� ������
		 *     char c = 65; 'A'
		 *  
		 *     'A' + 1
		 *     ===  ===
		 *      2    4
		 *      
		 *      'A' ==> 65
		 *      65 + 1 ==> 66 (int)
		 *      
		 *      10.5 + 10
		 *      ====  ====
		 *       8     4
		 *            ====
		 *            8 (10.0)
		 */
       byte byteValue = (byte) 127;
       // 1����Ʈ �޸� �Ҵ� => 127�� ÷�� => �̸� byteValue
       short shortValue = 32767;
       int intValue = 2147000000;
       long longValue = 2000000000;
       
       char charValue = 'A';
       
       float floatValue = 10.5F;
       double doubleValue = 10.5;
       
       boolean bCheck = false;
       
       System.out.println(byteValue);
       System.out.println(intValue);
       System.out.println(longValue);
       System.out.println(charValue);
       System.out.println(floatValue);
       System.out.println(doubleValue);
       System.out.println(bCheck);
       
	}

}
