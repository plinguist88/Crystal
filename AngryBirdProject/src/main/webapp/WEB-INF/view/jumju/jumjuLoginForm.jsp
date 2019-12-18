<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form id="frm" name="frm" action="jjLoginAction" method="post" commandName="jumjuLoginCommand" >
	<table border="1">
		<tr>
			<td>UserId</td>
				<td>
					<form:input id="id" path="id"  />
					<form:errors path="id" />
				</td>
			<td>
				<form:checkbox path="jjIdStore" /> : Remember Me
			</td>
		</tr>
		
		<tr>
			<td>Password</td>
				<td>
					<form:password id="pw" path="pw" />
					<form:errors path="pw" />
				</td>
			<td>
				<input type="submit" id="btn" value="로그인" />
			</td>
		</tr>
		<tr>
			<td colspan=2>
				<a href="#">아이디 찾기</a>|<a href="#">비밀번호 찾기</a>&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>