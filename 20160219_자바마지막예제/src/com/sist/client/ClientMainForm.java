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
    
    // id|��ȭ��|����
    Socket s;
    BufferedReader in;// �������� ���� �д´�
    OutputStream out; // ������ ��û���� ������ 
    public ClientMainForm()
    {
    	setLayout(card);//BorderLayout
    	add("WR",wr);
    	add("LOG",login);
    	add("GR",gr);
    	
    	
    	// ũ��
    	setSize(800, 600);
    	// �����츦 ������
    	setVisible(true);
    	setResizable(false);
    	
    	login.b1.addActionListener(this);
    	
    	//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
    }
    // ������ ����
    public void connection(String id,String name,String sex)
    {
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ 
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




