package Clue.display.gameboard;

import java.awt.*;
import javax.swing.*;

public class GameBoard extends JPanel{
	Image backImg;
	JPanel gridBoard;
	
	public GameBoard(){
		backImg=Toolkit.getDefaultToolkit().getImage("C:\\image\\boardBack.png");
		gridBoard=new GameView();
		gridBoard.setBackground(Color.white);
		
		setLayout(null);
		
		gridBoard.setBounds(280,130,390,390);

		add(gridBoard);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(),this);
		}
	
}
