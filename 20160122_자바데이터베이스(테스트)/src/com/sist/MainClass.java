package com.sist;
import java.sql.*;
public class MainClass {

	public static void main(String[] args) 
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		// ¿¬°á
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		String sql="SELECT * FROM emp";
		PreparedStatement ps= conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}

}
