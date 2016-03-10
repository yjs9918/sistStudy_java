package com.sist;
class MyThread2 extends Thread
{
	int sum=0;
	int start;
	int end;
	
	public MyThread2(int s,int e)
	{
		start=s;
		end=e;
	}
	public void run()
	{
		try
		{
			for(int i=start;i<=end;i++)
			{
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"=>sum:"+sum);
				Thread.sleep(100);
			}
		}catch(Exception ex){}
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t1=new MyThread2(1, 50);
		MyThread2 t2=new MyThread2(51, 100);
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());//현재 쓰레드 확인 : currentThread()
		try
		{
			t1.join();
			t2.join();
		}catch(Exception ex){}
		System.out.println("t1.sum"+t1.sum);
		System.out.println("t2.sum"+t2.sum);
		System.out.println("총합:"+(t1.sum+t2.sum));
		
	}

}
