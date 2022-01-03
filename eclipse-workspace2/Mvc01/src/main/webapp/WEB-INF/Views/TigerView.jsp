<%@page import="java.util.LinkedList"%>
<%@page import="Pack01.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <!-- JSTL을 쓰겠다는 코드  -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>t12 호랑이</h1>

<%
// 1번 로직에 대한 식
	int num = (int)request.getAttribute("num"); // 얻으려는 키 값이 num 
	out.print(num);
	out.println("<br/>");
	
	// 2번 
	String str = (String)request.getAttribute("str");
	out.print(str);
	out.println("<br/>");
	
	// 3번 
	int[] ar = (int[])request.getAttribute("ar");
	for(int value : ar){
		out.print(value + " ");
	}out.println("<br/>");
	
	
	// 4번 
	Person person = (Person)request.getAttribute("person");
	out.print(person.getId() + " " + person.getPass());
	out.println("<br/>");
	
	//5번 
	@SuppressWarnings("unchecked")
	
	LinkedList<Integer> list01 =
		(LinkedList<Integer>)request.getAttribute("list01");
	out.println(list01.get(0));
	out.println(list01.get(1));
	out.println(list01.get(2));
	out.println("<br/");

	//6
	@SuppressWarnings("unchecked")
	LinkedList<String> list02 = (LinkedList<String>) request.getAttribute("list02");
	out.print(list02.get(0));
	out.print(list02.get(1));
	out.print(list02.get(2));

	out.print("<br/>");

	//7
	@SuppressWarnings("unchecked")
	LinkedList<Person> list03 = (LinkedList<Person>) request.getAttribute("list03");
	out.println(list03.get(0).getId() + " " + list03.get(0).getPass());
	out.println(list03.get(1).getId() + " " + list03.get(1).getPass());
	out.println(list03.get(2).getId() + " " + list03.get(2).getPass());

	out.print("<br/>");
	/* 	//6번
		
		@SuppressWarnings("unchecked")
		
		LinkedList<String> list02 =(LinkedList<String>)request.getAttribute("list02");
		out.println(list02.get(0));
		out.println(list02.get(1));
		out.println(list02.get(2));
		out.println("<br/");
		
		
		//7번
		
		@SuppressWarnings("unchecked")
		
		LinkedList<Person> list03 =
			(LinkedList<Person>)request.getAttribute("list03");
		out.println(list03.get(0).getId() + list03.get(0).getPass());
		out.println(list03.get(1).getId() + list03.get(1).getPass());
		out.println(list03.get(2).getId() + list03.get(2).getPass());
	
		out.println("<br/");
	
		 */
%>

<!-- 제어문을 태그로 사용하고 싶을 때? -->
 <h1>JSTL 테스트 </h1>
 <!--
 a는 객체가 된다. list03에서 들고온 한개의 객체를 a로 한다. 
 b안에 들어있는 index를 이용하면 
 
 
   -->
 <c:forEach var="a" items="${list03}" varStatus="b">
 		${b.index} : ${a.getId()} ${a.getPass()}<br>
</c:forEach>
 

 
<%-- <%
	// 이 코드는 사용할 수 없다. 
	//String nickName = request.getParameter("nickName");

	String r1 = (String)request.getAttribute("nickName");
	Integer r2 = (Integer)request.getAttribute("age");
	
	String r3 = String.valueOf(request.getAttribute("age"));

%>

	<h1>여기는 타이거 뷰</h1>
	<h1>${nickName}</h1>
	<h1>${age}</h1>

	<%=r1%>
	<%=r2%> --%>
	
	
</body>
</html>