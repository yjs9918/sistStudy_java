package com.sist.client;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.sist.board.BoardDAO;
import com.sist.board.BoardDTO;

import java.io.*;
import java.text.*;
/*
 *   Adapter => interface�� �̸� ������ Ŭ����
 *     => �̺�Ʈ ó�� �޼ҵ尡 �ΰ��̻��϶� ����
 *     
 */

public class BoardMain extends JFrame implements ActionListener,MouseListener{
	CardLayout card=new CardLayout();
	BoardList bList=new BoardList();
	BoardDAO dao=new BoardDAO();
	BoardIU iu=new BoardIU();
	BoardContent bCont=new BoardContent(); 
	
	/*{
		BoardDTO d=new BoardDTO();
		d.setName("ȫ�浿");
		d.setSubject("�Խ��� �ۿø���");
		d.setContent("�Խ��� �ۿø���");
		d.setPwd("1234");
		BoardDAO.getList().add(d);
	}*/
	int curpage=1; //���� ���� �ִ� ������
	int totalpage=0; //��������
	
	public BoardMain()
	{
		setLayout(card);
		add("LIST",bList);
		add("IU",iu);
		add("CONT",bCont);
		setSize(800,600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try 
				{
					File file=new File("c:\\image\\board.txt");
					if(!file.exists())
					{
						file.createNewFile();
					}
					ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(BoardDAO.getList());
					oos.close();
				} catch (Exception ex) {}
			}
			
		});
		
		bList.b5.addActionListener(this);//���۹�ư
		bList.b3.addActionListener(this);//������ư
		bList.b4.addActionListener(this);//������ư
		iu.b2.addActionListener(this);
		iu.b1.addActionListener(this);
		bCont.b3.addActionListener(this);
		bCont.b1.addActionListener(this);
		bCont.b2.addActionListener(this);
		bList.table.addMouseListener(this);
		getData();
	}
	public void getData()
	{
		for(int i=bList.model.getRowCount()-1;i>=0;i--)
		{
			bList.model.removeRow(i);
		}
		for(BoardDTO d:dao.boardListData(curpage))
		{
			String[] data={
					String.valueOf(d.getNo()),
					d.getSubject(),	d.getName(),
					new SimpleDateFormat("yyyy-MM-dd").format(d.getRegdate()),
					String.valueOf(d.getHit())
			};
			bList.model.addRow(data);
		}
		
		totalpage=dao.boardTotalPage();
		String res=curpage+"page / "+totalpage+" pages";
		bList.la3.setText(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.b5) //����ó��
		{
			iu.tf1.setText("");
			iu.tf2.setText("");
			iu.ta.setText("");
			iu.pf.setText("");
			iu.la1.setText("�۾���");
			iu.b1.setText("�۾���");
			
			card.show(getContentPane(), "IU");
			iu.tf1.requestFocus(); //Ŀ�� ������
		}
		else if(e.getSource()==iu.b2)
		{
			card.show(getContentPane(), "LIST");
		}
		else if(e.getSource()==iu.b1)
		{
			String type=iu.b1.getText();
			String name=iu.tf1.getText().trim();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���");
				//alert() ������ ���� ���
				iu.tf1.requestFocus();
				//tf.focus() ������ ���� ���
				return;
			}
			
			String subject=iu.tf2.getText().trim();
			if(subject.length()<1)
			{
				JOptionPane.showMessageDialog(this, "������ �Է��ϼ���");
				//alert() ������ ���� ���
				iu.tf2.requestFocus();
				//tf.focus() ������ ���� ���
				return;
			}
			
			String content=iu.ta.getText().trim();
			if(content.length()<1)
			{
				JOptionPane.showMessageDialog(this, "������ �Է��ϼ���");
				//alert() ������ ���� ���
				iu.ta.requestFocus();
				//tf.focus() ������ ���� ���
				return;
			}
			
			String pwd=String.valueOf(iu.pf.getPassword()).trim();
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this, "��й�ȣ�� �Է��ϼ���");
				//alert() ������ ���� ���
				iu.pf.requestFocus();
				//tf.focus() ������ ���� ���
				return;
			}
			
			BoardDTO d=new BoardDTO();
			d.setName(name);
			d.setSubject(subject);
			d.setContent(content);
			d.setPwd(pwd);
			
			if(type.equals("�۾���"))
			{
				dao.BoardInsert(d);
				card.show(getContentPane(), "LIST");
				//response.sendRedirect("list.jsp") ������ ���� ���
				getData();
			}
			else //�����ϱ�
			{
				d.setNo(Integer.parseInt(bCont.tf1.getText()));
				boolean bCheck=dao.boardUpdate(d);
				if(bCheck==true)
				{
					JOptionPane.showMessageDialog(this, "�����Ǿ����ϴ�");
					card.show(getContentPane(),"LIST");
					getData();
				}
				else
				{
					JOptionPane.showMessageDialog(this, "��й�ȣ�� Ʋ���ϴ�");
					iu.pf.setText("");
					iu.pf.requestFocus();
				}
			}
		}
		else if(e.getSource()==bList.b3)//����
		{
			if(curpage>1)
			{
				curpage--;
				getData();
			}
		}
		else if(e.getSource()==bList.b4)//����
		{
			if(curpage<totalpage)
			{
				curpage++;
				getData();
			}
		}
		else if(e.getSource()==bCont.b3)
		{
			card.show(getContentPane(), "LIST");
			getData();
		}
		else if(e.getSource()==bCont.b1)
		{
			iu.b1.setText("�����ϱ�");
			iu.la1.setText("�����ϱ�");
			iu.tf1.setText(bCont.tf3.getText());
			iu.tf2.setText(bCont.tf5.getText());
			iu.ta.setText(bCont.ta.getText());
			iu.pf.setText("");
			card.show(getContentPane(), "IU");
			
		}
		else if(e.getSource()==bCont.b2)
		{
			String pwd=JOptionPane.showInputDialog("��й�ȣ �Է�:");
			int no=Integer.parseInt(bCont.tf1.getText());
			boolean bCheck=dao.boardDelete(no, pwd);
			if(bCheck==true)
			{
				JOptionPane.showMessageDialog(this, "�����Ǿ����ϴ�");
				card.show(getContentPane(), "LIST");
				getData();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "��й�ȣ�� Ʋ���ϴ�");
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.table)
		{
			if(e.getClickCount()==2) //����Ŭ���̺�Ʈ
			{
				int row=bList.table.getSelectedRow();
				String no=bList.model.getValueAt(row, 0).toString();
				BoardDTO d=dao.boardContent(Integer.parseInt(no));
				bCont.tf1.setText(String.valueOf(d.getNo()));
				bCont.tf2.setText(new SimpleDateFormat("yyyy-MM-dd").format(d.getRegdate()));
				bCont.tf3.setText(d.getName());
				bCont.tf4.setText(String.valueOf(d.getHit()));
				bCont.tf5.setText(d.getSubject());
				bCont.ta.setText(d.getContent());
				card.show(getContentPane(), "CONT");
				
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
