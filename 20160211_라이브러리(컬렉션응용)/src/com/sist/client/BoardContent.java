package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class BoardContent extends JPanel{
	JLabel la1,la2,la3,la4,la5,la6;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JTextArea ta;
	JButton b1,b2,b3;
	
	public BoardContent() {
		la1=new JLabel("내용보기");
		la2=new JLabel("번호");
		la3=new JLabel("작성일");
		la4=new JLabel("이름");
		la5=new JLabel("조회수");
		la6=new JLabel("제목");
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		
		b1=new JButton("수정");
		b2=new JButton("삭제");
		b3=new JButton("목록");
		
		tf1.setEnabled(false);
		tf2.setEnabled(false);
		tf3.setEnabled(false);
		tf4.setEnabled(false);
		tf5.setEnabled(false);
		ta.setEnabled(false);
		
		la1.setFont(new Font("맑은 고딕",Font.BOLD,30));
		JPanel p1=new JPanel();
		p1.add(la1);
		
		setLayout(null);
		p1.setBounds(10,15,760,40);
		la2.setBounds(150,75,50,30);
		tf1.setBounds(205, 75, 150, 30);
		la3.setBounds(370,75,50,30);
		tf2.setBounds(430, 75, 150, 30);
		
		la4.setBounds(150,110,50,30);
		tf3.setBounds(205, 110, 150, 30);
		la5.setBounds(370,110,50,30);
		tf4.setBounds(430, 110, 150, 30);
		
		la6.setBounds(150,145,50,30);
		tf5.setBounds(205, 145, 375, 30);
		
		js.setBounds(150,180,430,250);
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.setBounds(150,440,430,35);
		add(la2);add(tf1);add(la3);add(tf2);
		add(la4);add(tf3);add(la5);add(tf4);
		add(la6);add(tf5);
		add(js);
		add(p1);
		add(p2);
		
		
		
	}
}












