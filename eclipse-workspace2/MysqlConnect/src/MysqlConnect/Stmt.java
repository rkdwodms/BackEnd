package MysqlConnect;

import java.sql.*;


public class Stmt {
 public static void main(String[] args) {
//	 DataSet ds = new DataSet();
//	 
   Connection conn = null;
         Statement stmt = null;
  
         String url = "jdbc:mysql://localhost:3306/db01";
         String id = "root";
         String pw = "1234";
  
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
  
             conn = DriverManager.getConnection(url, id, pw);
  
             System.out.println("Successfully Connected!");
  
             //DB�� ����� conn ��ü�κ��� Statement ��ü ȹ��.
             stmt = conn.createStatement();
             ResultSet rs = null;
             
             stmt = conn.createStatement();
             //�޾ƿ� �÷��� �޾ƿ��� 
             //table�� �Ѱ� �޾ƿ��� 
             
             
             
             rs = stmt.executeQuery("select * from table01");
             while(rs.next()) {
            	 String c1 = rs.getString("Name");
            	 String c2 = rs.getString("Age");
            	 String c3 = rs.getString("Salary");
            	 
            	 System.out.println(c1 + " " + c2 + " " + c3 + " ");
             }
             
             int result = stmt.executeUpdate("delete from table01 where Age=10");
             if (result == 1) {
            	 System.out.println("success!!!!");
             }

             rs = stmt.executeQuery("select * from table01");
             while(rs.next()) {
            	 String c1 = rs.getString("Name");
            	 String c2 = rs.getString("Age");
            	 String c3 = rs.getString("Salary");
            	 
            	 System.out.println(c1 + " " + c2 + " " + c3 + " ");
             }
   
//             StringBuilder sb = new StringBuilder();
//             String sql = sb.append("create table if not exists student(")
//                     .append("id int,")
//                     .append("name varchar(20),")
//                     .append("grade int")
//                     .append(");").toString();
//             
//             String selection = "select * from student";
             
             
  
             //query�� ������
//            stmt.execute(sql);
//            stmt.execute(selection);
            
         }
  
         catch(ClassNotFoundException e){
             e.printStackTrace();
         }
         catch(SQLException e){
             e.printStackTrace();
         }
         finally{
             try{
                 //�ڿ� ����
                if(conn != null && !conn.isClosed())
                     conn.close();
             } catch(SQLException e){
                 e.printStackTrace();
             }
         }
 }
}
