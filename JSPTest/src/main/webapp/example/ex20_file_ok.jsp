<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String path = application.getRealPath("/example/images");

	int size = 1024 * 1024 * 100;
	
	String filename = "";
	//String orgfilename = ""; > 다운로드 받을 때나 필요한 이름
	
	try {
		
		MultipartRequest multi = new MultipartRequest(
				request, 
				path, 
				size,
				"UTF-8",
				new DefaultFileRenamePolicy());
		
		//업로드한 이미지명 > DB 저장
		//filename = multi.getFilesystemName("attach");
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
	response.sendRedirect("ex20_file_form.jsp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/example/inc/asset.jsp" %>
<style>

</style>
</head>
<body>

	<!-- ex20_file_ok.jsp -->
	<div class="container">
	
	</div>
	
	<script>
	
	</script>
</body>
</html>