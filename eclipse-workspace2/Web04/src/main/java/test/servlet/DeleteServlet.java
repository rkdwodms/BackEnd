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

@WebServlet("/delete.do")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int n=0;
		
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");

		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db01";
			con = DriverManager.getConnection(url, "root", "1234");
			
			String sql = "delete from members where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			n = pstmt.executeUpdate();
			
		
		} catch(ClassNotFoundException ce){

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
		
		if(n >0) {
			response.sendRedirect("list.do");
		}else {
			
			pw.println("<html>");

			pw.println("<head>");

			pw.println("<body>");
			pw.println(id + " ªË¡¶µ </br>");
			
			pw.println("</body>");
			pw.println("</head>");
			pw.println("</html>");
			
			pw.close();
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}
	

}
