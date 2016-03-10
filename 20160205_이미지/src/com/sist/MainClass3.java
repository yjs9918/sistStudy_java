package com.sist;

import java.awt.Image;
import javax.swing.*;
import javax.swing.table.*;

public class MainClass3 extends JFrame{
	JTable table;
	DefaultTableModel model;
	
	public MainClass3()
	{
		String[] col={"번호","이름","성별"};
		Object[][] row=new Object[0][3]; //Object : 이미지, 문자, 숫자 다 가능
		model=new DefaultTableModel(row, col) //익명의 클래스
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
			return false;
			}
			
			@Override
			public Class getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0,columnIndex).getClass(); //테이블 안에 이미지 넣기
			}
			
		};
		table=new JTable(model);
		table.setRowHeight(30); //칸 간격 넓힘(기본 20)
		JScrollPane js=new JScrollPane(table);
		add("Center",js);
		setSize(450,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Object[] obj={1,"홍길동",new ImageIcon(setImage("c:\\image\\m1.gif",30,30))};
		model.addRow(obj);//데이터 한줄 추가
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass3();
	}
	
	public Image setImage(String filename,int width,int height) //버튼에 맞게 이미지 크기 맞춤
	{
		ImageIcon ii=new ImageIcon(filename);
		Image image=ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return image;
	}
}
