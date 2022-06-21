<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex02_page_directive.jsp -->
	
	<h1>페이지 지시자</h1>
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptates dicta harum doloribus voluptas mollitia quisquam laudantium et nisi recusandae eligendi fugit nostrum libero aliquid dolorum laboriosam ex minus dolor animi.</p>
	
	<%
	
		//Random rnd = null;
		//System.out.println(rnd.nextInt()); //NullPointerException
	
	%>
	
	<%@ include file="inc/copyright.jsp" %>
	
</body>
</html>