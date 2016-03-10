package com.sist;

import java.awt.Image;
import javax.swing.*;
import javax.swing.table.*;

public class MainClass3 extends JFrame{
	JTable table;
	DefaultTableModel model;
	
	public MainClass3()
	{
		String[] col={"��ȣ","�̸�","����"};
		Object[][] row=new Object[0][3]; //Object : �̹���, ����, ���� �� ����
		model=new DefaultTableModel(row, col) //�͸��� Ŭ����
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
			return false;
			}
			
			@Override
			public Class getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0,columnIndex).getClass(); //���̺� �ȿ� �̹��� �ֱ�
			}
			
		};
		table=new JTable(model);
		table.setRowHeight(30); //ĭ ���� ����(�⺻ 20)
		JScrollPane js=new JScrollPane(table);
		add("Center",js);
		setSize(450,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Object[] obj={1,"ȫ�浿",new ImageIcon(setImage("c:\\image\\m1.gif",30,30))};
		model.addRow(obj);//������ ���� �߰�
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass3();
	}
	
	public Image setImage(String filename,int width,int height) //��ư�� �°� �̹��� ũ�� ����
	{
		ImageIcon ii=new ImageIcon(filename);
		Image image=ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return image;
	}
}
