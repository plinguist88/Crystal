<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ctSupplyRegist</title>
</head>
<body>
<form:form action="ctSupplyRegistPro" name="frm" id="frm" method="post" commandName="ctSupplyRegistCommand" >
	<table width="600" align="center" border="1">
		<tr>
			<td>��ü��ȣ</td>
			<td></td>
		</tr>
		<tr>
			<td>��ü����ڵ��Ϲ�ȣ</td>
			<td><form:input path="scLicense" id="scLicense" />
				<form:errors path="scLicense"/></td>
		</tr>
		<tr>
			<td>��ü������̸�</td>
			<td><form:input path="scName1" id="scName1" />
				<form:errors path="scName1"/></td>
		</tr>
		<tr>
			<td>��ü����ڴ�ǥ�̸�</td>
			<td><form:input path="scName2" id="scName2" />
				<form:errors path="scName2"/></td>
		</tr>
		<tr>
			<td>��ü���������</td>
			<td><form:input path="scSort" id="scSort" />
				<form:errors path="scSort"/></td>
		</tr>
		<tr>
			<td>��ü������ּ�</td>
			<td><form:input path="scAddr" id="scAddr" />
				<form:errors path="scAddr"/></td>
		</tr>
		<tr>
			<td>��ü�������ȭ��ȣ</td>
			<td><form:input path="scPh" id="scPh" />
				<form:errors path="scPh"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="���" />
				<input type="button" value="���" onclick="location.href='ctSupplyList'" />
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>