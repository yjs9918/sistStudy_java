package com.sist;
/*
 *   클래스의 구조
 *     package => 한번만 사용
 *     import => 여러개 사용 가능
 *     class className{
 *       =============
 *         멤버변수 : instance, static
 *       =============
 *         생성자 : 생략이 가능
 *       =============
 *         메소드 : instance , static
 *       =============
 *     }
 *     
 *     1) 변수 ====> 배열(같은 크기), 클래스(다른 크기)
 *     2) 명령문 ===> 메소드
 *            int a=10;
 *     3) 변수 + 메소드 ===> 클래스
 *     4) 클래스 + 클래스 ==> 패키지
 *     ===================================
 *     패키지 여러개 ==> lib(jar)
 *     
 *     => 데이터형
 *        기본 데이터형 => 사용자 정의 (클래스)
 *        클래스의 용도
 *          1) 데이터만 모아서 처리 : ~DTO, ~VO(데이터빈)
 *          2) 기능 처리 : ~DAO, ~Manager (액션빈)
 *          3) 혼합 
 */

import java.util.*;
import java.sql.*;
import java.text.*;
class EmpDTO //사원정보(component : 객체) 모듈화(설계단위)
{
	int empno;
	String ename;
	String job;
	int mgr;
	java.util.Date hiredate=new java.util.Date(); 
	//포함 클래스 충돌될땐 이런식으로 세부명으로 써줘야함.
	int sal;
	int comm;
	int deptno;
}
public class 캡슐화 {

	public static void main(String[] args) 
	throws Exception
	{   //컨테이너
		// TODO Auto-generated method stub
		EmpDTO ed=new EmpDTO(); /* ed -> component -> 컴포넌트가 모이면 컨테이너*/
		ed.empno=1;
		ed.ename="홍길동";
		System.out.println("사번:"+ed.empno);
		System.out.println("이름:"+ed.ename);
		System.out.println("입사일:"+ed.hiredate);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년MM월dd일"); //mm : 분 으로 나옴
		System.out.println(sdf.format(ed.hiredate));
		
	}

}
