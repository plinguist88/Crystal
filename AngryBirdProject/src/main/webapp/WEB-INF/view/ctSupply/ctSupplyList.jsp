<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<title>ctSupplyList</title>
</head>
<body>
<div class="container">
<br /><br /><br />
<table class="line" align="center">
	<tr>
		<td width="20%">
		</td>
		<td width="60%" >
			<h1 align="center">Supply List</h1>
		</td>
		<td width="20%">
			<a href="ctContSupplyList"><img src="/AngryBirdProject/images/rightArrow.png" alt="ctContSupplyList" width="100"/></a>
		</td>
	</tr>
	<tr>
		<th>업체번호</th><th>업체명</th><th>업종</th>
	</tr>
<c:if test="${! empty ctSupplyDTO}">
<c:forEach var="ctSupply" items="${ctSupplyDTO }">
	<tr>
		<td><a href="<c:url value='ctSupplyDetail?scNo=${ctSupply.scNo }'/>">${ctSupply.scNo }</a></td>
		<td>${ctSupply.scName1 }</td>
		<td>${ctSupply.scSort }</td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty ctSupplyDTO}">
	<tr>
		<td>등록된 업체가 없습니다.</td>
	</tr>
</c:if>
	<tr>
		<td colspan="3" align="center">
			<input type="button" value="등록하기" onclick="location.href='ctSupplyRegist'" />
		</td>
	</tr>
</table>
</div>
</body>
</html>
<%@ include file ="../footer.jsp" %>