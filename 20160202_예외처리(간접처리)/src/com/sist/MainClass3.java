package com.sist;
class MyException extends Exception //����� ���� ����ó���� �ݵ�� Exception�� ��ӹ޾� ó���Ѵ�
{
	public MyException(String msg)
	{
		super(msg); //����� ���� ����ó��
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
				throw new MyException("a�� ¦����");
			}
		}catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
