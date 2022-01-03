package MysqlConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserWork {

	public static void main(String[] args) {
		
		Connection conn = null;
        Statement stmt = null;
 
        String url = "jdbc:mysql://localhost:3306/db01";
        String id = "root";
        String pw = "1234";
 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            conn = DriverManager.getConnection(url, id, pw);
 
            
            Scanner sc = new Scanner(System.in);
    		
    		
    		System.out.println("이름을 입력해주세요: ");
    		String userName = sc.nextLine();
    		
    		System.out.println("나이를 입력해주세요: ");
    		int userAge = sc.nextInt();
    		
    		System.out.println("연봉을 입력해주세요");
    		int userSal = sc.nextInt();
    		
    		
    		
    		String inserts = "insert into table01 values (?, ?, ?)";
    		
    		PreparedStatement pstmt = conn.prepareStatement(inserts);
    		pstmt.setString(1, userName);
    		pstmt.setInt(2, userAge);
    		pstmt.setInt(3, userSal);
    		
    		int resultCnt = pstmt.executeUpdate();
    		

    		
    		if (resultCnt > 0) { 
    			System.out.println("정상적으로 입력되었음."); 
    			pstmt.close();
    			
    		} else {
    			System.out.println("데이터 입력이 되지 않았음."); 
    			pstmt.close();
    			}
    		
    		
		
	} catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                //자원 해제
               if(conn != null && !conn.isClosed()) {
            	   conn.close();   
               }
                    
               	
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

}
}
