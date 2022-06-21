<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/jquery-ui.css" />
<script src="js/jquery-1.12.4.js"></script>
<script src="js/jquery-ui.js"></script>
<style>
	table {
		border-collapse: collapse;
	}
	
	table input {
		text-align: right;
	}
	
	table input#txt {
		text-align: left;
	}
</style>
</head>
<body>
	<!-- ex11_form.jsp -->
	<h1>버튼 만들기</h1>
	<form action="ex11_ok.jsp" method="POST">
		<table border width="600">
			<tr>
				<th width="200">너비(px)</th>
				<td width="400"><input type="number" name="width" value="50"/></td>
			</tr>
			<tr>
				<th>높이(px)</th>
				<td><input type="number" name="height" value="40" /></td>
			</tr>
			<tr>
				<th>텍스트</th>
				<td><input type="text" name="txt" value="버튼" id="txt"/></td>
			</tr>
			<tr>
				<th>배경색</th>
				<td><input type="color" name="bgcolor" /></td>
			</tr>
			<tr>
				<th>글자색</th>
				<td><input type="color" name="color" /></td>
			</tr>
			<tr>
				<th>글자 크기(px)</th>
				<td><input type="number" name="fontsize" value="16"/></td>
			</tr>
			<tr>
				<th>버튼 개수(ea)</th>
				<td><input type="number" name="count" value="5"/></td>
			</tr>
			<tr>
				<th>버튼 간격</th>
				<td>
					<div>좌우 간격:</div>
					<input type="range" name="rl" min="0" step="5" value="0"/>
					<div>상하 간격:</div>
					<input type="range" name="tb" min="0" step="5" value="0"/>
				</td>
			</tr>
			<tr>
				<th>아이콘</th>
				<td>
					<label for=""><input type="radio" name="icon" value="" checked/>없음</label>
					<label for=""><input type="radio" name="icon" value="◈" />◈</label>
					<label for=""><input type="radio" name="icon" value="★" />★</label>
					<label for=""><input type="radio" name="icon" value="♠" />♠</label>
					<label for=""><input type="radio" name="icon" value="♣" />♣</label>
					<label for=""><input type="radio" name="icon" value="♥5" />♥</label>
				</td>
			</tr>
			<tr>
				<th>테두리</th>
				<td>
					<select name="border" id="border">
						<option value="see">보이기</option>
						<option value="none">안보이기</option>
					</select>
					
					<div id="option">
						<div>두께(px) : <input type="text" value="3" name="thickness" /></div>
						<div>색상 : <input type="color" name="bordercolor"/></div>
						<div>스타일 : 
							<select name="style">
								<option value="solid">실선</option>
								<option value="dashed">쇄선</option>
								<option value="dotted">점선</option>
							</select>
						</div>
						<div>모서리(px) : <input type="number" value="5" name="radius"/></div>
					</div>
				</td>
			</tr>
		</table>
		
		<br>
		
		<input type="submit" value="만들기" name="btn" />
	</form>
	
	<script>
	
	//테두리가 안보이기이면 밑에 옵션이 보이지 않게 하기
	$('#border').change(function() {
		//alert(this.value);
		
		if(this.value == "none") {
			$('div#option').css("display", "none");
		} else {
			$('div#option').css("display", "block");
		}
	});
	</script>
</body>
</html>