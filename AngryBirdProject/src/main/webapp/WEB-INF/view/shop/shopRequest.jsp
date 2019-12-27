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
<meta charset="UTF-8">
<title>숍 예약신청 페이지</title>
<style>
div {
	border-right-style : none;
}

.a {
	border: 4px dashed #bcbcbc;
}
</style>
</head>
<body>
		<div>
			<br />
			<br />
		</div>
		<div class="a" align="center">
			<h2>숍 예약신청</h2>
		</div>
		
			<br />
		
		<div>
			<form:form action="shopRequestPro" name="frm" id="frm" meEthod="post" commandName="shopRequestCommand">
				<table width=600 class="line">
					<tr>
						<td width="200" >직원 번호</td>
						<td width="400">
							<form:input path="employeeNum" id="employeeNum" size="30" maxlenght="28" />
						</td>
					</tr>
					<tr>
						<td width="200">담당 연예인 이름</td>
						<td width="400">
							<form:input path="managerCelebrity" id="managerCelebrity" size="30" maxlenght="28" />
						</td>
					</tr>
					<tr>
						<td width="200">직원 연락처</td>
						<td width="400">
							<form:input path="employeePh" id="employeePh" size="30" maxlenght="28" />
							<form:errors path="employeePh" />
						</td>
					</tr>
					<tr>
						<td width="200">예약시작일자</td>
						<td width="400"><input type='date' name='startDate' /></td>
					</tr>
					<tr>
						<td width="200">예약종료일자</td>
						<td width="400"><input type='date' name='endDate' /></td>
					</tr>
					<tr>
						<td colspan="2">
						<div align="center">
							<input type="submit" value="신청하기" />
							<input type="reset" value="다시입력" />
							<button>가입취소</button>
						</div>
						</td>
				</table>
			</form:form>
		</div>
</body>
</html>