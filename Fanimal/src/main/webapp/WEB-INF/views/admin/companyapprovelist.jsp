<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>companyapprovelist</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>
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
	<%@ include file ="/WEB-INF/views/inc/header.jsp" %>
	<section id="main">
	
		<h1>기업 정보 조회</h1>
		<table id="list1">
			<tr>
				<th class="col1">번호</th>
				<th class="col2">아이디</th>
				<th class="col3">사용자이름</th>
				<th class="col4">전화번호</th>
				<th class="col5">주소</th>
				<th class="col6">사업자번호</th>
				<th class="col6">승인상태</th>
			</tr>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td class="cell1">${dto.cseq}</td>
				<td class="cell2"><a href="/fanimal/admin/companyapproveview.do?seq=${dto.cseq}">${dto.id}</a></td>
				<td class="cell3">${dto.name}</td>
				<td class="cell4">${dto.tel}</td>
				<td class="cell5">${dto.address}</td>
				<td class="cell6">${dto.business}</td>
				<td class="cell6">${dto.business}</td>
			</tr>
			</c:forEach>
		</table>
         
	</section>
         <div class="text-center">
            <ul class="pagination">
               <li><a href="#">1</a></li>
                 <li><a href="#">2</a></li>
                 <li><a href="#">3</a></li>
                 <li><a href="#">4</a></li>
                 <li><a href="#">5</a></li>
            </ul>
            
            <div class="input-group col-lg-4 col text-center">
                 <input type="text" class="form-control input-sm text-center" placeholder="내용을 입력하세요.">
                 <span class="input-group-btn">
                <button class="btn btn-secondary" type="button">검색</button>
                 </span>
            </div>
	</div>
	</main>
	<script>
		
	</script>

</body>
</html>
