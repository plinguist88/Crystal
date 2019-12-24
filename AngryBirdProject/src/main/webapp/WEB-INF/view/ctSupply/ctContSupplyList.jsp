<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}
</style>

<title>ctContSupplyList</title>
</head>
<body>
<table align="center">
	<tr>
		<td width="20%" align="center">
						<a href="ctSupplyList"><img src="/AngryBirdProject/images/leftArrow.png" alt="ctSupplyList" width="100"/></a>
		</td>
		<td colspan="2" width="60%" >
			<h1 align="center">ContSupply List</h1>
		</td>
		<td width="20%" >
		</td>
	</tr>
	<tr>
		<th>계약번호</th><th>계약업체</th><th>계약일자</th><th>계약기간</th>
	</tr>
<c:if test="${! empty ctContSupplyDTO}">
<c:forEach var="ctContSupply" items="${ctContSupplyDTO }">
	<tr>
		<td>${ctContSupply.ccNo }</td>
		<td><a href="<c:url value='ctSupplyDetail?scNo=${ctContSupply.scNo }'/>">${ctContSupply.scNo }</a></td>
		<td>${ctContSupply.ccDay }</td>
		<td>${ctContSupply.ccPeriod }</td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty ctContSupplyDTO}">
	<tr>
		<td>계약된 업체가 없습니다.</td>
	</tr>
</c:if>
	<tr>
		<td colspan="4" align="center">
			<input type="button" value="등록하기" onclick="location.href='ctContSupplyRegist'" />
		</td>
	</tr>
</table>
</body>
</html>
<%@ include file ="../footer.jsp" %>