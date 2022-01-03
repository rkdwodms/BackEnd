package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {

	private Connection conn;

	private ResultSet rs;

	public BoardDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/db02";
			String dbID = "root";
			String dbPassword = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDate() {
		String sql = "select now()";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}

		}catch (Exception e) {
			e.printStackTrace();

		}
		return ""; //데이터베이스 오류
	}


	public int getNext() {
		String sql = "select boardID from board order by boardID desc";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1; //첫 게시글
		}catch (Exception e) {
			e.printStackTrace();

		}
		return -1; //데이터베이스 오류

	}

	public int write(String boardTitle, String userId, String boardContent) {
		String sql = "insert into board values(?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext());
			pstmt.setString(2, boardTitle);
			pstmt.setString(3, userId);
			pstmt.setString(4, getDate());
			pstmt.setString(5, boardContent);
			pstmt.setInt(6, 1);
			
			return pstmt.executeUpdate(); 
		}catch (Exception e) {
			e.printStackTrace();

		}
		return -1; //데이터베이스 오류

	}

}

