package com.sist;

public class MainClass {
	int count;
	public synchronized void increment(String name)
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(name+":"+count++);
				Thread.sleep(100);
			}
		} catch (Exception ex) {}
	}
	public void start()
	{
		new ThreadA().start();
		new ThreadB().start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass().start();
	}
	class ThreadA extends Thread
	{
		public void run()
		{
			increment("ThreadA");
		}
	}
	class ThreadB extends Thread
	{
		public void run()
		{
			increment("ThreadB");
		}
	}

}
