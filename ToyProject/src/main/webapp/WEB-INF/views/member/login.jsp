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

</style>
</head>
<body>

	<!-- template.jsp > login.jsp -->
	<main>
		<%@ include file="/WEB-INF/views/inc/header.jsp" %>	
		<section>
			<h2>Login</h2>
			
			<form action="/toy/member/loginok.do" method="POST">
				<table class="table table-bordered vertical">
					<tr>
						<th>아이디</th>
						<td><input type="text" name="id" class="form-control short" required /></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="pw" class="form-control short" required /></td>
					</tr>
				</table>
				
				<div class="btns">
					<input type="button" value="돌아가기" class="btn btn-secondary" onclick="history.back();" />
					<input type="submit" value="로그인하기" class="btn btn-primary" />
				</div>
			</form>
			<hr />
			<div style="display: flex;">
			<form action="/toy/member/loginok.do" method="POST">
				<input type="hidden" name="id" value="admin" />
				<input type="hidden" name="pw" value="1111" />
				<input type="submit" class="btn btn-success" value="관리자(admin)" />
			</form>
			&nbsp;
			<form action="/toy/member/loginok.do" method="POST">
				<input type="hidden" name="id" value="hong" />
				<input type="hidden" name="pw" value="1111" />
				<input type="submit" class="btn btn-success" value="홍길동(hong)" />
			</form>
			&nbsp;
			<form action="/toy/member/loginok.do" method="POST">
				<input type="hidden" name="id" value="jooye" />
				<input type="hidden" name="pw" value="1234" />
				<input type="submit" class="btn btn-success" value="서주예(jooye)" />
			</form>
			&nbsp;
			<form action="/toy/member/loginok.do" method="POST">
				<input type="hidden" name="id" value="hello" />
				<input type="hidden" name="pw" value="1234" />
				<input type="submit" class="btn btn-success" value="아무개(hello)" />
			</form>
			</div>
		</section>
	</main>
	<script>
	
	</script>
</body>
</html>