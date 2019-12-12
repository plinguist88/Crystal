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

/* 일자 정규식*/
var dateJ = /\d{8}/;
/* 숫자만 */
var numJ = /\d/;

$(function(){
	   $("#auditionTitle").blur(function(){
	        if($("#auditionTitle").val()==""){
	        	$("#titleCheck").text("제목을 입력하세요.");
	        	$("#titleCheck").css('color','red');
	        } else {
	        	$("#titleCheck").text('');
	        }
	    });
	   $("#auditionNum").blur(function(){
 	        if($("#auditionNum").val()==""){
	        	$("#auditionNumCheck").text("회차를 입력하세요.");
	        	$("#auditionNumCheck").css('color','red');
	        }else {
		        if(numJ.test($(this).val())){
		        	console.log(numJ.test($(this).val()));
		        	$("#auditionNumCheck").text('');
		        } else {
		        	$("#auditionNumCheck").text('숫자로만 입력 가능합니다.');
		        	$("#auditionNumCheck").css('color','red');
		        }
	        } 
	    });
	   $("#startDate").blur(function(){
 	        if($("#startDate").val()==""){
	        	$("#startDateCheck").text("시작일을 입력하세요.");
	        	$("#startDateCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#startDateCheck").text('');
		        } else {
		        	$("#startDateCheck").text('일자는 숫자 8자리로 입력 가능합니다.');
		        	$("#startDateCheck").css('color','red');
		        }
	        } 

	    });
	   $("#endDate").blur(function(){
 	        if($("#endDate").val()==""){
	        	$("#endDateCheck").text("종료일을 입력하세요.");
	        	$("#endDateCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#endDateCheck").text('');
		        } else {
		        	$("#endDateCheck").text('일자는 숫자 8자리로 입력 가능합니다.');
		        	$("#endDateCheck").css('color','red');
		        }
	        } 

	    });
	   $("#auditionType").blur(function(){
	        if($("#auditionType").val()==""){
	        	$("#auditionTypeCheck").text("오디션 종류를 입력하세요.");
	        	$("#auditionTypeCheck").css('color','red');
	        }else {
	        	$("#auditionTypeCheck").text('');
	        }
	    });
	   $("#auditionGather").blur(function(){
	        if($("#auditionGather").val()==""){
	        	$("#gatherCheck").text("모집인원을 입력하세요.");
	        	$("#gatherCheck").css('color','red');
	        }else {
		        if(numJ.test($(this).val())){
		        	console.log(numJ.test($(this).val()));
		        	$("#gatherCheck").text('');
		        } else {
		        	$("#gatherCheck").text('숫자로만 입력 가능합니다.');
		        	$("#gatherCheck").css('color','red');
		        }
	        } 
	    });
	   $("#auditionContent").blur(function(){
	        if($("#auditionContent").val()==""){
	        	$("#contentCheck").text("내용을 입력하세요.");
	        	$("#contentCheck").css('color','red');
	        }else {
	        	$("#contentCheck").text('');
	        }
	    });
});


</script>
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<title>audition_upload.jsp</title>
</head>
<%@ include file="/WEB-INF/view/header.jsp"%>
<body>
<div  class="container">
<h2>오디션 공고 등록</h2>
<form:form action="registerAudition" method="post" commandName="auditionCommand">
<table class="line">
	<tr>
		<td>제목</td><td><form:input path="auditionTitle" size="60" id="auditionTitle"/><div id="titleCheck"></div></td>
	</tr>	
	<tr>
		<td>회차</td><td><form:input path="auditionNum" id="auditionNum"/><div id="auditionNumCheck"></div></td>
	</tr>
	<tr>
		<td>시작일</td><td><form:input path="startDate" id="startDate" /><div id="startDateCheck"></div></td>
	</tr>
	<tr>
		<td>종료일</td><td><form:input path="endDate" id="endDate"/><div id="endDateCheck"></div></td>
	</tr>
	<tr>
		<td>종류</td><td><form:input path="auditionType" id="auditionType" /><div id="auditionTypeCheck"></div></td>
	</tr>
	<tr>
		<td>모집인원</td><td><form:input path="auditionGather" id="auditionGather" /><div id="gatherCheck"></div></td>
	</tr>
	<tr>
		<td>내용</td><td><form:textarea path="auditionContent" id="auditionContent" /><div id="contentCheck"></div></td>
	</tr>
	<tr>
	<td colspan="2"><div align="center"><br />
<input type="submit" value="등록"/><input type="reset" value="취소"/>
</div></td>
	</tr>
</table>

</form:form>
</div>
<%@ include file="/WEB-INF/view/footer.jsp"%>
</body>



</html>