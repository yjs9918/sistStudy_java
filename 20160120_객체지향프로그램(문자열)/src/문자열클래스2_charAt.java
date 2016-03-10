import javax.swing.*;
//charAt
public class 문자열클래스2_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("알파벳을 입력");
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
		String res="A나a의 갯수는 "+count+"개입니다";
		JOptionPane.showConfirmDialog(null, res);
		//윈도우의 Dialog - confirm, input, message
	}

}
