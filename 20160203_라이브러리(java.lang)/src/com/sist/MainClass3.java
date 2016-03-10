package com.sist;
//equals : 실제 객체가 가지고 있는 값을 비교할 떄 사용
// == : Stack에 저장되어 있는 일반 변수값을 비교할 때 사용
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
			System.out.println("m1과 m2는 같다");
		}
		else
		{
			System.out.println("m1="+m1);
			System.out.println("m2="+m2);
			System.out.println("m1과 m2는 다르다");
		}
	}

}
