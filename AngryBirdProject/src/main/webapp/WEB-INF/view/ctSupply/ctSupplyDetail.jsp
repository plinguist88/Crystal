<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ctSupplyDetail</title>

<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

</head>
<body>
<div class="container">
<table class="line">
<tr>
	<td colspan="2"><h1 align="center">Supply Info</h1></td>
</tr>
<tr>
	<td width="30%">업체번호</td>
	<td>${ctSupplyDTO.scNo }</td>
</tr>
<tr>
	<td>사업자등록번호</td>
	<td>${ctSupplyDTO.scLicense }</td>
</tr>
<tr>
	<td>사업자이름</td>
	<td>${ctSupplyDTO.scName1 }</td>
</tr>
<tr>
	<td>사업자대표이름</td>
	<td>${ctSupplyDTO.scName2 }</td>
</tr>
<tr>
	<td>사업자종류</td>
	<td>${ctSupplyDTO.scSort  }</td>
</tr>
<tr>
	<td>사업장주소</td>
	<td>${ctSupplyDTO.scAddr  }</td>
</tr>
<tr>
	<td>사업자전화번호</td>
	<td>${ctSupplyDTO.scPh }</td>
</tr>
<tr>
	<td><input type="button" value="삭제하기" onclick="location.href='ctSupplyDelete?scNo="${ctSupplyDTO.scNo }"'" />
		<input type="button" value="뒤로가기" onclick="location.href='ctSupplyList'" /></td>
</tr>
</table>
</div>
</body>
</html>
<%@ include file ="../footer.jsp" %>