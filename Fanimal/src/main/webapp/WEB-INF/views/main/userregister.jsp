<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file = "/WEB-INF/views/inc/asset.jsp"%>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<style>
	#homelogo {
	        margin: 0 auto;
	        text-align: center;
	        background-image: url('/fanimal/asset/images/logo.png');
	        background-size: 500px;
	        background-repeat: no-repeat;
	        width: 400px;
	        height: 300px;
	        background-position: -55px -100px;
	    }
	    
	.col {
		display: flex;
		margin: 5px;
	}
	
	.cal {
		width: 150px;
		background-color: orange;
		border-radius: 10px;
		text-align: center;
		margin: 5px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<main>
		<div class="content">
			<a href="/fanimal/main/index.do"><div id="homelogo">
            
        	</div></a>
        	<div style="display: flex; justify-content: center; margin-left: 50px;">
	        	<form action="/fanimal/main/userregister.do" method="post" enctype="multipart/form-data" id="formData" style="display: flex; flex-direction: column;">
		        	<div class="col">
		        		<div class="cal">아이디</div>
		        		<input type="text" name="id" style="margin-right: 5px;" required>
		        		<input type="button" value="중복검사">
		        	</div>
		        	<div class="col">
		        		<div class="cal">비밀번호</div>
		        		<input type="password" name="pw" required>
		        	</div>
		        	<div class="col">
		        		<div class="cal">비밀번호 확인</div>
		        		<input type="password" name="pwcheck" required>
		        	</div>
		        	<div class="col">
		        		<div class="cal">이름</div>
		        		<input type="text" name="name" required>
		        	</div>
		        	<div class="col">
		        		<div class="cal">닉네임</div>
		        		<input type="text" name="nickname" style="margin-right: 5px;" required>
		        		<input type="button" value="중복검사">
		        	</div>
		        	<div class="col">
		        		<div class="cal">전화번호</div>
		        		<input type="text" name="tel1" style="width: 70px;" required> - 
		        		<input type="text" name="tel2" style="width: 70px;" required> - 
		        		<input type="text" name="tel3" style="width: 70px;" required>
		        	</div>
		        	<div class="col">
		        		<div class="cal">주소</div>
		        		<input type="text" id="sample5_address" placeholder="주소" style="margin-right: 5px;" name="address" required>
						<input type="button" onclick="sample5_execDaumPostcode()" value="주소 검색"><br>
						<div id="map" style="width:300px;height:300px;margin-top:10px;display:none"></div>
		        	</div>
		        	<div class="col">
		        		<div class="cal">생일</div>
		        		<input type="date" name="birth" required>
		        	</div>
		        	<div class="col">
		        		<div class="cal">이미지</div>
		        		<input type="file" name="img">
		        	</div>
		        	<div>
		        		<input type="submit" value="회원가입하기" style="width: 450px;">
		        	</div>
	        	</form>
        	</div>
		</div>
	</main>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0002fbb41a9a8a44cc42b3350fe8932b&libraries=services"></script>
	<script>
	    var mapContainer = document.getElementById('map'), // 지도를 표시할 div
	        mapOption = {
	            center: new daum.maps.LatLng(37.537187, 127.005476), // 지도의 중심좌표
	            level: 5 // 지도의 확대 레벨
	        };
	
	    //지도를 미리 생성
	    var map = new daum.maps.Map(mapContainer, mapOption);
	    //주소-좌표 변환 객체를 생성
	    var geocoder = new daum.maps.services.Geocoder();
	    //마커를 미리 생성
	    var marker = new daum.maps.Marker({
	        position: new daum.maps.LatLng(37.537187, 127.005476),
	        map: map
	    });
	
	
	    function sample5_execDaumPostcode() {
	        new daum.Postcode({
	            oncomplete: function(data) {
	                var addr = data.address; // 최종 주소 변수
	
	                // 주소 정보를 해당 필드에 넣는다.
	                document.getElementById("sample5_address").value = addr;
	                // 주소로 상세 정보를 검색
	                geocoder.addressSearch(data.address, function(results, status) {
	                    // 정상적으로 검색이 완료됐으면
	                    if (status === daum.maps.services.Status.OK) {
	
	                        var result = results[0]; //첫번째 결과의 값을 활용
	
	                        // 해당 주소에 대한 좌표를 받아서
	                        var coords = new daum.maps.LatLng(result.y, result.x);
	                        const xcoor = `<input type="hidden" value="\${result.y}" name="xcoor">`;
	                        const ycoor = `<input type="hidden" value="\${result.x}" name="ycoor">`;
	                        $('#formData').append(xcoor);
	                        $('#formData').append(ycoor);
	                    }
	                });
	            }
	        }).open();
	    }
	</script>
</body>
</html>