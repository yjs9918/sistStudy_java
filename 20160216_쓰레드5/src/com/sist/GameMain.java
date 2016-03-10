package com.sist;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class GameMain extends JFrame implements KeyListener{
	GameView gv=new GameView();
	public GameMain()
	{
		add("Center",gv);
		setSize(330,450);
		setVisible(true);
		addKeyListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_LEFT:
			gv.x-=3;
			if(gv.x<20)
			{
				gv.x=20;
			}
			break;
		case KeyEvent.VK_RIGHT:
			gv.x+=3;
			if(gv.x>280)
			{
				gv.x=280;
			}
			break;
		case KeyEvent.VK_ESCAPE:
			System.exit(0);// esc 눌렀을때 프로그램 종료
			break;
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
