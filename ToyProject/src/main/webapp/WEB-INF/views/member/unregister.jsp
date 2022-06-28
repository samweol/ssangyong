<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Toy Project</title>

<%@ include file="/WEB-INF/views/inc/asset.jsp" %>

<style>
	.btn {
		margin-top: 20px;
	}
</style>
</head>
<body>

	<!-- template.jsp -->
	<main>
		<%@ include file="/WEB-INF/views/inc/header.jsp" %>	
		<section>
			<h2>Unregister</h2>
			<div>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam soluta quidem vel est unde ipsum facere quo iusto libero mollitia expedita esse sit optio ipsa in voluptates hic blanditiis veritatis!</div>
			
			<input type="button" value="돌아가기" class="btn btn-secondary"
					onclick="location.href='/toy/index.do';">
				<input type="submit" value="탈퇴하기" class="btn btn-primary" onclick="location.href='/toy/member/unregisterok.do';">
		</section>
	</main>
	<script>
	
	</script>
</body>
</html>