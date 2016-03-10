package com.sist;
/*
 *   추상클래스 : 공통으로 적용되는 메소드를 선언하고
 *            필요시마다 구현해서 사용하는 것
 *            1) 서로 다른 클래스를 연결해서 사용
 *            2) 형식
 *               public abstract class className
 *               {
 *                 ==============================
 *                     설정 (변수)
 *                 ==============================
 *                     구현안된 메소드
 *                     추상 메소드
 *                     abstract void display();
 *                 ==============================
 *                     구현된 메소드
 *                 ==============================
 *               }
 *               추상 클래스를 사용하기 위해서는 반드시
 *               상속받아 구현된 하위 클래스의 주소를 받아서 사용
 *               
 *               public abstract class A
 *               class B extends A
 *               
 *               ==> A a=new B();
 *                   B b=new B();
 *               단점) 단일 상속
 */
abstract class 도형
{
	abstract void draw();
}
class 원 extends 도형
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 네모 extends 도형
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("네모를 그린다");
	}
	
}
class 삼각형 extends 도형
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리 3개 생성
		원 c=new 원();
		c.draw();
		삼각형 t=new 삼각형();
		t.draw();
		네모 r=new 네모();
		r.draw();
		
		//메모리 1개 생성
		System.out.println("\n추상클래스 사용법");
		도형 g=new 원();
		g.draw();
		g=new 삼각형();
		g.draw();
		g=new 네모();
		g.draw();
	}

}
