<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/css/css/sign.js"></script>

<title>Insert title here</title>
<style>
#myCanvas {
	border: 4px solid #444;
	border-radius: 15px;
	background-color: #fafafa;
}

.container1 {
	margin: 150x auto;
}
</style>

<!-- canvas 데이터를 encoded base64데이터(String타입)으로 받아와서 부모창에 img src에 전달하여 출력 -->
<script type="text/javascript">
function putImage(){
 	var canvas = document.getElementById("myCanvas");
	var ctx = canvas.getContext("2d"); 
	var myImage = canvas.toDataURL("image/png"); 
	$(opener.document).find("#MyPix").attr("src", myImage);
	$(opener.document).find("#signature").val(myImage);
}



$(document).ready(function() {
	
	$('#myCanvas').sign({
		resetButton : $('#resetSign'),
		lineWidth : 5,
		height : 300,
		width : 400
	});
	
	$("#btn").click(function(){
		putImage();
		self.close();
	});	
		
});
</script>
</head>
<body>
	<div class="container1">
		<h2>전자 서명란</h2>
		<canvas id="myCanvas"></canvas>
		<br /> <br /> 
		<input type="button" value="Reset" id='resetSign'>
		<input type="button" value="Register" id="btn"/>
	</div>
</body>
</html>