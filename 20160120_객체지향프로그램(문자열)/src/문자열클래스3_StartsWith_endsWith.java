//StartsWith(���ξ�) , endsWith(���̾�)
import javax.swing.*; //������ ����ϰڴٴ� ��� (swing �ȿ��� �����쿡 ���� �� ����� �� �������)
public class ���ڿ�Ŭ����3_StartsWith_endsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={
				"java and ajax",
				"jquery and java",
				"angularjs program",
				"java and c",
				"html and jsp",
				"java and jsp",
				"java program"
		};
		String data=JOptionPane.showInputDialog("�˻���");
		String res="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].endsWith(data))
			{
				res+=arr[i]+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, res); //null: �ּҸ� ������ ���� ���� �� ��
	}

}
