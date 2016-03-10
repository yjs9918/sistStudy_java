package com.sist;
/*
 *   컬렉션 클래스
 *     List    Set    Map ==> interface
 *     List => ArrayList, Vector, LinkedList, Queue, Stack
 *             =========  ======
 *         = 순서를 유지하고 있다 (각 데이터마다 index를 가지고 있다)
 *         = 중복 허용한다
 *         = 데이터베이스 프로그램
 *     Set => TreeSet, HashSet
 *         = 순서가 없다
 *         = 중복허용하지 않는다
 *         = XML프로그램
 *     Map => Hashtable, HashMap
 *         = 순서가 있다
 *         = 중복허용 (Value), 중복허용X(Key)
 *         = Key, Value를 동시에 제정
 *         = 클래스 관리, 우편번호..(Spring)
 *         = 빅데이터 (MapReduce)
 *         웹 ==> 
 *         a.jsp ==> b.jsp : id,pwd => jsp 파일은 멤버변수가 없다
 *         b b=new b(); (X)
 *         b.jsp?id=aaa&pwd=1234 (Map 방식 : id&pwd - Key/ aaa&1234 - Value)
 *         
 *         일반 프로그램 => 데이터를 전송할 때 메소드의 매개변수
 *         class A
 *         {
 *            public void disp(
 *            {
 *               B b=new B("hong");
 *               b.setName("shim");
 *            }
 *         }
 *         class B
 *         {
 *            String name;
 *            public B(String n)
 *            {
 *               name=n;
 *            }
 *            public void setName(String n)
 *            {
 *               name=n;
 *            }
 *         }
 *         
 *         ArrayList => 클래스만 저장이 가능(사용자정의, 라이브러리 포함)
 *           = add(객체값) 저장 => 뒤에 붙는다
 *             add(index,객체명) => 원하는 위치에 값 지정
 *             INSERT INTO ~~
 *               insert()
 *           = remove(index) => 데이터 삭제
 *             DELETE FROM ~~
 *               delete()
 *           = set(index, 객체명) => 데이터 수정
 *             UPDATE ~ SET
 *               update()
 *           = get(index) => 데이터 검색
 *             SELECT ~ FROM
 *               find()
 *           = size() => 저장 갯수
 *             SELECT COUNT(*) FROM ~
 *               count()
 *               
 *           A a=new A();
 *           add(a)
 *           =======
 *              a  ====> 100번지
 *           =======
 *           
 *           A b=new A();
 *           add(b)
 *           =======   =======
 *              a         b
 *           =======   =======
 *              0         1
 *              
 *           A c=new A();
 *           add(1,c)
 *           =======   =======   =======
 *              a         c         b
 *           =======   =======   =======
 *              0         1         2
 *              
 *           remove(1)
 *           =======   =======
 *              a         b
 *           =======   =======
 *              0         1      (index번호는 순차적으로 유지하고있다)
 *              
 *           ***** 데이터 제어하는 방식은 데이터형을 통일을 해야 한다
 *                              =========
 *                              제네릭(일반화)
 *                              
 *           class A<T>   T: 임시데이터형
 *           {
 *              T t
 *              public void setA(T t)
 *              {
 *                 this.t=t;
 *              }
 *              public T getA()
 *              {
 *                 return t;
 *              }
 *           }
 *           
 *           
 *           A<Integer> a=new A<integer>();
 *           
 *           ==> T ==> Integer로 변경
 *           
 *           ==> 제네릭을 사용하지 않는 경우 ==> Object
 *              
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//integer i=10; AutoBoxing
		list.add(10); //Integer   ==> 0
		list.add(15.5); // Double ==> 1  => 2
		list.add("홍길동"); //String ==> 2  => 3
		list.add(1,'A'); // ==> 1
		System.out.println("저장 갯수:"+list.size());
		int a=(int)list.get(0); //UnBoxing
		double b=(Double)list.get(2);
		String c=(String)list.get(3);
		char d=(char)list.get(1);
		System.out.println("Index:0=>"+a);
		System.out.println("Index:1=>"+d);
		System.out.println("Index:2=>"+b);
		System.out.println("Index:3=>"+c);
		
		ArrayList<String> list2= new ArrayList<String>();
		//Object => String
		list2.add("홍길동"); // 0
		list2.add("심청이"); // 1
		list2.add("이순신"); // 2
		list2.add("강감찬"); // 3
		list2.add("박문수"); // 4
		
		for(int i=0;i<list2.size();i++)
		{
			String name=list2.get(i);
			System.out.println("Index:"+(i)+"=>"+name);
		}
		//for=each (배열, 컬렉션)
		for(String name:list2)
		{
			System.out.println(name);
		}
		
		

	}

}
