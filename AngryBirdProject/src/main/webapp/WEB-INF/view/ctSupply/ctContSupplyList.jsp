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

<title>ctContSupplyList</title>
</head>
<body>
<div class="main">
<div class="bg"></div>
<table align="center" width="60%">
	<tr>
		<td colspan="4" class="title" align="center">
			<a href="ctSupplyList">Supply List</a> / <a href="ctContSupplyList" class="check">ContSupply List</a>
		</td>

	</tr>
	<tr>
		<th>계약번호</th><th>계약업체</th><th>계약일자<br />(YYMMDD)</th><th>계약기간<br />(년)</th>
	</tr>
<c:if test="${! empty ctContSupplyDTO}">
<c:forEach var="ctContSupply" items="${ctContSupplyDTO }">
	<tr style="font-size: 20px;" class="list">
		<td align="center" width="29%">${ctContSupply.ccNo }</td>
		<td align="center" width="29%"><a href="<c:url value='ctSupplyDetail?scNo=${ctContSupply.scNo }'/>">${ctContSupply.scNo }</a></td>
		<td align="center" width="20%">${ctContSupply.ccDay }</td>
		<td align="center" width="20%">${ctContSupply.ccPeriod }</td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty ctContSupplyDTO}">
	<tr>
		<td>계약된 업체가 없습니다.</td>
	</tr>
</c:if>
	<tr>
		<td colspan="4" align="center" style="padding-top: 10px;">
			<input type="button" value="등록하기" onclick="location.href='ctContSupplyRegist'" style="font-size : 20px; width: 15%; height: 50px;" />
		</td>
	</tr>
</table>
</div>
</body>
</html>
<%@ include file ="../footer.jsp" %>