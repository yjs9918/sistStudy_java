// char ==> 배열을 전송 ==> A,a가 몇개인지?
/*
 *   int (char[])
 */
public class 메소드연습4 {
	static int charCount(char[] ch)
	{
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A' || ch[i]=='a')
				count++;
		}
		return count;
	}
	static void process()
	{
		char[] ch={'a','a','a','A','B','B','c'};
		int count=charCount(ch);
		System.out.println("count:"+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
