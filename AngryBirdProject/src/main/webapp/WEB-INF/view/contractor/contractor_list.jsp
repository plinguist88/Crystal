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


<title>계약자 리스트</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		location.href="registerGoForCont";
	});
});	
</script>
<style type="text/css">

</style>
</head>
<body>
<div class="container">
<table class="bottom">
	<tr>
		<th>번호</th><th>계약자 ID</th><th>계약자 이름</th><th>계약자 생년월일</th><th>계약자 레벨</th><th>선택</th>
	</tr>
	<c:if test="${! empty conDTOs }">
		<c:forEach var="conDTO" items="${conDTOs}" varStatus="status"> <!-- 처음 el을 통해서 items에 받아올때는 model에서 넣은 큰 dto만 넣고, forEach에서 돌릴 때 큰 DTO.필드명(작은dto).필드명(작은 dto의 멤버변수) 형식으로 해야함 -->
			<tr>
				<td>${status.count }</td>
				<td><a href="<c:url value='contractorDetail/${conDTO.contractorId }' />">${conDTO.contractorId }</a></td>
				<td>${conDTO.contractorName }</td> 
				<td>${conDTO.contractorBirth }</td>
				<td>${conDTO.contractorLevel }</td>
				<td>
					<input type="checkbox" name="passedCan"  value="${conDTO.contractorId }"/>
				</td>				
			</tr>
	</c:forEach>
	</c:if>
	<tr><td colspan="6"><button id="btn1" >계약자 등록</button></td></tr>
</table>

</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>
