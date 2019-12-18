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
	
</script>
<style type="text/css">

</style>
</head>
<body>
<div class="container">
<table class="line">
	<tr>
		<th>번호</th><th>지원번호</th><th>지원자 이름</th><th>지원자 생년월일</th><th>총점</th>
	</tr>
	<c:if test="${! empty candidates }">
	<c:forEach var="can" items="${candidates}" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td><a href="<c:url value='/candidateDetail/${can.candidateNum }' />">${can.candidateNum }</a></td>
		<td>${can.candidateName}</a></td> 
		<td>${can.candidateBirth}</td>
		<td>${can.totalScore }</td>
	</tr>
	</c:forEach>
	</c:if>
	<c:if test="${empty candidates }">
		<tr>
			<td colspan="5" align="center">등록된 지원자가 없습니다.</td>
		</tr>
	</c:if>
</table>

</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>
