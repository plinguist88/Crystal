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

#frm{
	padding-top:10px;
}

</style>

<title>ctSupplyRegist</title>
</head>
<body>
<form:form action="ctSupplyRegistPro" name="frm" id="frm" method="post" commandName="ctSupplyRegistCommand" >
	<table width="50%" align="center">
		<tr>
			<td width="30%" align="left">업체번호</td>
			<td width="65%"><input type="text" Placeholder="자동 생성" readonly="true" style="width:300px;"/></td>
		</tr>
		<tr>
			<td align="left">사업자등등록번호</td>
			<td><form:input path="scLicense" id="scLicense" style="width:300px;"/>
				<form:errors path="scLicense"/></td>
		</tr>
		<tr>
			<td align="left">사업자이름</td>
			<td><form:input path="scName1" id="scName1" style="width:300px;"/>
				<form:errors path="scName1"/></td>
		</tr>
		<tr>
			<td align="left">사업자대표이름</td>
			<td><form:input path="scName2" id="scName2" style="width:300px;"/>
				<form:errors path="scName2"/></td>
		</tr>
		<tr>
			<td align="left">사업자종류</td>
			<td><form:input path="scSort" id="scSort" style="width:300px;"/>
				<form:errors path="scSort"/></td>
		</tr>
		<tr>
			<td align="left">사업장주소</td>
			<td>
				<input id="postcode1" type="text" value="" style="width:50px;" readonly/>&nbsp;-&nbsp;
				<input id="postcode2" type="text" value="" style="width:50px;" readonly/>&nbsp;&nbsp;
				<input id="zonecode" type="text" value="" style="width:50px;" readonly/>&nbsp;
				<input type="button" onClick="openDaumZipAddress();" value = "주소 찾기" /><br />
				<input type="text" id="address" value="" style="width:200px;" readonly/>
				<input type="text" id="address_etc" value="" style="width:200px;"/>
			</td>
		</tr>
		<tr>
			<td align="left">사업장주소<br />(RealType:hidden)</td>
			<td><form:input path="scAddr" id="scAddr" Placeholder="자동 생성" style="width: 410px" readonly="true" />
				<form:errors path="scAddr"/></td>
		</tr>
		<tr>
			<td align="left">사업자전화번호</td>
			<td><form:input path="scPh" id="scPh" style="width:300px;"/>
				<form:errors path="scPh"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center" style="padding-top: 10px;">
				<input type="submit" value="등록" id="sbt" style="font-size : 20px; width: 15%; height: 50px;"/>
				<input type="button" value="취소" onclick="location.href='ctSupplyList'" style="font-size : 20px; width: 15%; height: 50px;"/>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>
<%@ include file ="../footer.jsp" %>