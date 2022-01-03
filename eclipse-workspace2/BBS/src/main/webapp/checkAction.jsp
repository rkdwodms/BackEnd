<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="user.UserDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%
request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="user" class="user.User" scope="page" />

<jsp:setProperty name="user" property="userID" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POSCO ICT</title>
</head>
<body>


	<%


	UserDAO userDAO = new UserDAO();
	int result = userDAO.check(user);

	if (result == -1) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('사용 가능합니다.')");
		script.println("history.back()");
		script.println("</script>");
		
	} else {
		
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 존재하는 아이디입니다.')");
		script.println("history.back()");
		script.println("</script>");
		
	}
	%>
</body>
</html>