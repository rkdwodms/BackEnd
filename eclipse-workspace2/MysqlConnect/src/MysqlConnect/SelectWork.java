package MysqlConnect;

import java.sql.*;
import java.util.Scanner;


public class SelectWork {
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
  
             //DB�� ����� conn ��ü�κ��� Statement ��ü ȹ��.
             stmt = conn.createStatement();
             ResultSet rs = null;
             
             stmt = conn.createStatement();
             
             //�÷��� �޾ƿ��� 
             //���Ǹ� �޾ƿ���
             
            Scanner sc = new Scanner(System.in);
            

     		stmt = conn.createStatement();


             rs = stmt.executeQuery("select Name, Age, Salary from table01");
             while(rs.next()) {
            	 String c1 = rs.getString("Name");
            	 String c2 = rs.getString("Age");
            	 String c3 = rs.getString("Salary");
            	 
            	 System.out.println(c1 + " " + c2 + " " + c3 + " ");
             }
     		
             
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
