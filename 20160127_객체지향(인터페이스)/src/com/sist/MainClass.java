package com.sist;
interface A
{
	// 사용하지않아도 다 구현되야 함
	void a();
	void b();
	void c();
	void d();
	void e();
	default void f()
	{
		System.out.println("f()");
	}
}
class B implements A
{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		
	}
	
	public void f()
	{
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
