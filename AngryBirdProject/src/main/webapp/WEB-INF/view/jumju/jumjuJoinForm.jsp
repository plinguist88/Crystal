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
<title>가입<%-- <spring:message code="member.info" /> --%></title>
</head>
<body>
<div class="container">
	<!-- form: 라이브러리를 사용함 -->									<!-- controller에서 받은 command객체에 path와 같은 이름에 값을 줌 -->
	<form:form action="jjJoinAction" name="frm" id="frm" method="post" commandName="jumjuJoinCommand">
		<table width=600 class="line">
			<tr>
				<td width="200">
					점주 코드 번호
				</td>
				<td width="400">
					<form:hidden path="storeCodeNum" id="storeCodeNum" size="30" maxlenght="5" />
					<%-- <form:errors path="employeeNum" /> --%>
				</td>
			</tr>
			
			<tr>
				<td width="200">
					점주 ID
				</td>
				<td width="400">
					<form:hidden path="storeOwnerId" id="storeOwnerId" size="30" maxlenght="30" />
					<form:errors path="storeOwnerId" />
				</td>
			</tr>
			<tr>
				<td width="200">
					점주 이름
				</td>
				<td width="400">
					<form:input path="storeOwnerName" id="storeOwnerName" size="12" maxlenght="10" />
					<form:errors path="storeOwnerName" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					점주 비밀번호
				</td>
				<td width="400">
					<form:password path="storeOwnerPw" id="storeOwnerPw" size="30" maxlenght="15" />
					<form:errors path="storeOwnerPw" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					비밀번호 확인
				</td>
				<td width="400">
					<form:password path="jjPwCon" id="jjPwCon" size="12" maxlenght="15" />
					<form:errors path="jjPwCon" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					사업자 등록번호
				</td>
				<td width="400">
					<form:input path="storeNo" id="storeNo" size="30" maxlenght="13" />
					<form:errors path="storeNo" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					거래은행 이름
				</td>
				<td width="400">
					<form:input path="storeOwnerBank" id="storeOwnerBank" size="30" maxlenght="40" />
					<form:errors path="storeOwnerBank" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					계좌번호
				</td>
				<td width="400">
					<form:input path="storeOwnerAccount" id="storeOwnerAccount" size="12" maxlenght="15" />
					<form:errors path="storeOwnerAccount" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					점주 전화번호
				</td>
				<td width="400">
					<form:input path="storeOwnerPhone" id="storeOwnerPhone" size="12" maxlenght="11" />
					<form:errors path="storeOwnerPhone" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					주소
				</td>
				<td width="400">
					<form:input path="storeOwnerAddr" id="storeOwnerAddr" size="12" maxlenght="255" />
					<form:errors path="storeOwnerAddr" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					점주 계약일자
				</td>
				<td width="400">
					<form:input path="storeContractDay" id="storeContractDay" size="12" maxlenght="255" />
					<form:errors path="storeContractDay" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					점주 정산금액
				</td>
				<td width="400">
					<form:hidden path="storeOwnerCalculMoney" id="storeOwnerCalculMoney" size="30" maxlenght="9" />
					<%-- <form:errors path="jjCalMoney" /> --%>
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
				<div align="center"><br />
					<input type="submit" value="가입하기" />
					<input type="reset" value="다시 입력" />
					<input type="button" onclick="javascript:history.back();" value="뒤로 가기" />
				</div>
				</td>
			</tr>
		</table>
	</form:form>
</div>	
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp"%>