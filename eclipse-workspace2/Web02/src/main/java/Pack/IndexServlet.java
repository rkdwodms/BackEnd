package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/HelloServlet")
@WebServlet("/hello")

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexServlet() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("누군가 요청함");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>" +
		"<body>"+
				"<h1> 메인 페이지 입니다.  </h1>"+
		"</body>"+
				"</head>"+
		"</html>"
				);
		out.close();
//		ServletContext context = getServletContext();
//		RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
//		dispatcher.forward(request, response);
		//길을 알려주는 역할을 한다. 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}