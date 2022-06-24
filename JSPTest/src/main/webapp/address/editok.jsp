<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.test.jsp.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	//1. 인코딩 처리
	//2. 데이터 가져오기
	//3. DB 작업
	//	3.1 DB 연결
	//	3.2 SQL
	//	3.3 종료
	//4. 마무리
	
	//1.
	request.setCharacterEncoding("UTF-8");

	//2.
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	
	String seq = request.getParameter("seq");
	
	//3. 
	int result = 0;
	try {
		DBUtil util = new DBUtil();
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		conn = util.open();
		
		//System.out.println(conn.isClosed()); //false
		
		String sql = "update tblAddress set  name = ?, age = ?, address = ?, gender = ?, tel = ? where seq = ?";
		
		pstat = conn.prepareStatement(sql);
		
		pstat.setString(1, name);
		pstat.setString(2, age);
		pstat.setString(3, address);
		pstat.setString(4, gender);
		pstat.setString(5, tel);
		pstat.setString(6, seq);
		
		//4.
		result = pstat.executeUpdate();
		
		if(result > 0) {
			//추가 성공
		} else {
			//추가 실패
		}
		
	} catch (Exception e){
		System.out.println(e);
	}
	
	
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록</title>
<%@ include file="/address/inc/asset.jsp" %>
<style>
	<%@ include file="css/address.css" %>
</style>
</head>
<body>

	<!-- template.jsp > addok.jsp > editok.jsp -->
	<main>
		<header>
			<%@ include file="inc/header.jsp" %>
		</header>
		
		<section>
			<div class="section content">
			</div>
		</section>
	</main>
	
	<script>
		<%-- <% if (result >0) { %>
		
			alert('추가 성공!!');
			location.href='list.jsp';
		
		<%} else {%>
			
			alert('추가 실패!!');
			history.back();
		
		<%}%> --%>
		
		<% if (result >0) { %>
		
		location.href='list.jsp';
	
	<%} else {%>
		
		alert('수정 실패!!');
		history.back();
	
	<%}%>
	</script>
</body>
</html>