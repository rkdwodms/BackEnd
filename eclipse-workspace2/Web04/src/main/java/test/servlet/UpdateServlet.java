package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateServlet() {
        super();
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");

		String id=request.getParameter("id");

		response.setContentType("text/html;charset=euc-kr");

		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");

		pw.println("<head>");

		pw.println("<body>");
		pw.println(id + " ¼öÁ¤µÊ</br>");
		
		pw.println("</body>");
		pw.println("</head>");
		pw.println("</html>");
		
	
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
		
		
	}

}
