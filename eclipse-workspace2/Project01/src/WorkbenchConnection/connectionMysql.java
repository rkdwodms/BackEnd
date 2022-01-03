package WorkbenchConnection;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;


public class connectionMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	  } catch (Exception ex) {
	  // handle the error
	  }
	 
	  Connection conn =  null;
	  try{
	  conn =
	  DriverManager.getConnection
	                ("jdbc:mysql://localhost:3306/test" ,"root" ,"비밀번호");
	  System.out.println("connect");
	  } catch (SQLException ex) {
	  //handle any errors
	  System.out.println("SQLException: " + ex.getMessage());
	  System.out.println("SQLState: " + ex.getSQLState());

	}

}
