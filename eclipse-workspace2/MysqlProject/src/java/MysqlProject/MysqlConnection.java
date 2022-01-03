package java.MysqlProject; // ��Ű���� ����

import java.sql;
import java.io.*;

public class MysqlConnection{
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	MysqlConnection() {
		Try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC ����̹� �ε�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/table01?serverTimezone=UTC&&useSSL=false", "root", "1234"); // []�κ� ([table name], [pwd]) ����
			System.out.println("���� �Ϸ�");
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{ // ���� ����(������ �����Ƿ�)
				if(rs!=null){rs.close();}
				if(pstmt!=null){pstmt.close();}
				if(stmt!=null){stmt.close();}
				if(conn!=null){conn.close();}
			}catch(SQLException se2){
				se2.printStackTrace();
			}
		}
	}
}