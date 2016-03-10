package com.sist;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass2 extends JFrame implements ItemListener{
	JLabel la;
	JComboBox box;
	JPanel pan;
	
	public MainClass2()
	{
		la=new JLabel("�ƹ�Ÿ ����"); //�ѱ��ڴ� 20px������
		box=new JComboBox();
		box.addItem("1��");
		box.addItem("2��");
		box.addItem("3��");
		box.addItem("4��");
		box.addItem("5��");
		pan=new JPanel();
		pan.setBackground(Color.BLACK);
		setLayout(null);
		la.setBounds(10,15,100,30);
		box.setBounds(115,15,100,30);
		pan.setBounds(10,50,205,200);
		pan.setLayout(new BorderLayout());
		pan.add("Center",new JLabel(new ImageIcon(setImage("c:\\image\\m1.gif",pan.getWidth(),pan.getHeight()))));
		add(la);
		add(box);
		add(pan);
		setSize(240,295);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		box.addItemListener(this);
		
	}
	public Image setImage(String filename,int width,int height) //��ư�� �°� �̹��� ũ�� ����
	{
		ImageIcon ii=new ImageIcon(filename);
		Image image=ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return image;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			int selNum=box.getSelectedIndex();
			pan.removeAll(); //�г� �׸� ����
			pan.setLayout(new BorderLayout());
			pan.add("Center",new JLabel(new ImageIcon(setImage("c:\\image\\m"+(selNum+1)+".gif",pan.getWidth(),pan.getHeight()))));
			pan.validate(); //�г� �׸� ���ġ
		}
	}

}


















