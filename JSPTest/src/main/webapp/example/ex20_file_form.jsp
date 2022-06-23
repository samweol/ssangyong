<%@page import="java.util.Comparator"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	//디렉토리 탐색
	
	String path = application.getRealPath("/example/images");
	
	File dir = new File(path);
	
	File[] list = dir.listFiles();
	
	//System.out.println(Arrays.toString(list));
	//System.out.println(list[0].getName());
	//System.out.println(list[0].lastModified());
	
	//Calendar temp = Calendar.getInstance();
	//temp.setTimeInMillis(list[0].lastModified());
	//System.out.println(list[0].getName());
	//System.out.printf("%tF %tT\n" , temp, temp);
	
	//1. png
	//2022-06-23 11:12:25
	
	/* Arrays.sort(list, (a, b) -> {
		return Long.compare(a.lastModified(), b.lastModified());
	}); */
	
	Arrays.sort(list, new Comparator<File>() {
		public int compare(File a, File b) {
			return Long.compare(a.lastModified(), b.lastModified()); 
		}
	});
	
	/*
	[C:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\images\catty01.png, 
	 C:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\images\rect_icon01.png, 
	 C:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\images\rect_icon03.png, 
	 C:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\images\rect_icon09.png, 
	 C:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\images\rect_icon18.png]
	*/
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/example/inc/asset.jsp" %>
<style>
	#list {
		width: 800px;
		margin-top: 20px;
		margin-bottom: 30px;
	}
	
	#list > div {
		float: left;
		border: 1px solid #999;
		margin: 15px;
		width: 126px;
		height: 126px;
		background-size: contain;
		background-repeat: no-repeat;
		background-position: center center;
	}
	
	#list::after {
		content: '';
		display: block;
		clear: both;
	}
	
	/* #list > div > img {
		width: 126px;
		height: 126px;
	} */
</style>
</head>
<body>

	<!-- ex20_file_form.jsp -->
	<div class="container">
		<h1>Image Gallery</h1>
		
		<div id="list">
			<% for(File img :list) { %>
			<%-- <div><img src="images/<%= img.getName() %>"/></div> --%>
			<div style="background-image:url(images/<%= img.getName() %>);"></div>
			<%} %>	
		</div>
		
		<form method="POST" action="ex20_file_ok.jsp" enctype="multipart/form-data">
			<table class="table">
				<tr>
					<th>이미지</th>
					<td><input type="file" name="attach" required/></td>
				</tr>
			</table>
			
			<div>
				<input type="submit" value="이미지 업로드" class="btn btn-success"/>
			</div>
		</form>
		
	</div>
	
	<script>
	
	</script>
</body>
</html>