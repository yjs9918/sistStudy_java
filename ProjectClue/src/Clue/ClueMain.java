package Clue;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class ClueMain extends JFrame implements ActionListener,KeyListener{
	CardLayout card;
	GameWaitingRoom gwr=new GameWaitingRoom();
	Login login=new Login();
	GameMainScreen mainScreen=new GameMainScreen();
	CardSelect cs = new CardSelect();
	LoadingTest loading= new LoadingTest(this); //160204 정선 추가
	ReachRoom reachRoom =new ReachRoom();
	
	public ClueMain()
	{	
		card=new CardLayout();
		setLayout(card);
		add("LOG",login);
		add("GWR",gwr);
		add("MS",mainScreen);
		add("LD",loading); //160204정선추가
		add("CS",cs);
		
		setSize(1200,900);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		login.b1.addActionListener(this);
		gwr.chatInput.addActionListener(this);
		gwr.btnReady.addActionListener(this);
		gwr.btnExit.addActionListener(this);
		mainScreen.b.addActionListener(this);
		cs.st.addActionListener(this);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - getWidth())/2,(screenSize.height - getHeight())/2,getWidth(),getHeight());
		
		addKeyListener(this);
		setFocusable(true);
		reachRoom.b1.addActionListener(this);
		reachRoom.b2.addActionListener(this);

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
			
			card.show(getContentPane(), "LD"); //160204 정선추가
			new Thread(loading).start(); //160204 정선추가
			
			
		/*}else if(e.getSource()==gwr.btnExit){
			repaint();
			//card.previous(getContentPane());
			card.show(getContentPane(),"CS");
		}else if(e.getSource()==mainScreen.b){
			repaint();
			card.show(getContentPane(), "CS");
			//mainScreen.mc.show(this.getContentPane(), "CDS");
*/			
		}else if(e.getSource()==cs.st){
			repaint();
			card.previous(getContentPane());
			card.show(getContentPane(), "MS");
			
			//수정필요
			mainScreen.game.savePlayerStatus();
			mainScreen.game.setGamePlayer(Game.crrPlayer,mainScreen.game.runDice());
			
			mainScreen.showCount();
			mainScreen.jpGameBoard.repaint();
			//여기까지
			//mainScreen.mc.show(getParent(), "GB");
		}else if(e.getSource()==reachRoom.b1){
			repaint();
			card.show(getContentPane(), "CS");
			reachRoom.setVisible(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		mainScreen.game.gp.keyPressed(e);
		int n=mainScreen.game.process();
		if(n!=0){
			reachRoom.setBounds(500,250,230,240);
			reachRoom.la1.setText(n+"번방에 도달했습니다.");
			reachRoom.setVisible(true);
		}
		mainScreen.showCount();
		mainScreen.jpGameBoard.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

