package com.sist;
/*
 *   클래스 : 고유의 기능, 데이터 (기능 분리) => 캡슐화
 *   상속 : 기존의 클래스를 확장해서 변경, 추가가 가능하다
 *       형식)
 *           class A
 *           class B extends A
 *                   =======
 *                     상속
 *           A : 상위 클래스(베이스 클래스,super클래스,부모클래스)
 *           B : 하위 클래스(파생 클래스,sub클래스,자식클래스)
 *       1) 상속을 받으면 상속 내린 클래스의 모든 것을 받는다
 *          예외) static(공통으로 사용할 수 있게 만든다)
 *               private (접근할 수 없다)
 *               생성자
 *       2) 상속받은 내용을 변경해서 사용 할 수 있다(오버라이딩)
 *       3) 상속을 받게 되면 => 코딩을 할 필요가 없다(중복제거)
 *       4) 추가해서 사용 할 수 있다
 *       5) 상속을 받으면 ==> 클래스의 크기를 비교할 수 있다
 *          instanceof
 *          사용법 ==> boolean (true/false)
 *          String str
 *          StringBuffer sb
 *          Object obj
 *          
 *          if( str instanceof Object ) true //오른쪽 편이 더 크거나 같아야함
 *          if ( sb instanceof Object ) true
 *          if ( Object instanceof Sting ) false
 *          if ( sb instanceof String ) error (상속관계x => 크기비교x)
 *          ==> 상속과 관계없는 클래스는 크기를 사용할 수 없다
 *       6) 재사용
 *            = 상속 : 기능을 변경해서 사용 (단일 상속)
 *            = 포함 : 있는 그대로 사용
 *                   (익명의 클래스)
 *                   
 *       ***** 자바파일
 *          => 한개의 파일 안에 여러개의 클래스를 제작 가능
 *             1) public 클래스는 한개만 사용이 가능
 *             2) main 한개만 사용
 *          => class A
 *             class B
 *             Public class C ==> C.java
 *             *** 클래스명과 파일이름 동일
 */
class A
{
	int a=10;
	int b=20;
	String str="Hello";
}
class B extends A
{
	/*
	 * int a=10;  ==> 30
	   int b=20;  ==> 50
	   String str="Hello";  ==> "Java"
	 */
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str=new String();
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		if(obj instanceof String)
		{
			
		}*/
		A a=new A();
		System.out.println("a.a:"+a.a);
		System.out.println("a.b:"+a.b);
		System.out.println("a.str:"+a.str);
		
		B b=new B();
		System.out.println("b.a:"+b.a);
		System.out.println("b.b:"+b.b);
		System.out.println("b.str:"+b.str);
		
		b.a=30;
		b.b=50;
		b.str="Java";
		
		System.out.println("변경후");
		System.out.println("a.a:"+a.a);
		System.out.println("a.b:"+a.b);
		System.out.println("a.str:"+a.str);
		
		System.out.println("b.a:"+b.a);
		System.out.println("b.b:"+b.b);
		System.out.println("b.str:"+b.str);
		
		A c=new B();
		/*
		 *   A c = new B()
		 *   ===   =======
		 *   1) 변수 ==> 클래스 타입(자신이 가지고 있는 변수만 제어)
		 *   2) 메소드 ==> 생성자 타입(생성자에 따라서 메소드 호출은 달라진다)
		 */
		System.out.println("c.a:"+c.a);
		System.out.println("c.b:"+c.b);
		System.out.println("c.str:"+c.str);
	}

}
