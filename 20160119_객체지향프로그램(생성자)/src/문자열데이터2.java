//String�� ��ӹ޾� ���� �Ұ�.(Math,System�� ��������)
public class ���ڿ�������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" Hello Java ";
		System.out.println(str.length()); //length => ���� ���� Ȯ�� (��й�ȣ � �̿�. 8�� �̻� �Է�...)
		System.out.println(str.trim().length()); //trim() => �¿��� ���� ���� <�ſ��߿�>
		String str1="0123456789";
		//���� ��ȣ ==> 010-111
		// �� 0,3 ==> 4,7
		System.out.println(str1.substring(2)); // char �迭�̶�� ����.. �ε��� ��ȣ���� �����
		System.out.println(str1.substring(3, 7)); // �ε��� ���� ����ؼ� end-1������ ���
		String str2="MainClass.java";
		System.out.println(str2.substring(str2.lastIndexOf('.')+1)); 
		//lastIndexOf => �ڿ������� ã�ƿ�(Ȯ���� ã����) / +1 => . �����ͺ��� ����϶�
		//IndexOf => �տ������� ã�ƿ�
		String str3="admin,man,20,2003";
		String[] res=str3.split(","); // split => �����Ͱ� �������� �� �߶� ������.
		//String.valueOf(30); //"30" static �޼ҵ� (��ü�̸����� ����)
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
	}

}
