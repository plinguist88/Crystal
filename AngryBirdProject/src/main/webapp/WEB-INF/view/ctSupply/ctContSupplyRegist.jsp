<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript">
function scSerch(){
	var url = "/AngryBirdProject/scSearch";
	var winWidth = 700;
    var winHeight = 600;
    var popupOption= "width="+winWidth+", height="+winHeight; 
	window.open(url,"",popupOption);
}
</script>
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<title>ctSupplyRegist</title>
</head>
<body>
<div="container">
<form:form action="ctContSupplyRegistPro" name="frm" id="frm" method="post" commandName="ctContSupplyRegistCommand" >
	<table width="600" align="center" border="1">
		<tr>
			<td>계약번호</td>
			<td></td>
		</tr>
		<tr>
			<td>계약일자</td>
			<td><form:input path="ccDay" id="ccDay" />
				<form:errors path="ccDay"/></td>
		</tr>
		<tr>
			<td>계약기간</td>
			<td><form:input path="ccPeriod" id="ccPeriod" />
				<form:errors path="ccPeriod"/></td>
		</tr>
		<tr>
			<td>연장계약</td>
			<td><form:input path="ccExtention" id="ccExtention" />
				<form:errors path="ccExtention"/></td>
		</tr>
		<tr>
			<td>계약업체</td>
			<td><form:input path="scNo" id="scNo" /><input type="button" id="scSearch" value="조회" onclick="javascript:scSearch();"/>
				<form:errors path="scNo"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="계약" />
				<input type="button" value="취소" onclick="location.href='ctContSupplyList'" />
			</td>
		</tr>
	</table>
</form:form>
</div>
</body>
</html>