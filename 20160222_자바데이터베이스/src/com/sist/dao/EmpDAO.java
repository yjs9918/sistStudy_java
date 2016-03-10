package com.sist.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/*
 *    JDBC => java언어를 이용해서 오라클의 데이터 제어하는 프로그램
 *    1) 응용프로그램  <=======> 오라클 연결
 *                 연결 (드라이버를 설치) => thin 드라이버
 *            Class.forName(드라이버명) : 클래스 로딩
 *    2) 오라클 연결
 *            Connection => getConnection(URL,USERNAME,PWD)
 *    3) SQL문장을 오라클로 전송
 *            Statement
 *             = Statement
 *             = PreparedStatement(일반화)
 *             = CallableStatement(프로시저 호출)
 *             String id="aaa";
 *             String sex="man";
 *             int age=30;
 *             String name="hong";
 *             String addr="seoul";
 *             String sql="INSERT INTO member VALUES('"+id+"','"+sex+"',"+age+",'"+name+"','"+addr"')";
 *             String sql="INSERT INTO member VALUES(?,?,?,?,?)";
 *             = ResultSet executeQuery() : SELECT
 *             = int executeUpdate() : INSERT , UPDATE , DELETE
 *             
 *    4) 실행 결과를 읽어서 메모리에 저장
 *             ResultSet
 *             =======================
 *               id     name     sex     => Column
 *             =======================
 *                BOF(Begin Of File)
 *             =======================
 *              aaa     hong     man     : next() => bof부터 eof까지      first()
 *              bbb     shim     woman
 *              ccc     park     man     : previous() => eof부터 bof까지     last()
 *             =======================
 *                EOF(End Of File)
 *             =======================
 *             
 *             Connection => Statement => ResultSet
 *    5) 오라클 닫기
 *             ResultSet => Statement => Connection (여는 순서의 반대로 닫음)
 *             WHERE ename LIKE '%A%' => 오라클에서 사용..(자바에서는 error)
 *             WHERE ename LIKE '%'||'A'||'%' <=자바에서 보낼때
 */
public class EmpDAO {
   // 연결 객체
   private Connection conn;
   // SQL 전송 객체
   private PreparedStatement ps;
   // 오라클 주소 설정
   /*
    *   jdbc:업체명:드라이버명칭:@IP:포트:데이터베이스명
    */
   private final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
   // 1. 드라이버 등록 ==> 한번만 설정하면 된다(생성자)
   public EmpDAO()
   {
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         // 리플렉션 => 클래스의 이름으로 정보를 읽어와서 제어
      }catch(Exception ex)
      {
         System.out.println("EmpDAO():"+ex.getMessage());
      }
   }
   // 2. 연결 주소 얻기
   public void getConnection()
   {
      try
      {
         conn=DriverManager.getConnection(URL,"scott","tiger");//드라이버랑 연결할 수 있는 객체를 데려옴
         // conn scott/tiger
      }catch(Exception ex)
      {
         System.out.println("getConnection():"+ex.getMessage());
      }
   }
   // 3. 연결 종료
   public void disConnection()
   {
      try
      {
         if(ps!=null) ps.close();
         /*
          *   PreparedStatement ps
          *      => 전송(수신,송신)
          *         OutputStream => SQL
          *         BufferedReader => 실행 결과 읽기
          *   Connection conn
          *      => 연결 객체
          *      Socket
          */
         if(conn!=null) conn.close();
         //exit
      }catch(Exception ex)
      {
         System.out.println(ex.getMessage());
      }
   }
   // 4. 기능 설정
   //   4-1 : 전체 목록 (SELECT * ~~)
   public ArrayList<EmpDTO> empAllData()
   {
      ArrayList<EmpDTO> list=new ArrayList<EmpDTO>();
      try
      {
         // 연결
         getConnection();
         // SQL 문장 제작
         String sql="SELECT empno,ename,job,hiredate,deptno FROM emp";
         // SQL을 오라클 전송
         ps=conn.prepareStatement(sql);
         
         // 결과값 받기
         ResultSet rs=ps.executeQuery(); //데이터는 rs가 다 가지고 있다.
         while(rs.next()) //맨 첫줄부터 마지막까지 읽음(커서의 위치를 맨 위로 올릴때 사용)
         {
            EmpDTO d=new EmpDTO();
            d.setEmpno(rs.getInt(1)); //오라클은 모든 순서가 1번부터 시작
            d.setEname(rs.getString(2));
            d.setJob(rs.getString(3));
            d.setHiredate(rs.getDate(4));
            d.setDeptno(rs.getInt(5));
            list.add(d);
         }
         rs.close();
      }catch(Exception ex)
      {
         System.out.println("empAllData():"+ex.getMessage());
      }
      finally
      {
         disConnection();
      }
      return list;
   }
   //   4-2 : 상세 보기 (WHERE ~~)
   public EmpDTO empDetailData(int empno)
   {
      EmpDTO d=new EmpDTO();
      try
      {
         getConnection();
         String sql="SELECT * FROM emp WHERE empno=?";
         ps=conn.prepareStatement(sql);
         ps.setInt(1, empno); // 앞쪽 번호는 ?에 들어가는 번호
         ResultSet rs=ps.executeQuery(); //rs에 데이터 저장
         rs.next();
         d.setEmpno(rs.getInt(1));
         d.setEname(rs.getString(2));
         d.setJob(rs.getString(3));
         d.setMgr(rs.getInt(4));
         d.setHiredate(rs.getDate(5));
         d.setSal(rs.getInt(6));
         d.setComm(rs.getInt(7));
         d.setDeptno(rs.getInt(8));
         rs.close();
      }catch(Exception ex)
      {
         System.out.println("empDetailData():"+ex.getMessage());
         
         
      }
      finally
      {
         disConnection();
      }
      return d;
   }
   //   4-3 : 찾기 (LIKE)
   public ArrayList<EmpDTO> empFindData(String column,String data)
   {
      ArrayList<EmpDTO> list =
            new ArrayList<EmpDTO>();
      try
      {
         getConnection();
         String sql="SELECT empno,ename,job,hiredate,deptno "
               +"FROM emp "
               +"WHERE "+column+" LIKE '%'||?||'%'";
         ps=conn.prepareStatement(sql);
         ps.setString(1, data.toUpperCase());
            
            // 결과값 받기
            ResultSet rs=ps.executeQuery(); //데이터는 rs가 다 가지고 있다.
            while(rs.next()) //맨 첫줄부터 마지막까지 읽음(커서의 위치를 맨 위로 올릴때 사용)
            {
               EmpDTO d=new EmpDTO();
               d.setEmpno(rs.getInt(1)); //오라클은 모든 순서가 1번부터 시작
               d.setEname(rs.getString(2));
               d.setJob(rs.getString(3));
               d.setHiredate(rs.getDate(4));
               d.setDeptno(rs.getInt(5));
               list.add(d);
            }
            rs.close();
      }catch(Exception ex)
      {
         System.out.println(ex.getMessage());
      }
      finally
      {
         disConnection();
      }
      return list;
   }
   public ArrayList<ZipcodeDTO> postFind(String dong)
   {
      ArrayList<ZipcodeDTO> list =
            new ArrayList<ZipcodeDTO>();
      try
      {
         getConnection();
         String sql="SELECT zipcode,sido,gugun,dong,NVL(bunji,' ')" // ' ' 작은 따옴표 사이는 반드시 띄어야 한다(안하면 null)
               +"FROM zipcode "
               +"WHERE dong LIKE '%'||?||'%'";
         ps=conn.prepareStatement(sql);
         // ArrayList queryForList(sql);
         ps.setString(1,dong);
         ResultSet rs=ps.executeQuery();
         while(rs.next())
         {
            ZipcodeDTO d = new ZipcodeDTO();
            d.setZipcode(rs.getString(1));
            d.setSido(rs.getString(2));
            d.setGugun(rs.getString(3));
            d.setDong(rs.getString(4));
            d.setBunji(rs.getString(5));
            list.add(d);
         }
         rs.close();
      }catch(Exception ex)
      {
         System.out.println(ex.getMessage());
      }
      finally
      {
         disConnection();
      }
      return list;
   }
}




/*package com.sist.dao;
import java.sql.*;
import java.util.*;

 *    JDBC => java언어를 이용해서 오라클의 데이터 제어하는 프로그램
 *    1) 응용프로그램  <=======> 오라클 연결
 *                 연결 (드라이버를 설치) => thin 드라이버
 *            Class.forName(드라이버명) : 클래스 로딩
 *    2) 오라클 연결
 *            Connection => getConnection(URL,USERNAME,PWD)
 *    3) SQL문장을 오라클로 전송
 *            Statement
 *             = Statement
 *             = PreparedStatement(일반화)
 *             = CallableStatement(프로시저 호출)
 *             String id="aaa";
 *             String sex="man";
 *             int age=30;
 *             String name="hong";
 *             String addr="seoul";
 *             String sql="INSERT INTO member VALUES('"+id+"','"+sex+"',"+age+",'"+name+"','"+addr"')";
 *             String sql="INSERT INTO member VALUES(?,?,?,?,?)";
 *             = ResultSet executeQuery() : SELECT
 *             = int executeUpdate() : INSERT , UPDATE , DELETE
 *             
 *    4) 실행 결과를 읽어서 메모리에 저장
 *             ResultSet
 *             =======================
 *               id     name     sex     => Column
 *             =======================
 *                BOF(Begin Of File)
 *             =======================
 *              aaa     hong     man     : next() => bof부터 eof까지      first()
 *              bbb     shim     woman
 *              ccc     park     man     : previous() => eof부터 bof까지     last()
 *             =======================
 *                EOF(End Of File)
 *             =======================
 *             
 *             Connection => Statement => ResultSet
 *    5) 오라클 닫기
 *             ResultSet => Statement => Connection (여는 순서의 반대로 닫음)
 *             WHERE ename LIKE '%A%' => 오라클에서 사용..(자바에서는 error)
 *             WHERE ename LIKE '%'||'A'||'%' <=자바에서 보낼때
 
public class EmpDAO {
	// 연결 객체
	private Connection conn;
	// SQL 전송 객체
	private PreparedStatement ps;
	// 오라클 주소 설정
	
	 *   jdbc:업체명:드라이버명칭:@IP:포트:데이터베이스명
	 
	private final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
	// 1. 드라이버 등록 ==> 한번만 설정하면 된다(생성자)
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 리플렉션 => 클래스의 이름으로 정보를 읽어와서 제어
		}catch(Exception ex)
		{
			System.out.println("EmpDAO():"+ex.getMessage());
		}
	}
	// 2. 연결 주소 얻기
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"scott","tiger");//드라이버랑 연결할 수 있는 객체를 데려옴
			// conn scott/tiger
		}catch(Exception ex)
		{
			System.out.println("getConnection():"+ex.getMessage());
		}
	}
	// 3. 연결 종료
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			
			 *   PreparedStatement ps
			 *      => 전송(수신,송신)
			 *         OutputStream => SQL
			 *         BufferedReader => 실행 결과 읽기
			 *   Connection conn
			 *      => 연결 객체
			 *      Socket
			 
			if(conn!=null) conn.close();
			//exit
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	// 4. 기능 설정
	//   4-1 : 전체 목록 (SELECT * ~~)
	public ArrayList<EmpDTO> empAllData()
	{
		ArrayList<EmpDTO> list=new ArrayList<EmpDTO>();
		try
		{
			// 연결
			getConnection();
			// SQL 문장 제작
			String sql="SELECT empno,ename,job,hiredate,deptno FROM emp";
			// SQL을 오라클 전송
			ps=conn.prepareStatement(sql);
			
			// 결과값 받기
			ResultSet rs=ps.executeQuery(); //데이터는 rs가 다 가지고 있다.
			while(rs.next()) //맨 첫줄부터 마지막까지 읽음(커서의 위치를 맨 위로 올릴때 사용)
			{
				EmpDTO d=new EmpDTO();
				d.setEmpno(rs.getInt(1)); //오라클은 모든 순서가 1번부터 시작
				d.setEname(rs.getString(2));
				d.setJob(rs.getString(3));
				d.setHiredate(rs.getDate(4));
				d.setDeptno(rs.getInt(5));
				list.add(d);
			}
			rs.close();
		}catch(Exception ex)
		{
			System.out.println("empAllData():"+ex.getMessage());
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	//   4-2 : 상세 보기 (WHERE ~~)
	public EmpDTO empDetailData(int empno)
	{
		EmpDTO d=new EmpDTO();
		try
		{
			getConnection();
			String sql="SELECT * FROM emp WHERE empno=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, empno); // 앞쪽 번호는 ?에 들어가는 번호
			ResultSet rs=ps.executeQuery(); //rs에 데이터 저장
			rs.next();
			d.setEmpno(rs.getInt(1));
			d.setEname(rs.getString(2));
			d.setJob(rs.getString(3));
			d.setMgr(rs.getInt(4));
			d.setHiredate(rs.getDate(5));
			d.setSal(rs.getInt(6));
			d.setComm(rs.getInt(7));
			d.setDeptno(rs.getInt(8));
			rs.close();
		}catch(Exception ex)
		{
			System.out.println("empDetailData():"+ex.getMessage());
			
		}
		finally
		{
			disConnection();
		}
		return d;
	}
	//   4-3 : 찾기 (LIKE)
	public ArrayList<EmpDTO> empFindData(String column,String data)
	{
		ArrayList<EmpDTO> list= new ArrayList<EmpDTO>();
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,hiredate,deptno FROM emp WHERE "+column+" LIKE '%'||?||'%'";
			//쓰는 형식 잘 봐둬야함.. %?% 가 아닌 '%'||?||'%'로 써야함
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, data.toUpperCase());
			
			// 결과값 받기
			ResultSet rs=ps.executeQuery(); //데이터는 rs가 다 가지고 있다.
			while(rs.next()) //맨 첫줄부터 마지막까지 읽음(커서의 위치를 맨 위로 올릴때 사용)
			{
				EmpDTO d=new EmpDTO();
				d.setEmpno(rs.getInt(1)); //오라클은 모든 순서가 1번부터 시작
				d.setEname(rs.getString(2));
				d.setJob(rs.getString(3));
				d.setHiredate(rs.getDate(4));
				d.setDeptno(rs.getInt(5));
				list.add(d);
			}
			rs.close();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			disConnection();
		}
		return list;
	}
}





















*/