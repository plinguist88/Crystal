<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/view/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >
<meta charset="UTF-8">
<title>차량 예약신청 확인 페이지</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){			//'.'은 (html)클래스 '#'은 id
		location.href="carRequestList";
	});
});
</script>
<style>
body{
	background-image:url("images/car_1.png");
	background-repeat:no-repeat;
	background-position : bottom;
	background-size:300px;
}
</style>
</head>
<body>
	<div class="container">
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<div align="center"><a href="/AngryBirdProject/main"><img src="/AngryBirdProject/images/member.JPG" width="400" /></a></div>
		<h2>[&nbsp;  차량 예약이 완료되었습니다  &nbsp;]</h2>
	</div>
	<div align="center">
		<input type="button" value="예약내역확인" id="btn1" />
	</div>
</body>
</html>