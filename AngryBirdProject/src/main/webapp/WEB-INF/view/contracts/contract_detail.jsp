<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="/WEB-INF/view/header.jsp"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link href="${pageContext.request.contextPath}/css/css/style.css"
	rel="stylesheet">

<title>계약서 상세보기</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			location.href="/AngryBirdProject/initialContracts";
		});
		
	});
</script>
</head>
<body>
	<h2>계약서 내용</h2>								
		<table class="line">
			<tr>
				<td>
					계약자 ID <%-- 비밀번호는 계약자 ID로 자동생성하고 나중에 계약자가 변경하도록 함. --%>
				</td>
				<td>
					${ctDTO.contractorId }				
				</td>
			</tr>
			<tr>
				<td>
					계약자 이름
				</td>
				<td >
					${ctDTO.contractorName}	
				</td>
			</tr>
			<tr>
				<td >
					계약 종류
				</td>
				<td >
					<c:choose>
						<c:when test="${ctDTO.contractType eq 'trainee'}">
							연습생
						</c:when>
						<c:when test="${ctDTO.contractType eq 'celebrity'}">
							연예인
						</c:when>
					</c:choose>	
				</td>
			</tr>			
			<tr>
				<td >
					계약 시작일자
				</td>
				<td >
					${ctDTO.contractStartDate }	
				</td>
			</tr>			
			<tr>
				<td >
					계약 종료일자
				</td>
				<td >
					${ctDTO.contractEndDate }	
				</td>
			</tr>
			<tr>
				<td>
					계약서 서명
				</td>
				<td >
					<img id="MyPix" alt="전자서명" src="${ctDTO.signature }"/>
				</td>
			</tr>    
 			<tr>
				<td >
					체결 직원 ID
				</td>
				<td >
					${ctDTO.employeeId }	
				</td>
			</tr>  
 			<tr>
				<td >
					계약서 등록일
				</td>
				<td >
					${ctDTO.contractRegDate }	
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<div align="center"><br />
					<button id="btn">목록으로</button>
				</div>
				</td>
			</tr>
		</table>
</body>
</html>
<%@ include file="/WEB-INF/view/footer.jsp"%>