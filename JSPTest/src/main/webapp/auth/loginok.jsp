<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.test.jsp.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	//1. 데이터 가져오기
	//2. DB 작업 > select
	//3.1 있으면 인증 티켓 발급
	//3.2 없으면 X
	//4. 피드백
	
	//1.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//2.
	//DBUtil util = new DBUtil();
	
	Connection conn = null;
	PreparedStatement stat = null;
	ResultSet rs = null;
	
	conn = DBUtil.open();
	
	//로그인 처리 SQL
	String sql = "select * from tblUser where id = ? and pw = ?";
	
	stat = conn.prepareStatement(sql);
	
	//변수 설정
	stat.setString(1, id);
	stat.setString(2, pw);
	
	rs = stat.executeQuery(); //실행
	
	String name = "";
	String lv = "";
	
	//접속만 해도 session이 생기는데 로그인을 성공했을 경우 session에 값을 정해준다.
	if(rs.next()) {
		//로그인 성공
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("lv"));
		
		//인증 티켓 발급 > 세션 > 로그인
		session.setAttribute("auth", id); //인증티켓(=아이디)
		
		//계정정보
		session.setAttribute("name", rs.getString("name"));
		session.setAttribute("lv", rs.getString("lv"));
	} else {
		//로그인 실패
	}
	
	rs.close();
	stat.close();
	conn.close();
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

	<!-- loginok.jsp -->
	<div class="container">
		<h1>로그인</h1>
	</div>
	
	<script>
		<% if(session.getAttribute("auth") != null) { %>
		location.href='index.jsp';
		<% } %>
		
		<% if(session.getAttribute("auth") == null) { %>
		alert('인증 실패');
		history.back(); //login.jsp
		<% } %>
	</script>
</body>
</html>