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
		initItem=new JMenuItem("�غ�");
		startItem=new JMenuItem("����");
		exitItem=new JMenuItem("����");
		menu.add(initItem);
		menu.add(startItem);
		menu.addSeparator(); //���м�
		menu.add(exitItem);
		mb.add(menu);
		
		//������ �޴���ġ
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
			bar[i].setForeground(color[i]); //���α׷��� �ٰ� ����Ǵ� �� ����
			bar[i].setStringPainted(true);// ������� bar ����
			//bar[i].setValue(100); �÷� Ȯ��
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
			GameView.grade=0; //��� �ʱ�ȭ
			for(int i=0;i<5;i++)
			{
				gv[i].x=0; //x�� �ʱ�ȭ
				bar[i].setValue(0);//bar�� �ʱ�ȭ
			}
		}
		else if(e.getSource()==startItem)
		{
			String[] name={"���︻","��õ��","������","�λ긻","���ָ�"};
			for(int i=0;i<5;i++)
			{
				gv[i].threadName(name[i]);
			}
		}
	}

}









