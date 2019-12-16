<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ctSupplyList</title>
</head>
<body>
<br /><br /><br />
<table align="center">
	<tr>
		<td colspan="3">
			<h2>Supply List</h2>
		</td>	
	</tr>
<c:if test="${! empty ctSupplyDTO}">
<c:forEach var="ctSupply" items="${ctSupplyDTO }">
	<tr>
		<td>업체번호 : ${ctSupply.scNo }</td>
		<td>업체명 : ${ctSupply.scName1 }</td>
		<td>업종 : ${ctSupply.scSort }</td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty ctSupplyDTO}">
	<tr>
		<td>등록된 업체가 없습니다.</td>
	</tr>
</c:if>
	<tr>
		<td align="center">
			<input type="button" value="등록하기" onclick="location.href='ctSupplyRegist'" />
		</td>
	</tr>
</table>
</body>
</html>
<%@ include file ="../footer.jsp" %>