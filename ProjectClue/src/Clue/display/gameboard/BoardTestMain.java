package Clue.display.gameboard;

import java.awt.*;
import javax.swing.*;

import Clue.display.gamemainboard.GameArea;

public class BoardTestMain extends JFrame {

	GameArea gb = new GameArea();
	
	
	public BoardTestMain(){
		add(gb);
		setSize(955,680);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		BoardTestMain tm = new BoardTestMain();
	}

}
