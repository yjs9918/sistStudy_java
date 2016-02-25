package Clue;

import java.awt.*;
import javax.swing.*;

public class PUImg2 extends JPanel{
	
	Image reach;
	JLabel la1 ;
	
	public JButton b2,b3;
	public PUImg2(){
		
		
		
		reach=Toolkit.getDefaultToolkit().getImage("image/back/corr.jpg");
		setLayout(null);
		
	
	}
	@Override
	protected void paintComponent(Graphics g) {  
		
		g.drawImage(reach, 0, 0, getWidth(),getHeight(),this);
	}
	
}
