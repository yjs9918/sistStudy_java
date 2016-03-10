package com.sist;
/*
 *   Wrapper : 일반 데이터형 (int,double..)
 *             제어할 수 있게 클래스화를 시킨다
 *             int => Integer
 *             double => Double
 *             --
 *             --
 *             boolean => Boolean
 *             
 *             if("1") 1 ==> 42억 4천개...
 *       ==> Boxing, UnBoxing
 *       Integer i=10; ==> Boxing(클래스 안에 데이터 값을 direct로 넣음)
 *       Integer i=new Integer(10); //원래는 이렇게 써야함
 *       
 *       int ii=i; ==> UnBoxing (일반 데이터에 클래스값을 대입)
 *       
 *       
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in=100; //(컬렉션에서 사용)
		System.out.println("In:"+in);
		int i=in;
		Boolean b=true;
		System.out.println("i="+i);
		/*
		 * Integer => parseInt : 문자열을 정수
		 * Double => parseDouble : 문자열을 실수
		 * 
		 * 자바 => 웹(숫자개념x) 무조건 문자열
		 * "1" => 1
		 * a.jsp ==> b.jsp
		 * b.jsp?page=1
		 */
	}

}
