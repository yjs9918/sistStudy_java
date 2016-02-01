package Clue;
import java.awt.*;
import javax.swing.*;
public class GWR_userPanel extends JPanel{

	Image panelImage;
	
	public GWR_userPanel() {
		
		panelImage=Toolkit.getDefaultToolkit().getImage("/image/cardback.jpg");
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(panelImage, 0,0, getWidth(), getHeight(), this);
	}

	
}
	

