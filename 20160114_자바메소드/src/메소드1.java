// dan 입력받아서 구구단 출력
// 매개변수 (O) , 결과값(X)
public class 메소드1 {
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=(int)(Math.random()*8)+2;
		gugudan(dan);
	}

}
