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


<title>지원자 보기</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		location.href="/AngryBirdProject/passedCandidates/${auditionSeq}"
	});
});	
</script>
<style type="text/css">

</style>
</head>
<body>
<div class="container">
<form action="/AngryBirdProject/goPass" method="post" >
<table class="line">
	<tr>
		<th>번호</th><th>지원번호</th><th>지원자 이름</th><th>지원자 생년월일</th><th>총점</th><th>선택</th>
	</tr>
	<c:if test="${! empty audCandidatesDTO }">
		<c:forEach var="audC" items="${audCandidatesDTO}" varStatus="status"> <!-- 처음 el을 통해서 items에 받아올때는 model에서 넣은 큰 dto만 넣고, forEach에서 돌릴 때 큰 DTO.필드명(작은dto).필드명(작은 dto의 멤버변수) 형식으로 해야함 -->
		<c:choose>
		<c:when test="${status.count <= audC.auditionDTO.passed}">
			<tr style="background-color:#EFF5FB">
				<td>${status.count }</td>
				<td><a href="<c:url value='/candidateDetail/${audC.candidateDTO.candidateNum }' />">${audC.candidateDTO.candidateNum }</a></td>
				<td>${audC.candidateDTO.candidateName}</td> 
				<td>${audC.candidateDTO.candidateBirth}</td>
				<td>${audC.candidateDTO.totalScore }</td>

				<td>
				<c:if test="${audC.candidateDTO.totalScore >0}">
					<input type="checkbox" name="passedCan"  value="${audC.candidateDTO.candidateNum }"/>
				</c:if>
				</td>
				
			</tr>
		</c:when>
		<c:when test="${status.count > audC.auditionDTO.passed}">
			<tr>
				<td>${status.count }</td>
				<td><a href="<c:url value='/candidateDetail/${audC.candidateDTO.candidateNum }' />">${audC.candidateDTO.candidateNum }</a></td>
				<td>${audC.candidateDTO.candidateName}</td> 
				<td>${audC.candidateDTO.candidateBirth}</td>
				<td>${audC.candidateDTO.totalScore }</td>
				<td></td>
			</tr>
		</c:when>
	</c:choose>
	</c:forEach>
	</c:if>
	
	<c:if test="${empty audCandidatesDTO }">
		<tr>
			<td colspan="6" align="center">등록된 지원자가 없습니다.</td>
		</tr>
	</c:if>
</table>
<div align="center">
	<input type="submit" value="합격자 등록"/>
</div>
</form>
</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>
