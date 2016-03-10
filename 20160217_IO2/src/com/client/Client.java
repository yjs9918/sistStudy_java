package com.client;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.net.*;
public class Client extends JFrame implements ActionListener,Runnable{
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	Socket s;
	BufferedReader in;
	OutputStream out;
	public Client(){
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(25);
		b1=new JButton("접속");
		b2=new JButton("종료");
		tf.setEnabled(false);//텍스트필드 비활성화
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add("Center",js);
		add("South",p);
		setSize(450,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		tf.addActionListener(this);
		b2.addActionListener(this);
	}
;
	public static void main(String[] args) {
		new Client();
	}
	// 서버로부터 결과값을 읽어서 출력 => in
	@Override
	public void run() {
		while(true)
		{
			try
			{
				String msg=in.readLine();
				ta.append(msg+"\n");
			}catch(Exception ex){}
		}
	}
	// 사용자가 요청을 보낸다 => out
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) // server => ss.accept()
		{
			try
			{
				s=new Socket("localhost", 7777);
				// s => server정보
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//읽어오는 위치 잡음
				out=s.getOutputStream();
				new Thread(this).start();
				tf.setEnabled(true);
				b1.setEnabled(false);
			}catch(Exception ex){}
		}
		else if(e.getSource()==tf) // 요청 => in.readLine()
		{
			try
			{
				String msg=tf.getText().trim();
				if(msg.length()<1)
				{
					return;
				}
				out.write((msg+"\n").getBytes());
				tf.setText("");
			}catch(Exception ex){}
		}
		else if(e.getSource()==b2)
		{
			
		}
	}

}












