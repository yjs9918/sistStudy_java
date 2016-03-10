package com.sist;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{
	Image back,move;
	int x=50;
	int y=480;
	String[] img={"right.gif","right_enter.gif","left.gif","left_enter.gif"};
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\back.jpg");
		move=Toolkit.getDefaultToolkit().getImage("c:\\image\\right.gif");
	}
	public void setImage(int no)
	{
		move=Toolkit.getDefaultToolkit().getImage("c:\\image\\"+img[no]);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this); // 화면을 꽉채움
		g.drawImage(move, x, y, this); // 이미지 원래 파일 크기 그대로 가져옴
	}
	
}

