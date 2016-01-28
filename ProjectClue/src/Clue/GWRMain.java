package Clue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GWRMain extends JFrame implements ActionListener{
	CardLayout card=new CardLayout();
	GameWaitingRoom gwr=new GameWaitingRoom();
	Login login=new Login();
	public GWRMain()
	{
		setLayout(card);
		add("LOG",login);
		add("GWR",gwr);
		setSize(1200,900);
		setVisible(true);
		setResizable(false);
		
		login.b1.addActionListener(this);
		gwr.tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex){}
		GWRMain mn=new GWRMain();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(),"GWR");
		}
		else if(e.getSource()==gwr.tf)
		{
			String data= gwr.tf.getText();
			gwr.chat.append(data+"\n");
			gwr.tf.setText("");
		}
	}

}
