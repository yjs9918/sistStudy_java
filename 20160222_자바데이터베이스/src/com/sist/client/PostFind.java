package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;
import com.sist.dao.*;

import sun.net.www.content.image.jpeg;

public class PostFind extends JFrame implements ActionListener{
   JLabel la;
   JTextField tf;
   JButton bu;
   JTable table;
   DefaultTableModel model;
   public PostFind()
   {
      la = new JLabel("입력");
      tf = new JTextField(10);
      bu = new JButton("찾기");
      String[] col ={"우편번호","주소"};
      String[][] row = new String[0][2];
      model =new DefaultTableModel(row,col);
      table = new JTable(model);
      JScrollPane js = new JScrollPane(table);
      JPanel p = new JPanel();
      p.add(la);
      p.add(tf);
      p.add(bu);
      add("North",p);
      add("Center",js);
      setSize(450,400);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      bu.addActionListener(this);
      
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   new PostFind();
   }
	@Override
   public void actionPerformed(ActionEvent e) {
	   // TODO Auto-generated method stub
		if(e.getSource()==bu)
		{
			String dong=tf.getText().trim();
			if(dong.length()<1)
			{
				tf.requestFocus();
				return;
			}
			getData(dong);
		}
   }
	public void getData(String dong)
	{
		EmpDAO dao=new EmpDAO();
		ArrayList<ZipcodeDTO> list=dao.postFind(dong);
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		for(ZipcodeDTO d:list)
		{
			String[] data={
				d.getZipcode(),
				d.getSido()+" "+d.getGugun()+" "+d.getDong()+" "+d.getBunji()
				
			};
			model.addRow(data);
		}
	}

}