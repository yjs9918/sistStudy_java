package com.sist;
/*
 *    메모리 구조
 *       void disp(){} (메소드 정의) ==> 메모리에 저장 
 *       void disp();  (메소드 선언) ==> 메모리에 저장이 안된다
 *         모든 클래스는 메소드가 정의가 되어야 저장해서 사용할 수 있다
 *           => 인터페이스, 추상 클래스(메모리에 저장할 수 없다)
 *           interface A
 *           {
 *              void disp();
 *           }
 *           class B implements A
 *           {
 *              void disp(){}
 *           }
 *           class C
 *           {
 *              public void aaa()
 *              {
 *                 A a=new A(){
 *                    public void disp(){} => 이게 없으면 오류(A는 interface므로 메모리 저장x)
 *                 };
 *              }
 *           }
 *    ==============
 *       Method영역       => Method,static변수
 *    ==============
 *        Stack     => 매개변수, 지역변수 ({}에서만 사용)
 *        			=> 관리자 : 메모리
 *    ==============
 *         heap     => 객체(인스턴스) => new
 *         			=> 관리자 : 프로그래머 (GC)
 *    ==============
 *    
 *     라이브러리 : 자바에서 지원하는 클래스
 *             사용자 정의 라이브러리
 *             
 *      => 패키지로 묶여 있다 (관련된 클래스) ==> 클래스를 읽어서 사용할 때는 import
 *         java.lang (import를 생략할 수 있다)
 *           => Object : 최상의 클래스 (모든 클래스는 Object를 상속받아서 사용)
 *                = 복제 (clone)
 *                = 객체를 문자열로 변환 (toString)
 *                = 객체 비교 (equals)
 *                = 객체가 소멸을 확인 (finalize)
 *              String
 *              Math
 *              System
 *              StringBuffer
 *              Wrapper (데이터형 관리하기 쉽게 클래스화)
 *                int => Integer
 *                double => Double
 *                float => Float
 *                byte => Byte
 *                char[] => String
 *                boolean => Boolean
 *         java.util
 *         java.io
 *         java.net
 *         java.awt
 *         java.awt.event
 *         javax.swing
 *         javax.xml................
 */
class Student
{
	String name;
	// 생성자 함수
	public Student() 
	{
		System.out.println("객체 생성 완료...");  //생성
	}
	public void display()
	{
		System.out.println("Name:"+name);  //활용
	}
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("객체가 메모리에서 해제...");  //해제
	}
	// 소멸자 함수
	
}
interface A
{
	void disp();
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A a=new A(){
			public void disp(){System.out.println("aaa");} //익명의 클래스
		};
		a.disp();*/
		
		Student s=new Student();
		s.name="홍길동";
		s.display();
		s=null;
		System.gc();
	}

}












