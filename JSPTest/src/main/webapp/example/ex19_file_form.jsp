<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/example/inc/asset.jsp" %>

<style>
	td > div , div > div {
		margin-bottom: 10px;
	}
	
	div > div input, div > div span {
		float : left;
	}
	
	div > div::after {
		content: '';
		display: block;
		clear: both;
	}
	
	div > div span {
		cursor: pointer;
		font-size: 1em;
	}
</style>
</head>
<body>

	<!-- ex19_file_form.jsp -->
	<div class="container">
		<h1>다중 파일 업로드</h1>
		
		<form action="ex19_file_ok.jsp" method="POST" enctype="multipart/form-data">
			<table class="table">
				<tr>
					<th>문자열</th>
					<td><input type="text" name="txt" value="홍길동"/></td>
				</tr>
				<tr>
					<th>숫자</th>
					<td><input type="number" name="num" value="100"/></td>
				</tr>
				<tr>
					<th>파일</th>
					<td>
					<div id="filelist">
					<div><input type="file" name="attach1" /></div>
					</div>
					<hr />
					<input type="button" value="첨부 파일 추가하기" class="btn btn-secondary" id="btnfile"/>
					</td>
				</tr>
			</table>
			
			<div>
				<input type="submit" value="등록하기" class="btn btn-primary"/>
			</div>
		</form>
	</div>
	
	<script>
	<%@ include file="/example/js/string.js" %>
		let no = 2;
		$('#btnfile').click(function() {
			//let temp = '<div><input type="file" name="attach' + no + '" /></div>';
			let temp = String.format('<div><input type="file" name="attach{0}" /><span onclick="del();">&times;</span></div>', no);
			
			
			$('#filelist').append(temp);
			
			no++;
		});
		
		function del() {
			//alert(this); //object window
			//alert(event.target); //[object HTMLSpanElement]
			
			$(event.target).parent().remove();
		}
	</script>
</body>
</html>