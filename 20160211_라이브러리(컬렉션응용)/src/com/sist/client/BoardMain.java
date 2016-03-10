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
 *   Adapter => interface를 미리 구현한 클래스
 *     => 이벤트 처리 메소드가 두개이상일때 지원
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
		d.setName("홍길동");
		d.setSubject("게시판 글올리기");
		d.setContent("게시판 글올리기");
		d.setPwd("1234");
		BoardDAO.getList().add(d);
	}*/
	int curpage=1; //현재 보고 있는 페이지
	int totalpage=0; //총페이지
	
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
		
		bList.b5.addActionListener(this);//새글버튼
		bList.b3.addActionListener(this);//이전버튼
		bList.b4.addActionListener(this);//다음버튼
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
		if(e.getSource()==bList.b5) //새글처리
		{
			iu.tf1.setText("");
			iu.tf2.setText("");
			iu.ta.setText("");
			iu.pf.setText("");
			iu.la1.setText("글쓰기");
			iu.b1.setText("글쓰기");
			
			card.show(getContentPane(), "IU");
			iu.tf1.requestFocus(); //커서 깜박임
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
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				//alert() 웹에서 쓰는 방식
				iu.tf1.requestFocus();
				//tf.focus() 웹에서 쓰는 방식
				return;
			}
			
			String subject=iu.tf2.getText().trim();
			if(subject.length()<1)
			{
				JOptionPane.showMessageDialog(this, "제목을 입력하세요");
				//alert() 웹에서 쓰는 방식
				iu.tf2.requestFocus();
				//tf.focus() 웹에서 쓰는 방식
				return;
			}
			
			String content=iu.ta.getText().trim();
			if(content.length()<1)
			{
				JOptionPane.showMessageDialog(this, "내용을 입력하세요");
				//alert() 웹에서 쓰는 방식
				iu.ta.requestFocus();
				//tf.focus() 웹에서 쓰는 방식
				return;
			}
			
			String pwd=String.valueOf(iu.pf.getPassword()).trim();
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				//alert() 웹에서 쓰는 방식
				iu.pf.requestFocus();
				//tf.focus() 웹에서 쓰는 방식
				return;
			}
			
			BoardDTO d=new BoardDTO();
			d.setName(name);
			d.setSubject(subject);
			d.setContent(content);
			d.setPwd(pwd);
			
			if(type.equals("글쓰기"))
			{
				dao.BoardInsert(d);
				card.show(getContentPane(), "LIST");
				//response.sendRedirect("list.jsp") 웹에서 쓰는 방식
				getData();
			}
			else //수정하기
			{
				d.setNo(Integer.parseInt(bCont.tf1.getText()));
				boolean bCheck=dao.boardUpdate(d);
				if(bCheck==true)
				{
					JOptionPane.showMessageDialog(this, "수정되었습니다");
					card.show(getContentPane(),"LIST");
					getData();
				}
				else
				{
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
					iu.pf.setText("");
					iu.pf.requestFocus();
				}
			}
		}
		else if(e.getSource()==bList.b3)//이전
		{
			if(curpage>1)
			{
				curpage--;
				getData();
			}
		}
		else if(e.getSource()==bList.b4)//다음
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
			iu.b1.setText("수정하기");
			iu.la1.setText("수정하기");
			iu.tf1.setText(bCont.tf3.getText());
			iu.tf2.setText(bCont.tf5.getText());
			iu.ta.setText(bCont.ta.getText());
			iu.pf.setText("");
			card.show(getContentPane(), "IU");
			
		}
		else if(e.getSource()==bCont.b2)
		{
			String pwd=JOptionPane.showInputDialog("비밀번호 입력:");
			int no=Integer.parseInt(bCont.tf1.getText());
			boolean bCheck=dao.boardDelete(no, pwd);
			if(bCheck==true)
			{
				JOptionPane.showMessageDialog(this, "삭제되었습니다");
				card.show(getContentPane(), "LIST");
				getData();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.table)
		{
			if(e.getClickCount()==2) //더블클릭이벤트
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
