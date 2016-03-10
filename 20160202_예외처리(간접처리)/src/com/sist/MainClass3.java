package com.sist;
class MyException extends Exception //사용자 정의 예외처리는 반드시 Exception을 상속받아 처리한다
{
	public MyException(String msg)
	{
		super(msg); //사용자 정의 예외처리
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
			if(a%2==0)
			{
				throw new MyException("a는 짝수다");
			}
		}catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
