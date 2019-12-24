<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" 
			src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
function evaluate(){
	var myWindow = window.open("/AngryBirdProject/evaluationSheet","evaluationSheet","width=500, height=700");
}

$(function(){
	$("#btn").click(function(){
		evaluate();
	});
}); 

</script>
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<title>candidate evaluation</title>
</head>
<%@ include file="/WEB-INF/view/header.jsp"%>
<body>
<div  class="container">
<h2>지원자 평가</h2>

<form:form action="/AngryBirdProject/evaluationRegister" method="post" commandName="evalCommand"> 
<table class="line">
	<tr>
		<td width="200">지원자 번호</td><td width="800">${cdto.candidateNum }</td>
	</tr>
	<tr>
		<td width="200">지원자 이름</td><td width="800">${cdto.candidateName }</td>
	</tr>	
	<tr>
		<td width="200">지원자 생년월일</td><td width="800">${cdto.candidateBirth }</td>
	</tr>
	<tr>
		<td width="200">지원자 성별</td><td width="800">
		<c:choose>
			<c:when test="${cdto.candidateGender eq 'M'}">남자</c:when>
			<c:when test="${cdto.candidateGender eq 'F'}">여자</c:when>
		</c:choose>
		${cdto.candidateGender}
		</td>
	</tr>
	<tr>
		<td width="200">지원자 전화번호</td><td width="800">${cdto.candidatePh }</td>
	</tr>
	<tr>
		<td width="200">지원자 주소</td><td width="800">${cdto.candidateAddr }</td>
	</tr>
	<tr>
		<td width="200">참가 동영상</td>
		<td width="800">
			<video width="auto" id="video" controls >
				<source src='<c:out value="${pageContext.request.contextPath }/candidates/upload/${cdto.storeFilename }"  />' /> <!-- type="video/mp4" -->
			</video>
		</td>
	</tr>
	
	<tr>
		<td width="200">평가 총점</td>
		<td width="800">
		<form:hidden path="candidateNum" value="${cdto.candidateNum}"/>
 		<form:input path="evalScore"  id="evalScore" size="2" readonly="readonly" /> <!-- readonly라고만 치면 안됨. form태그는 반드시 ..=..라고 쳐야함. -->
 		<form:hidden path="q1" id="q1"/>		
		<form:hidden path="q2" id="q2"/>			
		<form:hidden path="q3" id="q3"/>			
		<form:hidden path="q4" id="q4"/>			
		<form:hidden path="q5" id="q5"/>			
		<form:hidden path="q6" id="q6"/>			
		<form:hidden path="q7" id="q7"/>			
		<form:hidden path="q8" id="q8"/>	
		<form:hidden path="q9" id="q9"/>	
		<form:hidden path="q10" id="q10"/>	

		<button type="button" id="btn">평가하기</button><!--  onclick="evaluate();" -->
		</td>
	</tr>
</table>
	<div align="center"><br />
 		<input type="submit" value="평가 등록">
	</div>
</form:form>	
</div>

</body>

<%@ include file="/WEB-INF/view/footer.jsp"%>

</html>