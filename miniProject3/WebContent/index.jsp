<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!-- 타이틀 및 메타데이터 -->
	<head>
		<meta charset="utf-8">
		<title>영화 어때? 최고의 영화 추천 및 리뷰 사이트</title>
		<link rel="stylesheet" href="index.css" />
		<!-- <script type="text/javascript" src="movieApiGet.js"></script>  -->
	</head>

<!-- 상단바 영역   -->
	<body>
	<div class="header">
			<div class ="navbar">
					<div class="navbar_logo">
						<a href="index.jsp"><img src="./images/mylogo.png" alt="로고"></a>
					</div>
					<div class="search">
						<input type="search" class="searchbox" placeholder="영화를 검색하세요">
						<a href=""><i class="fas fa-search"></i></a>
					</div>
					<ul class="nav_menu">
						<li><a href="index.jsp">홈</a></li>
						<li><a href="login.html">로그인</a></li>
					</ul>
			</div>
		</div>

<!-- 인덱스 메인 영역    -->
		<div class = "main" >
			<div class ="main_content">
				<div id="main1-1">
					<p>최근 별점이 제일 높은 영화</p>
					<img src="./images/samplePoster1.png" width="300" height="400">
					<p>도굴</p>
					<p>별점 : 4.5</p>
					<div class="starRating">
 						<span>☆</span><span>☆</span><span>☆</span><span>☆</span><span>☆</span>
					</div>
				</div>
				<div id="main1-2">
					<p>최근 리뷰가 많은 영화</p>
					<img src="./images/samplePoster2.png" width="300" height="400">
					<p>삼토반</p>
					<p>리뷰수 : 440 </p>
					<div class="starRating">
 						<span>☆</span><span>☆</span><span>☆</span><span>☆</span><span>☆</span>
					</div>
				</div>
				<div id="main1-3">
					<p>최근 추천지수가 가장 높은 영화</p>
					<img src="./images/samplePoster3.png" width="300" height="400">
					<p>노트북</p>
					<p>추천지수 : 10000</p>
					<div class="starRating">
 						<span>☆</span><span>☆</span><span>☆</span><span>☆</span><span>☆</span>
					</div>
				</div>
			</div>
			<div class="main_content2">
				<div id="main2-1">
					<p>최근 상영작</p>
					<img src="./images/samplePoster1.png" width="300" height="400">
					<p>노트북</p>
					<p>리뷰 수 : 10000</p>
				</div>
				<div id="main2-2" width="800" height="400">
				<p> 리뷰 1  <br/>
				<textarea rows="5" cols="70" style="resize:none;">와 정말 최고의 영화 정말 재미있어요 ^^ 추천합니다 </textarea> 
				<p> 리뷰 2 <br/>
				<textarea rows="5" cols="70" style="resize:none;">와 정말 최고의 영화 정말 재미있어요 ^^ 추천합니다 </textarea>
				<p> 리뷰 3 <br/>
				<textarea rows="5" cols="70" style="resize:none;" >와 정말 최고의 영화 정말 재미있어요 ^^ 추천합니다 </textarea>
				</div>
			</div>
		</div>

<!-- 하단 정보 텍스트 영역    -->
		<footer>
			<div class="intro">
			<!-- Contact -->
				<p class="title">팀프로젝트 영화어때</p>
				주소 : (07702) 서울특별시 강서구 화곡로 179<br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;대한상공회의소 서울기술교육센터 403호<br>
				팀명 : 영화어때<br>
				조원 : 박상종 이재선 박지원<br>
				문의 : psajo@naver.com
			</div>
		</footer>
	</body>
</html>