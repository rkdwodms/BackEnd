package MysqlConnect;

import java.sql.*;


public class MysqlCRUD {
 public static void main(String[] args) {
	 
   Connection conn = null;
         Statement stmt = null;
  
         String url = "jdbc:mysql://localhost:3306/db01";
         String id = "root";
         String pw = "1234";
  
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
  
             conn = DriverManager.getConnection(url, id, pw);
  
             System.out.println("Successfully Connected!");
  
             //DB와 연결된 conn 객체로부터 Statement 객체 획득.
             stmt = conn.createStatement();
             
             StringBuilder sb = new StringBuilder();
             String sql = sb.append("create table if not exists student(")
                     .append("id int,")
                     .append("name varchar(20),")
                     .append("grade int")
                     .append(");").toString();
             
             String selection = "select * from student";
             
             
  
             //query문 날리기
//            stmt.execute(sql);
            stmt.execute(selection);
            
         }
  
         catch(ClassNotFoundException e){
             e.printStackTrace();
         }
         catch(SQLException e){
             e.printStackTrace();
         }
         finally{
             try{
                 //자원 해제
                if(conn != null && !conn.isClosed())
                     conn.close();
             } catch(SQLException e){
                 e.printStackTrace();
             }
         }
 }
}

//import java.sql.*;
//
//class Mysql{
//	public Mysql() {
//		Connection conn;
//		
//		Statement stmt = conn.createStatement();
//		String sql;
//		
//		sql = "select * from first";
//		ResultSet rs = stmt.executeQuery(sql);
//		
//		
//		while(rs.next()) {
//			String Name = rs.getString("Name"); 
//			int Age = rs.getInt("Age");
//			int Salary = rs.getInt("Salary");
//			
//			System.out.println(Name + "\t" + Age + "\t" + Salary );
//		}
//	}
//}
//
//public class MysqlCRUD {
//	
//	public static void main(String[] args) {
//		
//		new Mysql();
//		
//	}
//
//}
