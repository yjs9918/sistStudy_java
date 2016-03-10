import java.sql.*;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		try
		{
			
			// Driver설치
			Class.forName("oracle.jdbc.driver.OracleDriver"); //ClassNotFoundException
			// 오라클 연결 //SQLException
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			conn=DriverManager.getConnection(url,"scott","tiger");
			//DriverManager:Factory 패턴
			
			// SQL 문장 전송
			String sql="SELECT empno,ename,job FROM emp";
			ps=conn.prepareStatement(sql);
			// 결과값을 받아서 출력
			ResultSet rs=ps.executeQuery(); //SQL 실행한 결과를 달라
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}catch(ClassNotFoundException cf)
		{
			System.out.println(cf.getMessage());
		}catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			try
			{
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex){}
		}
	}

}
