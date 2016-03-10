package com.sist.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/*
 *    JDBC => java�� �̿��ؼ� ����Ŭ�� ������ �����ϴ� ���α׷�
 *    1) �������α׷�  <=======> ����Ŭ ����
 *                 ���� (����̹��� ��ġ) => thin ����̹�
 *            Class.forName(����̹���) : Ŭ���� �ε�
 *    2) ����Ŭ ����
 *            Connection => getConnection(URL,USERNAME,PWD)
 *    3) SQL������ ����Ŭ�� ����
 *            Statement
 *             = Statement
 *             = PreparedStatement(�Ϲ�ȭ)
 *             = CallableStatement(���ν��� ȣ��)
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
 *    4) ���� ����� �о �޸𸮿� ����
 *             ResultSet
 *             =======================
 *               id     name     sex     => Column
 *             =======================
 *                BOF(Begin Of File)
 *             =======================
 *              aaa     hong     man     : next() => bof���� eof����      first()
 *              bbb     shim     woman
 *              ccc     park     man     : previous() => eof���� bof����     last()
 *             =======================
 *                EOF(End Of File)
 *             =======================
 *             
 *             Connection => Statement => ResultSet
 *    5) ����Ŭ �ݱ�
 *             ResultSet => Statement => Connection (���� ������ �ݴ�� ����)
 *             WHERE ename LIKE '%A%' => ����Ŭ���� ���..(�ڹٿ����� error)
 *             WHERE ename LIKE '%'||'A'||'%' <=�ڹٿ��� ������
 */
public class EmpDAO {
   // ���� ��ü
   private Connection conn;
   // SQL ���� ��ü
   private PreparedStatement ps;
   // ����Ŭ �ּ� ����
   /*
    *   jdbc:��ü��:����̹���Ī:@IP:��Ʈ:�����ͺ��̽���
    */
   private final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
   // 1. ����̹� ��� ==> �ѹ��� �����ϸ� �ȴ�(������)
   public EmpDAO()
   {
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         // ���÷��� => Ŭ������ �̸����� ������ �о�ͼ� ����
      }catch(Exception ex)
      {
         System.out.println("EmpDAO():"+ex.getMessage());
      }
   }
   // 2. ���� �ּ� ���
   public void getConnection()
   {
      try
      {
         conn=DriverManager.getConnection(URL,"scott","tiger");//����̹��� ������ �� �ִ� ��ü�� ������
         // conn scott/tiger
      }catch(Exception ex)
      {
         System.out.println("getConnection():"+ex.getMessage());
      }
   }
   // 3. ���� ����
   public void disConnection()
   {
      try
      {
         if(ps!=null) ps.close();
         /*
          *   PreparedStatement ps
          *      => ����(����,�۽�)
          *         OutputStream => SQL
          *         BufferedReader => ���� ��� �б�
          *   Connection conn
          *      => ���� ��ü
          *      Socket
          */
         if(conn!=null) conn.close();
         //exit
      }catch(Exception ex)
      {
         System.out.println(ex.getMessage());
      }
   }
   // 4. ��� ����
   //   4-1 : ��ü ��� (SELECT * ~~)
   public ArrayList<EmpDTO> empAllData()
   {
      ArrayList<EmpDTO> list=new ArrayList<EmpDTO>();
      try
      {
         // ����
         getConnection();
         // SQL ���� ����
         String sql="SELECT empno,ename,job,hiredate,deptno FROM emp";
         // SQL�� ����Ŭ ����
         ps=conn.prepareStatement(sql);
         
         // ����� �ޱ�
         ResultSet rs=ps.executeQuery(); //�����ʹ� rs�� �� ������ �ִ�.
         while(rs.next()) //�� ù�ٺ��� ���������� ����(Ŀ���� ��ġ�� �� ���� �ø��� ���)
         {
            EmpDTO d=new EmpDTO();
            d.setEmpno(rs.getInt(1)); //����Ŭ�� ��� ������ 1������ ����
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
   //   4-2 : �� ���� (WHERE ~~)
   public EmpDTO empDetailData(int empno)
   {
      EmpDTO d=new EmpDTO();
      try
      {
         getConnection();
         String sql="SELECT * FROM emp WHERE empno=?";
         ps=conn.prepareStatement(sql);
         ps.setInt(1, empno); // ���� ��ȣ�� ?�� ���� ��ȣ
         ResultSet rs=ps.executeQuery(); //rs�� ������ ����
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
   //   4-3 : ã�� (LIKE)
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
            
            // ����� �ޱ�
            ResultSet rs=ps.executeQuery(); //�����ʹ� rs�� �� ������ �ִ�.
            while(rs.next()) //�� ù�ٺ��� ���������� ����(Ŀ���� ��ġ�� �� ���� �ø��� ���)
            {
               EmpDTO d=new EmpDTO();
               d.setEmpno(rs.getInt(1)); //����Ŭ�� ��� ������ 1������ ����
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
         String sql="SELECT zipcode,sido,gugun,dong,NVL(bunji,' ')" // ' ' ���� ����ǥ ���̴� �ݵ�� ���� �Ѵ�(���ϸ� null)
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

 *    JDBC => java�� �̿��ؼ� ����Ŭ�� ������ �����ϴ� ���α׷�
 *    1) �������α׷�  <=======> ����Ŭ ����
 *                 ���� (����̹��� ��ġ) => thin ����̹�
 *            Class.forName(����̹���) : Ŭ���� �ε�
 *    2) ����Ŭ ����
 *            Connection => getConnection(URL,USERNAME,PWD)
 *    3) SQL������ ����Ŭ�� ����
 *            Statement
 *             = Statement
 *             = PreparedStatement(�Ϲ�ȭ)
 *             = CallableStatement(���ν��� ȣ��)
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
 *    4) ���� ����� �о �޸𸮿� ����
 *             ResultSet
 *             =======================
 *               id     name     sex     => Column
 *             =======================
 *                BOF(Begin Of File)
 *             =======================
 *              aaa     hong     man     : next() => bof���� eof����      first()
 *              bbb     shim     woman
 *              ccc     park     man     : previous() => eof���� bof����     last()
 *             =======================
 *                EOF(End Of File)
 *             =======================
 *             
 *             Connection => Statement => ResultSet
 *    5) ����Ŭ �ݱ�
 *             ResultSet => Statement => Connection (���� ������ �ݴ�� ����)
 *             WHERE ename LIKE '%A%' => ����Ŭ���� ���..(�ڹٿ����� error)
 *             WHERE ename LIKE '%'||'A'||'%' <=�ڹٿ��� ������
 
public class EmpDAO {
	// ���� ��ü
	private Connection conn;
	// SQL ���� ��ü
	private PreparedStatement ps;
	// ����Ŭ �ּ� ����
	
	 *   jdbc:��ü��:����̹���Ī:@IP:��Ʈ:�����ͺ��̽���
	 
	private final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
	// 1. ����̹� ��� ==> �ѹ��� �����ϸ� �ȴ�(������)
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ���÷��� => Ŭ������ �̸����� ������ �о�ͼ� ����
		}catch(Exception ex)
		{
			System.out.println("EmpDAO():"+ex.getMessage());
		}
	}
	// 2. ���� �ּ� ���
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"scott","tiger");//����̹��� ������ �� �ִ� ��ü�� ������
			// conn scott/tiger
		}catch(Exception ex)
		{
			System.out.println("getConnection():"+ex.getMessage());
		}
	}
	// 3. ���� ����
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			
			 *   PreparedStatement ps
			 *      => ����(����,�۽�)
			 *         OutputStream => SQL
			 *         BufferedReader => ���� ��� �б�
			 *   Connection conn
			 *      => ���� ��ü
			 *      Socket
			 
			if(conn!=null) conn.close();
			//exit
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	// 4. ��� ����
	//   4-1 : ��ü ��� (SELECT * ~~)
	public ArrayList<EmpDTO> empAllData()
	{
		ArrayList<EmpDTO> list=new ArrayList<EmpDTO>();
		try
		{
			// ����
			getConnection();
			// SQL ���� ����
			String sql="SELECT empno,ename,job,hiredate,deptno FROM emp";
			// SQL�� ����Ŭ ����
			ps=conn.prepareStatement(sql);
			
			// ����� �ޱ�
			ResultSet rs=ps.executeQuery(); //�����ʹ� rs�� �� ������ �ִ�.
			while(rs.next()) //�� ù�ٺ��� ���������� ����(Ŀ���� ��ġ�� �� ���� �ø��� ���)
			{
				EmpDTO d=new EmpDTO();
				d.setEmpno(rs.getInt(1)); //����Ŭ�� ��� ������ 1������ ����
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
	//   4-2 : �� ���� (WHERE ~~)
	public EmpDTO empDetailData(int empno)
	{
		EmpDTO d=new EmpDTO();
		try
		{
			getConnection();
			String sql="SELECT * FROM emp WHERE empno=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, empno); // ���� ��ȣ�� ?�� ���� ��ȣ
			ResultSet rs=ps.executeQuery(); //rs�� ������ ����
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
	//   4-3 : ã�� (LIKE)
	public ArrayList<EmpDTO> empFindData(String column,String data)
	{
		ArrayList<EmpDTO> list= new ArrayList<EmpDTO>();
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,hiredate,deptno FROM emp WHERE "+column+" LIKE '%'||?||'%'";
			//���� ���� �� ���־���.. %?% �� �ƴ� '%'||?||'%'�� �����
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, data.toUpperCase());
			
			// ����� �ޱ�
			ResultSet rs=ps.executeQuery(); //�����ʹ� rs�� �� ������ �ִ�.
			while(rs.next()) //�� ù�ٺ��� ���������� ����(Ŀ���� ��ġ�� �� ���� �ø��� ���)
			{
				EmpDTO d=new EmpDTO();
				d.setEmpno(rs.getInt(1)); //����Ŭ�� ��� ������ 1������ ����
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