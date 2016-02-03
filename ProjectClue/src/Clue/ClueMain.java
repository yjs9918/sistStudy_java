package Clue;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class ClueMain extends JFrame implements ActionListener,KeyListener{
	CardLayout card;
	GameWaitingRoom gwr=new GameWaitingRoom();
	Login login=new Login();
	GameMainScreen mainScreen=new GameMainScreen();

	
	
	public ClueMain()
	{	
		card=new CardLayout();
		setLayout(card);
		add("LOG",login);
		add("GWR",gwr);
		add("MS",mainScreen);
		
		setSize(1200,900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		login.b1.addActionListener(this);
		gwr.chatInput.addActionListener(this);
		gwr.btnReady.addActionListener(this);
		gwr.btnExit.addActionListener(this);

		addKeyListener(this);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex){}
		ClueMain mn=new ClueMain();

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
			//서버에 준비완료 알려주기
			card.show(getContentPane(), "MS");
			//게임시작
			
			
		}else if(e.getSource()==gwr.btnExit){
			repaint();
			card.previous(getContentPane());
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

