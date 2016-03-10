package com.sist;
//clone
class Sawon implements Cloneable
{
	String name;
	public Sawon(String name) 
	{
		this.name=name;
	}
	public void print()
	{
		System.out.println("Name:"+name);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		
		return super.clone();
	}
	
}
public class MainClass4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Sawon s1=new Sawon("홍길동");
		Sawon s2=s1;
		s1.print();
		s2.print();
		s2.name="심청이";
		s1.print(); //같은 주소를 쓰므로 심청이로 바뀜
		Sawon s3=(Sawon)s1.clone();
		s3.print();
		s3.name="박문수";
		s1.print();
		s3.print();
	}

}
