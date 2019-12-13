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
<title>audition_detail.jsp</title>
</head>
<body>
<div  class="container">
<h2>오디션 상세내용</h2>
<table class="line">
	<tr>
		<td>제목</td><td>${oneAud.title }</td>
	</tr>	
	<tr>
		<td>회차</td><td>${oneAud.auditionNo }</td>
	</tr>
	<tr>
		<td>시작일</td><td>${oneAud.startDate }</td>
	</tr>
	<tr>
		<td>종료일</td><td>${oneAud.endDate }</td>
	</tr>
	<tr>
		<td>종류</td><td>${oneAud.type }</td>
	</tr>
	<tr>
		<td>모집인원</td><td>${oneAud.gather }</td>
	</tr>
	<tr>
		<td>내용</td><td>${oneAud.content }</td>
	</tr>
<c:if test="${empty employeeInfo }">
	<tr>
		<td colspan="2">
		<div align="center"><br />
			<button id="btn1" >지원하기</button> 
		</div>
		</td>
	</tr>
</c:if>		
</table>
<c:if test="${!empty employeeInfo }">
	<div align="center"><br />
		<button id="btn2" >수정</button> 
		<button id="btn3" >삭제</button>
	</div>
</c:if>	
</div>
</body>
</html>
<%@ include file="/WEB-INF/view/footer.jsp"%>