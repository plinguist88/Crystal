<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="https://fonts.googleapis.com/css?family=Pattaya&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=East+Sea+Dokdo&display=swap" rel="stylesheet">

<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(function() {
	var cafeteria = $('.main');
	var backgrounds = new Array(
	'url(images/bc1.jpg)', 
	'url(images/bc22.jpg)',
	'url(images/bc3.jpg)',
	'url(images/bc4.jpg)'
	);
	var current = 0;

	function nextBackground() {
	    current++;
	    current = current % backgrounds.length;
	    cafeteria.css('background-image', backgrounds[current]);
	}
	setInterval(nextBackground, 3000);
	
	cafeteria.css('background-image', backgrounds[0]);
});
</script>

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}
:lang(en) {font-family: Arial, Helve tica, sans-serif;}

.main {
	position: relative;
	margin-left: 10%;
	width: 80%;
	height: 700px;
	background-image: url("images/bc1.jpg");
	background-color: white;
  	background-position: center;
  	background-repeat: no-repeat;
  	background-size: 100% 100%;
  	border-style: double;
}

.notice{
	padding: 10px;
	position: absolute;
	width: 300px;
	height: 675px;
	background-image: url("images/wooden1.jpg");
	background-repeat: repeat;
	border-style: double;
}

.title{
	font-family: 'Pattaya', sans-serif;
	font-size: 50px;
	color: black;
	background-color: white;
	border-style: outset;
	border-width: 10px;
	text-decoration-line: overline underline;
	
}
.content{
	margin-top: 20px;
	font-family: 'East Sea Dokdo', cursive;
	font-size: 30px;
	color: black;
	background-image: url("images/wcb1.png");
	background-position: center;
  	background-repeat: no-repeat;
  	background-size: 100% 100%;
	width: 280px;
	height: 450px;
}
</style>

<title>ctCafeteria</title>
</head>
<body>
<div class="main">
	<div class="notice" align="center">
		<div class="title">
			CRYSTAL<br />
			CAFETERIA
		</div>
		<div class="content" text-align="center">
			<br /><br />
			운영시간<br />
			평일 11:00 ~14:00<br /><br />
			문의사항<br />
			cafeteria@gmail.com<br />
			02-123-1234<br /><br />
			담당자<br />
			CT-김 주 형
		</div>
	</div>
</div>
</body>
</html>
<%@ include file ="../footer.jsp" %>