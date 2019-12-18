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
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
function exePostCode() {
	new daum.Postcode({
		oncomplete: function(data) {
		// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
		
			// 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
			// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
			var extraRoadAddr = ''; // 도로명 조합형 주소 변수
	
			// 법정동명이 있을 경우 추가한다. (법정리는 제외)
			// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
			if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
				extraRoadAddr += data.bname;
			}
			// 건물명이 있고, 공동주택일 경우 추가한다.
			if(data.buildingName !== '' && data.apartment === 'Y'){
				extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
			}
			// 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
			if(extraRoadAddr !== ''){
				extraRoadAddr = ' (' + extraRoadAddr + ')';
			}
			// 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
			if(fullRoadAddr !== ''){
				fullRoadAddr += extraRoadAddr;
			}
	
			// 우편번호와 주소 정보를 해당 필드에 넣는다.
			console.log(data.zonecode);
			console.log(fullRoadAddr);
			
			//$("[name=storeOwnerAddr]").val(data.zonecode);
			//$("[name=storeOwnerAddr1]").val(fullRoadAddr);
			
			document.getElementById('storeOwnerAddr1').value = data.zonecode; //5자리 새우편번호 사용
			document.getElementById('storeOwnerAddr2').value = fullRoadAddr;
			
			
		}
	
	}).open();
}
</script>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function() {
	
	$("#storeOwnerAddr3").on('blur', function(){
		var total = $("#storeOwnerAddr1").val() + " " + $("#storeOwnerAddr2").val() + " " + $("#storeOwnerAddr3").val()
		if (total != null) {
			$("#storeOwnerAddr").val(total);
		
		} else {
			return false;
			
		}
		
	});
});
</script>
</head>
<body>
<div class="container">
	<!-- form: 라이브러리를 사용함 -->									<!-- controller에서 받은 command객체에 path와 같은 이름에 값을 줌 -->
	<form:form action="jjJoinAction" name="frm" id="frm" method="post" commandName="jumjuJoinCommand">
		<table width=600 class="line">
			<tr>
				<td width="200">
					점주 ID
				</td>
				<td width="400">
					<form:hidden path="storeOwnerId" id="storeOwnerId" size="30" maxlenght="30" />
					<%-- <form:errors path="storeOwnerId" /> --%>
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
				<td class="form-group">
					<form:input path="storeOwnerAddr1" id="storeOwnerAddr1" placeholder="우편번호" class="form-group" size="12" maxlenght="255" readonly="readonly"/>
					<button type="button" class="btn btn-default" onclick="exePostCode();"><i class="fa fa-search"></i>주소 찾기</button><br/>
					<form:input path="storeOwnerAddr2" id="storeOwnerAddr2" class="form-control" size="40" maxlength="255" placeholder="도로명 주소" readonly="readonly" /><br/>
					<form:input path="storeOwnerAddr3" id="storeOwnerAddr3" class="form-control" size="40" maxlenght="255" placeholder="상세주소" /><br/>
					<form:errors path="storeOwnerAddr" />
					<form:input path="storeOwnerAddr" id="storeOwnerAddr" class="form-control" size="40" maxlenght="255" placeholder="모든주소" readonly="readonly" hidden="hidden"/>
					
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
				<td width="200">
					점주 코드 번호
				</td>
				<td width="400">
					<form:input path="storeCodeNum" id="storeCodeNum" size="30" maxlenght="5" />
					<form:errors path="storeCodeNum" />
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