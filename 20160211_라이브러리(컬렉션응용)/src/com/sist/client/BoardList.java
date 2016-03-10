package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class BoardList extends JPanel{
	JLabel la1,la2,la3;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2,b3,b4,b5;
	JComboBox box;
	JTextField tf;
	TableColumn column;
	public BoardList()
	{
		la1=new JLabel("�Խ���");
		la1.setFont(new Font("���� ���",Font.BOLD,30));
		JPanel p1=new JPanel();
		p1.add(la1); //��� ���Ľ����ֱ� ���� �г� ���� �ø�
		la2=new JLabel("Search");
		la3=new JLabel("0 page / 0pages");
		b1=new JButton("ã��");
		b2=new JButton("���");
		b3=new JButton("����");
		b4=new JButton("����");
		b5=new JButton("����");
		box=new JComboBox();
		box.addItem("�̸�");
		box.addItem("����");
		box.addItem("����");
		tf=new JTextField(10);
		
		String[] cols={"��ȣ","����","�̸�","�ۼ���","��ȸ��"};
		String[][] rows=new String[0][5];
		model=new DefaultTableModel(rows, cols)
		{
			public boolean isCellEditable(int r,int c)
			{
				return false;
			}
		};
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);//�� �̵� ����
		table.getTableHeader().setResizingAllowed(false);//�� ������¡ ���� => ũ�� ����
		table.setRowHeight(27); //default 20
		table.setShowVerticalLines(false);//���� ���μ� ���� /���μ� ���μ� ���ÿ� ���ﶩ setShowGrid
		table.getTableHeader().setBackground(new Color(201,176,251));
		JScrollPane js= new JScrollPane(table);
		js.getViewport().setBackground(Color.white);//JScrollPane�� ���̴� ���� �������..
		JPanel p2=new JPanel();
		p2.add(la2);
		p2.add(box);
		
		p2.add(tf);
		p2.add(b1);
		p2.add(b2);
		JPanel p3=new JPanel();
		p3.add(b3);
		p3.add(b4);
		p3.add(la3);
		
		//��ġ
		setLayout(null);
		p1.setBounds(10,15,770,40);
		b5.setBounds(10,70,100,30);
		js.setBounds(10,105,760,400);
		p2.setBounds(10,510,400,35);
		p3.setBounds(460,510,300,35);
		
		add(p1);
		add(b5);
		add(js);
		add(p2);
		add(p3);
		 for(int i=0; i<cols.length; i++)
	      {
			 
			 DefaultTableCellRenderer rnd=new DefaultTableCellRenderer();
	         column=table.getColumnModel().getColumn(i);
	         if(i==0)
	         {
	            column.setPreferredWidth(50);
	            rnd.setHorizontalAlignment(JLabel.CENTER);
	         }
	         else if(i==1)
	         {
	            column.setPreferredWidth(450);
	         }
	         else if(i==2)
	         {
	            column.setPreferredWidth(70);
	            rnd.setHorizontalAlignment(JLabel.CENTER);
	         }
	         else if(i==3)
	         {
	            column.setPreferredWidth(80);
	            rnd.setHorizontalAlignment(JLabel.CENTER);
	         }
	         else if(i==4)
	         {
	            column.setPreferredWidth(60);
	            rnd.setHorizontalAlignment(JLabel.RIGHT);
	         }
	         column.setCellRenderer(rnd);
	         
	      }
	   }

	}















