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
	<form:form action="joinAction" name="frm" id="frm" method="post" commandName="joinCommand">
		<table width=600 class="line">
			<tr>
				<td width="200 ">
					직원 번호
				</td>
				<td width="400">
					<form:hidden path="employeeNum" id="employeeNum" size="30" maxlenght="28" />
					<%-- <form:errors path="employeeNum" /> --%>
				</td>
			</tr>
			
			<tr>
				<td width="200">
					직원 이름<%-- <spring:message code="name" /> --%>
				</td>
				<td width="400">
					<form:input path="employeeName" id="employeeName" size="12" maxlenght="10" />
					<form:errors path="employeeName" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직원 이메일
				</td>
				<td width="400">
					<form:input path="employeeEmail" id="employeeEmail" size="30" maxlenght="28" />
					<form:errors path="employeeEmail" />
				</td>
			</tr>
			
			<%-- <tr>
				<td width="200">
					이메일 중복 확인
				</td>
				<td width="400">
					<form:input path="employeeEmail" id="employeeEmail" size="12" maxlenght="10" />
					<input type="button" name="emailCon" id="emailCon" value="중복 확인" />
					<form:errors path="employeeEmail" /><!-- path에는 프로퍼티 명이 옴 -->
				</td>
			</tr> --%>
			
			<tr>
				<td width="200">
					직원 비밀번호<%-- <spring:message code="password" /> --%>
				</td>
				<td width="400">
					<form:password path="employeePw" id="employeePw" size="12" maxlenght="10" />
					<form:errors path="employeePw" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					비밀번호 확인<%-- <spring:message code="password.confirm" /> --%>
				</td>
				<td width="400">
					<form:password path="pwCon" id="pwCon" size="12" maxlenght="10" />
					<form:errors path="pwCon" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직원 연락처
				</td>
				<td width="400">
					<form:input path="employeePh" id="employeePh" size="30" maxlenght="28" />
					<form:errors path="employeePh" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직원 경력
				</td>
				<td width="400">
					<form:input path="employeeHiredYrs" id="employeeHiredYrs" size="30" maxlenght="28" />
					<form:errors path="employeeHiredYrs" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					직원 입사연도
				</td>
				<td width="400">
					<form:input path="employeeHiredate" id="employeeHiredate" size="12" maxlenght="10" />
					<form:errors path="employeeHiredate" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					성별
				</td>
				<td width="400">
					 남자 : <input type="radio" value="M" name="employeeGender" id="employeeGender" checked="checked" />
					 여자 : <input type="radio" value="F" name="employeeGender" id="employeeGender" />
				</td>
			</tr>
			
			<tr>
				<td width="200">
					직원 생일
				</td>
				<td width="400">
					<form:input path="employeeBirth" id="employeeBirth" size="12" maxlenght="10" />
					<form:errors path="employeeBirth" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직원 키
				</td>
				<td width="400">
					<form:input path="employeeHeight" id="employeeHeight" size="30" maxlenght="28" />
					<form:errors path="employeeHeight" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직원 몸무게
				</td>
				<td width="400">
					<form:input path="employeeWeight" id="employeeWeight" size="30" maxlenght="28" />
					<form:errors path="employeeWeight" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직원 활동수치
				</td>
				<td width="400">
					<form:input path="employeeActive" id="employeeActive" size="30" maxlenght="28" />
					<form:errors path="employeeActive" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직원 권장섭취 칼로리
				</td>
				<td width="400">
					<form:input path="employeeKcal" id="employeeKcal" size="30" maxlenght="28" />
					<form:errors path="employeeKcal" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					부서 코드 번호
				</td>
				<td width="400">
					<form:select path="deptNum" id="deptNum">
						<form:option value=""><b>--부서 선택--</b></form:option>
							<c:forEach var="dept" items="${selectDept }" varStatus="i">
								<form:option value="${dept.deptNum }">${dept.deptNum }</form:option>
							</c:forEach>
					</form:select>
					<form:errors path="deptNum" />
				</td>
			</tr>
			
			<tr>
				<td width="200 ">
					직종 코드 번호
				</td>
				<td width="400">
					<form:select path="jopTypeNum" id="jopTypeNum">
						<form:option value=""><b>--직종 선택--</b></form:option>
							<c:forEach var="jopt" items="${selectJopt }" varStatus="i">
								<form:option value="${jopt.jopTypeNum }">${jopt.jopTypeNum }</form:option>
							</c:forEach>
					</form:select>
					
					<form:errors path="jopTypeNum" />
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
				<div align="center"><br />
					<input type="submit" value="가입하기" />
					<input type="reset" value="다시 입력" />
					<button>가입안함</button>
				</div>
				</td>
			</tr>
		</table>
	</form:form>
</div>	
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp"%>