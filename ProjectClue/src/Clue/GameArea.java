package Clue;

import java.awt.*;
import javax.swing.*;

public class GameArea extends JPanel{
	Image backImg;
	JPanel gridBoard;
	
	public GameArea(){
		backImg=Toolkit.getDefaultToolkit().getImage("C:\\image\\boardBack.png");
		gridBoard=new GameArea_InnerBoard();
		gridBoard.setBackground(Color.white);
		
		setLayout(null);
		
		gridBoard.setBounds(250,108,350,350);

		add(gridBoard);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(),this);
		}
}
