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
		la=new JLabel("아바타 선택"); //한글자당 20px정도임
		box=new JComboBox();
		box.addItem("1번");
		box.addItem("2번");
		box.addItem("3번");
		box.addItem("4번");
		box.addItem("5번");
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
	public Image setImage(String filename,int width,int height) //버튼에 맞게 이미지 크기 맞춤
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
			pan.removeAll(); //패널 그림 지움
			pan.setLayout(new BorderLayout());
			pan.add("Center",new JLabel(new ImageIcon(setImage("c:\\image\\m"+(selNum+1)+".gif",pan.getWidth(),pan.getHeight()))));
			pan.validate(); //패널 그림 재배치
		}
	}

}


















