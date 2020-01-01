<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/JavaScript" src="http://code.jquery.com/jquery-1.7.min.js"></script>
<script type="text/JavaScript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
	function openDaumZipAddress() {
		new daum.Postcode({
			oncomplete:function(data) {
				jQuery("#postcode1").val(data.postcode1);
				jQuery("#postcode2").val(data.postcode2);
				jQuery("#zonecode").val(data.zonecode);
				jQuery("#address").val(data.address);
				jQuery("#address_etc").focus();
				console.log(data);
				}
			}).open();
		}
	
$(function(){
	var scAddr = $('#scAddr');
	var etc = $('#address_etc')
	var addr = $('#address')
	
	etc.blur(function(){
		scAddr.val(addr.val()+" "+etc.val());
	});
});


</script>

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
			<td>
				<input id="postcode1" type="text" value="" style="width:50px;" readonly/>&nbsp;-&nbsp;
				<input id="postcode2" type="text" value="" style="width:50px;" readonly/>&nbsp;&nbsp;
				<input id="zonecode" type="text" value="" style="width:50px;" readonly/>&nbsp;
				<input type="button" onClick="openDaumZipAddress();" value = "주소 찾기" /><br/>
				<input type="text" id="address" value="" style="width:240px;" readonly/>
				<input type="text" id="address_etc" value="" style="width:200px;"/>
			</td>
		</tr>
		<tr>
			<td>업체사업장주소</td>
			<td><form:input path="scAddr" id="scAddr" style="width: 400px" />
				<form:errors path="scAddr"/></td>
		</tr>
		<tr>
			<td>업체사업자전화번호</td>
			<td><form:input path="scPh" id="scPh" />
				<form:errors path="scPh"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="등록" id="sbt"/>
				<input type="button" value="취소" onclick="location.href='ctSupplyList'" />
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>
<%@ include file ="../footer.jsp" %>