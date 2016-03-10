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
    ChatRoom cr=new ChatRoom();
    // id|��ȭ��|����
    Socket s;
    BufferedReader in;// �������� ���� �д´�
    OutputStream out; // ������ ��û���� ������ 
    public ClientMainForm()
    {
    	setLayout(card);//BorderLayout
    	
    	add("LOG",login);
    	add("WR",wr);
    	add("CR",cr);
    	// ũ��
    	setSize(800, 600);
    	// �����츦 ������
    	setVisible(true);
    	setResizable(false);
    	
    	login.b1.addActionListener(this);
    	wr.tf.addActionListener(this);
    	wr.b1.addActionListener(this);
    	cr.tf.addActionListener(this);
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //xǥ�� ������ ����
    	
    }
    // ������ ����
    public void connection(String id,String name,String sex)
    {
    	try
    	{
    		s=new Socket("localhost", 7777);
    		// s=>server
    		in=new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			out=s.getOutputStream();
			out.write((Function.LOGIN+"|"+id+"|"
					+name+"|"+sex+"\n").getBytes());
    	}catch(Exception ex){}
    	
    	// �����κ��� ���䰪�� �޾Ƽ� ó��
    	new Thread(this).start();// run()
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
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			repaint();
			
			String id=login.tf1.getText().trim();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"ID�� �Է��ϼ���");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText().trim();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"��ȭ�� �Է��ϼ���");
				login.tf2.requestFocus();
				return;
			}
			String sex="";
			if(login.man.isSelected())
				sex="����";
			else
				sex="����";
			connection(id, name, sex);
		}
		else if(e.getSource()==wr.tf)
		{
			String data=wr.tf.getText();
			if(data.length()<1)
				return;
			
			try
			{
				out.write((Function.WAITCHAT+"|"+data+"\n").getBytes());
			}catch(Exception ex){}
			wr.tf.setText("");
		}
		else if(e.getSource()==wr.b1)
		{
			//mr.setSize(230, 235);
			mr.setBounds(285,180, 230, 240);
			mr.setVisible(true);
		}
		else if(e.getSource()==cr.tf)
		{
			String msg=cr.tf.getText().trim();
			if(msg.length()<1) return;
			String color=cr.box.getSelectedItem().toString();
			initStyle();
			append(msg, color);
			cr.tf.setText("");
		}
	}
	public void initStyle()
	{
		Style def=StyleContext.getDefaultStyleContext().
				getStyle(StyleContext.DEFAULT_STYLE);
		Style blue=cr.jp.addStyle("blue",def);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style green=cr.jp.addStyle("green",def);
		StyleConstants.setForeground(green, Color.green);
		
		Style cyan=cr.jp.addStyle("cyan",def);
		StyleConstants.setForeground(cyan, Color.cyan);
		
		Style yellow=cr.jp.addStyle("yellow",def);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style magenta=cr.jp.addStyle("magenta",def);
		StyleConstants.setForeground(magenta, Color.magenta);
	}
	public void append(String msg,String color)
	{
		try
		{
			Document doc=
				  cr.jp.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", 
					cr.jp.getStyle(color));
		}catch(Exception ex){}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				String msg=in.readLine();
				System.out.println("Server=>"+msg);
				StringTokenizer st=
					  new StringTokenizer(msg, "|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				  case Function.LOGIN:
				  {
					  String[] data={
						st.nextToken(),	 
						st.nextToken(),
						st.nextToken(),
						st.nextToken()
					  };
					  wr.model2.addRow(data);
				  }
				  break;
				  case Function.MYLOG:
				  {
					  String id=st.nextToken();
					  setTitle(id);
					  card.show(getContentPane(), "WR");
				  }
				  break;
				  case Function.WAITCHAT:
				  {
					  wr.ta.append(st.nextToken()+"\n");
					  wr.bar.setValue(wr.bar.getMaximum());
				  }
				  break;
				}
			}catch(Exception ex){}
		}
	}

}





/*package com.sist.client;
import java.awt.*; //Layout
import javax.swing.*; //window
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.common.Function;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMainForm extends JFrame implements ActionListener,Runnable{
	
	CardLayout card=new CardLayout();
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	MakeRoom mr=new MakeRoom();
	ChatRoom cr=new ChatRoom();
	// id|��ȭ��|����
	Socket s;
	BufferedReader in; //�������� ���� �д´�
	OutputStream out; //������ ��û���� ������
	public ClientMainForm()
	{
		setLayout(card); //BorderLayout
		add("LOG",login);
		add("WR",wr);
		add("CR",cr);
		//ũ��
		setSize(800, 600);
		//�����츦 ������
		
		setVisible(true);
		setResizable(false);
		
		login.b1.addActionListener(this);
		wr.tf.addActionListener(this);
		wr.b1.addActionListener(this);
		cr.tf.addActionListener(this);
		
	}
	//������ ����
	public void connection(String id,String name, String sex)
	{
		try
		{
			s=new Socket("localhost",7777);
			//s => server
			in=new BufferedReader(new InputStreamReader(s.getInputStream())); //�������� ���� �о��
			out=s.getOutputStream();//������ ���� ����
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
		}catch(Exception ex){
			//�����κ��� ������ �޾Ƽ� ó��
			new Thread(this).start(); //run()
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		}catch(Exception ex){}
		ClientMainForm cm=new ClientMainForm();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText().trim();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID���Է��ϼ���");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText().trim();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "��ȭ�����Է��ϼ���");
				login.tf2.requestFocus();
				return;
			}
			String sex="";
			if(login.man.isSelected())
				sex="����";
			else
				sex="����";
			connection(id,name,sex);
				
		}
		else if (e.getSource()==wr.tf)
		{
			String data= wr.tf.getText();
			if(data.length()<1)
				return;
			try
			{
				out.write((data+"\n").getBytes());
			}catch(Exception ex){}
			wr.tf.setText(data);
			wr.ta.append(data+"\n"); //append:���� �ٿ���
			wr.tf.setText("");
		}
		else if(e.getSource()==wr.b1)
		{
			//mr.setSize(230,235);
			mr.setBounds(285,180,230,240);
			mr.setVisible(true);
		}
		else if(e.getSource()==cr.tf){
			String msg=cr.tf.getText().trim();
			if(msg.length()<1) return;
			String color=cr.box.getSelectedItem().toString();
			initStyle();
			append(msg,color);
			cr.tf.setText("");
		}
	}
	public void initStyle()
	{
		Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
		Style blue=cr.jp.addStyle("blue", def);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style green=cr.jp.addStyle("green", def);
		StyleConstants.setForeground(green, Color.green);
		
		Style cyan=cr.jp.addStyle("pink", def);
		StyleConstants.setForeground(cyan, Color.pink);
		
		Style yellow=cr.jp.addStyle("yellow", def);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style magenta=cr.jp.addStyle("magenta", def);
		StyleConstants.setForeground(magenta, Color.magenta);
		
		
	}
	public void append(String msg,String color)
	{
		try
		{
			Document doc=cr.jp.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", cr.jp.getStyle(color));
		}catch(Exception e){}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				String msg=in.readLine();
				System.out.println("Server=>"+msg);
				StringTokenizer st= new StringTokenizer(msg, "|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				case Function.LOGIN:
				{
					String[] data={
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
					};
					wr.model2.addRow(data);
				}
				break;
				case Function.MYLOG:
				{
					String id=st.nextToken();
					setTitle(id);
					card.show(getContentPane(), "WR");
				}
				break;
				
				case Function.WAITCHAT:
				{
					
					wr.ta.append(st.nextToken()+"\n");
				}
				}
				break;
			} catch (Exception ex) {
			}
		}
	}
	
	
	

}
*/