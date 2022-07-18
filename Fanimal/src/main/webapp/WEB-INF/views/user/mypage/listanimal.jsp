<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file = "/WEB-INF/views/inc/asset.jsp"%>
<link rel="stylesheet" href="/fanimal/asset/css/user/listanimal.css">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
	<main>
		<%@ include file ="/WEB-INF/views/inc/userheader.jsp"%>
		<section>
            <div id="content">					
				
				<a href=""> <!-- 클릭 시 링크 설정 -->
				<div class="card">				
					<!-- 카드 헤더 -->
					<div class="card-header" >
						<div class = "card-header-is_closed" > 
			                <!-- <div class = "card-header-text" > </div > 
			                <div class = "card-header-number" > </div >  -->
			            </div >
					</div>
			
					<!--  카드 바디 -->
					<div class="card-body">
			
						<!--  카드 바디 헤더 -->
						<div class="card-body-header">
							<h1><i class="fa-solid fa-paw"></i> 복돌이</h1>
							<p class="card-body-hashtag">말티즈 / 수컷 / 3살</p>
							<hr style="border-color: #EF5A31; margin: 5px 0px;">
							 <p class = "card-body-nickname">견주: 홍길동</p>
						</div>
						<!-- <p class="card-body-description">
							안녕하세요!
							4월 15일 순천만 동행구합니다!
						</p> -->
						<!--  카드 바디 본문 -->
			
						<!--  카드 바디 푸터 -->
						<!-- <div class="card-body-footer">
							<hr style="margin-bottom: 8px; opacity: 0.5; border-color: #EF5A31">
							<i class="icon icon-view_count"></i>조회 38회
							<i class="icon icon-comments_count"></i>댓글 4개
							<i class="reg_date"> 2018/04/12 </i>
						</div>	 -->			
					</div>				
				</div>
				</a>
				
				<!-- 2 -->
				<a href=""> <!-- 클릭 시 링크 설정 -->
				<div class="card">				
					<!-- 카드 헤더 -->
					<div class="card-header" >
						<div class = "card-header-is_closed" > 
			                <!-- <div class = "card-header-text" > </div > 
			                <div class = "card-header-number" > </div >  -->
			            </div >
					</div>
			
					<!--  카드 바디 -->
					<div class="card-body">
			
						<!--  카드 바디 헤더 -->
						<div class="card-body-header">
							<h1><i class="fa-solid fa-paw"></i> 복돌이</h1>
							<p class="card-body-hashtag">말티즈 / 수컷 / 3살</p>
							<hr style="border-color: #EF5A31; margin: 5px 0px;">
							 <p class = "card-body-nickname">견주: 홍길동</p>
						</div>									
					</div>				
				</div>
				</a>
				
				<!-- 3 -->				
				<a href=""> <!-- 클릭 시 링크 설정 -->
				<div class="card">				
					<!-- 카드 헤더 -->
					<div class="card-header" >
						<div class = "card-header-is_closed" > 
			                <!-- <div class = "card-header-text" > </div > 
			                <div class = "card-header-number" > </div >  -->
			            </div >
					</div>
			
					<!--  카드 바디 -->
					<div class="card-body">
			
						<!--  카드 바디 헤더 -->
						<div class="card-body-header">
							<h1><i class="fa-solid fa-paw"></i> 복돌이</h1>
							<p class="card-body-hashtag">말티즈 / 수컷 / 3살</p>
							<hr style="border-color: #EF5A31; margin: 5px 0px;">
							 <p class = "card-body-nickname">견주: 홍길동</p>
						</div>									
					</div>				
				</div>
				</a>
				
				
				
				
				<!-- 반려동물 추가 -->
				<a href="/fanimal/user/mypage/addanimal.do"> <!-- 클릭 시 링크 설정 -->
				<div class="card">				
					<!-- 카드 헤더 -->
					<div class="add-card-header">
					<i class="fa-solid fa-plus" id="plus"></i>
						<div class = "card-header-is_closed" > 
			                <!-- <div class = "card-header-text" > </div > 
			                <div class = "card-header-number" > </div >  -->
							
			            </div >
					</div>
			
					<!--  카드 바디 -->
					<div class="card-body">
			
						<!--  카드 바디 헤더 -->
						<div class="card-body-header">
						
						</div>							
					</div>				
				</div>
				</a>			


            </div>
        </section>
       <footer>

       </footer>
    </main>    
</body>
</html>