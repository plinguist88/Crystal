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
<title>SHOP RESERV. 페이지</title>
</head>
<body>
	<div class="container">
			<form:form action="###" name="frm" id="frm" method="post" commandName="###">
				<div class="form-group">
					<form:hidden class="form-control" path="goodsNum" id="goodsNum" />
					<label for="selectDate"><h3>▶ 선택날짜</h3></label> 
					<input type="date" class="forcontrol" name="selectDate" id="selectDate">
					<input type="submit" class="btn btn-dark" />
				</div>
				<table width=600 class="line">
					<tr>
						<td width="200 ">
							직원 번호
						</td>
						<td width="400">
							<form:hidden path="#" id="#" size="30" maxlenght="28" />
						</td>
					</tr>
					<tr>
						<td width="200 ">
							담당 연예인 이름
						</td>
						<td width="400">
							<form:hidden path="#" id="#" size="30" maxlenght="28" />
						</td>
					</tr>
				</table>
			</form:form>
	</div>
</body>
</html>