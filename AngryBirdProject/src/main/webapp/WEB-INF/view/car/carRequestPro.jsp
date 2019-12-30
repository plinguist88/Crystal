<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<style>
body{
	background-image:url("images/car_1.png");
	background-repeat:no-repeat;
	background-position : bottom;
	background-size:400px;
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
		<h2>[ 차량 예약이 완료되었습니다 ]</h2>
	</div>
	<div align="right">
		<input type="submit" value="예약내역확인" />
	</div>
</body>
</html>