<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:set var="today" value="<%=new Date() %>" />
<fmt:formatDate value="${today }" pattern="dd" var="day"/>

<c:set var="ds1" value="<%=new Date(new Date().getTime()-1000*60*60*24*1) %>" />
<c:set var="ds2" value="<%=new Date(new Date().getTime()-1000*60*60*24*2) %>" />
<c:set var="ds3" value="<%=new Date(new Date().getTime()-1000*60*60*24*3) %>" />
<c:set var="ds4" value="<%=new Date(new Date().getTime()-1000*60*60*24*4) %>" />
<c:set var="ds5" value="<%=new Date(new Date().getTime()-1000*60*60*24*5) %>" />

<c:set var="da1" value="<%=new Date(new Date().getTime()+1000*60*60*24*1) %>" />
<c:set var="da2" value="<%=new Date(new Date().getTime()+1000*60*60*24*2) %>" />
<c:set var="da3" value="<%=new Date(new Date().getTime()+1000*60*60*24*3) %>" />
<c:set var="da4" value="<%=new Date(new Date().getTime()+1000*60*60*24*4) %>" />
<c:set var="da5" value="<%=new Date(new Date().getTime()+1000*60*60*24*5) %>" />

<fmt:formatDate value="${ds1 }" pattern="dd" var="ds1"/>
<fmt:formatDate value="${ds2 }" pattern="dd" var="ds2"/>
<fmt:formatDate value="${ds3 }" pattern="dd" var="ds3"/>
<fmt:formatDate value="${ds4 }" pattern="dd" var="ds4"/>
<fmt:formatDate value="${ds5 }" pattern="dd" var="ds5"/>

<fmt:formatDate value="${da1 }" pattern="dd" var="da1"/>
<fmt:formatDate value="${da2 }" pattern="dd" var="da2"/>
<fmt:formatDate value="${da3 }" pattern="dd" var="da3"/>
<fmt:formatDate value="${da4 }" pattern="dd" var="da4"/>
<fmt:formatDate value="${da5 }" pattern="dd" var="da5"/>

<link href="${pageContext.request.contextPath}/css/css/ctMain.css" rel="stylesheet" >

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
			<a href="#"><c:out value="${ds5 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${ds4 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${ds3 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${ds2 }" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#"><c:out value="${ds1 }"/></a>&nbsp;&nbsp;&nbsp;&nbsp;
		</span>
		<span class="day"">
			<a href="#">&nbsp;<c:out value="${day }" /></a>
		</span>
		<span class="afterDay"">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ da1}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ da2}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ da3}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ da4}" />
			&nbsp;&nbsp;&nbsp;&nbsp;<c:out value="${ da5}" />
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