<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과</h1>
	<div>result: ${result }</div>
	
	<hr>
	
	<div>price : ${price }</div>
	
	<hr>
	
	<div>dto : ${dto }</div>
	
	<hr>
	<c:forEach items="${nlist }" var="item" >
		<div>
			${item }
		</div>
	</c:forEach>
	
	<hr>
	<c:forEach items="${list }" var="ldto" >
		<div>
			${ldto.seq }, ${ldto.item }, ${ldto.price }, ${ldto.regdate }
		</div>
	</c:forEach>
</body>
</html>