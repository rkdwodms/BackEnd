package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list.do")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		ResultSet rs = null;
		response.setContentType("text/html;charset=UTF-8");

		Connection con=null;

		PreparedStatement pstmt=null;



		PrintWriter pw = response.getWriter();

		pw.println("<html>");

		pw.println("<head></head>");

		pw.println("<body>");

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/db01";

			con = DriverManager.getConnection(url, "root", "1234");

			String select = "select * from members";

			pstmt = con.prepareStatement(select);

			rs = pstmt.executeQuery();



			pw.println("<div>");

			pw.println("<table border='1' width='1200'>");

			pw.println("<tr>");

			pw.println("<th>아이디</th>");

			pw.println("<th>삭제</th>");

			pw.println("<th>수정</th>");

			pw.println("</tr>");
			
				
			while(rs.next()) {
				
//				String id1 = "호랑이";
				String id = rs.getString("id");

				pw.println("<tr>");

				pw.println("<td>" + id + "</td>");

				pw.println("<td><a href='delete.do?id=" + id + "'>삭제</a></td>");

				pw.println("<td><a href='update.do?id=" + id + "'>수정</a></td>");

				pw.println("</tr>");
			


			//			pw.println("<tr>");
			//
			//			pw.println("<td>" + id2 + "</td>");
			//
			//			pw.println("<td><a href='delete.do?id=" + id2 + "'>삭제</a></td>");
			//
			//			pw.println("<td><a href='update.do?id=" + id2 + "'>수정</a></td>");
			//
			//			pw.println("</tr>");
			//			
			//			
			//			
			//			pw.println("<tr>");
			//
			//			pw.println("<td>" + id3 + "</td>");
			//
			//			pw.println("<td><a href='delete.do?id=" + id3 + "'>삭제</a></td>");
			//
			//			pw.println("<td><a href='update.do?id=" + id3 + "'>수정</a></td>");
			//
			//			pw.println("</tr>");
			//			
			//			
			//			
			//			pw.println("<tr>");
			//
			//			pw.println("<td>" + id4 + "</td>");
			//
			//			pw.println("<td><a href='delete.do?id=" + id4 + "'>삭제</a></td>");
			//
			//			pw.println("<td><a href='update.do?id=" + id4 + "'>수정</a></td>");
			//
			//			pw.println("</tr>");
			}


		pw.println("</table>");

		pw.println("</div>");

		pw.println("<a href='main.html'>메인페이지로 이동</a>");


	}catch(ClassNotFoundException ce){

		System.out.println(ce.getMessage());

	}catch(SQLException se){

		System.out.println(se.getMessage());

	}finally{

		try{

			if(rs!=null) rs.close();

			if(pstmt!=null) pstmt.close();

			if(con!=null) con.close();

		}catch(SQLException se){

			System.out.println(se.getMessage());

		}
	}
		
		pw.println("</body>");
		pw.println("</html>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);


	}

}
