// dan �Է¹޾Ƽ� ������ ���
// �Ű����� (O) , �����(X)
public class �޼ҵ�1 {
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
