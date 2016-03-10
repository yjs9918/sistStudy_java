/*
 *  ����
 *    10���� : �Ϲ� ���� (10,34,56...)
 *    8���� : 012,013,014... (0����)
 *    16���� : 0x55,0x88...(0x..)
 *  �Ǽ�
 *    10.34 (8byte) ==> �Ҽ������� 15�ڸ� , 10.34F (4byte)  ==> �Ҽ������� 6�ڸ�
 *    4 byte�� 21�� 4õ ������ ���ڱ����� ǥ�� ����
 *  ����
 *  	'' ==> �ѱ��ڸ� ���� => ������ȣ�� ������ �ִ�
 *				����ÿ� �׻� ������ȣ�� �����ؼ� ����
 *			   'A' => 65
 *			   'a' => 97
 *			   '7' => 55
 *			   '0' => 48
 *    
 *  �� : true / false
 *  ���ڿ� : ""
 *  	�ѱ��� �̻� ���
 *  	"a", "aabbba", "adsldad"
 */
public class �ڹ�ǥ����2 {
	
	public static void main(String[] args) {
	System.out.println(012);
	System.out.println(0xFF);
	System.out.println("A"+1); //A1
	System.out.println('A'+1); //66
	System.out.println('7'+1); //56
	System.out.println("7"+1); //71
	
	// 'A' ==> 65 ,L '7' ==> 55 (ASC) �ƽ�Ű�ڵ尪 ���� ==> �����ڵ�� �Ѿ��
	// ASC ==> 255���� , �����ڵ� : 65535����
	System.out.println(10.34);
	System.out.println(10.34F);
	System.out.println(10000000000000000L);  // �Ϲ� ���ڴ� 4byte ,L�� �ٿ������ν� 8byte�� ��ȯ
	/*
	 * �Ϲ� ���� : 4byte => 21�� 4õ
	 * 			~L , l => (8byte)
	 * �Ϲ� �Ǽ� : 8byte
	 * 		  4byte�� ���� ~F , f
	 */
	System.out.println((int)'A');
	System.out.println((int)'0');
	System.out.println((char)65);
	System.out.println(true);
	System.out.println(false);
	System.out.println("ȫ�浿");
	// "ȫ�浿"
	System.out.println("\"ȫ�浿\""); 
	System.out.println("c:\\javaDev\\javaStudy"); 
	// \ => \\ , " => \"
	}
}
