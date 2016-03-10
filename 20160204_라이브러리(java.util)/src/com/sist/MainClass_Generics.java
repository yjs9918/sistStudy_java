package com.sist;
import java.util.*;
/*
 *   T : Type
 *   E : Element
 *   V : Value
 *   K : Key
 *   
 *   Map<K,V>
 *   Map<String,Object>
 *   Map<String,?> // ? => ���������� �ƹ��ų� �ᵵ �ȴ�
 */
class Box<T> //���׸�Ÿ��(Generics)=> (�������� ����)
{
	T t;
	public void setBox(T t)
	{
		this.t=t;
	}
	public T getBox()
	{
		return t;
	}
}
public class MainClass_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box=new Box<String>();
		box.setBox("ȫ�浿");
		String name=box.getBox();
		System.out.println(name);
		ArrayList<String> list=new ArrayList<String>();
		
	}

}
