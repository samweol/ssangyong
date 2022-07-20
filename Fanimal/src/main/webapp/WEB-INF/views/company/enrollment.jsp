<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>
<link rel="stylesheet" href="/fanimal/asset/css/company_style.css">
<style>
	#main {
		width: 940px;
		margin: 0 auto;
	}
	#main h1 {
		border-bottom: 7px double #999;
		margin-top: 30px;
		padding-bottom: 20px;
      	align-content: center;
		text-align: center;
	}
   #list1 {
      width: 940px;
      font-size: 17px;
      border-spacing: 15px;
   }
   #list1 .cell1 {
      text-align: center;
      border-radius: 10px;
      border: 1px solid #444;
      padding: 5px;
   }
   #list1 .cell2 {
      text-align: center;
   }
   #list1 .cell3 {
      padding-left: 20px;
   }
   #list1 .cell4 {
      padding-left: 20px;
      width: 120px;
   }
   #list1 .cell5 {
      width: 120px;
      padding-right: 20px;
   }
   #list1 .cell6 {
      padding-left: 10px;
   }
   #list .checkbox {
   	width: 500px;
   }
   .btn {
   margin-top: 10px;
   position: right;
   float: right;
   
   }
   #list .text {
   	resize: none;
   	width: 400px;
   	height: 800px;
   }
</style>
</head>
<body>

	<main>
	<%@ include file ="/WEB-INF/views/inc/companyheader.jsp"%>
<div id="main">
	
	<h1>기업 등록 신청</h1>
   <table id="list1">
      <tbody>
         <tr>
            <td class="cell1">기업명</td>
            <td class="cell3" colspan="3"><input type="text" name="hosname" required></td>

         </tr>
         <tr>
            <td class="cell1">인허가번호</td>
            <td class="cell3" colspan="3"><input type="text" name="license" required></td>
         </tr>
         <tr>
            <td class="cell1">운영시간</td>
            <td class="cell4"><input type="text" name="starttime" required></td>
            <td class="cell6">~</td>
            <td class="cell5"><input type="text" name="endtime" required></td>
            <td class="cell1">휴게시간</td>
            <td class="cell2">9:00 ~ 16:00</td>
         </tr>
         <tr>
               <td class="cell1">요일</td>
               <td>
                  <input type="checkbox" name="open" value="1">월
                  <input type="checkbox" name="open" value="2">화
                  <input type="checkbox" name="open" value="3">수
                  <input type="checkbox" name="open" value="4">목
                  <input type="checkbox" name="open" value="5">금
                  <input type="checkbox" name="open" value="6">토
                  <input type="checkbox" name="open" value="7">일
               </td>
               <td class="cell7">/</td>
               <td>
                  <input type="checkbox" name="open" value="8">평일
                  <input type="checkbox" name="open" value="9">주말
               </td>
            </tr>
            <tr>
            	<td class="cell1">소 개</td>
            	<td><textarea name="content" class="text" required></textarea></td>
            </tr>
            
      </tbody>
      
   </table>
   <button type="button" class="btn btn-success" onclick="location.href='/care/company/mypage/hospitalinfoview.do'">등록하기</button>
   </div>
   
	</main>
	<script>
		
	</script>

</body>
</html>





