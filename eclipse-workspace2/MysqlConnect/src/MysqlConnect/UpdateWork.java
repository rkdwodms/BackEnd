package MysqlConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateWork {

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
            
            Scanner sc = new Scanner(System.in);
      
      
      System.out.println("�����ϰ���� �÷����� �Է����ּ���. : ");
      String col = sc.nextLine();
      
      System.out.println("�����ϰ���� ����� �̸��� �Է����ּ���. : ");
      String name = sc.nextLine();
      
      System.out.println("������ ���� �Է����ּ���. : ");
      int val = sc.nextInt();
      
      String updates = "update table01 set Name=?, Age=";
      
      PreparedStatement pstmt = conn.prepareStatement(updates);
      pstmt.setString(1, col);
      pstmt.setInt(2, val);
      pstmt.setString(3, name);
      int resultcnt = pstmt.executeUpdate();

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