<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyinfolist</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>
<link rel="stylesheet" href="/fanimal/asset/css/company_style.css">
<style>
		body {
			margin-bottom: 100px;
		}
		body, div, h1, th, td {
			color: #444;
		}
		#main {
			/* width: 940px; */
			margin: 0 auto;
		}
		#main h1 {
			border-bottom: 7px double #999;
			padding-top: 30px;
         	align-content: center;
			text-align: center;
			margin: 0;
			padding-bottom: 5px;
			margin-bottom: 5px;
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

		#list1 .col1 { width: 156px; text-align: center; }
		#list1 .col2 { width: 156px; text-align: center; }
		#list1 .col3 { width: 156px; text-align: center; }
		#list1 .col4 { width: 156px; text-align: center; }
		#list1 .col5 { width: 156px; text-align: center; }
		#list1 .col6 { width: 156px; text-align: center; }

		#list1 td { text-align: center; }
		#list1 th { background-color: #ddd; }

		#list1 tr:hover { background-color: #eee; }

	</style>
</head>
<body>
	<main>
	<%@ include file ="/WEB-INF/views/inc/adminheader.jsp"%>
	<section id="main">
		<div class="content">
		<h1>기업 정보 조회</h1>
		<table id="list1" style="margin: 0 auto;">
			<tr>
				<th class="col1">번호</th>
				<th class="col2">아이디</th>
				<th class="col3">사용자이름</th>
				<th class="col4">전화번호</th>
				<th class="col5">주소</th>
				<th class="col6">사업자번호</th>
			</tr>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td class="cell1">${dto.cseq}</td>
				<td class="cell2"><a href="/fanimal/admin/companyinfoview.do?seq=${dto.cseq}">${dto.id}</a></td>
				<td class="cell3">${dto.name}</td>
				<td class="cell4">${dto.tel}</td>
				<td class="cell5">${dto.address}</td>
				<td class="cell6">${dto.business}</td>
			</tr>
			</c:forEach>
		</table>
         </div>
	</section>
	<%@ include file ="/WEB-INF/views/inc/footer.jsp"%>
	</main>
	<script>
		
	</script>

</body>
</html>





