<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
	request.setCharacterEncoding("UTF-8");

	Connection conn = null;
	Statement stmt = null;

	String n1 = request.getParameter("name");
	String n2 = request.getParameter("age");
	String n3 = request.getParameter("salary");

	out.println(n1);
	out.println(n2);
	out.println(n3);

	try {
		String url = "jdbc:mysql://192.168.241.92:4444/db02";
		String id = "tiger";
		String pw = "1234";

		Class.forName("com.mysql.cj.jdbc.Driver");

		conn = DriverManager.getConnection(url, id, pw);

		String inserts = "insert into table03 values(?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(inserts);

		pstmt.setString(1, n1);
		pstmt.setString(2, n2);
		pstmt.setString(3, n3);

		pstmt.executeUpdate();

		System.out.println("연결성공!");

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			//자원 해제
			if (conn != null && !conn.isClosed()) {
		conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
%>
</body>
</html>