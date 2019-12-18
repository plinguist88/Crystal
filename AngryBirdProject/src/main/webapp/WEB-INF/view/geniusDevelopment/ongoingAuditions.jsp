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


<title>audition_list.jsp</title>
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">

</script> -->
<style type="text/css">

</style>
</head>
<body>
<div class="container">
<h2 align="center">모집 중인 오디션</h2>
<table class="line">
	<tr>
		<th>번호</th><th>제목</th><th>시작일</th><th>종료일</th>
	</tr>
	<c:if test="${! empty ongoingAuds }">
	<c:forEach var="aud" items="${ongoingAuds}" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td><a href="<c:url value='showCandidates/${aud.auditionSeq }' />">${aud.title }</a></td> 
		<td>${aud.startDate }</td><td>${aud.endDate }</td>
	</tr>
	</c:forEach>
	</c:if>
	<c:if test="${empty ongoingAuds }">
		<tr>
			<td colspan="4" align="center">진행중인 오디션 공고가 없습니다.</td>
		</tr>
	</c:if>
</table>
<br />
<h2 align="center">모집 완료 오디션</h2>
<table class="line">
	<tr>
		<th>번호</th><th>제목</th><th>시작일</th><th>종료일</th>
	</tr>
	<c:if test="${! empty finishedAuds }">
	<c:forEach var="aud" items="${finishedAuds}" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td><a href="<c:url value='showCandidates/${aud.auditionSeq }' />">${aud.title }</a></td> 
		<td>${aud.startDate }</td><td>${aud.endDate }</td>
	</tr>
	</c:forEach>
	</c:if>
	<c:if test="${empty finishedAuds }">
		<tr>
			<td colspan="4" align="center">진행완료된 오디션 공고가 없습니다.</td>
		</tr>
	</c:if>
</table>



</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>
