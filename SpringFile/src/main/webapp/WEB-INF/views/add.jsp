<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파일 업로드</h1>
	<form action="/spring/addok" method="POST" enctype="multipart/form-data">
		<table>
			<tr>
				<th>텍스트</th>
				<td><input type="text" name="data"></td>
			</tr>
			<tr>
				<th>파일</th>
				<td><input type="file" name="attach"></td>
			</tr>
		</table>
		
		<br>
		
		<input type="submit" value="보내기">
	</form>
</body>
</html>