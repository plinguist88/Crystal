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

<link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script>
var rangeDate = 31; // set limit day
var setSdate, setEdate;
$(function() { 							//document.ready(function)
	/*$(".carChoose").hide();*/
	
	$("#from").datepicker({
			dateFormat : 'yy-mm-dd',
			minDate : 0,
			onSelect : function(selectDate) {
				var stxt = selectDate.split("-");
				stxt[1] = stxt[1] - 1;
				var sdate = new Date(stxt[0], stxt[1], stxt[2]);
				var edate = new Date(stxt[0], stxt[1], stxt[2]);
				edate.setDate(sdate.getDate() + rangeDate);

				$('#to').datepicker('option', {
					minDate : selectDate,
					beforeShow : function() {
						$("#to").datepicker("option", "maxDate", edate);
						setSdate = selectDate;
						console.log(setSdate)
					}
				});
				//to 설정
			}
		//from 선택되었을 때
		});

		$("#to").datepicker({
			dateFormat : 'yy-mm-dd',
			onSelect : function(selectDate) {
				setEdate = selectDate;
				console.log(setEdate)
			}
		});

		$('.btn').on('click', function(e) {
			if ($('input#from').val() == '') {
				alert('시작일을 선택해주세요.');
				$('input#from').focus();
				return false;
			} else if ($('input#to').val() == '') {
				alert('종료일을 선택해주세요.');
				$('input#to').focus();
				return false;
			}

			var t1 = $('input#from').val().split("-");
			var t2 = $('input#to').val().split("-");
			var t1date = new Date(t1[0], t1[1], t1[2]);
			var t2date = new Date(t2[0], t2[1], t2[2]);
			var diff = t2date - t1date;
			var currDay = 24 * 60 * 60 * 1000;
			if (parseInt(diff / currDay) > rangeDate) {
				alert('로그 조회 기간은 ' + rangeDate + '일을 초과할 수 없습니다.');
				return false;
			}
				/*$(".carChoose").show();*/
		});
	});
	//조회 버튼 클릭
</script>

<script type="text/javascript">
	var openWin;

	function openCar() {
		// window.name = "부모창 이름"; 
		window.name = "carRequest.jsp";
		// window.open("open할 window", "자식창 이름", "팝업창 옵션");
		openWin = window.open("/AngryBirdProject/ChildPage", "carListForm", "width=570, height=350, resizable = no, scrollbars = no");
	}
</script>

<style>

.a {
	border: 4px dashed #bcbcbc;
}

.main{
	border-style : none;
	position : relative;
	z-index : 1;
}

.main .bg{
	position : absolute;
	z-index : -1;
	top : 0;
	bottom :0;
	left : 250px;
	right : 0;
	background :url("images/c4.jpg") center center;
	opacity : .2;
	width : 70%;
	height : 100%;
}

</style>
</head>

<body>
	<div class="main" >
	<div class="bg"></div>
		<div>
			<br />
			<br />
		</div>
		<div class="a" align="center">
			<h2>차량 예약신청</h2>
		</div>
		
			<br />
		
		<div class="b" align="center">
			<form:form action="carRequestPro" name="frm" id="frm" method="post" commandName="carRequestCommand">
				<table width=600 class="line">
					<tr>
						<td width="200"><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶ 직원번호</h3></td>
						<td width="400">
							<form:input path="employeeNum" id="employeeNum" size="30" maxlenght="28" />
						</td>
					</tr>
					<tr>
						<td width="200"><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶ 차량종류/탑승인원</h3></td>
						<td width="400">
						
					<form:select path="carType" id="carType">
						<form:option value=""><b>--탑승 차량선택--</b></form:option>
							<c:forEach var="carReq" items="${cars }" varStatus="i">
								<form:option value="${carReq.carType }">${carReq.carType }</form:option>
							</c:forEach>
					</form:select>
					
					<form:select path="carPassengerNum" id="carPassengerNum">
						<form:option value=""><b>--탑승 가능인원--</b></form:option>
							<c:forEach var="carReq" items="${cars }" varStatus="i">
								<form:option value="${carReq.carPassengerNum }">${carReq.carPassengerNum }</form:option>
							</c:forEach>
					</form:select>
						<form:errors path="carPassengerNum" />
						</td>
					</tr>
					<tr>
						<td width="200"><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶ 대여기간선택</h3></td>
						<td width="400">
							<div class="wrap">
								<div>
									<form:input path="from" id="from"/>
									&nbsp;&nbsp;~&nbsp;&nbsp; <form:input path="to" id="to"/>
									&nbsp;&nbsp;<button type = "button" class="btn" onclick="openCar()">조회</button>
								</div>
							</div>
					</tr>
					<tr class="carChoose">					
						<td width="100"><h3>&nbsp;&nbsp;&nbsp;&nbsp;▶ 대여가능차량</h3></td>
						<td width="500"><form:select path="carRegNum1" id="carRegNum1">
								<form:option value="">
									<b>--예약가능 차량번호--</b>
								</form:option>
								<c:forEach var="carReq" items="${cars }" varStatus="i">
									<form:option value="${carReq.carRegNum }">${carReq.carRegNum }</form:option>
								</c:forEach>
							</form:select></td>				
					</tr>
					<tr>
						<td colspan="2">
							<div align="center">
								<input type="submit" value="신청하기" /> 
								<input type="reset"	value="다시입력" />
							</div>
						</td>
					</tr>
			</table>
		</form:form>
	</div>
	</div>
</body>
</html>