package com.sist.dao;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO dao=MemberDAO.newInstance();
		dao.typeAllUpdate();
		System.out.println("DB수정 완료");
	}

}
