<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="board.BoardDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%
request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="board" class="board.boardVO" scope="page" />
<jsp:setProperty name="board" property="boardTitle" />
<jsp:setProperty name="board" property="boardContent" />



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>JSP 웹사이트</title>
</head>
<body>

	<%
	String userID = null;
	if (session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	if (userID == null) {

		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인 하세요.')");
		script.println("location.href = 'login.jsp'");
		script.println("</script>");

	} else {
		if (board.getBoardTitle() = null || board.getBoardContent() == null) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력이 안된 사항이 있다.')");
			script.println("history.back()");
			script.println("</script>");
		} else {
			BoardDAO boardDAO = new BoardDAO();
			int result = boardDAO.write(board.getBoardTitle(), userId, board.getBoardContent());
			if (result == -1) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('글쓰기 실패.')");
		script.println("history.back()");
		script.println("</script>");
			} else {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("location.href = 'Board.jsp'");
		script.println("history.back()");
		script.println("</script>");
			}
		}
	}
	
	%>


</body>
</html>
 --%>