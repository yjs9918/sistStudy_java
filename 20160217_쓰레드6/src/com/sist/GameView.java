package com.sist;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GameView extends JPanel{
	Image horse;
	int x,y;
	GameMain gm;
	static int grade; //등수를 5개의 말이 변수 하나로 공유하기 위해 static 이용
	HorseThread ht;
	public GameView(GameMain gm)
	{
		this.gm=gm;
		horse=Toolkit.getDefaultToolkit().getImage("c:\\image\\horse.gif");
	}
	public void threadName(String name)
	{
		ht=new HorseThread();
		ht.setName(name); //이름 부여 (이름을 찾아가기 위해 부여함)
		ht.start();
	}
	// => update() {clearRect(),paint()}
	// repaint() => update
	// g => 그림을 그리는 도구
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
					if(Thread.currentThread().getName().equals("서울말"))//지정된 쓰레드 확인
					{
						x+=10;
						gm.bar[0].setValue(x);
						if(x>1000) //종료시점
						{
							x=1300; //말을 사라지게 만듦
							grade++;
							String res="★★★서울말★★★☞"+grade+"등\n";
							gm.ta.append(res);
							interrupt();//쓰레드 종료
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400까지 난수 발생 (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("인천말"))//지정된 쓰레드 확인
					{
						x+=10;
						gm.bar[1].setValue(x);
						if(x>1000) //종료시점
						{
							x=1300; //말을 사라지게 만듦
							grade++;
							String res="★★★인천말★★★☞"+grade+"등\n";
							gm.ta.append(res);
							interrupt();//쓰레드 종료
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400까지 난수 발생 (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("강원말"))//지정된 쓰레드 확인
					{
						x+=10;
						gm.bar[2].setValue(x);
						if(x>1000) //종료시점
						{
							x=1300; //말을 사라지게 만듦
							grade++;
							String res="★★★강원말★★★☞"+grade+"등\n";
							gm.ta.append(res);
							interrupt();//쓰레드 종료
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400까지 난수 발생 (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("부산말"))//지정된 쓰레드 확인
					{
						x+=10;
						gm.bar[3].setValue(x);
						if(x>1000) //종료시점
						{
							x=1300; //말을 사라지게 만듦
							grade++;
							String res="★★★부산말★★★☞"+grade+"등\n";
							gm.ta.append(res);
							interrupt();//쓰레드 종료
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400까지 난수 발생 (100:default)
						Thread.sleep(s);
					}
					if(Thread.currentThread().getName().equals("제주말"))//지정된 쓰레드 확인
					{
						x+=10;
						gm.bar[4].setValue(x);
						if(x>1000) //종료시점
						{
							x=1300; //말을 사라지게 만듦
							grade++;
							String res="★★★제주말★★★☞"+grade+"등\n";
							gm.ta.append(res);
							interrupt();//쓰레드 종료
						}
						Random rnd=new Random();
						int s=rnd.nextInt(301)+100; //0~400까지 난수 발생 (100:default)
						Thread.sleep(s);
					}
				}
			} catch (Exception ex) {}
		}
	}

}


























