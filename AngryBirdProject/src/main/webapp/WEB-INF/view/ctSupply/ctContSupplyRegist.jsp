<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
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

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}

#frm{
	padding-top:10px;
}


</style>

<title>ctSupplyRegist</title>
</head>
<body>
<form:form action="ctContSupplyRegistPro" name="frm" id="frm" method="post" commandName="ctContSupplyRegistCommand" >
	<table width="50%" align="center">
		<tr>
			<td width="30%" align="center">계약번호</td>
			<td width="65%"><input type="text" Placeholder="자동 생성" readonly="true" style="width:300px;"/></td>
		</tr>
		<tr>
			<td align="center">계약일자</td>
			<td><form:input path="ccDay" id="ccDay" style="width:300px;"/>
				<form:errors path="ccDay"/></td>
		</tr>
		<tr>
			<td align="center">계약기간</td>
			<td><form:input path="ccPeriod" id="ccPeriod" style="width:300px;"/>
				<form:errors path="ccPeriod"/></td>
		</tr>
		<tr>
			<td align="center">연장계약</td>
			<td><form:input path="ccExtention" id="ccExtention" style="width:300px;"/>
				<form:errors path="ccExtention"/></td>
		</tr>
		<tr>
			<td align="center">계약업체</td>
			<td><form:input path="scNo" id="scNo" style="width:300px;"/><input type="button" id="scSearch" value="조회" onclick="javascript:scSearch();"/>
				<form:errors path="scNo"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center" style="padding-top: 10px;">
				<input type="submit" value="계약" style="font-size : 20px; width: 15%; height: 50px;"/>
				<input type="button" value="취소" onclick="location.href='ctContSupplyList'" style="font-size : 20px; width: 15%; height: 50px;"/>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>
<%@ include file ="../footer.jsp" %>