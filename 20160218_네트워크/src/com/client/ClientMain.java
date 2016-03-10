package com.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ClientMain extends JFrame implements ActionListener{
	GameView my=new GameView();
	GameView you=new GameView();
	public ClientMain()
	{
		setLayout(null);
		my.setBounds(10,100,400,400);
		you.setBounds(420,100,200,200);
		add(my);
		add(you);
		my.getRand();
		you.getRand();
		my.display(1);
		you.display(0);
		setSize(645,550);
		setVisible(true);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				my.pan[i][j].addActionListener(this);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(e.getSource()==my.pan[i][j])
				{
					my.pan[i][j].setBackground(Color.yellow);
					my.pan[i][j].setEnabled(false);
					String s=my.pan[i][j].getText(); //버튼의 값 가져옴
					you.checkBtn(Integer.parseInt(s));
				}
			}
		}
	}

}
