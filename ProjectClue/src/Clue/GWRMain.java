package Clue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GWRMain extends JFrame implements ActionListener{
	CardLayout card=new CardLayout();
	GameWaitingRoom gwr=new GameWaitingRoom();
	
	public GWRMain()
	{
		setLayout(card);
		add("gwr",gwr);
		setSize(1200,900);
		setVisible(true);
		setResizable(false);
		
		gwr.tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex){}
		Main mn=new Main();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==gwr.tf)
		{
			String data= gwr.tf.getText();
			gwr.chat.append(data+"\n");
			gwr.tf.setText("");
		}
	}

}
