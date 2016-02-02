package clue;
import java.awt.*;
import javax.swing.*;
public class questionCard extends JPanel{
	Image qcard;
	
	public questionCard() {
		qcard=Toolkit.getDefaultToolkit().getImage("image/qcard1.png");
		
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(qcard, 0, 0, getWidth(),getHeight(),this);
	}
}
