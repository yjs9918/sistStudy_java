package com.sist;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance(); //메소드를 통해 메모리 접근 : 추상클래스 or 인터페이스
		//싱글턴 패턴
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH); // 0~11
		int day=cal.get(Calendar.DATE); 
		int week=cal.get(Calendar.DAY_OF_WEEK); //1~7	
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.println("년도:"+year);
		System.out.println("월:"+(month+1));
		System.out.println("일:"+day);
		System.out.println("요일:"+strWeek[week-1]);
	}

}
