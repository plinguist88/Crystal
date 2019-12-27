<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/view/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >
<title>계약자 등록</title>
<script type="text/javascript" 
			src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">

/* 생년월일 정규식*/
var dateJ = /^([0-9][0-9])(0[0-9]|1[0-2])(0[0-9]|[1-2][0-9]|3[0-1])/;
/* 숫자만 */
var numJ = /\d/;
/* 전화번호 */
var phoneJ = /\d{11}/;

$(function(){
	   $("#contractorName").blur(function(){
	        if($("#contractorName").val()==""){
	        	$("#contractorNameCheck").text("계약자 이름을 입력하세요.");
	        	$("#contractorNameCheck").css('color','red');
	        } else {
	        	$("#contractorNameCheck").text('');
	        }
	    });
	   $("#contractorBirth").blur(function(){
 	        if($("#contractorBirth").val()==""){
	        	$("#contractorBirthCheck").text("계약자 생년월일을 입력하세요.");
	        	$("#contractorBirthCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#contractorBirthCheck").text('');
		        } else {
		        	$("#contractorBirthCheck").text('날짜형식이 맞지 않습니다. 생년월일은 숫자 6자리로만 입력 가능합니다.');
		        	$("#contractorBirthCheck").css('color','red');
		        }
	        } 
	    });
	   $("#contractorPhone").blur(function(){
 	        if($("#contractorPhone").val()==""){
	        	$("#contractorPhoneCheck").text("계약자 휴대폰 번호를 입력하세요.");
	        	$("#contractorPhoneCheck").css('color','red');
	        }else {
		        if(phoneJ.test($(this).val())){
		        	console.log(phoneJ.test($(this).val()));
		        	$("#contractorPhoneCheck").text('');
		        } else {
		        	$("#contractorPhoneCheck").text('휴대폰 번호는 숫자 11자리로 입력 가능합니다.');
		        	$("#contractorPhoneCheck").css('color','red');
		        }
	        } 
	    });
	   $("#contractorAddr").blur(function(){
 	        if($("#contractorAddr").val()==""){
	        	$("#contractorAddrCheck").text("계약자 주소를 입력하세요.");
	        	$("#contractorAddrCheck").css('color','red');
	        }
	    });
	   $("#contractorLevel").blur(function(){
	        if($("#contractorLevel").val()=="선택하세요"){
	        	$("#contractorLevelCheck").text("권한레벨을 선택하세요.");
	        	$("#contractorLevelCheck").css('color','red');
	        }
	    });

	   $("#frm").submit(function(){
		   if($("#contractorName").val()=="" || 
			  $("#contractorBirth").val()=="" || 
			  $("#contractorPhone").val()=="" || 
			  $("#contractorAddr").val()=="" || 
			  $("#contractorLevel").val()=="선택하세요" ){
			   alert("모든 항목을 채워주세요.");
			   return false;
		   }
	   });
});


</script>
</head>
<body>
<div class="container">
	<h2>계약자 계정 생성</h2>
	<!-- form: 라이브러리를 사용함 -->									<!-- controller에서 받은 command객체에 path와 같은 이름에 값을 줌 -->
	<form:form action="registerContractor" name="frm" id="frm" method="post" commandName="regContractorCommand">
		<table class="line">
			<tr>
				<td>
					계약자 ID <%-- 비밀번호는 계약자 ID로 자동생성하고 나중에 계약자가 변경하도록 함. --%>
				</td>
				<td>자동생성 됩니다.
					<form:hidden path="contractorId" id="contractorId" />
				</td>
			</tr>
			<tr>
				<td>
					계약자 비밀번호 <%-- 비밀번호는 계약자 ID로 자동생성하고 나중에 계약자가 변경하도록 함. --%>
				</td>
				<td>자동생성 됩니다.
					<form:hidden path="contractorPw" id="contractorPw" />
				</td>
			</tr>			
			<tr>
				<td>
					계약자 이름
				</td>
				<td >
					<form:input path="contractorName" id="contractorName" size="12" maxlength="10" />
					<div id="contractorNameCheck"></div>
				</td>
			</tr>
			<tr>
				<td >
					계약자 성별
				</td>
				<td >
					 남자 : <input type="radio" value="M" name="contractorGender" id="contractorGender" checked="checked" />
					 여자 : <input type="radio" value="F" name="contractorGender" id="contractorGender" />
				</td>
			</tr>			
			<tr>
				<td >
					계약자 생년월일
				</td>
				<td >
					<form:input path="contractorBirth" id="contractorBirth" size="10" />
					<div id="contractorBirthCheck"></div>
				</td>
			</tr>
			
			<tr>
				<td >
					계약자 전화번호
				</td>
				<td >
					<form:input path="contractorPhone" id="contractorPhone" size="30" maxlength="28" />
					<div id="contractorPhoneCheck"></div>
				</td>
			</tr>
			
			<tr>
				<td>
					계약자 주소
				</td>
				<td>
					<form:input path="contractorAddr" id="contractorAddr" size="70" />
					<div id="contractorAddrCheck"></div>
				</td>
			</tr>
			
			<tr>
				<td>
					지원번호   <!-- 필수항목 아님 -->
				</td>
				<td>
					 <form:input path="participantNum" id="participantNum" />
				</td>
			</tr>
			<tr>
				<td>
					계약자 권한레벨 <%-- 권한레벨은 계약종류에 따라 다르게, 연습생은 0, 연예인은 1 --%>
				</td>
				<td>
					<form:select path="contractorLevel"  id="contractorLevel">
						<form:option value="선택하세요" label="선택하세요"/>
						<form:option value="0" label="연습생"/>
						<form:option value="1" label="연예인"/>
					</form:select>
					<div id="contractorLevelCheck"></div>
				</td>
			</tr>
		
			<tr>
				<td colspan="2">
				<div align="center"><br />
					<input type="submit" value="등록하기" />
					<input type="reset" value="다시 입력" />
				</div>
				</td>
			</tr>
		</table>
	</form:form>
</div>	
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp"%>