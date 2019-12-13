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
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		location.href="goAudition";
	});
});
</script>
<style type="text/css">

</style>
</head>
<body>
<div class="container">
<table class="line">
	<tr>
		<th>번호</th><th>제목</th><th>등록일</th>
	</tr>
	<c:if test="${! empty auditions }">
	<c:forEach var="aud" items="${auditions}" varStatus="status">
	<tr>
		<td>${status.count }</td><td><a href="auditionDetail">${aud.title }</a></td><td>${aud.uploadDate }</td>
	</tr>
	</c:forEach>
	</c:if>
	<c:if test="${empty auditions }">
		<tr>
			<td colspan="3" align="center">등록된 오디션 공고가 없습니다.</td>
		</tr>
	</c:if>
</table>
<c:if test="${employeeInfo.deptNum eq 'GD' }">
			<div align="center"><br />
				<button id="btn1">오디션 공고 등록</button>
			</div>
</c:if>
</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>
