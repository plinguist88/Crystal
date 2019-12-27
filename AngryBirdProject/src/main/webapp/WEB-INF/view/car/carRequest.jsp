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
<title>차량 예약신청 페이지</title>
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
			<h2>차량 예약신청</h2>
		</div>
			<br />
		
		<div class="container">
			<form:form action="carRequestPro" name="frm" id="frm" method="post" commandName="carRequestCommand">
				<table width=600 class="line">
					<tr>
						<td width="200" >직원번호</td>
						<td width="400">
							<form:input path="employeeNum" id="employeeNum" size="30" maxlenght="28" />
						</td>
					</tr>
					
				<tr>
					<td width="200">대여기간선택</td>
					<td width="400">
						<div class="wrap">
							<div>
								시작 : <input type="text" id="from">
								~ 종료 : <input type="text" id="to">
								<button class="btn">조회</button>
							</div>
						</div>
				</tr>	
						
				<tr>
						<td width="200">대여시작일자</td>
						<td width="400"><input type='date' name='startDate' /></td>
					</tr>
					<tr>
						<td width="200">대여종료일자</td>
						<td width="400"><input type='date' name='endDate' /></td>
					</tr>
					
					<tr>
						<tr>
						<td width="200" >차량대여일자</td>
						<td width="400">
							<form:input path="carRequestRentalDate" id="carRequestRentalDate" size="30" maxlenght="28" />
						</td>
					</tr>
					<tr>
						<tr>
						<td width="200" >차량반납일자</td>
						<td width="400">
							<form:input path="carRequestReturnDate" id="carRequestReturnDate" size="30" maxlenght="28" />
						</td>
					</tr>
					<tr>
						<td width="200">차량종류</td>
						<td width="400">
						
					<form:select path="carType" id="carType">
						<form:option value=""><b>--차량선택--</b></form:option>
							<c:forEach var="carReq" items="${cars }" varStatus="i">
								<form:option value="${carReq.carType }">${carReq.carType }</form:option>
							</c:forEach>
					</form:select>
					<form:select path="carPassengerNum" id="carPassengerNum">
						<form:option value=""><b>--인승선택--</b></form:option>
							<c:forEach var="carReq" items="${cars }" varStatus="i">
								<form:option value="${carReq.carPassengerNum }">${carReq.carPassengerNum }</form:option>
							</c:forEach>
					</form:select>
						<form:errors path="carPassengerNum" />
						</td>
					</tr>
				<!--  	<tr>
						<td width="200" >신청 대여일자</td>
						<td width="400"><input type='date' name='startDate' />
						</td>
					</tr>
					<tr>
						<td width="200">신청 반납일자</td>
						<td width="400"><input type='date' name='startDate' />
						</td>
					</tr>-->
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