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
      
      
      System.out.println("변경하고싶은 컬럼명을 입력해주세요. : ");
      String col = sc.nextLine();
      
      System.out.println("변경하고싶은 사람의 이름을 입력해주세요. : ");
      String name = sc.nextLine();
      
      System.out.println("변경할 값을 입력해주세요. : ");
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
                //자원 해제
             if(conn != null && !conn.isClosed())
                    conn.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

}
}