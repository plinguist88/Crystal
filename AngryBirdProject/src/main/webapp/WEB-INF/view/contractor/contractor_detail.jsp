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
<title>계약자 등록</title>
<script type="text/javascript" 
			src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">

/* 생년월일 정규식*/
var dateJ = /\d{6}/;
/* 숫자만 */
var numJ = /\d/;
/* 전화번호 */
var phoneJ = /\d{11}/;

$(function(){
	$("#btn").click(function(){
		location.href="/AngryBirdProject/${conDTO.contractorId }";
	});
});


</script>
</head>
<body>
<div class="container">
	<h2>계약자 계정 생성</h2>
		<c:if test="${!empty conDTO }">
		<table class="line">
			<tr>
				<td>
					계약자 ID <%-- 비밀번호는 계약자 ID로 자동생성하고 나중에 계약자가 변경하도록 함. --%>
				</td>
				<td>
					${conDTO.contractorId }
				</td>
			</tr>
			<tr>
				<td>
					계약자 비밀번호 <%-- 비밀번호는 계약자 ID로 자동생성하고 나중에 계약자가 변경하도록 함. --%>
				</td>
				<td>
					초기 비밀번호는 ID와 동일합니다. 변경 필요합니다.
				</td>
			</tr>			
			<tr>
				<td>
					계약자 이름
				</td>
				<td >
					${conDTO.contractorName }
				</td>
			</tr>
			<tr>
				<td >
					계약자 성별
				</td>
				<td >
					${conDTO.contractorGender }
				</td>
			</tr>			
			<tr>
				<td >
					계약자 생년월일
				</td>
				<td >
					${conDTO.contractorBirth }
				</td>
			</tr>
			
			<tr>
				<td >
					계약자 전화번호
				</td>
				<td >
					${conDTO.contractorPhone }
				</td>
			</tr>
			
			<tr>
				<td>
					계약자 주소
				</td>
				<td>
					${conDTO.contractorAddr }
				</td>
			</tr>
			
			<tr>
				<td>
					지원번호   <!-- 필수항목 아님 -->
				</td>
				<td>
					${conDTO.participantNum }
				</td>
			</tr>
			<tr>
				<td>
					계약자 권한레벨 <%-- 권한레벨은 계약종류에 따라 다르게, 연습생은 0, 연예인은 1 --%>
				</td>
				<td>
					<c:choose>
						<c:when test="${conDTO.contractorLevel ==0}">
							연습생
						</c:when>
						<c:when test="${conDTO.contractorLevel ==1}">
							연예인
						</c:when>
					</c:choose>
					
				</td>
			</tr>
		
			<tr>
				<td colspan="2">
				<div align="center"><br />
					<button id="btn">계약서 등록</button>
				</div>
				</td>
			</tr>
		</table>
	</c:if>	
</div>	
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp"%>