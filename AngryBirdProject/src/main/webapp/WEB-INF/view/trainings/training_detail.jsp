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

<title>트레이닝 상세내용</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){	
	$("#btn").click(function(){
		location.href="/AngryBirdProject/trainings";
	});                  
});
</script>

</head>
<body>
	<h2>트레이닝 상세보기</h2>	
	<form action="/AngryBirdProject/updateTraining" id="frm" method="post">				
		<table class="line">
			<tr>
				<td>
					트레이닝 번호 
				</td>
				<td>
					${tDTO.trainingNum }
					<input type="hidden" name="trainingNum" value="${tDTO.trainingNum }"/>
				</td>
			</tr>
			<tr>
				<td>
					트레이닝 레벨
				</td>
				<td >
					<c:choose>
						<c:when test="${tDTO.trainingLevel eq 'step1'}">기초반</c:when>
						<c:when test="${tDTO.trainingLevel eq 'step2'}">심화반</c:when>
						<c:when test="${tDTO.trainingLevel eq 'step3'}">데뷔반</c:when>
						<c:when test="${tDTO.trainingLevel eq 'step4'}">연예인반</c:when>																		
					</c:choose>
				</td>
			</tr>		
			<tr>
				<td >
					트레이닝 시작일자
				</td>
				<td >
					${tDTO.trainingStartDate }
				</td>
			</tr>			
			<tr>
				<td >
					트레이닝 종료일자
				</td>
				<td >
					${tDTO.trainingEndDate }
				</td>
			</tr>
			<tr>
				<td >
					트레이닝 커리큘럼
				</td>
				<td >
					${tDTO.trainingCurriculum }
				</td>
			</tr>	
			<tr>
				<td>트레이닝 수강생</td>
				<td>
					
					<select name="chosenContractors" id="chosenContractors" multiple="multiple" style="width: 300px;">
					<c:forEach var="con" items="${conList }">
						<option value="${con.contractorId }">${con.contractorId } ${con.contractorName }</option>
					</c:forEach>
					</select>
					<br />
					<input type="submit" value="수강생 등록" />	
									
				</td>
			</tr>		
			<tr>
				<td colspan="2">
				<div align="center"><br />
					<button type="button" id="btn">목록으로</button>
				</div>
				</td>
			</tr>
		</table>
	</form>				
</body>
</html>
<%@ include file="/WEB-INF/view/footer.jsp"%>