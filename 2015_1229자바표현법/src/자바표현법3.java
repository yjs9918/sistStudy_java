/*
 * ��¹��
 *   System.out.println() => new line
 *     System.out.println("Hello");
 *     System.out.println("Java");
 *     Hello
 *     Java
 *   System.out.print()
 *     System.out.print("Hello");
 *     System.out.print("Java");
 *     HelloJava
 *   System.out.printf()
 *   
 *   (int)((123456.78-123456)*100)
 */
public class �ڹ�ǥ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Java");
		System.out.print("Hello\t"); 
		// \n => (new line : ������ ���)
		// \t => (tab : ���� ����)
		System.out.print("Java");
		/*
		System.out.printf(); ������ �ִ� ���
		JDK => 1.5�̻� (C���� ����)
		*/
		System.out.println(86/3.0);
		System.out.printf("%.2f", 86/3.0);
		/*
		 *   %d : ���� ���
		 *   %s : ���ڿ� ���
		 *   %c : ���� ���
		 *   %f : �Ǽ� ���
		 *   
		 *   %f   ==> %5.2f  �Ҽ��� 2�ڸ� ��� (�Ҽ��� �� �ڸ��� ĭ ����) 
		 *   5�̻��� �� �ݿø� �ϹǷ� �����ؼ� ����ؾ� �Ѵ�.
		 */
		System.out.printf("%5d%5d%5d",85,89,90); 
		// ���� ���ڰ� ĭ ���� => 5ĭ �� ���� 2�ڸ��� ĭ ���� �� ������ 3ĭ ����
		// - �� : ���� ����   + ��: ������ ����
		
		//System.out.println((int)((123456.78f-123456)*100)); => byte ���� ������� �츮�� ������ ���� ���´�.
	}
}
