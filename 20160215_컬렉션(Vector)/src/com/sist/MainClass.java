package com.sist;
/*
 *   Vector : List
 *   
 *   ArrayList : 비동기화, 데이터베이스(Vector를 보완한 클래스)
 *   Vector : 동기화, 네트워크
 *     = size()
 *     = add(Object), addElement(Object)
 *     = remove(index), removeElementAt(index)
 *       removeAllElements(), clear()
 *     = set(index,Object)
 *     = get(index), elementAt(index)
 *     = 자료구조 => 데이터를 통일해서 저장 => 관리
 *                ===============
 *                  제네릭
 *       Vector<String> vec=new Vector<String>();
 *          => 저장 공간을 10개 만들고 시작 (default 10개)
 *          new Vector<String>(5); <- 저장공간을 5개 만들고 시작
 *     = java.util에 저장
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>(5);
		System.out.println("String 저장 갯수 : "+vec.size());
		System.out.println("저장공간 크기 : "+vec.capacity());
		// 저장
		vec.addElement("홍길동1"); // 0
		vec.addElement("홍길동2"); // 1
		vec.addElement("홍길동3"); // 2
		//홍길동7 추가 => 3
		vec.addElement("홍길동4"); // 3 => 4
		vec.addElement("홍길동5"); // 4 => 5
		vec.addElement("홍길동6"); // 5 => 6
		// 순서가 있다, 데이터는 중복을 허용
		vec.add(3,"홍길동7");
		System.out.println("저장 갯수 확인 : "+vec.size());
		System.out.println("Capacity : "+vec.capacity());
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		System.out.println("삭제");
		vec.removeElementAt(2);
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		System.out.println("수정");
		vec.setElementAt("홍길동8", 3);
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		//전체 삭제
		vec.removeAllElements();
		//vec.clear();
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		System.out.println("저장 갯수 확인 : "+vec.size());
		System.out.println("Capacity : "+vec.capacity());
		
	}

}
