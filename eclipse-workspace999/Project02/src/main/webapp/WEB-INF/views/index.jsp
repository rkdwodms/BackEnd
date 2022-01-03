<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<div class="d-flex" id="wrapper">
		<!-- Sidebar-->
		<div class="border-end bg-white" id="sidebar-wrapper">
			<div class="sidebar-heading border-bottom bg-light">Start
				Bootstrap</div>

			<!-- Page content wrapper-->
			<div id="page-content-wrapper">

				<!-- Page content-->
				<div class="container-fluid">
					<h1 class="mt-4">프로그래밍 게시판</h1>
					<p>프로그래밍에 관련된 정보를 주고받는 게시판</p>
				</div>
			</div>
			<div class="list-group list-group-flush">
				<a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="register">회원가입</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="user">회원조회</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="select">게시물 조회</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="write">게시물 등록</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="delete">게시물 삭제</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="withdraw">회원탈퇴</a>
			</div>
		</div>

	</div>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="../resources/js/scripts.js"></script>
</body>
</html>