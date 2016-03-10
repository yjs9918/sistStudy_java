package com.sist;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{
	Image back,move;
	int x=650,y=470;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\Image\\back.jpg");
		move=Toolkit.getDefaultToolkit().getImage("c:\\Image\\left.gif");
		new Move().start();
	}
	public void setImage(int no)
	{
		if(no==0)
			move=Toolkit.getDefaultToolkit().getImage("c:\\Image\\left.gif");
		else
			move=Toolkit.getDefaultToolkit().getImage("c:\\Image\\right.gif");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
		g.drawImage(move, x, y, this);
	}
	class Move extends Thread
	{
		public void run() //Thread 동작기능
		{
			int t=1;
			while(true)
			{
				x=x-(t*10);
				if(x<0)
				{
					setImage(1);
					t=-1;
				}
				if(x>740)
				{
					setImage(0);
					t=1;
				}
				try
				{
					Thread.sleep(100);
				}catch(Exception ex){}
			}
		}
	}
}
