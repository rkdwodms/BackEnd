<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<title>메인 페이지</title>
</head>

<body>
	<%=new Date()%>
	<h2>Hello World</h2>
	<a href="t1">링크1</a><br/>
	
	<a href="t2">링크2</a><br/>
	<a href="t3?sendName=apple">링크3</a><br/>
	<a href="t4?name=banana&age=1000">링크4</a><br/>
	<a href="t5?name=orange&age=2000">링크5</a><br/>
	<!-- <a href="t6?Nickname=?&age=?">링크6</a><br/> -->
	<a href="t6">링크6</a><br/>
	<a href="t7?name=kiwi&age=25">링크7</a><br/>
	<a href="t8">링크8</a><br/>
	<a href="t9">링크9</a><br/>
	<a href="t10">링크10</a><br/>
	
	<FORM METHOD = POST action = "t11">
	
		<INPUT TYPE="text" NAME="id" ><br/>
		<INPUT TYPE="number" NAME="pass"><br/>
		<INPUT TYPE="submit" VALUE="sending!">
		
	</FORM>
	
	<a href="t12">링크12</a><br/>
	<a href="t13">회원목록</a><br/>
</body>
