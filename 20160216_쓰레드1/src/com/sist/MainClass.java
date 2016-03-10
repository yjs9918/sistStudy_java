package com.sist;
/*
 *   Thread의 생명주기
 *   
 *   NEW    ====    Runnable    ====    Running
 *                                      = Blocked
 *                                      = Dead
 *   NEW : new Thread()
 *         1) 이름 부여
 *            Thread - 0
 *            Thread - 1
 *            ..
 *            ..
 *            getName() : 부여된 이름으로 불러옴
 *            setName() : 재 설정
 *         2) 우선순위 부여
 *            1~10
 *            1: MIN_PRIORITY
 *            5: NORM_PRIORITY
 *            10:MAX_PRIORITY
 *            getPriority()
 *            setPriority()
 *   Runnable : 대기상태 (필요한 자원을 확보)
 *     => start()
 *   Running : 쓰레드의 동작
 *     => run() : 쓰레드는 반드시 한가지 일만 수행
 *        =====
 *         = 종료 : interrupt()
 *         = 일시정지 : sleep(),join()
 *         
 *   ***** run() 정의
 *     1) run() 정의
 *     2) 구현 => Runnable
 *   ***** CPU가 시간을 분배해서 => 독점권
 *         
 */
//Thread 생성 : Thread상속
class MyThread extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(100);
				// 1000분의 1초 단위
				
			}
		} catch (Exception ex) {}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		System.out.println("이름:"+t1.getName());
		System.out.println("우선순위:"+t1.getPriority());
		
		MyThread t2=new MyThread();
		System.out.println("이름:"+t2.getName());
		System.out.println("우선순위:"+t2.getPriority());
		
		MyThread t3=new MyThread();
		System.out.println("이름:"+t3.getName());
		System.out.println("우선순위:"+t3.getPriority());
		
		//동작 명령
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		t1.start();// t1,t2,t3이 한번씩 실행되면서 진행한다. (출력: 111,222,333.....)
		t2.start();
		t3.start();
	}

}



















