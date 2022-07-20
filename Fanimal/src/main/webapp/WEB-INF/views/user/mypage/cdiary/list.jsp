
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/fanimal/asset/css/list.css">
<link rel="icon" type="image/x-icon" href="/fanimal/pic/dog.ico">
<%@ include file="/WEB-INF/views/inc/asset.jsp"%>
<link rel="stylesheet" href="/fanimal/asset/css/add.css">
<title>Insert title here</title>
</head>
<body>
   


	<main>
		<%@ include file="/WEB-INF/views/inc/userheader.jsp"%>
		<section>
			
			<c:forEach items="${dlist}" var="dto">
			<div class="container">
				<div class="row" style="max-width: 40vw;">
					<div class="col-md-3">
						<img src="/fanimal/pic/${dto.dogpic}" alt="Dog Profile Image"
							class="img-circle" id="dog_profile_img">
					</div>
					
					
					
					<div class="col-md-5">
						<div class="row">
							<div class="col-sm-3">
								<img src="/fanimal/pic/산책2.png" alt="Dog Icon"
									class="img-rounded" id="dog_icon">
							</div>
							
							
							
							<div class="col-sm-3">
								<h4>${dto.name}</h4>
							</div>

							</div>
							<div class="row">
								<div class="col-sm-3">
									<p>성별 : </p>
								</div>
								<div class="col-sm-3">
									<p>${dto.gender}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-3">
									<p>나이 :  </p>
								</div>
	
								<div class="col-sm-3">
									<p>${dto.age}살 </p>
								</div>
	
							</div>
							<div class="row">
								<div class="col-sm-3">
									<p>몸무게 :</p>
								</div>
								<div class="col-sm-3">
									<p>${dto.dogweight} kg</p>
								</div>
							</div>	
					</div>
				</div>
			</div>
			</c:forEach>
			
			
            
		
         <div class="container">
            <ul class="nav nav-tabs nav-justified">
            
         
               <li class="active"><a href="/fanimal/cdiary/list.do">전체보기</a></li>
               <li><a href="/fanimal/cdiary/list.do?type=1">산책일기</a></li>
               <li style="position:relative; left:0; top:0;">
               		<a href="/fanimal/cdiary/list.do?type=2">케어일기</a>
               		<button type="button" class="btn" data-toggle="modal" data-target="#contentListPageModal" style="position:absolute; left: 300px; top: -20px;">일기 쓰기<img src="/fanimal/pic/연필.png" style=" width: 30px; height: 20px;"></button>
               </li>
            </ul>
         </div>
         
	


			<!-- 리스트 출력 -->
			<div class="container">
				<div class="row d-flex w-100">
				
				
					
					
					<!-- 케어일기 -->
					<c:if test="${type == '2'}">
					<c:forEach items="${clist}" var="cdto">
						<span class="col-sm-3 flex-fill"> <a href="#"
							data-toggle="modal" data-target="#contentPageModal"
							id='modalparent'> <!-- 모달로 들어가는 링크 --> <img
								src="/fanimal/files/${cdto.picture}" alt="Dog Profile Image"
								class="rounded gallery" onclick="getDataToAjax(${cdto.cdSeq})">
						</a>
						</span>
					</c:forEach>
					</c:if>
		
										
					<!-- 산책일기 -->	
					<c:if test="${type == '1'}">
					<c:forEach items="${wlist}" var="wdto">
						<span class="col-sm-3 flex-fill">
						 <a href="#" data-toggle="modal"  data-target="#contentPageModal2" id='modalparent2'>   
							<img src="/fanimal/files/${wdto.pic}" alt="Dog Profile Image"
								class="rounded gallery" onclick="getDataToAjax2(${wdto.wseq})">
							</a>
						</span>
					</c:forEach>
					</c:if>
					
					
					
					
					<!-- 전체보기 -->
					<c:if test="${type == null}">
					<c:forEach items="${clist}" var="cdto">
						<span class="col-sm-3 flex-fill"> <a href="#"
							data-toggle="modal" data-target="#contentPageModal"
							id='modalparent'> <!-- 모달로 들어가는 링크 --> <img
								src="/fanimal/files/${cdto.picture}" alt="Dog Profile Image"
								class="rounded gallery" onclick="getDataToAjax(${cdto.cdSeq})">
						</a>
						</span>
					</c:forEach>
					
					
					<c:forEach items="${wlist}" var="wdto">
						<span class="col-sm-3 flex-fill">
						 <a href="#" data-toggle="modal"  data-target="#contentPageModal2" id='modalparent2'>   
							<img src="/fanimal/files/${wdto.pic}" alt="Dog Profile Image"
								class="rounded gallery" onclick="getDataToAjax2(${wdto.wseq})">
							</a>
						</span>
					</c:forEach>
					</c:if>
				</div>
			</div>




			<!-- Modal 1 -->
			<div class="modal fade" id="contentPageModal" tabindex="-1"
				role="dialog" aria-labelledby="contentPageModalLabel"
				aria-hidden="true">
				<div class="modal-dialog modal-lg" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="contentPageModalLabel"></h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="container modal-body">
							<div class="row">
								<div class="col-sm-5">
									<span id="picture"></span> <!-- picture -->
								</div>
								<div class="panel col-sm-4">
									<div class="panel-heading row">
										<div class="col-sm-1">
											<img src="/fanimal/pic/주사기2.png" alt="Dog Icon"
												class="img-rounded" id="dog_icon">
										</div>
										<div class="col-sm-5">
											<h4 id='dogName'></h4>
										</div>
										<div class="">
											<button type="button" class="btn btn-default pull-right">수정하기</button>
										</div>
									</div>
									<div class="panel-body">
										<h4 class="card-title" >처방전</h4>
			         					   </div>
			                                <div class="panel-body" style="padding: 5px;">
			                                    <h3 style="margin: 0px;"></h3>
			                                    <div class="container-fluid">
			                                        <div class="row">
			                                            <div class="col-sm-3 td">약이름</div>
			                                            <div class="col-sm-3 td" id="pname"></div>
			                                            <div class="col-sm-3 td">성분</div>
			                                            <div class="col-sm-3 td"id="component"></div>
			                                        </div>
			                                        <div class="row">
			                                            <div class="col-sm-2 td" style="padding: 0px;">투약 일 수</div>
			                                            <div class="col-sm-2 td" id="pdate"></div>
			                                            <div class="col-sm-2 td">용법</div>
			                                            <div class="col-sm-6 td" id="usage"></div>
			                                           
			                                        </div>
							                            <div class="row">
				                                            <div class="col-sm-2 td">목적</div>
				                                            <div class="col-sm-2 td" id="purpose"></div>
				                                        </div>
			                                        <div class="row">
			                                            <div class="col-sm-2 td">접종</div>
			                                            <div class="col-sm-4 td" id="vaccination"></div>
			                                            <div class="col-sm-2 td">수술</div>
			                                            <div class="col-sm-4 td" id="surgery"></div>
			                                        </div>
			                                    </div>
											       <h3>의사 코멘트</h3>
				                                    <p id="explain">
				                                        
				                                    </p>
				
				                                    <h3>나의 코멘트</h3>
				                                    <p id="content">
				                                        오늘 주니모 샤워를 시켰다. 근데 아침에 엄마가 이미 시켰다고 한다. 뒤에서 싸늘한 주니모의 눈빛이 느껴진다.
				                                    </p>
										<footer class="pull-right"> 케어일기 작성 날짜  </footer>
									</div>
								</div>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default">삭제하기</button>
							<button type="button" class="btn btn-default"
								data-dismiss="modal">확인</button>
						</div>
					</div>
				</div>
			</div>
				
				
				
			<!-- Modal 2 -->
			<div class="modal fade" id="contentPageModal2" tabindex="-1"
				role="dialog" aria-labelledby="contentPageModalLabel"
				aria-hidden="true">
				<div class="modal-dialog modal-lg" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="contentPageModalLabel2"></h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="container modal-body">
							<div class="row">
								<div class="col-sm-5">
									<span id="picture"></span> <!-- picture -->
								</div>
								<div class="panel col-sm-4">
									<div class="panel-heading row">
										<div class="col-sm-1">
											<img src="/fanimal/pic/산책2.png" alt="Dog Icon"
												class="img-rounded" id="dog_icon">
										</div>
										<div class="col-sm-5">
											<h4 id='dogName2'></h4>
										</div>
										<div class="">
											<button type="button" class="btn btn-default pull-right">수정하기</button>
										</div>
									</div>
									<div class="panel-body">
										<h5 class="card-title" id="title" >산책일기제목</h5>
										<table class="table">
											<thead class="thead-light">
												<tr>
													<th scope="col">1</th>
													<th scope="col">2</th>
													<th scope="col">3</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>주</td>
													<td>니</td>
													<td>모</td>
												</tr>
												<tr>
													<td>주</td>
													<td>니</td>
													<td>모</td>
												</tr>
												<tr>
													<td>주</td>
													<td>니</td>
													<td>모</td>
												</tr>
											</tbody>
										</table>
										<hr style="height: 3px;">
										<h4 id="content">산책일기</h4>
										<hr>
										<p id="explain"></p>
										<hr>
										<footer class="pull-right"> 작성일 2022/07/17 </footer>
									</div>
								</div>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default">삭제하기</button>
							<button type="button" class="btn btn-default"
								data-dismiss="modal">확인</button>
						</div>
					</div>
				</div>
			  </div>
			  
			  
			  
			  
	<!-- 진료확인서가 여러개 존재할 경우만 보여질수있도록 -> 페이지 이동할때 뒤에 pseq붙여서 이동하기-->
	<!-- 왜 ${plist.pSeq}가 들어가면 동작하지 않는지 질문*************** -->
	<c:if test="${count>1}">
    <div class="modal fade" id="contentListPageModal" tabindex="-1" role="dialog" aria-labelledby="contentPageModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">처방전이 여러개 존재합니다. 보고싶은 처방전을 클릭하세요.</h4>
                </div>
                <div class="modal-body">
             	   <c:forEach items="${pslist}" var="dto">
                    <div class="list-group">
                        <a href="/fanimal/cdiary/add.do?pSeq=${dto.getPSeq()}&aSeq=${dto.getASeq()}" class="list-group-item" data-toggle="modal">${dto.getPSeq()}번째 :  ${dto.getPDate()}</a>
                    </div>
                    </c:forEach>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                </div>
            </div>
        </div>
        </div>
        </c:if>
        
        <!-- 진료확인서가 한개있는경우  -->
        <c:if test="${count==1}">
			    <div class="modal fade" id="contentListPageModal" tabindex="-1" role="dialog" aria-labelledby="contentPageModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">처방전이 한개 존재합니다. 처방전을 클릭하세요.</h4>
                </div>
                <div class="modal-body">
             	   <c:forEach items="${pslist}" var="dto">
                    <div class="list-group">
                        <a href="/fanimal/cdiary/add.do?pSeq=${dto.getPSeq()}&aSeq=${dto.getASeq()}" class="list-group-item" data-toggle="modal">${dto.getPDate()}</a>
                    </div>
                    </c:forEach>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                </div>
            </div>
        </div>
        </div>
		 </c:if>

				
		</section>
		<%@ include file ="/WEB-INF/views/inc/footer.jsp"%>
	</main>



	<script>
   
   //서버 > (데이터:JSON) > 클라이언트
   //케어일기
   function getDataToAjax(cdseq) {
      console.log(cdseq);
      
      
      $.ajax({
         type: 'GET',
         url: '/fanimal/cdiary/listcdiaryajax.do',
         data: 'cdseq=' + cdseq,  //전송 할 데이터
         dataType: "json",
         success: function(result){ //listcdiaryajax.do로부터 데이터받기   
            
				console.log(result);	
        	 
				$('#contentPageModalLabel').html('');
            	$('#contentPageModalLabel').append('<span>' + result.animalName +'</span>');
                  
         
            	$('#dogName').html('');
            	$('#dogName').append('<span>' + result.animalName +'케어일기' + '</span>');
                    
            	
         	 
         		$('#explain').html('');
            	$('#explain').append('<span>' + result.explain + '</span>');
                    
            	
            	//크게 나오는 사진은 추후 list.do에서 수정
            	$('#picture').html('');
             	$('#picture').append('<img src="/fanimal/files/'+result.picture +'">');
             	
             	
        		$('#component').html('');
            	$('#component').append('<span>' + result.component + '</span>');
            	
            	
            	
        		$('#pname').html('');
            	$('#pname').append('<span>' + result.pname + '</span>');
            	
            	
            	$('#pdate').html('');
            	$('#pdate').append('<span>' + result.pdate + '일</span>');
            	
            	
        		$('#vaccination').html('');
            	$('#vaccination').append('<span>' + result.vaccination + '</span>');
            	
            	
            	
        		$('#usage').html('');
            	$('#usage').append('<span>' + result.usage + '</span>');
            	
            	
            	
        		$('#surgery').html('');
            	$('#surgery').append('<span>' + result.surgery + '</span>');
            	
            	
            	$('#content').html('');
            	$('#content').append('<span>' + result.content + '</span>');
            	
            	
            	$('#purpose').html('');
            	$('#purpose').append('<span>' + result.purpose + '</span>');
             			 	
             
         },
         error: function(a,b,c) {
            console.log(a,b,c);
         }
      });
      
   };
   
   
   
   //산책일기
   function getDataToAjax2(wseq){
	  
  	 
	   
	      $.ajax({
	         type: 'GET',
	         url: '/fanimal/cdiary/listwdiaryajax.do',
	         data: 'wseq=' + wseq,  //전송 할 데이터
	         dataType: "json",
	         success: function(result){ //listcdiaryajax2.do로부터 데이터받기   
	            
			
	        	 console.log(result);	
					$('#contentPageModalLabel2').html('');
	            	$('#contentPageModalLabel2').append('<span>' + result.name +'</span>');
	                 
	         
	            	$('#dogName2').html('');
	            	$('#dogName2').append('<span>' + result.name +'산책일기' + '</span>');
	                    
	            	
	         	 
	         		$('#title').html('');
	            	$('#title').append('<span>' + result.title + '</span>');
	            	
	            	
	            	
	         		$('#content').html('');
	            	$('#content').append('<span>' + result.content + '</span>');
	                    
    
	         },
	         error: function(a,b,c) {
	            console.log(a,b,c);
	         }
	      });
	      
	   };
   </script>
</body>
</html>



