package com.sist;
// 인터페이스 (Button)
import java.awt.*;
import java.awt.event.*; //interface
import javax.swing.*;
public class PuzzleGame extends JFrame implements ActionListener{
	JButton[][] bu=new JButton[3][3];
	JButton start, end;
	int[][] panCount=new int[3][3]; //2차원배열 : 1차원배열이 모여서 만들어짐 ex:퍼즐판
	int brow;
	int bcol;
	public PuzzleGame()
	{
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(3, 3, 5, 5));
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bu[i][j]=new JButton(String.valueOf(k));
				// 정수(데이터형) => 문자열(String.valueOf());
				k++;
				p1.add(bu[i][j]);
				bu[i][j].setEnabled(false);
				bu[i][j].setFont(new Font("맑은 고딕",Font.BOLD,25));
				bu[i][j].addActionListener(this);
			}
		}
		start=new JButton("시작");
		end=new JButton("종료");
		JPanel p2=new JPanel();
		p2.add(start);
		p2.add(end);
		
		//윈도우
		add("Center",p1);
		add("South",p2);
		setSize(350,370);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		start.addActionListener(this);
	}
	//중복없는 난수
	public void getRand()
	{
		int[] temp=new int[9];
		boolean bDash=false;
		int su=0;
		for(int i=0;i<9;i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*9);
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(su==temp[j])
					{
						bDash=true;
						break;
					}
				}
			}
			temp[i]=su;
			panCount[i/3][i%3]=su; //1차원 배열을 2차원 배열로 바꾸는 방법(하나는 나누고 하나는 나머지값)
			if(su==8)
			{
				brow=i/3;
				bcol=i%3;
			}
		}
		
	}
	//출력
	public void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==brow && j==bcol)
				{
					bu[i][j].setText("");
					bu[i][j].setEnabled(false);
				}
				else
				{
					bu[i][j].setEnabled(true);
					bu[i][j].setText(String.valueOf(panCount[i][j]+1));
				}
			}
		}
	}
	//종료
	public boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuzzleGame pg=new PuzzleGame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start)
		{
			getRand();
			display();
			//start.setEnabled(false);
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e.getSource()==bu[i][j])
				{
					if(!((brow==i && Math.abs(bcol-j)==1)
						||(bcol==j && Math.abs(brow-i)==1)))
						return;
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					display();
					if(isEnd())
					{
						JOptionPane.showMessageDialog(this, "Game Over!!");
					}
				}
			}
		}
	}

}
