package com.sist;
import java.awt.*;
import javax.swing.*;
public class MainClass2 extends JFrame{
	GameView gv=new GameView();
	public MainClass2()
	{
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}

}
