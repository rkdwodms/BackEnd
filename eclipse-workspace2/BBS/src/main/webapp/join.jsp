<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">

<title>JSP 게시판 웹사이트</title>
</head>
<body style="background-color: #00498c; height: 100px; width: 100%;">
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span>
				<!-- 게시판 아이콘 작대기(-) 하나를 의미 -->
				<span class="icon-bar"></span>
				<!-- 게시판 아이콘 작대기(-) 하나를 의미 -->
				<span class="icon-bar"></span>
				<!-- 게시판 아이콘 작대기(-) 하나를 의미 -->
			</button>
			<a class="navbar-brand" href="main.jsp">POSCO ICT</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="main.jsp">HOME</a></li>
				<!-- <li><a href="bbs.jsp">게시판</a></li> -->
			</ul>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="login.jsp">로그인</a></li>
				<li class="active"><a href="join.jsp">회원가입</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">

				<h3 style="text-align: center;">회원가입</h3>
				<form action="checkAction.jsp" method="post">
					<input type="text" class="form-control" placeholder="아이디"
						name="userID" maxlength="20">
					<div class="form-group">
						<input type="submit" id="id_check" class="btn btn-outline-primary"
							value="중복체크" style="float: right">
					</div>
				</form>




				<form action="joinAction.jsp" method="post">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디"
							name="userID" maxlength="20">
					</div>

					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호"
							name="userPassword" maxlength="20">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="이름"
							name="userName" maxlength="20">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="전화번호"
							name="userPhone" maxlength="50">
					</div>
					<div class="form-group">
						<input type="email" class="form-control" placeholder="이메일"
							name="userEmail" maxlength="50">
					</div>
					<input type="submit" class="btn btn-primary form-control"
						value="회원가입">
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>