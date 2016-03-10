package com.sist2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass extends JFrame implements MouseMotionListener{
	GameView gv=new GameView();
	public MainClass()
	{
		setTitle("게임창");
		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("Game");
		JMenuItem a=new JMenuItem("Start");
		JMenuItem b=new JMenuItem("Stop");
		JMenuItem c=new JMenuItem("EXIT");
		
		menu.add(a);
		menu.add(b);
		menu.addSeparator(); //구분선
		menu.add(c);
		
		bar.add(menu);
		
		setJMenuBar(bar);
		
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //메모리 회수
		addMouseMotionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		gv.x=e.getX()-25; //타이틀 바 크기 만큼을 빼 줘야 마우스포인터와 오버랩됨
		gv.y=e.getY()-80; //타이틀 바  + 메뉴 크기만큼 빼줘야 함
		gv.repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
