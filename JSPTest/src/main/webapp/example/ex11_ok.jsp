<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	request.setCharacterEncoding("UTF-8");

	//너비
	int width = Integer.parseInt(request.getParameter("width"));
	//높이
	int height = Integer.parseInt(request.getParameter("height"));
	//텍스트
	String txt = request.getParameter("txt");
	//배경색
	String bgcolor = request.getParameter("bgcolor");
	//글자색
	String color = request.getParameter("color");
	//글자 크기
	int fontsize = Integer.parseInt(request.getParameter("fontsize"));
	//버튼 개수
	int count = Integer.parseInt(request.getParameter("count"));
	//버튼 간격
	int rl = Integer.parseInt(request.getParameter("rl"));
	int tb = Integer.parseInt(request.getParameter("tb"));
	//아이콘
	String icon = request.getParameter("icon");
	//테두리
	int thickness = Integer.parseInt(request.getParameter("thickness"));
	String bordercolor = request.getParameter("bordercolor");
	String style = request.getParameter("style");
	int radius = Integer.parseInt(request.getParameter("radius"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.btn {
		background-color: <%= bgcolor %>;
		color: <%= color %>;
		width: <%= width %>px;
		height: <%= height %>px;
		font-size: <%= fontsize %>px;
		margin: <%= tb %>px <%= rl %>px;
		border: <%= thickness %>px <%=style %> <%= bordercolor %>;
		border-radius: <%= radius %>px;
	}
</style>
</head>
<body>
	<!-- ex11_ok.jsp -->
	<h1>결과</h1>
	<table border width="600">
		<tr>
			<th>버튼</th>
		</tr>
		<tr>
			<td>
				<% for(int i=0; i<count; i++) { %>
					<input type="button" class="btn" value="<%= icon %><%=txt %>"/>
				<% } %>
			</td>
		</tr>
	</table>
	
	<script>
	</script>
</body>
</html>