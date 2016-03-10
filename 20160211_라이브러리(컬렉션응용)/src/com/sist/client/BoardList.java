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
		la1=new JLabel("게시판");
		la1.setFont(new Font("맑은 고딕",Font.BOLD,30));
		JPanel p1=new JPanel();
		p1.add(la1); //가운데 정렬시켜주기 위해 패널 위에 올림
		la2=new JLabel("Search");
		la3=new JLabel("0 page / 0pages");
		b1=new JButton("찾기");
		b2=new JButton("목록");
		b3=new JButton("이전");
		b4=new JButton("다음");
		b5=new JButton("새글");
		box=new JComboBox();
		box.addItem("이름");
		box.addItem("제목");
		box.addItem("내용");
		tf=new JTextField(10);
		
		String[] cols={"번호","제목","이름","작성일","조회수"};
		String[][] rows=new String[0][5];
		model=new DefaultTableModel(rows, cols)
		{
			public boolean isCellEditable(int r,int c)
			{
				return false;
			}
		};
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);//열 이동 금지
		table.getTableHeader().setResizingAllowed(false);//열 리사이징 금지 => 크기 고정
		table.setRowHeight(27); //default 20
		table.setShowVerticalLines(false);//열의 세로선 삭제 /가로선 세로선 동시에 지울땐 setShowGrid
		table.getTableHeader().setBackground(new Color(201,176,251));
		JScrollPane js= new JScrollPane(table);
		js.getViewport().setBackground(Color.white);//JScrollPane의 보이는 곳을 흰색으로..
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
		
		//배치
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















