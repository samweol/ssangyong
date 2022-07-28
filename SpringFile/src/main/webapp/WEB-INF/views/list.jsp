<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/spring/resources/css/bootstrap.css">
<script src="/spring/resources/js/jquery-1.12.4.js"></script>
<style>
	main {
		width: 800px;
		margin: 0 auto;
	}
</style>
</head>
<body>
	<main>
		<h1>List</h1>
		
		<table class="table table-bordered">
			<tr>
				<td>5</td>
				<td>제목입니다.</td>
				<td>
					<ul>
						<li>첨부파일</li>
						<li>첨부파일</li>
						<li>첨부파일</li>
					</ul>
				</td>
			</tr>
		</table>
		
		<div>
			<input type="button" value="쓰기" class="btn btn-primary" onclick="location.href='/spring/write';">
		</div>
	</main>
	
	<script>
	
	</script>
</body>
</html>