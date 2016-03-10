package com.sist;
// Runnable
/*
 *   Thread => 데이터, 메소드를 공유해서 사용 => inner Class
 *   Runnable => 이미 상속을 받은 상태에서 => 쓰레드를 제어
 *   ========
 *      class A extends JFrame implements Runnable
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MainClass extends JFrame implements Runnable,ActionListener{
	
	JLabel la1,la2,la3,la4;
	JProgressBar bar1,bar2,bar3;
	JButton b1,b2;
	JTextField tf1,tf2,tf3;
	
	public MainClass()
	{
		la1=new JLabel("운세보기");
		la1.setFont(new Font("맑은 고딕",Font.BOLD,30));
		la2=new JLabel("금전운");
		la3=new JLabel("애정운");
		la4=new JLabel("건강운");
		bar1=new JProgressBar(0,100);
		bar1.setStringPainted(true); //퍼센테이지 보여줌
		bar2=new JProgressBar(0,100);
		bar2.setStringPainted(true);
		bar3=new JProgressBar(0,100);
		bar3.setStringPainted(true);
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		b1=new JButton("Start");
		b2=new JButton("Exit");
		
		setLayout(null);
		JPanel p1=new JPanel();
		p1.add(la1);
		p1.setBounds(10,15,570,40);
		add(p1);
		
		la2.setBounds(10,65,50,30);
		bar1.setBounds(65,65,400,30);
		tf1.setBounds(470,65,110,30);
		add(la2);add(bar1);add(tf1);
		
		la3.setBounds(10,100,50,30);
		bar2.setBounds(65,100,400,30);
		tf2.setBounds(470,100,110,30);
		add(la3);add(bar2);add(tf2);
		
		la4.setBounds(10,135,50,30);
		bar3.setBounds(65,135,400,30);
		tf3.setBounds(470,135,110,30);
		add(la4);add(bar3);add(tf3);
		
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(10,170,570,35);
		add(p2);
		
		setSize(600,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void go()
	{
		try
		{
			Random rnd=new Random();
			int a=rnd.nextInt(101);// 0~100까지
			int b=rnd.nextInt(101);
			int c=rnd.nextInt(101);
			for(int i=0;i<=a;i++)
			{
				
				bar1.setValue(i);
				Thread.sleep(50);
			}
			tf1.setText(a+"%");
			for(int i=0;i<=b;i++)
			{
				bar2.setValue(i);
				Thread.sleep(50);
			}
			tf2.setText(b+"%");
			for(int i=0;i<=c;i++)
			{
				bar3.setValue(i);
				Thread.sleep(50);
			} //동기화 쓰레드
			tf3.setText(c+"%");
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			new Thread(this).start();
			//델리게이트 (대리자)
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}

}
