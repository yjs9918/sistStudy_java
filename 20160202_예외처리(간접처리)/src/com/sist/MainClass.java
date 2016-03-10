package com.sist;
/*
 *   throws : 메소드에 설정을 한다
 *     => 예상되는 예외를 등록
 *     => 사용시에는 반드시 등록된 예외를 처리하고 사용한다
 *        (RuntimeException은 생략 할 수 있다)
 *        
 *     => 시스템에 의존 (예외 회피)
 *        직접 처리하는 방법
 *        
 *     public void disp() throws IOException,<Exception,Throwable>
 *       => 이 메소드는 IO와 관련된 예외가 발생할 수 있다
 *       public void aaa()
 *       {
 *          try
 *          {
 *            disp();
 *          }catch(IOException e){}
 *       } // 직접처리(조치가 필요할때)
 *       
 *       public void bbb() throws IOException => Throwable로 묶어서 예외처리 가능
 *       {
 *          disp();
 *       } // 간접처리
 */
public class MainClass {
	public int div(String a, String b) throws NumberFormatException,ArithmeticException
	{
		return Integer.parseInt(a)/Integer.parseInt(b);
	}
	public void result()
	{
		div("1","0"); //Runtime 에러는 생략이 가능하다
	}
	public void result1() throws NumberFormatException,ArithmeticException // Exception들의 순서 없이 배치 가능(상위클래스 포함)
	{
		div("1","0"); //조치를 취할 수 없다 (예외만 피해감(프로그램 종료만 막아줌))
	}
	public void result2() //조치를 취할 수 있다
	{
		try
		{
			div("1","0");
		}catch(NumberFormatException e){}
		catch(ArithmeticException e){}
	}
	public void result3() throws Exception
	{
		div("1","0"); //상위 클래스로 한번에 묶어서 예외 처리 가능
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
