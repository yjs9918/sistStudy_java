import javax.swing.*;
//charAt
public class ���ڿ�Ŭ����2_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("���ĺ��� �Է�");
		//System.out.println(str);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='a' || c=='A')
			{
				count++;
			}
		}
		String res="A��a�� ������ "+count+"���Դϴ�";
		JOptionPane.showConfirmDialog(null, res);
		//�������� Dialog - confirm, input, message
	}

}
