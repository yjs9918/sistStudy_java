package Clue;

import javax.swing.*;
import java.awt.*;
public class Loading extends JPanel{

	Image ld;
	
	public Loading(){
		ld= Toolkit.getDefaultToolkit().getImage("C:\\image\\loading.gif");
		
	}
	
	protected void paintComponent(Graphics g) {
		g.drawImage(ld, 0, 0, getWidth(), getHeight(),this);
		}
}
