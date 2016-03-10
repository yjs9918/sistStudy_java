package com.sist;
// Date: 시스템의 시간을 읽어 온다 => 등록일 (게시판, 회원가입)
import java.util.*;
import java.text.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		
		// java.text.SimpleDateFormat sdf
		//                    =new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// import java.text 사용하지 않으면 이렇게 써야함
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 날짜 형식 재정의
		/*
		 *  yyyy => 년도 yy,yyy
		 *  MM ==> 월 => 02 => M (08,09)8진법표현때문에 에러남 : 01 ~ 07 
		 *      M
		 *  dd ==> 일
		 *      d
		 *  hh ==> 시간
		 *  mm ==> 분
		 *  ss ==> 초
		 */
		System.out.println(sdf.format(date));
	}

}
