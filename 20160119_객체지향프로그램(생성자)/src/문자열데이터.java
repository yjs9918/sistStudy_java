/*
 *   ���ڿ� ������
 *   ========
 *   char[] ==> �����ϴ� Ŭ���� ���� String
 *   String : ���ڿ��� �����ؼ� ����� ����
 *            ���ڿ��� ������ �� �ִ� �޼ҵ尡 �����Ѵ�
 *   1) �����ϴ� ���
 *      int[] arr={1,2,3,4,5};
 *      String str1="Hello Java!!"; //�ּҰ����� ����
 *      String str2="Hello Java!!"; // �̷��� ���� str1,str2�� �ּҰ��� ����.(�������ڿ��� �ּҰ��� ����)
 *      char[] str1={'H','e'......);
 *      "" => ���ڿ��� �� ��ü�� �ּ�
 *      str1==str2
 *      String str2=new String("Hello Java!!"); //�ּҰ����� ����
 *      ������� ���� ������� ������ ����. only ���ڿ�
 */
public class ���ڿ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello Java";
		String str2="Hello Java";
		if(str1==str2)
		{
			System.out.println("str1�� str2�� ���� �ּҸ� ������ �ִ�.");
		}
		String str3=new String("hello java");
		if(str1==str3)
		{
			System.out.println("str1==str3");
		}
		else
		{
			System.out.println("str1!=str3");
		}
		
		if(str1.equalsIgnoreCase(str3)) // equals => ������ �ִ� �� ��(��ҹ��� ����)
			                            // equalsIgnoreCase => ��ҹ��� ����X
		{
			System.out.println("str1==str3");
		}
		
		System.out.println(str1.toUpperCase()); // toUpperCase => ���� �о�ͼ� �빮�ڷ� �ٲ㼭 ���
		System.out.println(str1.toLowerCase()); // toLowerCase => ���� �о�ͼ� �ҹ��ڷ� �ٲ㼭 ���
		// ���� �����ߴ� �����ʹ� �״�� �����ȴ�. ��¸� �ٲ㼭 ���
		// str1=str1.toLowerCase(); //���� �ٲ���� ������ �ҹ��ڷ� ��µȴ�.
		System.out.println(str1);
	}

}
