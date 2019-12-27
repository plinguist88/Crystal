<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="/WEB-INF/view/header.jsp"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<%-- <link href="${pageContext.request.contextPath}/css/css/style.css"
	rel="stylesheet"> --%>
<link href="${pageContext.request.contextPath}/css/css/forCalendar/peach.css"
	rel="stylesheet">
<title>트레이닝 캘린더</title>
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script> -->

</head>
<body>
	<h2>트레이닝 캘린더</h2>								
	<div id="calendar" style="position:absolute; width: 100%; height: 800px"></div>
	
	<script src="${pageContext.request.contextPath }/css/css/MindFusion.Scheduling.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/css/css/MyFirstSchedule.js" type="text/javascript"></script>
	
</body>
</html>
<%@ include file="/WEB-INF/view/footer.jsp"%>