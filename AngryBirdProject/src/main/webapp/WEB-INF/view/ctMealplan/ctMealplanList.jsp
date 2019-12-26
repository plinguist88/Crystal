<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:set var="now" value="<%=new java.util.Date() %>" />
<c:set var="sysDay"><fmt:formatDate value="${now}" pattern="dd" /></c:set>

<link href="${pageContext.request.contextPath}/css/css/ctMain.css" rel="stylesheet" >

<script type="text/javascript">
	
</script>

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}
:lang(en) {font-family: Arial, Helve tica, sans-serif;}

.main{
	background-image: url("images/mp1.jpg");
}

.dateline{
	width: 45%;
	height: 6%;
	border: 3px solid red;
	padding-left: 20px;
	padding-right: 20px;
	padding-bottom: 20px;
	border-radius: 30px;
	background-color: white;
	text-align: center;
	font-size: 20px;
	margin-top: 5px;
}
.today{
	text-decoration: underline;
	text-decoration-style: double;
	text-decoration-color: red;
	margin-bottom: 5px;
}

.day{
	border: 2px solid red;
	border-radius: 50%;
}
a {
	text-decoration: none;
	color: black;
}

.afterDay{
	color: #bfbfbf;
}
</style>

<title>ctMealplanList</title>
</head>
<body>
<div class="main" align="center">
	<div class="dateline" align="center">
		<div class="today"">
			Today
		</div>
		<span class="beforeDay"">
			<a href="#"><c:out value="${sysDay-5 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${sysDay-4 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${sysDay-3 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${sysDay-2 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${sysDay-1 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
		</span>
		<span class="day"">
			<a href="#">&nbsp;<c:out value="${sysDay}" /></a>
		</span>
		<span class="afterDay"">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ sysDay+1}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ sysDay+2}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ sysDay+3}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ sysDay+4}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ sysDay+5}" />
		</span>
	</div>
	<div class="mealplanList">
		<table>
			<tr>
				<td>
				</td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>
<%@ include file ="../footer.jsp" %>