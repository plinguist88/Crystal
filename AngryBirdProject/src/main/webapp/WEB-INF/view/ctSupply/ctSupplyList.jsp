<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath}/css/css/ctMain.css" rel="stylesheet" >

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}

.main{
	border-style: none;
	position: relative;
    z-index: 1;
}

.main .bg{
	position: absolute;
    z-index: -1;
    top: 0;
    bottom: 0;
    left: 250px;
    right: 0;
    background: url(images/backsc1.jpg) center center;
    opacity: .2;
    width: 70%;
    height: 100%;
}

.title{
	font-size: 60px;
	padding-top: 10px;
	padding-bottom: 10px;
}

.title a{
	text-decoration: none;
}

.check{
	border: 3px solid red;
	border-radius: 10px;
	color: red;
}

th{
	font-size: 40px;
	border-top: 1px solid black;
	border-bottom: 1px solid black;
}

.list td{

}
</style>

<title>ctSupplyList</title>
</head>
<body>
<div class="main">
<div class="bg"></div>
<table align="center" width="60%">
	<tr>
		<td colspan="3" class="title" align="center">
			<a href="ctSupplyList" class="check">Supply List</a> / <a href="ctContSupplyList">ContSupply List</a>
		</td>
	</tr>
	<tr>
		<th>업체번호</th><th>업체명</th><th>업종</th>
	</tr>
<c:if test="${! empty ctSupplyDTO}">
<c:forEach var="ctSupply" items="${ctSupplyDTO }">
	<tr style="font-size: 20px;" class="list">
		<td align="center" width="30%"><a href="<c:url value='ctSupplyDetail?scNo=${ctSupply.scNo }'/>">${ctSupply.scNo }</a></td>
		<td align="center" width="40%">${ctSupply.scName1 }</td>
		<td align="center" width="20%">${ctSupply.scSort }</td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty ctSupplyDTO}">
	<tr>
		<td align="center">등록된 업체가 없습니다.</td>
	</tr>
</c:if>
	<tr>
		<td colspan="3" align="center" style="padding-top: 10px;">
			<input type="button" value="등록하기" onclick="location.href='ctSupplyRegist'" style="font-size : 20px; width: 15%; height: 50px;"/>
		</td>
	</tr>
</div>
</table>
</body>
</html>
<%@ include file ="../footer.jsp" %>