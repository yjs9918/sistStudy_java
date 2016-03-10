package com.sist.client;
import java.awt.*;
import javax.swing.*;

public class BoardIU extends JPanel{
	JLabel la1,la2,la3,la4,la5;
	JTextField tf1,tf2;
	JTextArea ta;
	JPasswordField pf;
	JButton b1,b2;
	
	public BoardIU() {
		la1=new JLabel("글쓰기");
		la1.setFont(new Font("맑은 고딕",Font.BOLD,30));
		JPanel p=new JPanel();
		p.add(la1);
		la2=new JLabel("이름");
		la3=new JLabel("제목");
		la4=new JLabel("내용");
		la5=new JLabel("비밀번호");
		
		tf1=new JTextField();
		tf2=new JTextField();
		
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		
		pf=new JPasswordField();
		
		b1=new JButton("글쓰기");
		b2=new JButton("취소");
		
		setLayout(null);
		p.setBounds(10,15,770,40);
		la2.setBounds(150,75,60,30);
		tf1.setBounds(215, 75, 150, 30);
		
		la3.setBounds(150,110,60,30);
		tf2.setBounds(215, 110, 415, 30);
		
		la4.setBounds(150,145,60,30);
		js.setBounds(215, 145, 415, 200);
		
		la5.setBounds(150,350,60,30);
		pf.setBounds(215, 350, 100, 30);
		
		JPanel p1=new JPanel();
		p1.add(b1);
		p1.add(b2);
		
		p1.setBounds(150,390,480,35);
		
		add(p);
		add(la2);add(tf1);
		add(la3);add(tf2);
		add(la4);add(js);
		add(la5);add(pf);
		add(p1);
		
		
	}
}

