package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	Image back;
	JLabel la1,la2,la3;
	JTextField tf1,tf2;
	JRadioButton man,woman;
	JButton b1,b2;
	// ���� (�ʱ�ȭ)
	/*
	 *   JPanel => �ε�
	 *             1) ������ ȣ��
	 *             2) update() => clearRect()
	 *                paint(),paintComponent() ==> �ڵ� ȣ��
	 *             ==> ȭ�� ����
	 */
	public Login() 
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\back.jpg");
		la1=new JLabel("ID");
		la2=new JLabel("��ȭ��");
		la3=new JLabel("����");
		tf1=new JTextField();
		tf2=new JTextField();
		b1=new JButton("�α���");
		b2=new JButton("���");
		man=new JRadioButton("����");
		woman=new JRadioButton("����");
		ButtonGroup bg=new ButtonGroup();
		bg.add(man);
		bg.add(woman);
		man.setSelected(true);
		
		JPanel p=new JPanel(); // FlowLayout
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 120, 195, 35);
		p.setOpaque(false);
		// ��ġ
		//setLayout(new GridLayout(3, 2 , 5 , 5)); //���� 5(�¿찣��),5(���Ʒ�����)
		setLayout(null); //����� ����
		la1.setBounds(10, 15, 40, 30);
		tf1.setBounds(55, 15, 150, 30);
		la2.setBounds(10, 50, 40, 30);
		tf2.setBounds(55, 50, 150, 30);
		la3.setBounds(10,85,40,30);
		man.setBounds(55,85,70,30);
		man.setOpaque(false);
		woman.setBounds(130,85,70,30);
		woman.setOpaque(false);
		
		// �߰�
		add(la1); add(tf1);
		add(la2); add(tf2);
		add(la3); add(man); add(woman);
		add(p);
	}
	@Override
	//paint, paintComponent => �ڵ�ȣ��
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
	
}
