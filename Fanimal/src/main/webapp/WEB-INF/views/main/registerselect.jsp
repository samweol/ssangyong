<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.select {
		width: 200px;
		height: 200px;
		background-color: orange;
		border-radius: 50%;
		display: flex;
		justify-content: center;
		align-items: center;
		margin: 10px;
	}
	
	a {
		color: black;
		text-decoration: none;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<main>
		<div style="display: flex; justify-content: center;">
			<a href="/fanimal/main/userregister.do"><div class="select">개인</div></a>
			<a href="/fanimal/main/companyregister.do"><div class="select">기업</div></a>
		</div>
	</main>
</body>
</html>