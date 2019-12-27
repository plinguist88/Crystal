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


<title>트레이닝 리스트</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		location.href="goTrainingUpload";
	});
});	
</script>
<style type="text/css">

</style>
</head>
<body>
<div class="container">
<table class="bottom">
	<tr><th colspan="5"><div align="right"><a href="/AngryBirdProject/goTrainingSchedular">트레이닝 캘린더 보기</a></div></th></tr>
	<tr>
		<th>번호</th><th>트레이닝 번호</th><th>트레이닝 레벨</th><th>트레이닝 시작일자</th><th>트레이닝 종료일자</th>
	</tr>
	<c:if test="${! empty tDTOs }">
		<c:forEach var="tDTO" items="${tDTOs}" varStatus="status"> <!-- 처음 el을 통해서 items에 받아올때는 model에서 넣은 큰 dto만 넣고, forEach에서 돌릴 때 큰 DTO.필드명(작은dto).필드명(작은 dto의 멤버변수) 형식으로 해야함 -->
			<tr>
				<td>${status.count }</td>
				<td><a href="<c:url value='trainingDetail/${tDTO.trainingNum }' />">${tDTO.trainingNum }</a></td>
				<td>
					<c:choose>
						<c:when test="${tDTO.trainingLevel eq 'step1'}">기초반</c:when>
						<c:when test="${tDTO.trainingLevel eq 'step2'}">심화반</c:when>
						<c:when test="${tDTO.trainingLevel eq 'step3'}">데뷔반</c:when>
						<c:when test="${tDTO.trainingLevel eq 'step4'}">연예인반</c:when>																		
					</c:choose>
				</td> 
				<td>${tDTO.trainingStartDate }</td>
				<td>${tDTO.trainingEndDate }</td>			
			</tr>
		</c:forEach>
	</c:if>
	<tr><td colspan="5"><button id="btn1" >트레이닝 등록</button></td></tr>
</table>

</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>
