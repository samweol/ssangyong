<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	//select .. where id = session.getAttribute("id")
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/auth/inc/asset.jsp" %>
<style>

</style>
</head>
<body>

	<!-- index.jsp -->
	<div class="container">
		<h1>인증, 허가</h1>
		
		<!--  
			- Register, Login, Logout
			- Sing up, Sign in, Sign out
		-->
		<% if(session.getAttribute("auth") == null) { %>
		<fieldset>
			<input type="button" value="로그인" class="btn btn-primary" onclick="location.href='login.jsp';" />
		</fieldset>
		<% } %>
		
		<% if(session.getAttribute("auth") != null) { %>
		<fieldset>
			<input type="button" value="로그아웃" class="btn btn-primary" onclick="location.href='logout.jsp';" />
			
			<hr />
			
			<div>
				<%= session.getAttribute("name") %>(<%= session.getAttribute("auth") %>) 등급<%= session.getAttribute("lv") %>
			</div>
		</fieldset>
		<% } %>
		
		<hr />
		
		<!-- 등급 > 허가(비노출 방식) -->
		<% if(session.getAttribute("auth") != null && Integer.parseInt(session.getAttribute("lv").toString()) <3) { %>
			<a href="member.jsp" class="btn btn-success">회원 전용 페이지</a>
		<% } %>
		
		<hr />
		
		<!-- 노출 방식 -->
		<% if(session.getAttribute("auth") == null || Integer.parseInt(session.getAttribute("lv").toString()) == 3) { %>
			<a href="#!" class="btn btn-success" onclick="alert('회원만 접근이 가능합니다.');">회원 전용 페이지</a>
		<% } else { %>
			<a href="member.jsp" class="btn btn-success">회원 전용 페이지</a>
		<% } %>
		
		<hr />
		
		<!-- 노출 방식 -->
		<% if(session.getAttribute("auth") == null || Integer.parseInt(session.getAttribute("lv").toString()) != 1) { %>
			<a href="#!" class="btn btn-success" onclick="alert('관리자만 접근이 가능합니다.');">관리자 전용 페이지</a>
		<% } else { %>
			<a href="admin.jsp" class="btn btn-success">관리자 전용 페이지</a>
		<% } %>
	</div>
	
	<script>
	
	</script>
</body>
</html>