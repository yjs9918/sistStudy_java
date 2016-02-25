package Clue;



import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;



public class ShowTurn extends JFrame {
	JLabel la1;
	JLabel label ;
	JLabel label2 ;
	JPanel p1;

	public JButton b1;
	public ShowTurn(){
		JPanel p1= new JPanel();
		p1.add("Center", new JLabel(new ImageIcon(setImage("image/showturn.jpg", p1.getWidth(), p1.getHeight()))));
		setSize(300,300);
		
		label = new JLabel("MY TURN ");
		b1= new JButton("주사위 돌리기");
		
		setLayout(null);
		
		label.setBounds(150,50,80,20);
		b1.setBounds(80,150,120,40);
		
		add(label);
		add(b1);	
	
		
	
		
		
	}
	/*	public static void main(String[] args){
		new ShowTurn().setVisible(true);
	}
public void setLabel(String id, int dice){
		label.setText(id+"턴! ");
		label2.setText("이동횟수: "+dice);
		
	}*/
	private Image setImage(String filename, int width, int height) {
		// TODO Auto-generated method stub
		ImageIcon ii = new ImageIcon(filename);
		Image image = ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return image;
		// return null;
	}
	
}
