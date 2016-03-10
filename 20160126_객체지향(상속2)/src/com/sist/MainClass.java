package com.sist;
/*
 *   상속 : 기존클래스 내용을 받는다 (중복 코딩을 줄일 수 있다)
 *        1) 있는 그대로 사용
 *        2) 변경해서 사용
 *           ========
 *             오버라이딩
 *             조건)
 *                 1. 상속
 *                 2. 메소드명이 같다
 *                 3. 매개변수가 동일
 *                 4. 리턴형이 동일
 *                 5. 접근지정어를 확장(축소는 불가능)
 *                 
 *        상속 => 상위클래스를 통해서 하위 클래스 제어
 *              => 오버라이딩된 메소드만 제어
 *        class A
 *        class B extends A
 *        A a=new B();
 *        ==> 모든 클래스를 한번에 모아서 제어 : Object
 */
class 게시판
{
	int a=100;
	public void write()
	{
		System.out.println("게시판 글쓰기");
	}
	public void list()
	{
		System.out.println("게시판 목록을 출력");
	}
}
class 답변형게시판 extends 게시판
{
	int a=200;
	public void list() //오버라이딩
	{
		System.out.println("답변을 포함해서 출력");
	}
}
class 댓글형게시판 extends 게시판
{
	int a=300;
	public void list()
	
	{
		System.out.println("댓글을 포함해서 출력");
	}
}
class 갤러리게시판 extends 게시판
{
	int a=400;
	public void write()
	{
		System.out.println("글쓰기와 그림 업로드 한다");
	}
	public void list()
	{
		System.out.println("그림을 포함해서 출력");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		게시판 board = new 답변형게시판();
		System.out.println(board.a);
		board.write();
		board.list();
		board = new 갤러리게시판();
		board.write();
		board.list();
		board = new 댓글형게시판();
		board.write();
		board.list();
	}

}
