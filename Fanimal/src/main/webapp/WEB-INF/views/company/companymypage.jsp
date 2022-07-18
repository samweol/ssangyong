<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/fanimal/asset/css/company_style.css">
<script src="/fanimal/asset/js/jquery-1.12.4.js"></script>
<script src="https://kit.fontawesome.com/3ac15bdbeb.js" crossorigin="anonymous"></script>
<style>
        .col {
            width: 150px;
            padding: 5px;
            background-color: #81E5AB;
            border-radius: 10px;
            text-align: center;
            margin-bottom: 10px;
        }

        .content {
            padding: 5px;
            margin-left: 5px;
            width: 250px;
        }
        
        #content {
        	height: 100vh;
        }
</style>
<title>Insert title here</title>
</head>
<body>
	<main>
		<%@ include file ="/WEB-INF/views/inc/companyheader.jsp"%>
		<section>
	            <div id="content">
	            	<div style="display: flex; flex-direction: column; align-items: center;">
			            <div style="display: flex; margin-top: 20px;">
			                <div class="col">대표자이름</div>
			                <div class="content">${dto.name }</div>
			            </div>
			            <div style="display: flex;">
			                <div class="col">사업자번호</div>
			                <div class="content">${dto.business }</div>
			            </div>
			            <div style="display: flex;">
			                <div class="col">아이디</div>
			                <div class="content">${dto.id }</div>
			            </div>
			            <div style="display: flex;">
			                <div class="col">이메일</div>
			                <div class="content" id="txtemail">${dto.email }</div>
			                <div><i class="fa-solid fa-pen" onclick="updateinfo('${auth.id}');" style="cursor: pointer;"></i></div>
			            </div>
        			</div>	            
	            </div>
	        </section>
        </main>
        <script>
        	function updateinfo(id) {
        		const tempStr = $(event.target).parent().prev().text();
        		/* alert(tempStr); */ 
        		$(event.target).parent().parent().after(temp);
        		
        		$(event.target).parent().parent().next().find('input').val(tempStr);
        		$(event.target).parent().parent().next().find('input[name=id]').val(id);
        	}
        	
        	temp =`<div id="editRow" style="display: flex; margin-left: 165px;">
            	<form id="editForm">
        		<input type="text" id="txt" name="email">
        		<input type="hidden" name="id">
        		<button onclick="update();">수정하기</button>
        	</form>
        </div>`;
        	
        	function update() {
        		$.ajax({
        			type: 'POST',
        			url: '/fanimal/company/updatemypage.do',
        			data: $('#editForm').serialize(),
        			dataType: 'json',
        			success: function(result) {
        				if(result.result == '1') {
        					
        					$('#txtemail').text($('#txt').val());
        					$('#editRow').remove();
        					
        				}
        			},
        			error: function(a, b, c) {
        				console.log(a, b, c);
        			}
        		});
        	}
        </script>
</body>
</html>