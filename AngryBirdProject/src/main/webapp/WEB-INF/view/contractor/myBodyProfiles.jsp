<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ include file="/WEB-INF/view/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<title>내 신체계측정보 리스트</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		location.href="/AngryBirdProject/goBodyProfile";
	});
});	
</script>

<!-- 구글 차트  -->
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
google.charts.load('current', {'packages':['line', 'corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {

var chartDiv = document.getElementById('chart_div');

var data = new google.visualization.DataTable();
data.addColumn('string', 'Month');
data.addColumn('number', "weight");
data.addColumn('number', "BMR");

<c:if test="${! empty profileList }">
data.addRows([
	<c:forEach var="pDTO" items="${profileList}" varStatus="status">
		<c:if test="${! status.last}" >
		['${pDTO.measureDate}', ${pDTO.weight},  ${pDTO.metabolism}],
		</c:if>
	
		<c:if test="${status.last}" >
		['${pDTO.measureDate}', ${pDTO.weight},  ${pDTO.metabolism}]
		</c:if>	
		</c:forEach>
]);
</c:if>



var materialOptions = {
  chart: {
    title: '몸무게 및 기초대사량 변화 추이'
  },
  
  width: 900,
  height: 500,
  series: {
    // Gives each series an axis name that matches the Y-axis below.
    0: {axis: 'weight'},
    1: {axis: 'BMR'}
  },
  axes: {
    // Adds labels to each axis; they don't have to match the axis names.
    y: {
      Temps: {label: 'weight'},
      Daylight: {label: 'BMR'}
    }
  }
};

function drawMaterialChart() {
  var materialChart = new google.charts.Line(chartDiv);
  materialChart.draw(data, materialOptions);
}

drawMaterialChart();

}
</script>
<style type="text/css">

</style>
</head>
<body>
<div class="container" >
<h2>나의 바디프로필 리스트</h2>
	<div align="center">
       <div id="chart_div" style="width: 1000px; height: 500px; border:1px solid black;"></div>
   </div><br /><br />    
<table class="bottom">
	<tr>
		<th>번호</th><th>측정일자</th><th>키</th><th>몸무게</th><th>기초대사량</th>
	</tr>
	<c:if test="${! empty profileList }">
		<c:forEach var="pDTO" items="${profileList}" varStatus="status"> <!-- 처음 el을 통해서 items에 받아올때는 model에서 넣은 큰 dto만 넣고, forEach에서 돌릴 때 큰 DTO.필드명(작은dto).필드명(작은 dto의 멤버변수) 형식으로 해야함 -->
			<tr>
				<td align="center">${status.count }</td>
				<td align="center">
					<!-- 문자열로 받은 날짜를 Date로 변환 -->
<%-- 					<fmt:parseDate value="${pDTO.measureDate}" pattern="yyyyMMdd" var="measureDate"/>
					<fmt:formatDate value="${measureDate}" pattern="yyyyMMdd" var="me"/>
					<a href="<c:url value='/measureDetail/${me}' />">${me}</a> --%>
					<a href="<c:url value='/measureDetail/${pDTO.measureDate}' />">${pDTO.mDate}</a>
				</td>
				<td align="center">${pDTO.height }</td>
				<td align="center">${pDTO.weight }</td>	
				<td align="center">${pDTO.metabolism }</td>		
			</tr>
		</c:forEach>
	</c:if>
	<tr><td colspan="5"><button id="btn1" >바디프로필 등록</button></td></tr>
</table>

</div>
</body>
</html>

<%@ include file="/WEB-INF/view/footer.jsp" %>
