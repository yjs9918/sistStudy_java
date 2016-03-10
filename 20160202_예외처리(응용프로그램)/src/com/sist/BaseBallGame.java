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
		ta.setEditable(false); //���� ����
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
		if(e.getSource()==b2) //� ��ư�� ���ȳ�
		{
			dispose(); //�޸� ȸ��
			System.exit(0); //���α׷� ����
		}
		else if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "������ ���۵Ǿ����ϴ�");
			getRand();
			tf.setEnabled(true);
			tf.requestFocus(); //Ŀ�� ������
			b1.setEnabled(false); //start ��ư ��Ȱ��ȭ
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
			JOptionPane.showMessageDialog(this, "������ �Է��ؾ� �մϴ�");
			tf.setText(""); //�Է�â �����ֱ�
			tf.requestFocus(); //Ŀ�� ������
			return; //����
			
		}
		if(num<100 || num>999)
		{
			try 
			{
				throw new MyException("���ڸ� ������ �Է��ϼ���");
				//throw �ؿ��� �ڵ��� �� ����(������µ�) => �ٷ� catch���� �̵��ϹǷ� �Ʒ����� �������� ���ؼ� ������� 
				//throw ==> catch����
				//�ؿ��� ������ ����� �� ����
			} catch (MyException ex) 
			{
				JOptionPane.showMessageDialog(this, ex.getMessage());
				tf.setText(""); //�Է�â �����ֱ�
				tf.requestFocus(); //Ŀ�� ������
				return; //����
			}
		}
		user[0]=num/100;
		user[1]=(num%100)/10;
		user[2]=num%10;
		if(user[0]==user[1]|| user[1]==user[2]|| user[0]==user[2])
		{
			try 
			{
				throw new MyException("�ߺ��� ���� ����� �� ����");
				//throw �ؿ��� �ڵ��� �� ����(������µ�) => �ٷ� catch���� �̵��ϹǷ� �Ʒ����� �������� ���ؼ� ������� 
				//throw ==> catch����
				//�ؿ��� ������ ����� �� ����
			} catch (MyException ex) 
			{
				JOptionPane.showMessageDialog(this, ex.getMessage());
				tf.setText(""); //�Է�â �����ֱ�
				tf.requestFocus(); //Ŀ�� ������
				return; //����
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
		//��Ʈ
		String msg="Input Number:"+num+",Result:"+s+"S-"+b+"B\n";
		ta.append(msg);
		if(s==3)
		{
			int type= JOptionPane.showConfirmDialog(this, "������ �ٽ� �ұ��?","����",JOptionPane.YES_NO_OPTION);
			if(type==JOptionPane.YES_OPTION)
			{
				ta.setText("");
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true); //�ʱ���·� ���ư�
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
		// �ߺ�����
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
			//����
			while(bDash)
			{
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su) //�ߺ��� ���� ������ while���� �ٽ� ������
					{
						bDash=true;
						break;
					}
				}
			}
			//�ߺ����� ��� ����
			com[i]=su;
		}
	}

}
