package com.sist;
import javax.swing.*; // 윈도우
import java.awt.*; // 배치(Layout)
import java.awt.event.*;
// 상속 : 기존의 만들어진 클래스의 기능을 전체 받는다 (중복을 제거한다)
public class MainClass2 extends JFrame
implements KeyListener
{
	GameView gv=new GameView();
	int type=0;
	public MainClass2()
	{
		//추가
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		addKeyListener(this); // 이벤트 등록
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
	}
	@Override
	public void keyTyped(KeyEvent e) { //키 두개 눌렀을때 ex)ctrl+z
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) { //키보드 눌렀을때
		// TODO Auto-generated method stub
		
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_RIGHT:
			type=0;
			gv.setImage(0);
			gv.x+=5;
			if(gv.x>800)
				gv.x=0;
			break;
		case KeyEvent.VK_LEFT:
			type=2;
			gv.setImage(2);
			gv.x-=5;
			if(gv.x<0)
				gv.x=800;
			break;
		case KeyEvent.VK_UP:
			type=1;
			gv.setImage(0);
			gv.y-=5;
			if(gv.y>600)
				gv.y=0;
			break;
		case KeyEvent.VK_DOWN:
			type=1;
			gv.setImage(2);
			gv.y+=5;
			if(gv.y<0)
				gv.y=600;
			break;
		case KeyEvent.VK_ENTER:
			if(type==0)
			{
				gv.setImage(1);
			}
			else
			{
				gv.setImage(3);
			}
			break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) { // 키보드 놨을 때
		// TODO Auto-generated method stub
		
	}

}
