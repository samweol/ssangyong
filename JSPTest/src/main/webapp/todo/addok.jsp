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
	String work = request.getParameter("work");
	String important = request.getParameter("important");
	
	//3. 
	int result = 0;
	try {
		DBUtil util = new DBUtil();
		
		Connection conn = null;
		Statement stat = null;
		PreparedStatement pstat = null;
		
		conn = util.open();
		
		System.out.println(conn.isClosed()); //false
		
		String sql = "insert into tblTodo (seq, todo, regdate, priority, complete) values (seqTodo.nextVal, ?, sysdate, ?, 'n')";
		
		pstat = conn.prepareStatement(sql);
		
		pstat.setString(1, work);
		pstat.setString(2, important);
		
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
</style>
</head>
<body>

	<!-- template.jsp > addok.jsp -->
	<main>
		<header>
		</header>
		
		<section>
			</div>
		</section>
	</main>
	
	<script>
		
		<% if (result >0) { %>
		
		location.href='list.jsp';
	
	<%} else {%>
		
		alert('추가 실패!!');
		history.back();
	
	<%}%>
	</script>
</body>
</html>