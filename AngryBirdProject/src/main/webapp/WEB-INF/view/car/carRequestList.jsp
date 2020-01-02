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
<title>차량예약리스트</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){			//'.'은 (html)클래스 '#'은 id
		location.href="carRequest";
	});
});
$(function(){
	$("#btn2").click(function(){			//'.'은 (html)클래스 '#'은 id
		location.href="main";
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
		<td colspan="8"><div align="center"><h2>배차요청리스트</h2></div></td>
	</tr>
	<tr>
		<th>순번</th><th>직원번호</th><th>예약번호</th><th>대여일자</th><th>반납일자</th><th>차종</th><th>인원</th><th>차량번호</th>
	</tr>
	<c:if test="${! empty carRequestList }"> <!-- service model에 선언해준 이름과 동일해야 함 -->
	<c:forEach var="carRequest" items="${carRequestList}" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td>${carRequest.employeeNum}</td>
		<td>${carRequest.carRequestRentalNum}</td> 
		<td>${carRequest.from }</td> 
		<td>${carRequest.to }</td>
		<td>${carRequest.carType }</td>
		<td>${carRequest.carRequestPassengerNum }</td>
		<td>${carRequest.carRegNum }</td>
	</tr>
	</c:forEach>
	</c:if>
	<c:if test="${empty carRequestList }">
		<tr>
			<td colspan="3" align="center">등록된 예약이 없습니다.</td>
		</tr>
	</c:if>
		<tr>
			<td colspan="8">
				<div align="center">
					<input type="button" value="배차신청" id="btn1" /> 
					<input type="button" value="메인으로" id="btn2" /> 
				</div>
			</td>
		</tr>
	</table>
</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>