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
 *   Map<String,?> // ? => 데이터형을 아무거나 써도 된다
 */
class Box<T> //제네릭타입(Generics)=> (데이터형 통일)
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
		box.setBox("홍길동");
		String name=box.getBox();
		System.out.println(name);
		ArrayList<String> list=new ArrayList<String>();
		
	}

}
