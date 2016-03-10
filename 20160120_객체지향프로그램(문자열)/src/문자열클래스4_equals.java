// equals : 문자열 비교(대소문자 구분)
// equalsIgnoreCase : 문자열 비교(대소문자 구분x)
import javax.swing.*;
public class 문자열클래스4_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ID="admin";
		String PWD="1234";
		
		String myid=JOptionPane.showInputDialog("ID 입력:");
		String mypwd=JOptionPane.showInputDialog("PWD 입력:");
		
		if(myid.equalsIgnoreCase(ID)&& mypwd.equals(PWD))
		{
			System.out.println("로그인되었습니다");
		}
		else
		{
			System.out.println("ID나 Password가 틀립니다.");
		}
	}

}
