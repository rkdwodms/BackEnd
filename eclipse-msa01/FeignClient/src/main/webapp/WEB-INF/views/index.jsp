<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="t1"> 링크1 </a><br/>


<!--  rest template방식 http 요청 -->
<a href="app/1000"> rest template 방식</a> <br/>
<!-- 1000이라는 인수전달까지 한다. 받아서 사용하세숑! -->

<!-- feign 방식   -->
<a href="app2/8888"> feign 방식 </a> <br/>

<a href="http://http://localhost:8761/app/1234"> Zull 방식 1 </a> <br/>
<a href="http://http://localhost:8761/bpp/5678"> Zull 방식 2 </a>

</body>
</html>