package com.client;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{
    JButton[][] pan=new JButton[5][5];;
    int[][] panCount=new int[5][5];
    public GameView()
    {
    	setLayout(new GridLayout(5,5,5,5));
    	int k=1;
    	for(int i=0;i<5;i++)
    	{
    		for(int j=0;j<5;j++)
    		{
    			pan[i][j]=new JButton(String.valueOf(k));
    			k++;
    			add(pan[i][j]);
    		}
    	}
    }
    public void display(int no)
    {
    	int k=1;
    	for(int i=0;i<5;i++)
    	{
    		for(int j=0;j<5;j++)
    		{
    			if(no==0)
    			{
    				pan[i][j].setText("");
    				pan[i][j].setEnabled(false);
    			}
    			else
    			{
    				pan[i][j].setText(String.valueOf(panCount[i][j]));
    				pan[i][j].setEnabled(true);
    			   
    			}
    		}
    	}
    }
    public void checkBtn(int n)
    {
    	for(int i=0;i<5;i++)
    	{
    		for(int j=0;j<5;j++)
    		{
    			if(n==panCount[i][j])
    			{
    				pan[i][j].setBackground(Color.pink);
    				break;
    			}
    		}
    	}
    }
    public void getRand()
    {
    	int[] com=new int[25];
    	int su=0;// �߻��� ���� ���� 
		// �ߺ�üũ
		boolean bDash=false;
		// true: �ߺ� , false: �ߺ��� ����
		/*
		 *   true => ������ �ٽ� �߻�
		 *   false => com�迭�� ���� 
		 */
		for(int i=0;i<25;i++)
		{
			bDash=true;
			while(bDash)// �ߺ��� ���� ���¿��� ����
			{
				// ���� �߻�
				su=(int)(Math.random()*25)+1;
				bDash=false;
				// �ߺ�üũ
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break;// while���� �̵� 
					}
				}
			}
			com[i]=su;
			panCount[i/5][i%5]=su;
		}
    }
}






