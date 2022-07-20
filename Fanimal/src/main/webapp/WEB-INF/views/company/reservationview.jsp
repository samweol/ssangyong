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
      body,
      div,
      h1,
      th,
      td {
         color: #444;
      }

      #main {
         width: 940px;
         margin: 0 auto;
      }

      #main h1 {
         border-bottom: 6px double rgb(80, 78, 78);
         margin-top: 30px;
         align-content: center;
         text-align: left;
         padding-left: 30px;
      }


      #imback {
         padding-left: 35px;
      }
      
      #imback .image {
         position: relative;
         width: 140px;
         height: 140px;
         border-radius: 50%;
         overflow: hidden;
      }

      #imback .image>img {
         position: absolute;
         top: 0;
         left: 0;
         width: 100%;
         height: 100%;
         object-fit: cover;
      }


      #imback .cell1 {
         font-size: 17px;
         width: 150px;
         text-align: center;
         font-weight: bold;
         padding-top: 15px;
         padding-bottom: 15px;

      }

      #imback .cell2 {
         border: 1px solid #ccc;
         /* background-color: rgb(184, 233, 235); */
         font-size: 17px;
         width: 100px;
         height: 30px;
         text-align: center;
         font-weight: bold;
         position: relative;
         top: 45px;
         border-radius: 15%;
      }

      #list1 {
         border-spacing: 10px;
         padding-left: 20px;
         float: left;
      }

      #list1 td {
         padding: 5px;
         font-size: 16px;
      }


      #list1 .cell1 {
         /* background-color: rgb(184, 233, 235); */
         width: 150px;
         height: 30px;
         border-radius: 10px;
         text-align: center;
         font-weight: bold;
      }

      #list3 {
         position: relative;
         top: 30px;
      }
	
	
      
   </style>
</head>
<body>
<main>
<%@ include file ="/WEB-INF/views/inc/companyheader.jsp"%>
<section id="main">

      <h1>예약내역 확인</h1>
      <form method="GET" action="/fanimal/company/reservationlist.do">
      <table id="imback">
            <tr class="col1">
               <td class="image">
                  <img src="/asset/css/images/pic.png">
               </td>
               <td class="cell1">${dto.name} 님</td>
               <td class="cell2">${dto.visit}</td>
            </tr>
      </table>
      <table id="list1">
            <tr class="col1">
               <td class="cell1">보호자</td>
               <td class="cell1">${dto.username}</td>
               <td class="cell1">연락처</td>
               <td class="cell1">${dto.tel}</td>
               <td class="cell1">방문목적</td>
               <td class="cell1">${dto.purpose}</td>
               <td class="cell1">방문일자</td>
               <td class="cell1">${dto.resdate}</td>
               <td class="cell1">특이사항</td>
               <td class="cell1">${dto.uniqueness}</td>
              </tr>
      </table>
      </form>
   </section>
   <table id="list3">
         <tr>
            <td>
            <input type="button" value="돌아가기" class="btn btn-secondary" onclick="location.href='/fanimal/company/reservationlist.do'">
              <input type="button" value="진단결과 작성하기" class="btn btn-success" onclick="location.href='/fanimal/company/prescription.do?seq=${dto.seq}'">
            </td>
         </tr>
   </table>
  </main>
	<script>
		
	</script>

</body>
</html>





