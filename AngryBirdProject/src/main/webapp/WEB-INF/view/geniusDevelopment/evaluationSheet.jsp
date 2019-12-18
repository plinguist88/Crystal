<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지원자 평가지</title>
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >
<script type="text/javascript" 
			src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	var total = 0;
 	var q1 = 0;
 	var q2 = 0;
 	var q3 = 0;
 	var q4 = 0;
 	var q5 = 0;
 	var q6 = 0;
 	var q7 = 0;
 	var q8 = 0;
 	var q9 = 0;
 	var q10 = 0;	
     $("input[type=radio]").click(function(){ 
     	q1 = parseInt($("input[name='q1']:checked").val());
     	q2 = parseInt($("input[name='q2']:checked").val());
     	q3 = parseInt($("input[name='q3']:checked").val());
     	q4 = parseInt($("input[name='q4']:checked").val());
     	q5 = parseInt($("input[name='q5']:checked").val());
     	q6 = parseInt($("input[name='q6']:checked").val());
     	q7 = parseInt($("input[name='q7']:checked").val());
     	q8 = parseInt($("input[name='q8']:checked").val());
     	q9 = parseInt($("input[name='q9']:checked").val());
     	q10 = parseInt($("input[name='q10']:checked").val());
     	total = q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10 ;
      });
     
	$("#btn1").click(function(){
    	$("#sum1").val(total);
	});
	
	$("#btn2").click(function(){
		$(opener.document).find("#evalScore").val($("#sum1").val());
		$(opener.document).find("#q1").val($("#q1").val());
		$(opener.document).find("#q2").val($("#q2").val());
		$(opener.document).find("#q3").val($("#q3").val());
		$(opener.document).find("#q4").val($("#q4").val());
		$(opener.document).find("#q5").val($("#q5").val());
		$(opener.document).find("#q6").val($("#q6").val());
		$(opener.document).find("#q7").val($("#q7").val());
		$(opener.document).find("#q8").val($("#q8").val());
		$(opener.document).find("#q9").val($("#q9").val());
		$(opener.document).find("#q10").val($("#q10").val());	
		self.close();
	});
});

</script>
<style type="text/css">
table {
	border-collapse: collapse;
	margin-left:auto;  /* 테이블 자동으로 가운데 정렬 */
	margin-right:auto; /* 테이블 자동으로 가운데 정렬 */
}

</style>
</head>
<body >
<div class="container">
<div align="center">
	<table border="1">
		<tr>
			<td>번호</td>
			<td>평가항목</td>
			<td>문항</td>
			<td>상</td>
			<td>중</td>
			<td>하</td>
		</tr>
		<tr>
			<td>1</td>
			<td>동영상 길이</td>
			<td>6분 이상: 상 <br />
				3분 이상 6분 미만: 중<br />
				3분 미만: 하
			</td>
			<td><input id="q1" type="radio" name="q1" value="3"/></td>
			<td><input id="q1" type="radio" name="q1" value="2"/></td>
			<td><input id="q1" type="radio" name="q1" value="1"/></td>
		</tr>
		<tr>
			<td>2</td>
			<td rowspan="3">춤</td>
			<td>난이도</td>
			<td><input id="q2" type="radio" name="q2" value="3"/></td>
			<td><input id="q2" type="radio" name="q2" value="2"/></td>
			<td><input id="q2" type="radio" name="q2" value="1"/></td>
		</tr>
		<tr>
			<td>3</td>
			<td>무대장악력</td>
			<td><input id="q3" type="radio" name="q3" value="3"/></td>
			<td><input id="q3" type="radio" name="q3" value="2"/></td>
			<td><input id="q3" type="radio" name="q3" value="1"/></td>
		</tr>
		<tr>
			<td>4</td>
			<td>리듬감</td>
			<td><input id="q4" type="radio" name="q4" value="3"/></td>
			<td><input id="q4" type="radio" name="q4" value="2"/></td>
			<td><input id="q4" type="radio" name="q4" value="1"/></td>
		</tr>
		<tr>
			<td>5</td>
			<td rowspan="3">노래</td>
			<td>선곡능력</td>
			<td><input id="q5" type="radio" name="q5" value="3"/></td>
			<td><input id="q5" type="radio" name="q5" value="2"/></td>
			<td><input id="q5" type="radio" name="q5" value="1"/></td>
		</tr>
		<tr>
			<td>6</td>
			<td>음역대</td>
			<td><input id="q6" type="radio" name="q6" value="3"/></td>
			<td><input id="q6" type="radio" name="q6" value="2"/></td>
			<td><input id="q6" type="radio" name="q6" value="1"/></td>
		</tr>
		<tr>
			<td>7</td>
			<td>바이브레이션</td>
			<td><input id="q7"  type="radio" name="q7" value="3"/></td>
			<td><input id="q7"  type="radio" name="q7" value="2"/></td>
			<td><input id="q7" type="radio" name="q7" value="1"/></td>
		</tr>
		<tr>
			<td>8</td>
			<td rowspan="2">화제성</td>
			<td>외모</td>
			<td><input id="q8" type="radio" name="q8" value="3"/></td>
			<td><input id="q8" type="radio" name="q8" value="2"/></td>
			<td><input id="q8" type="radio" name="q8" value="1"/></td>
		</tr>
		<tr>
			<td>9</td>
			<td>개인기</td>
			<td><input id="q9" type="radio" name="q9" value="3"/></td>
			<td><input id="q9" type="radio" name="q9" value="2"/></td>
			<td><input id="q9" type="radio" name="q9" value="1"/></td>
		</tr>
		<tr>
			<td>10</td>
			<td>글로벌 역량</td>
			<td>외국어(0개: 1점 <br />1개: 2점<br />2개 이상: 3점)</td>
			<td><input id="q10" type="radio" name="q10" value="3"/></td>
			<td><input id="q10" type="radio" name="q10" value="2"/></td>
			<td><input id="q10" type="radio" name="q10" value="1"/></td>
		</tr>
		<tr>
			<td colspan="3"><button id="btn1">총점 계산</button></td>
			<td colspan="3"><input type="text" id="sum1" size="2" readonly/> / 30</td>
		</tr>
	</table>
	<br /><br />
	<button id="btn2">평가 완료</button> 
</div>	
</div>	
</body>
</html>
