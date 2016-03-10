package com.sist.dao;
import java.sql.*;
import java.util.*;
public class MemberDAO {
	private Connection conn; 
	//오라클 연결시 연결해줌(Socket) => ip,port(oracle - ip:localhost / port:1521)
	private PreparedStatement ps; // 입출력
	// BufferedReader, OutputStream
	private static MemberDAO dao; //싱글턴 패턴
	// 싱글턴 패턴 : 각 클라이언트가 DAO를 하나만 생성 따라서 static으로 생성 (메모리공간 1개)
	private final String URL="jdbc:oracle:thin:@localhost:1521:ORCL"; //오라클 주소라서 상수
	
	// 드라이버 설치
	public MemberDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //new 없이 메모리 할당(리플렉션에 해당)
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	// 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"scott","tiger"); //계정연결
			// SQL Plus => conn scott/tiger
		}catch(Exception ex){}
	}
	// 오라클 연결 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			//exit
		}catch(Exception ex){}
	}
	// 기능 수행
	// 오라클에서 SELECT는 return을 가진다 (데이터를 읽어올때(출력할때))
	// 1. 로그인
	public String isLogin(String id,String pwd)
	{
		String res="";
		return res;
	}
	// 2. 수정(로그인시 1, 아닐땐0)
	public void typeUpdate(String id,int type) //id를 가져와서 type을 바꿈
	{
		
	}
	// 3. 데이터를 읽기 
	public MemberDTO memberInfoData(String id)
	{
		MemberDTO d=new MemberDTO();
		return d;
	}
	// 4. 전체 초기화 (접속할때마다 type값을 0으로 가진다)
	public void typeAllUpdate()
	{
		try
		{
			//연결
			getConnection();
			//SQL 문장을 보낸다
			String sql="UPDATE member SET " + "type=0"; // 전체 초기화
			ps=conn.prepareStatement(sql); //오라클에 sql을 보냄
			ps.executeUpdate(); //실행
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally //무조건 수행
		{
			disConnection();
		}
	}
	// 싱글턴
	public static MemberDAO newInstance()
	{
		if(dao==null)
			dao=new MemberDAO();
		return dao; //null값일때 생성하고 아닐땐 dao를 데려와 사용한다 => 객체 한번만 생성
	}
	
	
	
}
















