<%@page import="java.util.LinkedList"%>
<%@page import="Pack01.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <!-- JSTL�� ���ڴٴ� �ڵ�  -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>t12 ȣ����</h1>

<%
// 1�� ������ ���� ��
	int num = (int)request.getAttribute("num"); // �������� Ű ���� num 
	out.print(num);
	out.println("<br/>");
	
	// 2�� 
	String str = (String)request.getAttribute("str");
	out.print(str);
	out.println("<br/>");
	
	// 3�� 
	int[] ar = (int[])request.getAttribute("ar");
	for(int value : ar){
		out.print(value + " ");
	}out.println("<br/>");
	
	
	// 4�� 
	Person person = (Person)request.getAttribute("person");
	out.print(person.getId() + " " + person.getPass());
	out.println("<br/>");
	
	//5�� 
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
	/* 	//6��
		
		@SuppressWarnings("unchecked")
		
		LinkedList<String> list02 =(LinkedList<String>)request.getAttribute("list02");
		out.println(list02.get(0));
		out.println(list02.get(1));
		out.println(list02.get(2));
		out.println("<br/");
		
		
		//7��
		
		@SuppressWarnings("unchecked")
		
		LinkedList<Person> list03 =
			(LinkedList<Person>)request.getAttribute("list03");
		out.println(list03.get(0).getId() + list03.get(0).getPass());
		out.println(list03.get(1).getId() + list03.get(1).getPass());
		out.println(list03.get(2).getId() + list03.get(2).getPass());
	
		out.println("<br/");
	
		 */
%>

<!-- ����� �±׷� ����ϰ� ���� ��? -->
 <h1>JSTL �׽�Ʈ </h1>
 <!--
 a�� ��ü�� �ȴ�. list03���� ���� �Ѱ��� ��ü�� a�� �Ѵ�. 
 b�ȿ� ����ִ� index�� �̿��ϸ� 
 
 
   -->
 <c:forEach var="a" items="${list03}" varStatus="b">
 		${b.index} : ${a.getId()} ${a.getPass()}<br>
</c:forEach>
 

 
<%-- <%
	// �� �ڵ�� ����� �� ����. 
	//String nickName = request.getParameter("nickName");

	String r1 = (String)request.getAttribute("nickName");
	Integer r2 = (Integer)request.getAttribute("age");
	
	String r3 = String.valueOf(request.getAttribute("age"));

%>

	<h1>����� Ÿ�̰� ��</h1>
	<h1>${nickName}</h1>
	<h1>${age}</h1>

	<%=r1%>
	<%=r2%> --%>
	
	
</body>
</html>