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
        align-content: center;
		text-align: center;
	}
	#list1 {
      width: 940px;
      font-size: 17px;
      border-spacing: 15px;
      padding: 30px;
      align-content: center;
   }
   #list1 .cell1 {
      text-align: center;
      border-radius: 10px;
      border: 1px solid #444;
   }
   #list1 .cell2 {
      text-align: center;
   }
   #list1 .cell3 {
      padding-left: 20px;
   }

</style>
</head>
<body>
	<main>
	<%@ include file ="/WEB-INF/views/inc/adminheader.jsp"%>
	<div id="main">
	
		<h1>기업 승인 상세보기</h1>
	<table id="list1">
      <tbody>
         <tr>
            <td class="cell1">기업명</td>
            <td class="cell3" colspan="3">홍길동</td>
         </tr>
         <tr>
            <td class="cell1">인허가번호</td>
            <td class="cell3" colspan="3">11164899</td>
         </tr>
         <tr>
            <td class="cell1">소개</td>
            <td class="cell3" colspan="3">ㄹ머디러ㅣ먿럼더러미덜머디럳머리머ㅣ러밎</td>
         </tr>
         <tr>
            <td class="cell1">운영시간</td>
            <td class="cell2"><span>9:00</span>~<span>16:00</span></td>
            <td class="cell1">휴게시간</td>
            <td class="cell2"><span>9:00</span>~<span>16:00</span></td>
         </tr>
         <tr>
            <td class="cell1">승인상태</td>
            <td class="cell3" colspan="3">승인대기</td>
         </tr>
            
      </tbody>
   </table>

    <button id="testBtn" class="btn btn-primary">승인하기</button>
	<div class="modal" id="testModal" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog modal-sm" role="document">
			<div class="modal-content">
				<div class="modal-body">
					<p>[Hospital] 승인하시겠습니까?</p>
				</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button" data-dismiss="modal">뒤로가기</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="location.href='/fanimal/admin/companyapproveview.do'">승인완료</button>
				</div>
			</div>
		</div>
	</div>
	<button id="testBtn1" class="btn btn-secondary">거절하기</button>
	<div class="modal" id="testModal1" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog modal-sm" role="document">
			<div class="modal-content">
				<div class="modal-body">
					<p>[Hospital] 거절하시겠습니까?</p>
				</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button" data-dismiss="modal">뒤로가기</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="location.href='/fanimal/admin/companyapproveview.do'">거절완료</button>
				</div>
			</div>
		</div>
	</div>
	<button type="button" class="btn btn-success" onclick="location.href='/fanimal/admin/companyapprovelist.do'">뒤로가기</button>
	
	</div>
	



	</main>
	
	<script>
	$('#testBtn').click(function(e){
		e.preventDefault();
		$('#testModal').modal("show");
	});
	
	$(document).ready(function(){
	    function alignModal(){
	        var modalDialog = $(this).find(".modal-dialog");
	        
	        // Applying the top margin on modal dialog to align it vertically center
	        modalDialog.css("margin-top", Math.max(0, ($(window).height() - modalDialog.height()) / 2));
	    }
	    // Align modal when it is displayed
	    $(".modal").on("shown.bs.modal", alignModal);
	    
	    // Align modal when user resize the window
	    $(window).on("resize", function(){
	        $(".modal:visible").each(alignModal);
	    });   
	});
	
	$('#testBtn1').click(function(e){
		e.preventDefault();
		$('#testModal1').modal("show");
	});
	

	</script>

</body>
</html>





