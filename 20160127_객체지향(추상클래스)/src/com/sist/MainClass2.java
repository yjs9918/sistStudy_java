package com.sist;
/*
 *   추상 클래스                                        인터페이스(추상클래스의 일종)
 *   ==========================================
 *    단일 상속                                                  다중 상속
 *    메소드(구현X,구현O)            메소드(구현X) ~ JDK 1.7
 *                             *** JDK 1.8 (static, default) 구현된메소드 가짐
 *    상속을 받은 클래스가
 *    구현 안된 메소드를 구현해서 사용
 *    (extends)                implements
 *    
 *   ==========================================
 *   형식)
 *       abstract class className
 *       {
 *          int a;
 *          public abstract void display();
 *       }
 *       
 *       interface interfaceName
 *       {
 *          int a;   => error
 *            : 모든 변수는 상수다
 *          int a=10; ========> public static final(생략)
 *          void display(); ===> public abstract (생략)
 *          ***JDK 1.8 추가
 *          static void a() ===> public (생략)
 *          {
 *             // 상속(X) ==> 공통으로 적용
 *          }
 *          default void b() ===> public (생략)
 *          {
 *             // 필요한 클래스마다 오버라이딩이 가능
 *          }
 *       }
 *       
 *       class A
 *       {
 *          void display(){1}
 *       }
 *       class B extends A
 *       {
 *          void display(){2}  => 오버라이딩 시켜야함
 *       }
 *       
 *       ==>
 *       interface VS class
 *       interface A
 *       interface B ==> 확장
 *           extends
 *       ==> interface B extends A
 *       
 *       interface A
 *       interface B extends A
 *       class C implements B
 *               ==========
 *               class가 interface를 상속받는 경우에 사용
 *       class C implements A,B ==> 다중 상속이 가능
 *       class => interface 상속 (X)
 */
import java.awt.*;
import java.awt.event.*; // interface를 가지고 있다
/*
 *   Button, TextField, Menu
 *     => actionPerformed() : ActionListener
 *   MouseListener
 *   KeyListener
 *   MouseMotionListener
 *   ItemListener
 */
import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener{
	JButton bu;
	public MainClass2() 
	{
		bu=new JButton("Click");
		// 추가
		add("North",bu);
		// 윈도우 크기
		setSize(300,300);
		// 윈도우를 보여라
		setVisible(true);
		
		bu.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bu)
		{
			System.out.println("버튼 클릭!!");
		}
	}

}
