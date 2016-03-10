package com.sist.client;
import java.awt.*;//Layout
import javax.swing.*;//window
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.common.Function;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
public class ClientMainForm extends JFrame 
implements ActionListener,Runnable
{
    CardLayout card=new CardLayout();
    Login login=new Login();
    WaitRoom wr=new WaitRoom();
    MakeRoom mr=new MakeRoom();
    GameRoom gr=new GameRoom();
    
    // id|대화명|성별
    Socket s;
    BufferedReader in;// 서버에서 값을 읽는다
    OutputStream out; // 서버로 요청값을 보낸다 
    public ClientMainForm()
    {
    	setLayout(card);//BorderLayout
    	add("WR",wr);
    	add("LOG",login);
    	add("GR",gr);
    	
    	
    	// 크기
    	setSize(800, 600);
    	// 윈도우를 보여라
    	setVisible(true);
    	setResizable(false);
    	
    	login.b1.addActionListener(this);
    	
    	//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
    }
    // 서버와 연결
    public void connection(String id,String name,String sex)
    {
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 생성자 
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		}catch(Exception ex){}
		ClientMainForm cm=new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	@Override
	public void run() {
		
	}

}




