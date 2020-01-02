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
/* 생년월일 정규식*/
var dateJ = /\d{6}/;
/* 숫자만 */
var numJ = /\d/;
/* 전화번호 */
var phoneJ = /\d{11}/;

$(function(){
	   $("#candidateName").blur(function(){
 	        if($("#candidateName").val()==""){
	        	$("#candidateNameCheck").text("지원자 이름을 입력하세요.");
	        	$("#candidateNameCheck").css('color','red');
	        }else{
	        	$("#candidateNameCheck").text('');
	        }
	    });
	   $("#candidateBirth").blur(function(){
 	        if($("#candidateBirth").val()==""){
	        	$("#candidateBirthCheck").text("지원자 생년월일을 입력하세요.");
	        	$("#candidateBirthCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#candidateBirthCheck").text('');
		        } else {
		        	$("#candidateBirthCheck").text('생년월일은 숫자 6자리로 입력 가능합니다. 예: 910101');
		        	$("#candidateBirthCheck").css('color','red');
		        }
	        } 
	    });
	   $("#candidatePh").blur(function(){
 	        if($("#candidatePh").val()==""){
	        	$("#candidatePhCheck").text("지원자 전화번호를 입력하세요.");
	        	$("#candidatePhCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(phoneJ.test($(this).val()));
		        	$("#candidatePhCheck").text('');
		        } else {
		        	$("#candidatePhCheck").text('전화번호는 -없이 숫자 11자리로 입력 가능합니다.');
		        	$("#candidatePhCheck").css('color','red');
		        }
	        } 

	    });
	   $("#candidateAddr").blur(function(){
	        if($("#candidateAddr").val()==""){
	        	$("#candidateAddrCheck").text("지원자 주소를 입력하세요.");
	        	$("#candidateAddrCheck").css('color','red');
	        }else {
	        	$("#candidateAddrCheck").text('');
	        }
	    });
	   $("#candidateVideo").blur(function(){
	        if($("#candidateVideo").val()== null){
	        	$("#candidateVideoCheck").text("참가 동영상을 업로드해주세요.");
	        	$("#candidateVideoCheck").css('color','red');
	        }else {
	        	$("#candidateAddrCheck").text('');
	        }
	    });

	   $("#frm").submit(function(){
		   if($("#candidateName").val()=="" || 
			  $("#candidateBirth").val()=="" || 
			  $("#candidatePh").val()=="" || 
			  $("#candidateAddr").val()=="" || $("#candidateVideo")[0].files.length===0 ){
			   alert("모든 항목을 채워주세요.");
			   return false;
		   }
	   });
});


</script>
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<title>applyForm</title>
</head>
<%@ include file="/WEB-INF/view/header.jsp"%>
<body>
<div  class="container">
<h2>지원자 등록</h2>
<form:form action="register" method="post" enctype="multipart/form-data" commandName="candidatesCommand" id="frm">

<form:hidden path="auditionSeq" value="${auditionSeq }"/>
<table class="line">
	<tr>
		<td width="200">지원자 번호</td>
		<td width="400">지원 완료 후 자동생성됩니다.
			<form:hidden path="candidateNum"/>
		</td>
	</tr>
	<tr>
		<td width="200">지원자 이름</td><td width="400"><form:input path="candidateName" id="candidateName"/><div id="candidateNameCheck"></div></td>
	</tr>	
	<tr>
		<td width="200">지원자 생년월일</td><td width="400"><form:input path="candidateBirth" id="candidateBirth"/><div id="candidateBirthCheck"></div></td>
	</tr>
	<tr>
		<td width="200">지원자 성별</td>
	<td width="400">
		남자 : <input type="radio" value="M" name="candidateGender" id="candidateGender" checked="checked" />
		여자 : <input type="radio" value="F" name="candidateGender" id="candidateGender" />
	</td>
	</tr>
	<tr>
		<td width="200">지원자 전화번호</td><td width="400"><form:input path="candidatePh" id="candidatePh"/><div id="candidatePhCheck"></div></td>
	</tr>
	<tr>
		<td width="200">지원자 주소</td><td width="400"><form:input path="candidateAddr" id="candidateAddr" size="60"/><div id="candidateAddrCheck"></div></td>
	</tr>
	<tr>
		<td width="200">참가 동영상</td>
		<td width="400">
		<input type="file" name="candidateVideo" id="candidateVideo" />
		<div id="candidateVideoCheck"></div>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
		<div align="center"><br />
			<input type="submit" value="등록"/>
			<button onclick="javascript: history.go(-1)">취소</button>
		</div>
		</td>
	</tr>
</table>

</form:form>
</div>
<%@ include file="/WEB-INF/view/footer.jsp"%>
</body>



</html>