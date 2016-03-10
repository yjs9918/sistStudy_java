package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseMain extends JFrame implements MouseListener{
	GameView gv=new GameView();
	public MouseMain()
	{
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseMain mm=new MouseMain();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount()==2) //더블클릭
		{
			gv.x=e.getX();
			gv.y=e.getY();
			gv.repaint(); //paint() 호출
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
