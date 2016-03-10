package com.sist;
/*
 *   throws : �޼ҵ忡 ������ �Ѵ�
 *     => ����Ǵ� ���ܸ� ���
 *     => ���ÿ��� �ݵ�� ��ϵ� ���ܸ� ó���ϰ� ����Ѵ�
 *        (RuntimeException�� ���� �� �� �ִ�)
 *        
 *     => �ý��ۿ� ���� (���� ȸ��)
 *        ���� ó���ϴ� ���
 *        
 *     public void disp() throws IOException,<Exception,Throwable>
 *       => �� �޼ҵ�� IO�� ���õ� ���ܰ� �߻��� �� �ִ�
 *       public void aaa()
 *       {
 *          try
 *          {
 *            disp();
 *          }catch(IOException e){}
 *       } // ����ó��(��ġ�� �ʿ��Ҷ�)
 *       
 *       public void bbb() throws IOException => Throwable�� ��� ����ó�� ����
 *       {
 *          disp();
 *       } // ����ó��
 */
public class MainClass {
	public int div(String a, String b) throws NumberFormatException,ArithmeticException
	{
		return Integer.parseInt(a)/Integer.parseInt(b);
	}
	public void result()
	{
		div("1","0"); //Runtime ������ ������ �����ϴ�
	}
	public void result1() throws NumberFormatException,ArithmeticException // Exception���� ���� ���� ��ġ ����(����Ŭ���� ����)
	{
		div("1","0"); //��ġ�� ���� �� ���� (���ܸ� ���ذ�(���α׷� ���Ḹ ������))
	}
	public void result2() //��ġ�� ���� �� �ִ�
	{
		try
		{
			div("1","0");
		}catch(NumberFormatException e){}
		catch(ArithmeticException e){}
	}
	public void result3() throws Exception
	{
		div("1","0"); //���� Ŭ������ �ѹ��� ��� ���� ó�� ����
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
