// equals : ���ڿ� ��(��ҹ��� ����)
// equalsIgnoreCase : ���ڿ� ��(��ҹ��� ����x)
import javax.swing.*;
public class ���ڿ�Ŭ����4_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ID="admin";
		String PWD="1234";
		
		String myid=JOptionPane.showInputDialog("ID �Է�:");
		String mypwd=JOptionPane.showInputDialog("PWD �Է�:");
		
		if(myid.equalsIgnoreCase(ID)&& mypwd.equals(PWD))
		{
			System.out.println("�α��εǾ����ϴ�");
		}
		else
		{
			System.out.println("ID�� Password�� Ʋ���ϴ�.");
		}
	}

}
