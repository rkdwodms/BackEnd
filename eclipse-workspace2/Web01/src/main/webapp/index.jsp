<%@page import = "java.util.Date" %>


<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>

	<h1>테스트</h1>
	<a href = "a.jsp">링크1</a>
	<a href = "tiger/b.jsp">링크2</a>
	
	<a href = "e.jsp?nickname">링크3</a>
</body>
</html>



<%-- <style>

	div



</style>
</head>
<body>
	<table border="1" width="200">
	
	<%
  		for(int i=0; i<10; i++){
   			out.println( "<a href=a.jsp?num=" + i + "> [" + i + "] </a>" );
  		}
	%> --%>
	
	<%-- <% 
		for(int i=2; i < 10; i++ ){
			for(int j=1; j < 10; j++ ){ %>
			
				<tr>
					<td><% 
					int res = i*j;
					out.print(i + "X" + j + "=" + res);
					%></td>
					</tr>
		<% 	}
		}
	
	%> --%>
	</table>
	
</body>
<%-- <body>
	<% 
		int sum=0;
	for( int a =0; a <10; a++) {
		sum += a;
		out.println(a);
	}
	out.println("<br/>");
	out.println(sum);

	%>
</body> --%>






<%-- <body bgcolor=<%="pink" %>>
	<button> 버튼 </button>
</body>
 --%>







<%-- 	<%=100 %>
	<%="홍길동" %>
	<%=(3 > 2)?"호랑이":"독수리" %>
	
	<%!
		int sum(int a, int b){
		return a + b;
	}
	%>
	<%=sum(10,20) %>

 --%>



<%--  	<%
		String[] name = {"호랑이" , "코끼리", "독수리"
		};
	%>
	<table border="1" width="200">
	<%for(int i=0; i<name.length; i++){ %>
		<tr>
			<td><%=i * 10 + 10 %></td>
			<td><%=name[i]%></td>
		</tr>
		<% } %>
	</table> --%> 


<%-- <%
	//java.util.Date date = new java.util.Date();
	Date date new Date();

%>

<%= 
	date %> --%>

	<!-- 	//num은 반드시 홀수라고 정의한다. 
	// 배열 사용하지 않는다. 
	int num = 5; 일때
	
	결과값 
	   *
	 * * *
   * * * * *
     * * *  
	   * -->

	<%-- <%
	int num = 5;
	int cent = num/2;
		
		for(int i=0; i < cent; i++){
	        for(int j=0; j<4-i; j++){   
	            System.out.print(" ");
	        }
	        for(int j=0; j<i*2+1; j++) { 
	            System.out.print("*");
	        }
	        System.out.println();
	    }
			System.out.println();
	  
	
	%>
 --%>
	<!-- jsp : 여기서 자바를 사용하겠다.  -->
	<!-- 함수 작성 가능 -->
	<!-- 페이지 출력 가능 -->
	<!-- 자바 코드 작성 가능 -->

	<!-- <h1>호랑이</h1> -->
	<!-- 	
 예제 1 : 자바 코드를 사용할 수 있다. -->

	<%-- 		<!-- 스크립트 릿 -->
		<%
			int num = 10;
			String s = "호랑이";
			
			
			//페이지로 출력하는 역할을 한다. 
			out.println(num + s + "</br>");
			out.println(s);
			
			
	 		
		%> --%>

	<%-- 		
		<!-- 표현식 : 웹 페이지 출력 -->
		
		<% 
		int num = 20;
		String s = "호랑이";
		%>

		
			
		<%= num %><p/>
		<%= s %><p/> --%>



	<!-- 선언문 :  함수 작성  -->



	<%-- 		
		<%!
		public void m1(javax.servlet.jsp.JspWriter out) {
			try{
				out.print("함수콜");
			}catch(Exception e){
				
			}
			
		}
		
		public int m2() {
			return 1000;
		}
		
		%>
		 
		 
		<% 
			m1(out);
		%>
		<%= m2() %>
 --%>

	<!-- 주석문  -->
	<%-- --%>

</body>
</html>