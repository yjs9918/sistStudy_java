package com.sist;
//equals : ���� ��ü�� ������ �ִ� ���� ���� �� ���
// == : Stack�� ����Ǿ� �ִ� �Ϲ� �������� ���� �� ���
class MyNumber
{
	int num;
	public MyNumber(int num) 
	{
		this.num=num;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num==((MyNumber)obj).num)
			return true;
		else
			return false;
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber m1=new MyNumber(10);
		MyNumber m2=new MyNumber(10);
		//MyNumber m3=m1;
		if(m1.equals(m2))
		{
			System.out.println("m1="+m1);
			System.out.println("m2="+m2);
			System.out.println("m1�� m2�� ����");
		}
		else
		{
			System.out.println("m1="+m1);
			System.out.println("m2="+m2);
			System.out.println("m1�� m2�� �ٸ���");
		}
	}

}
