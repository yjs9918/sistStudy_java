package com.sist;
import java.awt.*; //Layout
import javax.swing.*; //window
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import java.awt.event.*;
public class ClientMainForm extends JFrame implements ActionListener{
	CardLayout card=new CardLayout();
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	MakeRoom mr=new MakeRoom();
	ChatRoom cr=new ChatRoom();
	// id|대화명|성별
	public ClientMainForm()
	{
		setLayout(card); //BorderLayout
		add("LOG",login);
		add("WR",wr);
		add("CR",cr);
		//크기
		setSize(800, 600);
		//윈도우를 보여라
		
		setVisible(true);
		setResizable(false);
		
		login.b1.addActionListener(this);
		wr.tf.addActionListener(this);
		wr.b1.addActionListener(this);
		cr.tf.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자
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
			card.show(getContentPane(), "WR");
		}
		else if (e.getSource()==wr.tf)
		{
			String data= wr.tf.getText();
			wr.ta.append(data+"\n"); //append:문자 붙여줌
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

}
