package Clue;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GameArea extends JPanel{
	
	
	Image backImg;
	JPanel gridBoard;
	Game game;
	public GameArea(){
		game=new Game();
		backImg=Toolkit.getDefaultToolkit().getImage("/image/boardBack.png");
		gridBoard=game.gv;
		gridBoard.setBackground(Color.white);
		
		
		
		
		setLayout(null);
		
		gridBoard.setBounds(249,109,352,352);

		add(gridBoard);
		
		/*try {
			game.porocess();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	}

			
			
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(backImg, 0, 0, getWidth(), getHeight(),this);
		}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		game.gp.keyPressed(e);
		
	}
}
