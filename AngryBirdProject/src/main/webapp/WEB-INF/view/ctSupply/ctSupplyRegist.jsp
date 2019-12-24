<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}
</style>

<title>ctSupplyRegist</title>
</head>
<body>
<form:form action="ctSupplyRegistPro" name="frm" id="frm" method="post" commandName="ctSupplyRegistCommand" >
	<table width="600" align="center" border="1">
		<tr>
			<td>업체번호</td>
			<td></td>
		</tr>
		<tr>
			<td>업체사업자등등록번호</td>
			<td><form:input path="scLicense" id="scLicense" />
				<form:errors path="scLicense"/></td>
		</tr>
		<tr>
			<td>업체사업자이름</td>
			<td><form:input path="scName1" id="scName1" />
				<form:errors path="scName1"/></td>
		</tr>
		<tr>
			<td>업체사업자대표이름</td>
			<td><form:input path="scName2" id="scName2" />
				<form:errors path="scName2"/></td>
		</tr>
		<tr>
			<td>업체사업자종류</td>
			<td><form:input path="scSort" id="scSort" />
				<form:errors path="scSort"/></td>
		</tr>
		<tr>
			<td>업체사업장주소</td>
			<td><form:input path="scAddr" id="scAddr" />
				<form:errors path="scAddr"/></td>
		</tr>
		<tr>
			<td>업체사업자전화번호</td>
			<td><form:input path="scPh" id="scPh" />
				<form:errors path="scPh"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="등록" />
				<input type="button" value="취소" onclick="location.href='ctSupplyList'" />
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>