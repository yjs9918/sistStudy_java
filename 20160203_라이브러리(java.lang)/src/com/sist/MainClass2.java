package com.sist;
//toString : ��ü�� ���ڿ��� ��ȯ
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// java : JDK 1.0(java)        javax: JDK 1.2(java2)
// java : JDK 1.8(java3)
// ���ٽ�  : �Լ� �������̽� <-
// ����ȥ  : �ڹٿ��� �ڹٽ�ũ��Ʈ ����
public class MainClass2 extends JFrame implements ActionListener{
	JLabel la,la2;
	JComboBox box;
	JButton b;
	public MainClass2() {
		la=new JLabel("����");
		box=new JComboBox();
		box.addItem("����");
		box.addItem("����");
		b=new JButton("����");
		la2=new JLabel("���õ� ����",JLabel.CENTER);
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
			String sex=box.getSelectedItem().toString(); //object�� string���� ��ȯ
			//String sex=(String)box.getSelectedItem(); ������ ������ (����ȯ)
			la2.setText("���õ� ����:"+sex);
		}
	}

}
