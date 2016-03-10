package com.sist;
/*
 *   추상 클래스 : 종류별로 모아서 관리
 *     추상 : 사물마다의 공통점을 추출한다
 *                ====
 *   예) 새, 곤충, 물고기 ==> 동물(추상 클래스) : 기능이 선언만 된다
 *      삼성, 현대, LG, SK ==> 회사(추상 클래스)
 *   추상 클래스 : 공통으로 사용하는 데이터, 메소드
 *             ======================
 *               상속받아서 구체화
 *      
 *      설계단 ==== 구현단
 *      
 *       동물                      추상클래스
 *        |  상속
 *    새   개구리   벌              실제클래스
 *    1) 용도
 *       관련있는 클래스를 모아서 관리
 *       실제 클래스 제작시 시간을 절약
 *       => 공통적으로 사용되는 메소드를 프로그램에 맞게 구현
 *          (오버라이딩)
 *       => 기능 추가
 *       => 선언
 *          public abstract class className
 *          {
 *             ==> 공통으로 적용된 메소드가 선언
 *             (추상 메소드)
 *             public abstract void disp();
 *          }
 *    인터페이스
 *       1) 추상의 일종이다 (추상 클래스 단점 보완)
 *       2) 다중 상속이 가능
 *       3) 구성
 *          public interface interfaceName
 *          {
 *             변수 ======> 상수 (public static final) 생략
 *             선언된 메소드 ==> (public abstract) 생략
 *             구현된 메소드 ==> default, static (JDK 1.8~)
 *          }
 *    =======================================================
 *    상속
 *      interface === interface
 *               extends
 *      interface === class
 *              implements
 *      class === class
 *           extends
 *      class === interface (X)
 *      
 *      **** interface A
 *           interface B
 *           class C implements A,B
 *                             ===== 다중상속
 *           class A
 *           class B
 *           class C extends A,B (error)
 *           
 *           class A
 *           class B extends A
 *           class C extends B ===> 단일상속
 *           
 *           상속이 있는 경우
 *           class A
 *           {
 *              a,b,c (static, private (X))
 *           }
 *           class B extends A
 *           {
 *              d (a,b,c)
 *           }
 *           
 *           A a= new A() ==> A(a,b,c)
 *           B b= new B() ==> B(a,b,c,d)
 *           A c= new B() ==> A(a,b,c)
 *               ========
 *               변경된 메소드만 호출
 *           B b= new A() ==> error (하위 클래스는 상위클래스를 받을 수 없다)
 *           B b= (B) new A() ==> 형 변환 하여 사용해야함 -> 후에 제네릭 등장(자동형변환)
 *           
 *     public abstract class A
 *     {
 *        abstract void disp();
 *     }
 *     class B extends A
 *     {
 *        public void disp(){1}  ... 오버라이딩 (default<public)
 *     }
 *     class C extends A
 *     {
 *        protected void disp(){2} ... 오버라이딩 (default<protected)
 *     }
 *     
 *     A a=new B(); ==> a.disp(); B(1)
 *     a=new C();   ==> a.disp(); C(2)
 */
abstract class A
{
	abstract void disp();
}
class B extends A
{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("B:disp() Call...");
	}
	
}
class C extends A
{

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		System.out.println("C:disp() Call...");
	}
	
}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.disp();
		a=new C();
		a.disp();
	}

}
