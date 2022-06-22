<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="inc/asset.jsp" %>
</head>
<body>
	<!-- ex12_request.jsp -->
	
	<!-- /JSPTest/example/ex12_request.jsp -->
	<p>요청 URL : <%= request.getRequestURI() %></p>
	<!-- localhost -->
	<p>요청 서버 도메인 : <%= request.getServerName() %></p>
	
	
	<!-- null -->
	<!-- ex12_request.jsp?name=홍길동&age=22 -->
	<p>요청 쿼리 문자열 : <%= request.getQueryString() %></p>
	<!-- 0:0:0:0:0:0:0:1 -->
	<p>클라이언트 주소 : <%= request.getRemoteAddr() %></p>
	<!-- GET -->
	<p>요청 방식 : <%= request.getMethod() %></p>
	<!-- /JSPTest -->
	<p>컨텍스트 경로 : <%= request.getContextPath() %></p>
	<!-- localhost:8090 -->
	<p><%= request.getHeader("host") %></p>
	
	<% 
		//request.getHeader("헤더명")
		
		Enumeration<String> e = request.getHeaderNames();
	
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			System.out.println(name);
		}
	%>
	
</body>
</html>