<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1> 사원 목록 </h1>

	<h1>회원 목록</h1>
<%-- 
	<%
	try {
			
		

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/db01";

		con = DriverManager.getConnection(url, "root", "1234");

		String select = "select * from members";

		pstmt = con.prepareStatement(select);

		rs = pstmt.executeQuery();
		
	
	%> --%>
	
	

		<table border='1' width='1200'>
			<tr>
				<th>아이디</th>
				<th>삭제</th>
				<th>수정</th>
			</tr>
			
		
		
			
<%-- 			
	<%
	while(rs.next()) {
		
		String id = rs.getString("id");
	
	
	

	} %> --%>
	
	
	</table>
	
	<a href='index.jsp'>메인페이지로 이동</a>
</body>
</html>