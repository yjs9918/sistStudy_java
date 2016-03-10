package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
		
	}
}
public class BaseBallGame extends JFrame implements ActionListener{
	
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	int[] com=new int[3];
	int[] user=new int[3];
	int s,b;
	
	public BaseBallGame()
	{
		ta=new JTextArea();
		ta.setEditable(false); //편집 방지
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(10);
		tf.setEnabled(false);
		b1=new JButton("Start");
		b2=new JButton("Exit");
		
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("Center",js);
		add("South",p);
		setSize(450,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BaseBallGame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) //어떤 버튼이 눌렸나
		{
			dispose(); //메모리 회수
			System.exit(0); //프로그램 종료
		}
		else if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "게임이 시작되었습니다");
			getRand();
			tf.setEnabled(true);
			tf.requestFocus(); //커서 깜박임
			b1.setEnabled(false); //start 버튼 비활성화
		}
		else if(e.getSource()==tf)
		{
			game();
		}
	}
	public void game()
	{
		String strNum=tf.getText().trim();
		int num=0;
		try
		{
			num=Integer.parseInt(strNum);
		}catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this, "정수만 입력해야 합니다");
			tf.setText(""); //입력창 지워주기
			tf.requestFocus(); //커서 깜박임
			return; //복구
			
		}
		if(num<100 || num>999)
		{
			try 
			{
				throw new MyException("세자리 정수만 입력하세요");
				//throw 밑에는 코딩할 수 없다(에러출력됨) => 바로 catch절로 이동하므로 아래문장 수행하지 못해서 에러출력 
				//throw ==> catch수행
				//밑에는 문장을 사용할 수 없다
			} catch (MyException ex) 
			{
				JOptionPane.showMessageDialog(this, ex.getMessage());
				tf.setText(""); //입력창 지워주기
				tf.requestFocus(); //커서 깜박임
				return; //복구
			}
		}
		user[0]=num/100;
		user[1]=(num%100)/10;
		user[2]=num%10;
		if(user[0]==user[1]|| user[1]==user[2]|| user[0]==user[2])
		{
			try 
			{
				throw new MyException("중복된 수는 사용할 수 없다");
				//throw 밑에는 코딩할 수 없다(에러출력됨) => 바로 catch절로 이동하므로 아래문장 수행하지 못해서 에러출력 
				//throw ==> catch수행
				//밑에는 문장을 사용할 수 없다
			} catch (MyException ex) 
			{
				JOptionPane.showMessageDialog(this, ex.getMessage());
				tf.setText(""); //입력창 지워주기
				tf.requestFocus(); //커서 깜박임
				return; //복구
			}
		}
		s=0;
		b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		//힌트
		String msg="Input Number:"+num+",Result:"+s+"S-"+b+"B\n";
		ta.append(msg);
		if(s==3)
		{
			int type= JOptionPane.showConfirmDialog(this, "게임을 다시 할까요?","선택",JOptionPane.YES_NO_OPTION);
			if(type==JOptionPane.YES_OPTION)
			{
				ta.setText("");
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true); //초기상태로 돌아감
			}
			else
			{
				dispose();
				System.exit(0);
			}
		}
		tf.setText("");
		tf.requestFocus();
	}
	public void getRand()
	{
		int su=0;
		// 중복여부
		/*
		 *   com[0]=8
		 *   com[1]=7
		 *   
		 *   su=7
		 *    
		 */
		boolean bDash=true;
		for(int i=0;i<3;i++)
		{
			bDash=true;
			//난수
			while(bDash)
			{
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su) //중복된 수가 있으면 while문을 다시 돌려라
					{
						bDash=true;
						break;
					}
				}
			}
			//중복없는 경우 저장
			com[i]=su;
		}
	}

}
