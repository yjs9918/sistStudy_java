package Clue;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import Clue.GameMainScreen;
import Clue.Dice;

import java.awt.event.*;


public class ClueMain extends JFrame implements ActionListener{
	CardLayout card;
	GameWaitingRoom gwr=new GameWaitingRoom();
	Login login=new Login();
	GameMainScreen mainScreen=new GameMainScreen();
	LoadingTest loading= new LoadingTest(this); //160204 정선 추가
	private Dice dice; //160206 정선 추가
	
	
	
	
	public ClueMain()
	{	
		card=new CardLayout();
		setLayout(card);
		add("LOG",login);
		add("GWR",gwr);
		add("LD",loading); //160204정선추가
		add("MS",mainScreen);
		setSize(1200,900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		login.b1.addActionListener(this);
		gwr.chatInput.addActionListener(this);
		gwr.btnReady.addActionListener(this);
		gwr.btnExit.addActionListener(this);
		
		dice=new Dice();//정선 추가 150207
	}
	
	
	public Dice dice() //정선 추가 160206
	{
		return dice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex){}
		ClueMain mn=new ClueMain();
		String path = ClueMain.class.getResource("").getPath();
		System.out.println(path);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(),"GWR");
		}
		else if(e.getSource()==gwr.chatInput)
		{
			String data= gwr.chatInput.getText();
			gwr.chat.append(data+"\n");
			gwr.chatInput.setText("");
		}
		else if(e.getSource()==gwr.btnReady)
		{	
			repaint();
			
			card.show(getContentPane(), "LD"); //160204 정선추가
			new Thread(loading).start(); //160204 정선추가
			
		}else if(e.getSource()==gwr.btnExit){
			repaint();
			card.previous(getContentPane());
		}
	}
	

}

