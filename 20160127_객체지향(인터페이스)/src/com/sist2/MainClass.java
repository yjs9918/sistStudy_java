package com.sist2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass extends JFrame implements MouseMotionListener{
	GameView gv=new GameView();
	public MainClass()
	{
		setTitle("����â");
		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("Game");
		JMenuItem a=new JMenuItem("Start");
		JMenuItem b=new JMenuItem("Stop");
		JMenuItem c=new JMenuItem("EXIT");
		
		menu.add(a);
		menu.add(b);
		menu.addSeparator(); //���м�
		menu.add(c);
		
		bar.add(menu);
		
		setJMenuBar(bar);
		
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //�޸� ȸ��
		addMouseMotionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		gv.x=e.getX()-25; //Ÿ��Ʋ �� ũ�� ��ŭ�� �� ��� ���콺�����Ϳ� ��������
		gv.y=e.getY()-80; //Ÿ��Ʋ ��  + �޴� ũ�⸸ŭ ����� ��
		gv.repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
