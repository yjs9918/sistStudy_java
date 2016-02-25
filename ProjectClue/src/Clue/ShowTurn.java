package Clue;



import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import java.awt.*;


public class ShowTurn extends JFrame {

	PUImg img;
	
	public JButton b1;
	public ShowTurn(){
		
		setSize(300,300);
		img = new PUImg();
		b1= new JButton("주사위 돌리기");
		setLayout(null);
	
	
		
		img.setBounds(0,0,300,300);
	
		b1.setBounds(40,150,120,40);
		
	
		add(img);
		img.add(b1);	
	
		
	
		
		
	}
	
	/*	
	public static void main(String[] args){
		new ShowTurn().setVisible(true);
	}
public void setLabel(String id, int dice){
		label.setText(id+"턴! ");
		label2.setText("이동횟수: "+dice);
		
	}*/
	
	
}
