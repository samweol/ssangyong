<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>prescription</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>
<link rel="stylesheet" href="/fanimal/asset/css/company_style.css">
   <style>
   #tablebox {
		width: 940px;
		margin: 0 auto;
	}
   #tablebox h1 {
		border-bottom: 7px double #999;
		margin-top: 30px;
      align-content: center;
		text-align: center;
	}
   #required {
      /* border: 1px solid #444; */
      width: 940px;
      font-size: 17px;
      border-spacing: 15px;
      padding: 30px;
   }

   #list .cell {

      text-align: center;
      padding: 5px;
   }
   #content {
   	background-color: white;

   }
   </style>
</head>
<body>

	<main>
		<%@ include file ="/WEB-INF/views/inc/companyheader.jsp"%>
		<section>
	            <div id="content">
	               
	               	<div id="tablebox">
	               	<form method="POST" action="/fanimal/company/prescription.do">       		               	
	                <table class="table animal" id="required">
	                	
	                	<tr>
	                		<td colspan="2"><h2>반려동물 정보</h2></td>
	                	</tr>
	                	
	                	
	                	<tr>
	                		<td>성분</td>
	                		<td>
	                			<select name="type" id="type" class="form-control" onclick="del()" onchange="animalChange(this)" required>
	                				<option value="" disabled selected>===선택===</option>
	                				<c:forEach items="${typelist}" var="tdto">	                				
	                				<option value="${tdto.tseq}">${tdto.type}</option>
	                				</c:forEach>
	                			</select>
	                		</td>
	                	</tr>
	                	<tr>
	                		<td>복용약</td>
	                		<td>${dto.username}</td>
	                		<!-- <td>
	                			<select name="kind" id="kind" class="form-control" required>
	                				<option value="" disabled selected>====선택====</option>	                				
	                			</select>
	                		</td> -->
	                	</tr>
	                	<tr>
	                		<td>용법</td>
	                		<td><input type="text" name="name" id="name" class="form-control" size="10" required></td>
	                	</tr>
	                	<tr>
	                		<td>복용 주기</td>
	                		<td><input type="text" name="name" id="name" class="form-control" size="10" required></td>
	                	</tr>
	                	<tr>
	                		<td>처방 일수</td>
	                		<td><input type="text" name="name" id="name" class="form-control" size="10" required></td>
	                	</tr>
	                	<tr>
	                		<td>설명</td>
	                		<td><input type="text" name="name" id="name" class="form-control" size="10" required></td>
	                	</tr>
	                </table>
	                <div id="subbtn"><button type="submit" class="btn btn-warning">추가하기</button></div>
	                </form>
	                </div>	                	                    
	            </div>
	        </section>
	        <footer>
	
	        </footer>
        </main>
	<script>
	let no = 2;	

	$('#btnfile').click(function() {
		
		let temp = String.format('<div><input type="file" name="attach{0}"><span onclick="del();">&times;</span></div>', no);
		
		$('#filelist').append(temp);
		
		no++;
		
	});

	function del() {
		//alert(this);
		//alert(event.target);
		
		$(event.target).parent().remove();
		$('#image_container').children().remove();
		
		let temp = String.format('<div id="picbox"><input type="file" name="attach" onchange="viewimg(event);"><span onclick="del();">&times;</span></div>');
		
		$('#filelist').append(temp);
		
	}



	function del() {
		//alert("hi");
		$('#kind').empty();
		
	}


	function animalChange(e) {
		$.ajax({
			type: 'GET',
			url: '/fanimal/ajax/anikind.do',
			data: 'tseq=' + $(event.target).val(),
			dataType: 'json',
			success: function(result) {	
						
				$('#kind').append('<option value="" disabled selected>====선택====</option>');
				
				$(result).each(function(index, item) {
					
					$('#kind').append('<option value="' + item.kseq + '">' + item.kind + '</option>')
								
					
				});
									
			},
			error: function(a,b,c) {
				console.log(a,b,c);
			}
		});
		
		
	}

	</script>

</body>
</html>







