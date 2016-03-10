package com.sist;
/*
 *   �߻� Ŭ����                                        �������̽�(�߻�Ŭ������ ����)
 *   ==========================================
 *    ���� ���                                                  ���� ���
 *    �޼ҵ�(����X,����O)            �޼ҵ�(����X) ~ JDK 1.7
 *                             *** JDK 1.8 (static, default) �����ȸ޼ҵ� ����
 *    ����� ���� Ŭ������
 *    ���� �ȵ� �޼ҵ带 �����ؼ� ���
 *    (extends)                implements
 *    
 *   ==========================================
 *   ����)
 *       abstract class className
 *       {
 *          int a;
 *          public abstract void display();
 *       }
 *       
 *       interface interfaceName
 *       {
 *          int a;   => error
 *            : ��� ������ �����
 *          int a=10; ========> public static final(����)
 *          void display(); ===> public abstract (����)
 *          ***JDK 1.8 �߰�
 *          static void a() ===> public (����)
 *          {
 *             // ���(X) ==> �������� ����
 *          }
 *          default void b() ===> public (����)
 *          {
 *             // �ʿ��� Ŭ�������� �������̵��� ����
 *          }
 *       }
 *       
 *       class A
 *       {
 *          void display(){1}
 *       }
 *       class B extends A
 *       {
 *          void display(){2}  => �������̵� ���Ѿ���
 *       }
 *       
 *       ==>
 *       interface VS class
 *       interface A
 *       interface B ==> Ȯ��
 *           extends
 *       ==> interface B extends A
 *       
 *       interface A
 *       interface B extends A
 *       class C implements B
 *               ==========
 *               class�� interface�� ��ӹ޴� ��쿡 ���
 *       class C implements A,B ==> ���� ����� ����
 *       class => interface ��� (X)
 */
import java.awt.*;
import java.awt.event.*; // interface�� ������ �ִ�
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
		// �߰�
		add("North",bu);
		// ������ ũ��
		setSize(300,300);
		// �����츦 ������
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
			System.out.println("��ư Ŭ��!!");
		}
	}

}
