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
		Sawon s1=new Sawon("ȫ�浿");
		Sawon s2=s1;
		s1.print();
		s2.print();
		s2.name="��û��";
		s1.print(); //���� �ּҸ� ���Ƿ� ��û�̷� �ٲ�
		Sawon s3=(Sawon)s1.clone();
		s3.print();
		s3.name="�ڹ���";
		s1.print();
		s3.print();
	}

}
