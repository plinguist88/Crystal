<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/view/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >
<title>대여가능 차량목록</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
</script>
<style type="text/css">
</style>
</head>	
<body>
<table align="center">
	<tr></tr>
	<tr>
		<td colspan="3"><div align="center"><h1>대여가능 차량목록</h1></div></td>
	</tr>
	<tr></tr>
	<tr>
		<td height="0" align="center">
			<div style = "height:100%">
			<a href="https://www.hyundai.com/kr/ko/vehicles/grand-starex/20my/specifications">
			<img src = "images\c1.jpg" height = "100%" ></a></div>
		</td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr>
		<td height="0">
			<div style = "height:100%">
			<a href="https://www.kia.com/kr/vehicles/all-new-carnival/specification.html">
			<img src = "images\c2.jpg" height = "100%"></a></div>
		</td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr>
		<td height="0">
			<div style = "height:100%"><img src = "images\c3.jpg" height = "100%"></div>
			<a href="https://www.kia.com/kr/vehicles/all-new-carnival/specification.html">
			<img src = "images\c3.jpg" height = "100%"></a></div>
		</td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
</table>
</body>
</html>