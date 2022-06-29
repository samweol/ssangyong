<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Toy Project</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>

<style>
.table.horizontal th:nth-child(1) {width: 50px;}
.table.horizontal th:nth-child(2) {width: auto;}
.table.horizontal th:nth-child(3) {width: 70px;}
.table.horizontal th:nth-child(4) {width: 120px;}
.table.horizontal th:nth-child(5) {width: 50px;}

.table.horizontal td:nth-child(2) {
	text-align: left;
}

.table.horizontal td {
	text-align: center;
}

.table.horizontal th {
	text-align: center;
}

.search {
	margin: 15px auto;
}

.search td > * {
	width: auto;
	margin: 0px 5px;
}
</style>
</head>
<body>

	<!-- template.jsp -->
	<main>
		<%@ include file="/WEB-INF/views/inc/header.jsp" %>	
		<section>
			<h2>Board</h2>
			
			<c:if test="${map.isSearch == 'y'}">
			<div style="text-align:center; margin-bottom: 10px; color: coral;">
				'${map.word}'으로 검색한 결과 총 ${list.size()}개의 게시물이 발견되었습니다.
			</div>
			</c:if>
			
			<table class="table table-bordered horizontal">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>이름</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
				<c:forEach items= "${list}" var="dto">
				<tr>
					<td>${dto.seq}</td>
					<td>
						<a href="/toy/board/view.do?seq=${dto.seq}&isSearch=${map.isSearch}&column=${map.column}&word=${map.word}">${dto.subject}</a>
					</td>
					<td>${dto.name}</td>
					<td>${dto.regdate}</td>
					<td>${dto.readcount}</td>
				</tr>
				</c:forEach>
				<c:if test="${list.size() == 0 }">
				<tr>
					<td colspan="5">게시물이 없습니다.</td>
				</tr>
				</c:if>
			</table>
			<div>
				<form action="/toy/board/list.do" method="GET">
					<table class="search">
						<tr>
							<td>
								<select name="column" class="form-control">
									<option value="subject">제목</option>
									<option value="content">내용</option>
									<option value="name">이름</option>
								</select>
							</td>
							<td>
								<input type="text" name="word" class="form-control" required />
							</td>
							<td>
								<button class="btn btn-primary">검색하기</button>
								<c:if test="${map.isSearch == 'y'}">
								<button class="btn btn-secondary" type="button" onclick="location.href='/toy/board/list.do';">검색중단하기</button>
								</c:if>
							</td>
						</tr>
					</table>
				</form>
			</div>
			
			<c:if test="${not empty auth }">
			<div class="btns">
				<input type="button" value="글쓰기" class="btn btn-primary" onclick="location.href='/toy/board/add.do';" />
			</div>
			</c:if>
		</section>
	</main>
	<script>
		//검색중
		<c:if test="${map.isSearch == 'y'}">
		$('select[name=column]').val('${map.column}');
		$('input[name=word]').val('${map.word}');
		</c:if>
	</script>
</body>
</html>