package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GameMain extends JFrame implements ActionListener{
	GameView[] gv=new GameView[5];
	JProgressBar[] bar=new JProgressBar[5];
	JTextArea ta;
	JMenuItem initItem,startItem,exitItem;
	public GameMain()
	{
		JMenuBar mb=new JMenuBar();
		JMenu menu=new JMenu("Game");
		initItem=new JMenuItem("준비");
		startItem=new JMenuItem("시작");
		exitItem=new JMenuItem("종료");
		menu.add(initItem);
		menu.add(startItem);
		menu.addSeparator(); //구분선
		menu.add(exitItem);
		mb.add(menu);
		
		//윈도우 메뉴배치
		setJMenuBar(mb);
		
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		Color[] color={Color.yellow,Color.pink,Color.magenta,Color.cyan,Color.green};
		setLayout(null);
		
		for(int i=0;i<5;i++)
		{
			gv[i]=new GameView(this);
			bar[i]=new JProgressBar(0,1000);
			bar[i].setBackground(Color.white);
			bar[i].setForeground(color[i]); //프로그레스 바가 진행되는 색 변경
			bar[i].setStringPainted(true);// 여기까지 bar 생성
			//bar[i].setValue(100); 컬러 확인
			gv[i].setBounds(10,125+(i*100),1000,60);
			bar[i].setBounds(10,185+(i*100),1000,30);
			add(gv[i]);
			add(bar[i]);
		}
		js.setBounds(10,15,1000,100);
		add(js);
		
		setSize(1030,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initItem.addActionListener(this);
		startItem.addActionListener(this);
		exitItem.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exitItem)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==initItem)
		{
			ta.setText("");
			GameView.grade=0; //등수 초기화
			for(int i=0;i<5;i++)
			{
				gv[i].x=0; //x값 초기화
				bar[i].setValue(0);//bar값 초기화
			}
		}
		else if(e.getSource()==startItem)
		{
			String[] name={"서울말","인천말","강원말","부산말","제주말"};
			for(int i=0;i<5;i++)
			{
				gv[i].threadName(name[i]);
			}
		}
	}

}









