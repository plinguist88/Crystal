<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<button type="button" onclick="location.href='supplyCompanyRegist'" />
<body>
납품업체 정보입니다<br />
<c:forEach var="scList" items="${supplyCompanyList }">
업체번호 : ${scList.scNo }
업체등록번호 : ${scList.scLicense }
업체명 : ${scList.scName1 }<br />
</c:forEach>
</body>
</html>