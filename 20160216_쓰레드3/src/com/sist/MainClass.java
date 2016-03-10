package com.sist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 *   class A
 *   class B    A.class
 *              B.class
 *   class A
 *   {
 *      class B
 *   }
 *   
 *   A.class
 *   A$B.class
 *   
 */
public class MainClass {
    public synchronized void print(String url)
    {
    	try
    	{
    		Document doc=Jsoup.connect(url).get();
    		System.out.println(doc);
    	}catch(Exception ex){}
    }
    public void start()
    {
    	new ThreadA().start();
    	new ThreadB().start();
    	new ThreadC().start();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass().start();
	}
    class ThreadA extends Thread
    {
    	public void run()
    	{
    		print("http://www.daum.net");
    	}
    }
    class ThreadB extends Thread
    {
    	public void run()
    	{
    		print("http://www.naver.com");
    	}
    }
    class ThreadC extends Thread
    {
    	public void run()
    	{
    		print("http://www.nate.com");
    	}
    }
}
