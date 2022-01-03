package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/abc")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertServlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
//		int age = request.getParameter("age");
//		int salary = request.getParameter("salary");
//		
		
		int n=0;

		PreparedStatement pstmt = null;

		Connection con = null;
		
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/db01";
			
			con = DriverManager.getConnection(url, "root", "1234");
			
			String sql = "insert into members values(?)";
			
		
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, id);
			
			System.out.println("연결성공!");

			n=pstmt.executeUpdate();
			

		}catch(ClassNotFoundException ce){

			System.out.println(ce.getMessage());

		}catch(SQLException se){

			System.out.println(se.getMessage());

		}finally{

			try{

				if(pstmt!=null) pstmt.close();

				if(con!=null) con.close();

			}catch(SQLException se){

				System.out.println(se.getMessage());

			}
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();

		
		pw.println("<html>");

		pw.println("<head></head>");

		pw.println("<body>");
		pw.println(id + " 님 가입됨</br></br></br>");
		
		pw.println("<a href='main.html'>메인페이지로 이동</a>");

		
		pw.println("</body>");
		pw.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
	
}
