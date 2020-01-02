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

<title>바디프로필 등록</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
/* 부모창에서 자식창으로 값전달 함수 */
function standards(){
	var myWindow = window.open("/AngryBirdProject/calculateStandards","calculateStandards","width=500, height=700");
}


/* 측정일자 정규식*/
var dateJ = /^(20\d{2})(0[0-9]|1[0-2])(0[0-9]|[1-2][0-9]|3[0-1])/;
var heightJ = /^([0-9][0-9][0-9])/;
var weightJ = /^([0-9][0-9]|[0-9][0-9][0-9])/;



$(function() {
	$("#cal").click(function() {
		standards();
	});


	$("#measureDate").blur(function() {
		if ($("#measureDate").val() == "") {
			$("#measureDateCheck").text("측정일자를 입력하세요.");
			$("#measureDateCheck").css('color', 'red');
		} else {
			if (dateJ.test($(this).val())) {
				console.log(dateJ.test($(this).val()));
				$("#measureDateCheck").text('');
			} else {
				$("#measureDateCheck").text('날짜형식이 맞지 않습니다. 올바른 예) 20191231');
				$("#measureDateCheck").css('color', 'red');
			}
		}	
	});
	$("#height").blur(function() {
		if ($("#height").val() == "") {
			$("#heightCheck").text("키를 입력하세요.");
			$("#heightCheck").css('color', 'red');
		} else {
			if (heightJ.test($(this).val())) {
				console.log(heightJ.test($(this).val()));
				$("#heightCheck").text('');
			} else {
				$("#heightCheck").text('정수로만 입력가능합니다.');
				$("#heightCheck").css('color', 'red');
			}
		}	
	});
	$("#weight").blur(function() {
		if ($("#weight").val() == "") {
			$("#weightCheck").text("몸무게를 입력하세요.");
			$("#weightCheck").css('color', 'red');
		} else {
			if (weightJ.test($(this).val())) {
				console.log(weightJ.test($(this).val()));
				$("#weightCheck").text('');
			} else {
				$("#weightCheck").text('정수로만 입력가능합니다.');
				$("#weightCheck").css('color', 'red');
			}
		}	
	});
/* 	$("#frm").submit(
			function() {
				if ($("#contractorId").val() == ""
						|| $("#contractType").val() == "선택하세요"
						|| $("#contractStartDate").val() == ""
						|| $("#contractEndDate").val() == "") {
					alert("모든 항목을 입력주세요.");
					return false;
				}
				if ($("#signature").val() == "") {
					alert("전자서명을 등록해주세요.");
					return false;
				}
		}); */
});
</script>
</head>
<body>
	<h2>바디프로필 등록</h2>								
	<form:form action="/AngryBirdProject/bodyProfileUpload"  method="post" commandName="bodyProfileCommand">
		<table class="line">
			<tr>
				<td >
					계약자 ID
				</td>
				<td >
					${conDTO.contractorId }
					<form:hidden path="contractorId" value="${conDTO.contractorId }"/>
				</td>
			</tr>	
			<tr>
				<td >
					나이
				</td>
				<td >
					만 ${conDTO.contractorBirth } 세
					<form:hidden path="age" id="age" value="${conDTO.contractorBirth }"/>
				</td>
			</tr>			
			<tr>
				<td >
					성별
				</td>
				<td >
					<c:choose>
						<c:when test="${conDTO.contractorGender eq 'M'}">
							남자
						</c:when>
						<c:when test="${conDTO.contractorGender eq 'F'}">
							여자
						</c:when>
					</c:choose>	
					<form:hidden path="gender" id="gender" value="${conDTO.contractorGender }"/>
				</td>
			</tr>						
			<tr>
				<td>
					측정일자
				</td>
				<td>
					<form:input path="measureDate" id="measureDate" size="8" />
					<div id="measureDateCheck"></div>
				</td>
			</tr>
			<tr>
				<td>
					키와 몸무게
				</td>
				<td >
					키: <form:input path="height" id="height" maxlength="3" size="3"/><div id="heightCheck"></div><br /> 
					몸무게: <form:input path="weight" id="weight" maxlength="3" size="3"/><div id="weightCheck"></div>
					
				</td>
			</tr>	
			<tr>
				<td>
					기초대사량
				</td>
				<td >
<%-- 					표준몸무게: <form:input path="standardWeight" maxlength="3" size="3" readonly="readonly" style="border:none"/> --%>
					기초대사량: <form:input path="metabolism" maxlength="4" size="4" readonly="readonly" style="border:none"/> kcal
					<button type="button" id="cal">계산하기</button>
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