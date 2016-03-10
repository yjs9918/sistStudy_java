package com.sist;
//toString : 객체를 문자열로 변환
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// java : JDK 1.0(java)        javax: JDK 1.2(java2)
// java : JDK 1.8(java3)
// 람다식  : 함수 인터페이스 <-
// 나즈혼  : 자바에서 자바스크립트 제어
public class MainClass2 extends JFrame implements ActionListener{
	JLabel la,la2;
	JComboBox box;
	JButton b;
	public MainClass2() {
		la=new JLabel("성별");
		box=new JComboBox();
		box.addItem("남자");
		box.addItem("여자");
		b=new JButton("선택");
		la2=new JLabel("선택된 성별",JLabel.CENTER);
		//setLayout(new FlowLayout());
		JPanel p=new JPanel(); // Default : FlowLayout
		p.add(la);
		p.add(box);
		p.add(b);
		add("Center",p);
		add("South",la2);
		setSize(350,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			String sex=box.getSelectedItem().toString(); //object를 string으로 변환
			//String sex=(String)box.getSelectedItem(); 위에와 동일함 (형변환)
			la2.setText("선택된 성별:"+sex);
		}
	}

}
