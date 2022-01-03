<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
		String n1 = request.getParameter("name");
		String n2 = request.getParameter("age");
		String n3 = request.getParameter("salary");
		
		out.println(n1);
		out.println(n2);
		out.println(n3);
		%>
</body>
</html>