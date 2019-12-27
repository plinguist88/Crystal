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

<title>트레이닝 등록</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">

/* 일자 정규식*/
var dateJ = /^(20\d{2})(0[0-9]|1[0-2])(0[0-9]|[1-2][0-9]|3[0-1])/;

$(function(){	
	   $('#summernote').summernote();
	   
	   $("#trainingStartDate").blur(function(){
	        if($("#trainingStartDate").val()==""){
	        	$("#trainingStartDateCheck").text("트레이닝 시작일자를 입력하세요.");
	        	$("#trainingStartDateCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#trainingStartDateCheck").text('');
		        } else {
		        	$("#trainingStartDateCheck").text('날짜형식이 맞지 않습니다. 올바른 예) 20191231');
		        	$("#trainingStartDateCheck").css('color','red');
		        }
	        } 
	    });
	   $("#trainingEndDate").blur(function(){
	        if($("#trainingEndDate").val()==""){
	        	$("#trainingEndDateCheck").text("트레이닝 종료일자를 입력하세요.");
	        	$("#trainingEndDateCheck").css('color','red');
	        }else {
		        if(dateJ.test($(this).val())){
		        	console.log(dateJ.test($(this).val()));
		        	$("#trainingEndDateCheck").text('');
		        } else {
		        	$("#trainingEndDateCheck").text('날짜형식이 맞지 않습니다. 올바른 예) 20191231');
		        	$("#trainingEndDateCheck").css('color','red');
		        }
	        } 
	    });	
		   
	$("#frm").submit(function(){
        if( 
        	$("#trainingLevel").val()=="선택하세요" || 
       	 	$("#trainingStartDate").val()=="" || 
        	$("#trainingEndDate").val()=="" || 
           	$("#summernote").val()=="")     
      		{
      			alert("모든 항목을 입력주세요.");
      			return false;
    		}
	});	                       
});
</script>

<!-- 섬머노트 게시판 에디터 API -->
<!-- include libraries(jQuery, bootstrap) -->
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 

<!-- include summernote css/js -->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote.js"></script>




</head>
<body>
	<h2>트레이닝 등록</h2>								
	<form:form action="/AngryBirdProject/trainingUpload" method="post" id="frm" commandName="trainingCommand">
		<table class="line">
			<tr>
				<td>
					트레이닝 번호 
				</td>
				<td>트레이닝 번호는 자동생성됩니다.
					<form:hidden path="trainingNum" />
				</td>
			</tr>
			<tr>
				<td>
					트레이닝 레벨
				</td>
				<td >
					<form:select path="trainingLevel">
						<form:option value="선택하세요"></form:option>
						<form:option value="step1">기초반</form:option>
						<form:option value="step2">심화반</form:option>
						<form:option value="step3">데뷔반</form:option>
						<form:option value="step4">연예인반</form:option>
					</form:select>
				</td>
			</tr>		
			<tr>
				<td >
					트레이닝 시작일자
				</td>
				<td >
					<form:input path="trainingStartDate" id="trainingStartDate" size="8" />
					<div id="trainingStartDateCheck"></div>
				</td>
			</tr>			
			<tr>
				<td >
					트레이닝 종료일자
				</td>
				<td >
					<form:input path="trainingEndDate" id="trainingEndDate" size="8" />
					<div id="trainingEndDateCheck"></div>
				</td>
			</tr>
			<tr>
				<td >
					트레이닝 커리큘럼
				</td>
				<td >
					<form:textarea path="editordata" id="summernote"/>
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