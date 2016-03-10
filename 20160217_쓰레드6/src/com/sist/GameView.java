package com.sist;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GameView extends JPanel{
	Image horse;
	int x,y;
	GameMain gm;
	static int grade; //����� 5���� ���� ���� �ϳ��� �����ϱ� ���� static �̿�
	HorseThread ht;
	public GameView(GameMain gm)
	{
		this.gm=gm;
		horse=Toolkit.getDefaultToolkit().getImage("c:\\image\\horse.gif");
	}
	public void threadName(String name)
	{
		ht=new HorseThread();
		ht.setName(name); //�̸� �ο� (�̸��� ã�ư��� ���� �ο���)
		ht.start();
	}
	// => update() {clearRect(),paint()}
	// repaint() => update
	// g => �׸��� �׸��� ����
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(horse, x, y, this);
	}
	class HorseThread extends Thread
	{
		public void run()
		{
			try {
				for(int i=0;i<=1000;i++)
				{
					if(Thread.currentThread().getName().equals("���︻"))//������ ������ Ȯ��
					{
						x+=10;
						gm.bar[0].setValue(x);
						if(x>1000) //�������
						{
							x=1300; //���� ������� ����
							grade++;
							String res="�ڡڡڼ��︻�ڡڡڢ�"+grade+"��\n";
							gm.ta.append(res);
							interrupt();//������ ����
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400���� ���� �߻� (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("��õ��"))//������ ������ Ȯ��
					{
						x+=10;
						gm.bar[1].setValue(x);
						if(x>1000) //�������
						{
							x=1300; //���� ������� ����
							grade++;
							String res="�ڡڡ���õ���ڡڡڢ�"+grade+"��\n";
							gm.ta.append(res);
							interrupt();//������ ����
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400���� ���� �߻� (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("������"))//������ ������ Ȯ��
					{
						x+=10;
						gm.bar[2].setValue(x);
						if(x>1000) //�������
						{
							x=1300; //���� ������� ����
							grade++;
							String res="�ڡڡڰ������ڡڡڢ�"+grade+"��\n";
							gm.ta.append(res);
							interrupt();//������ ����
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400���� ���� �߻� (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("�λ긻"))//������ ������ Ȯ��
					{
						x+=10;
						gm.bar[3].setValue(x);
						if(x>1000) //�������
						{
							x=1300; //���� ������� ����
							grade++;
							String res="�ڡڡںλ긻�ڡڡڢ�"+grade+"��\n";
							gm.ta.append(res);
							interrupt();//������ ����
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400���� ���� �߻� (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("���ָ�"))//������ ������ Ȯ��
					{
						x+=10;
						gm.bar[4].setValue(x);
						if(x>1000) //�������
						{
							x=1300; //���� ������� ����
							grade++;
							String res="�ڡڡ����ָ��ڡڡڢ�"+grade+"��\n";
							gm.ta.append(res);
							interrupt();//������ ����
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400���� ���� �߻� (100:default)
						Thread.sleep(s);
					}
				}
			} catch (Exception ex) {}
		}
	}

}


























