/*
 *   ���ڿ� : String => char[]�� �����ϴ� ��ɰ� 
 *                   ���ڿ��� �����ϴ� ���
 *   ����
 *     = String str="";
 *       ====== === == 
 *       ��������     ����   ������
 *       char[] str={};
 *     = String str=new String("")
 *   ���
 *     = equals : ���ڿ��� ������ ���� Ȯ��
 *        (��ҹ��ڸ� �����ؼ� ��)
 *       1) ����� : boolean
 *       2) �Ű����� : ���ڿ�
 *       => boolean equals(String s)
 *       => ID,PWD = (�α���, ID�ߺ�üũ, ���¼Һм�)
 *       ��) String str="Hello";
 *          String str1="Hello";
 *          => str.equals(str1)
 *     = trim : �¿��� ���鸸 ����
 *       => ����ڰ� ȸ������, �α���...
 *       => String trim()
 *       ��)
 *          String str=" Hello Java ";
 *          string s=str.trim()
 *     = length : ������ ����
 *       => ���ڸ� ���� (��й�ȣ)
 *       => int length()
 *           String str="Hello Java";
 *           int len=str.length;
 *     = substring : ���ڿ� �и�
 *       => String substring(int s)
 *          String substring(int s, int e)
 *       ��)
 *          ���ڿ��� ���۹�ȣ�� 0������ ����
 *          "Hello Java"
 *           0123456789
 *          String str="0123456789";
 *          str.substring(3);
 *           => 3456789
 *          str.substring(3,8)
 *           => 34567  end-1 => 7
 *     = indexOf (�տ������� ã�� ���)
 *       => �ش繮�ڸ� ã�� ��쿡 ���
 *          int indexOf(char c)
 *          string str="Hello Java";
 *                      0123456789
 *          str.indexOf('a') : 7
 *     = lastIndexOf // ��θ�, Ȯ����
 *          string str="Hello Java";
 *                      0123456789
 *          str.indexOf('a') : 9
 *     ==============������Ʈ==============
 *     = startsWith
 *       boolean startsWith("���ڿ�")
 *       java Program
 *       java and jsp
 *       java and c
 *       jsp and java
 *       startsWith("java") //���� �־��� ���ڿ��� '�����ϴ�' ������ ã���ش�
 *     = endsWith // ���� �־��� ���ڿ��� '������' ������ ã���ش�.
 *     but �߰��� �ִ� ���ڴ� ������ ���� ���� (substring���� �ڸ� �� ����Ѵ�)
 *     =================================
 *     = vlaueOf : ��� ���������� ���ڿ��� ��ȯ
 *       valueOf(10) => "10"
 *       valueOf(true) => "true"
 *       => ������, ���� ������ ���ڿ�
 *       => static String valueOf(��������) //static�̹Ƿ� ��ü�������� �ʾƵ� ��.(������ static. �������� instance)
 *       String.valueOf()
 *     = spit : ���ڿ����� �и��ϰ� ����
 *       String[] split(String regex)
 *       d{1-3}\\.d{1-3}\\.d{1-3}\\.d{1-3}  -> ip�ּ�
 *     = toUpperCase : �빮�� ��ȯ
 *       toLowerCase : �ҹ��� ��ȯ
 *     = compare : ���� �� (�� ���ڰ� ������ �ִ� ���������� ��)
 *     = concat : ���ڿ� ���� (+)
 *     = insertString : ���� ����
 *     = charAt(int index)
 *     String str="Hello Java"
 *       str.charAt(2) ==> 'l' (�ѱ��ھ� �߶� �� ���)
 */
public class ���ڿ�Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={
				"aaabbbccc", //0
				"abcd", //1
				"abcdef", //1
				"dsfdddsflasd", //5
				"wdsffddddjlskmcn" //5
		};
		int max=0;
		int[] count=new int[arr.length];
		int c=0;
		for(int i=0;i<arr.length;i++){
			c=0;
			for(int j=0;j<arr[i].length();j++)
			{
				char ss=arr[i].charAt(j);
				if(ss=='d')
					c++;
			}
			count[i]=c;
		}
		for(int i=0;i<count.length;i++)
		{
			if(max<count[i])
				max=count[i];
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(max==count[i])
			{
				System.out.println(arr[i]);
			}
		}
	}

}
