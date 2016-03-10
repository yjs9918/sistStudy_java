//StartsWith(접두어) , endsWith(접미어)
import javax.swing.*; //윈도우 사용하겠다는 명령 (swing 안에는 윈도우에 관련 된 명령이 다 들어있음)
public class 문자열클래스3_StartsWith_endsWith {

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
		String data=JOptionPane.showInputDialog("검색어");
		String res="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].endsWith(data))
			{
				res+=arr[i]+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, res); //null: 주소를 가지고 있지 않을 때 씀
	}

}
