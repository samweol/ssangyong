<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>
<style>
	#main {
		width: 940px;
		margin: 0 auto;
	}
	#main h1 {
		border-bottom: 7px double #999;
		margin-top: 30px;
        align-content: center;
		text-align: center;
		padding-bottom: 15px;
	}
   #list1 {
      width: 940px;
      font-size: 17px;
   }
   #list1 .cell1 {
      text-align: center;
      border: 1px solid #444;
      padding: 10px;
   }
   #list1 .cell2 {
      text-align: center;
   }
   #list1 .cell3 {
      padding-left: 20px;
   }
   .btn {
   margin-top: 10px;
   position: right;
   float: right;
   
   }
</style>
</head>
<body>
	<main>
	<%@ include file ="/WEB-INF/views/inc/header.jsp" %>
	<div id="main">
	
		<h1>기업 정보 조회</h1>
   <table id="list1">

         <tr>
            <td class="cell1">기업명</td>
            <td class="cell3">${cdto.hosname}</td>
         </tr>
         <tr>
            <td class="cell1">인허가번호</td>
            <td class="cell3">${cdto.license}</td>
         </tr>
         <tr>
            <td class="cell1">소개</td>
            <td class="cell3">${cdto.info}</td>
         </tr>
         <tr>
            <td class="cell1">운영시간</td>
            <td class="cell2">${cdto.starttime}~${cdto.endtime}</td>
            <td class="cell1">휴게시간</td>
            <td class="cell2">9:00~16:00</td>
         </tr>
         <tr>
            <td class="cell1">승인상태</td>
            <td class="cell3" colspan="3">${cdto.state}</td>
         </tr>
         <tr>
         	<td>대표자 이름</td>
         	<%-- <td>${dto.name}</td> --%>
         </tr>
         <tr>
         	<td>사업자 번호</td>
         	<%-- <td>${dto.business}</td> --%>
         </tr>
         <tr>
         	<td>아이디</td>
         	<%-- <td>${dto.id}</td> --%>
         </tr>
         <tr>
         	<td>이메일</td>
         	<td>${list.get(0).email}</td>
         </tr>
   </table>
   <div id="btn">
   <button type="button" class="btn btn-primary">승인하기</button>
   </div>
   </div>
	</main>
	<script>
		
	</script>

</body>
</html>





