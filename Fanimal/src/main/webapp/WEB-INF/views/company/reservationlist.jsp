<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "/WEB-INF/views/inc/asset.jsp"%>
<link rel="stylesheet" href="/fanimal/asset/css/company_style.css">
<style>
	body {
			margin-bottom: 100px;
		}
		body, div, h1, th, td {
	
			color: #444;
		}
		#main {
			width: 940px;
			margin: 0 auto;
		}
		#main h1 {
			border-bottom: 7px double #999;
			margin-top: 30px;
         	align-content: center;
			text-align: center;
		}

		#list1 {
			border: 1px solid #ccc;
			border-collapse: collapse;
			border-left: 0px;
			border-right: 0px;			
			width: 940px;
		}

		#list1 th, #list1 td {
			border: 1px solid #ccc;
			border-left: 0px;
			border-right: 0px;
			padding: 5px;
			font-size: 14px;
		}

		#list1 .col1 { width: 188px; text-align: center; }
		#list1 .col2 { width: 188px; text-align: center; }
		#list1 .col3 { width: 188px; text-align: center; }
		#list1 .col4 { width: 188px; text-align: center; }
		#list1 .col5 { width: 188px; text-align: center; }

		#list1 td { text-align: center; }
		#list1 th { background-color: #ddd; }

		#list1 tr:hover { background-color: #eee; }
</style>
</head>
<body>

	<main>
	<%@ include file ="/WEB-INF/views/inc/companyheader.jsp"%>
	<section id="main">
		<div id="content">
		<h1>기업 예약내역 조회</h1>
		
		<table id="list1">
			<tr>
				<th class="col1">번호</th>
				<th class="col2">반려동물이름</th>
				<th class="col3">방문목적</th>
				<th class="col4">방문일자</th>
				<th class="col5">방문여부</th>
			</tr>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td class="cell1">${dto.seq}</td>
				<td class="cell2"><a href="/fanimal/company/reservationview.do?seq=${dto.seq}">${dto.name}</a></td>
				<td class="cell3">${dto.purpose}</td>
				<td class="cell4">${dto.resdate}</td>
				<td class="cell5">${dto.visit}</td>
			</tr>
			</c:forEach>
		</table>
		</div>
	</section>
	</main>
	
	<script>
		
	</script>

</body>
</html>





