package com.sist;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class MainClass extends JFrame{
	JButton b1,b2,b3,b4;
	public MainClass()
	{
		setLayout(null);
		b1=new JButton(new ImageIcon("c:\\image\\delete.gif"));
		b2=new JButton(new ImageIcon("c:\\image\\list.gif"));
		b3=new JButton(new ImageIcon("c:\\image\\modify.gif"));
		b4=new JButton(new ImageIcon("c:\\image\\reply.gif"));
		
		b1.setBounds(10,15,100,30);
		b2.setBounds(10,50,150,30);
		b3.setBounds(10,85,170,30);
		b4.setBounds(10,120,200,30);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.setIcon(new ImageIcon(setImage("c:\\image\\delete.gif",b1.getWidth(),b1.getHeight())));
		b2.setIcon(new ImageIcon(setImage("c:\\image\\list.gif",b2.getWidth(),b2.getHeight())));
		b3.setIcon(new ImageIcon(setImage("c:\\image\\modify.gif",b3.getWidth(),b3.getHeight())));
		b4.setIcon(new ImageIcon(setImage("c:\\image\\reply.gif",b4.getWidth(),b4.getHeight())));
		
		setSize(250,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Image setImage(String filename,int width,int height) //버튼에 맞게 이미지 크기 맞춤
	{
		ImageIcon ii=new ImageIcon(filename);
		Image image=ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return image;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}
