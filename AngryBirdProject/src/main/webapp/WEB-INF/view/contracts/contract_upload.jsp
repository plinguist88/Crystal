<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="/WEB-INF/view/header.jsp"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link href="${pageContext.request.contextPath}/css/css/style.css"
	rel="stylesheet">

<title>계약자 등록</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
/* 전자 서명을 위한 팝업창 */
function signature1(){
	var myWindow = window.open("/AngryBirdProject/signatureSheet","signatureSheet","width=500, height=500");
}

/* 계약일자 정규식*/
var dateJ = /^(20\d{2})(0[0-9]|1[0-2])(0[0-9]|[1-2][0-9]|3[0-1])/;

$(function(){	
	   $("#contractStartDate").blur(function(){
	        if($("#contractStartDate").val()==""){
	        	$("#contractStartDateCheck").text("계약자 생년월일을 입력하세요.");
	        	$("#contractStartDateCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#contractStartDateCheck").text('');
		        } else {
		        	$("#contractStartDateCheck").text('날짜형식이 맞지 않습니다. 올바른 예) 20191231');
		        	$("#contractStartDateCheck").css('color','red');
		        }
	        } 
	    });
	   $("#contractEndDate").blur(function(){
	        if($("#contractEndDate").val()==""){
	        	$("#contractEndDateCheck").text("계약자 생년월일을 입력하세요.");
	        	$("#contractEndDateCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#contractEndDateCheck").text('');
		        } else {
		        	$("#contractEndDateCheck").text('날짜형식이 맞지 않습니다. 올바른 예) 20191231');
		        	$("#contractEndDateCheck").css('color','red');
		        }
	        } 
	    });	
		   
	$("#frm").submit(function(){
        if($("#contractorId").val()=="" || 
        	$("#contractType").val()=="선택하세요" || 
       	 	$("#contractStartDate").val()=="" || 
        	$("#contractEndDate").val()=="")     
      		{
      			alert("모든 항목을 입력주세요.");
      			return false;
    		}
        if($("#signature").val()=="")
        	{
        		alert("전자서명을 등록해주세요.");
  				return false;
       		}
	});	                       
});
    </script>
</head>
<body>
	<h2>계약서 등록</h2>								
	<form:form action="/AngryBirdProject/contractUpload" method="post" id="frm" commandName="contractCommand">
		<table class="line">
			<tr>
				<td>
					계약자 ID <%-- 비밀번호는 계약자 ID로 자동생성하고 나중에 계약자가 변경하도록 함. --%>
				</td>
				<td>${conDTO.contractorId }
					<form:hidden path="contractorId" value="${conDTO.contractorId }" />
				</td>
			</tr>
			<tr>
				<td>
					계약자 이름
				</td>
				<td >
					${conDTO.contractorName }
					<form:hidden path="contractorName" value="${conDTO.contractorName }" />
				</td>
			</tr>
			<tr>
				<td >
					계약 종류
				</td>
				<td >
					<form:select path="contractType">
						<form:option value="선택하세요"></form:option>
						<form:option value="trainee">연습생</form:option>
						<form:option value="celebrity">연예인</form:option>
					</form:select>
				</td>
			</tr>			
			<tr>
				<td >
					계약 시작일자
				</td>
				<td >
					<form:input path="contractStartDate" id="contractStartDate" size="8" />
					<div id="contractStartDateCheck"></div>
				</td>
			</tr>			
			<tr>
				<td >
					계약 종료일자
				</td>
				<td >
					<form:input path="contractEndDate" id="contractEndDate" size="8" />
					<div id="contractEndDateCheck"></div>
				</td>
			</tr>
			<tr>
				<td>
					계약서 서명
				</td>
				<td >
					<input type="button" id="btn1" value="서명하기" onclick="signature1()"/>
					<form:hidden path="signature" id="signature"/>
					<img id="MyPix" alt="전자서명 등록 시 화면에 나타납니다." />
					<div id="signatureCheck"></div>
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
</body>
</html>
<%@ include file="/WEB-INF/view/footer.jsp"%>