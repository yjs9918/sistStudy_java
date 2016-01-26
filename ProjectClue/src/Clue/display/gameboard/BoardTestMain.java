package Clue.display.gameboard;

import java.awt.*;
import javax.swing.*;

public class BoardTestMain extends JFrame {

	GameBoard gb = new GameBoard();
	
	
	public BoardTestMain(){
		add(gb);
		setSize(950,650);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		
		BoardTestMain tm = new BoardTestMain();
	}

}
