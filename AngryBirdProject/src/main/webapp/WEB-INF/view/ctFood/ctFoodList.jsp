<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}
:lang(en) {font-family: Arial, Helve tica, sans-serif;}
</style>

<title>ctFoodList</title>
</head>
<body>
<c:forEach var="ctFood" items="${ctFoodDTO }">
${ctFood.foodNo }
${ctFood.foodName }
${ctFood.foodOrigin }
${ctFood.foodQty }
</c:forEach>
</body>
</html>
<%@ include file ="../footer.jsp" %>