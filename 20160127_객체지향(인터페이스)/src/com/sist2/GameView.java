package com.sist2;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{
	Image back,move; //null
	int x,y;
	public GameView() // class�ε� new�� �� �پ� ������ �߻�Ŭ����  or �������̽�
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\back.jpg");
		move=Toolkit.getDefaultToolkit().getImage("c:\\image\\left.gif");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
		g.drawImage(move, x, y, this);
	}
	
}
