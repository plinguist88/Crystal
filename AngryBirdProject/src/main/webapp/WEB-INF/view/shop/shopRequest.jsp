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
<link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script>
	var rangeDate = 31; // set limit day
	var setSdate, setEdate;
	$(function() {
		$("#shopRequestStartTime").datepicker({
			dateFormat : 'yy-mm-dd',
			minDate : 0,
			onSelect : function(selectDate) {
				var stxt = selectDate.split("-");
				stxt[1] = stxt[1] - 1;
				var sdate = new Date(stxt[0], stxt[1], stxt[2]);
				var edate = new Date(stxt[0], stxt[1], stxt[2]);
				edate.setDate(sdate.getDate() + rangeDate);

				$('#shopRequestEndTime').datepicker('option', {
					minDate : selectDate,
					beforeShow : function() {
						$("#shopRequestEndTime").datepicker("option", "maxDate", edate);
						setSdate = selectDate;
						console.log(setSdate)
					}
				}); //to 설정
			} //from 선택되었을 때
		});

		$("#shopRequestEndTime").datepicker({
			dateFormat : 'yy-mm-dd',
			onSelect : function(selectDate) {
				setEdate = selectDate;
				console.log(setEdate)
			}
		});
		$('.btn').on('click', function(e) {
			if ($('input#shopRequestStartTime').val() == '') {
				alert('시작일을 선택해주세요.');
				$('input#shopRequestStartTime').focus();
				return false;
			} else if ($('input#shopRequestEndTime').val() == '') {
				alert('종료일을 선택해주세요.');
				$('input#shopRequestEndTime').focus();
				return false;
			}

			var t1 = $('input#shopRequestStartTime').val().split("-");
			var t2 = $('input#shopRequestEndTime').val().split("-");
			var t1date = new Date(t1[0], t1[1], t1[2]);
			var t2date = new Date(t2[0], t2[1], t2[2]);
			var diff = t2date - t1date;
			var currDay = 24 * 60 * 60 * 1000;
			if (parseInt(diff / currDay) > rangeDate) {
				alert('로그 조회 기간은 ' + rangeDate + '일을 초과할 수 없습니다.');
				return false;
			}
		});
	}); //조회 버튼 클릭
</script>

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
						<td width="200" ><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶ 직원번호</h3></td>
						<td width="400">
							<form:input path="employeeNum" id="employeeNum" size="30" maxlenght="28" />
						</td>
					</tr>
					
					<tr>
						<td width="200"><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶ 담당연예인이름</h3></td>
						<td width="400">
							<form:select path="managerCelebrity" id="managerCelebrity">
								<form:option value=""><b>--담당 연예인선택--</b></form:option>
									<c:forEach var="shopReq" items="${list }" varStatus="i">
										<form:option value="${shopReq.managerCelebrity }">${shopReq.managerCelebrity }</form:option>
									</c:forEach>
							</form:select>
						</td>
					</tr>
					<tr>
						<td width="200"><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶  예약가능한 숍</h3></td>
						<td width="400">
							<form:select path="shopsName" id="shopsName">
								<form:option value=""><b>--숍 선택하기--</b></form:option>
									<c:forEach var="shopReq" items="${shops2 }" varStatus="i">
										<form:option value="${shopReq.shopsName }">${shopReq.shopsName }</form:option>
									</c:forEach>
							</form:select>
						</td>
					</tr>
					<tr>
						<td width="200"><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶ 방문일자선택</h3></td>
						<td width="400">
							<div class="wrap">
								<div>
									<form:input path="shopRequestStartTime" id="shopRequestStartTime"/>
									&nbsp;&nbsp;~&nbsp;&nbsp; <form:input path="shopRequestEndTime" id="shopRequestEndTime"/>
									&nbsp;&nbsp;<button class="btn">조회</button>
								</div>
							</div>
					</tr>
					<tr>
						<td colspan="2">
						<div align="center">
							<input type="submit" value="신청하기" />
							<input type="reset" value="다시입력" />
						</div>
						</td>
				</table>
			</form:form>
		</div>
</body>
</html>