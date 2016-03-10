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
		b1=new JButton("����");
		b2=new JButton("����");
		tf.setEnabled(false);//�ؽ�Ʈ�ʵ� ��Ȱ��ȭ
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
	// �����κ��� ������� �о ��� => in
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
	// ����ڰ� ��û�� ������ => out
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) // server => ss.accept()
		{
			try
			{
				s=new Socket("localhost", 7777);
				// s => server����
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//�о���� ��ġ ����
				out=s.getOutputStream();
				new Thread(this).start();
				tf.setEnabled(true);
				b1.setEnabled(false);
			}catch(Exception ex){}
		}
		else if(e.getSource()==tf) // ��û => in.readLine()
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












