package com.sist;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{

	int x=-30,y=-30;
	@Override
	public void paint(Graphics g) {
		//g.setColor(Color.white);
		//g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor(new Color((int)(Math.random()*256),
				(int)(Math.random()*256),(int)(Math.random()*256)));
		g.drawOval(x, y, 30, 30);
	}

}
