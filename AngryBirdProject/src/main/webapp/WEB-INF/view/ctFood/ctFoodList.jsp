<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/JavaScript" src="http://code.jquery.com/jquery-1.7.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#search").keyup(function(){
		var selectN = $("#selectN").val();
		var n = 2;
		if(selectN == 1){
			var n = 1;
		} else if(selectN == 2){
			var n = 2;
		}
		var k = $(this).val();
		$(".ctFoodList").hide();
		var temp = $(".ctFoodList > td:nth-child("+n+"):contains('"+ k +"')");
		
		$(temp).parent().show();
	});
});
</script>

<link href="${pageContext.request.contextPath}/css/css/ctMain.css" rel="stylesheet" >

<style type="text/css">
:lang(ko) {font-family: nanum gothic, sans-serif;}
:lang(en) {font-family: Arial, Helve tica, sans-serif;}

.main{
	border-style: none;
}

.quickBar{
  position: fixed;
  top: 150px;
  right: 70px;
  z-index: 99;
  
  border: 3px solid black;
  border-radius: 20px;
}

.quickBar a{
	text-decoration: none;
	display: block;
}

.orderBtn{
	font-size: 30px;
	padding: 10px;
	border: 1px solid black;
	border-radius: 10px;
	background-color: white;
}

.importBtn{
	font-size: 30px;
	padding: 10px;
	border: 1px solid black;
	border-radius: 10px;
	background-color: white;
}

.orderBtn:hover {
	background-color: red; 
	color:white;
}

.importBtn:hover {
	background-color: red;
	color: white; 
}

</style>

<title>ctFoodList</title>
</head>
<body>
<div class="main">
<table align="center" width="50%">
	<tr>
		<td colspan="4">
			<h1 align="center">Food List</h1>
		</td>
	</tr>
	<tr>
		<th width="20%">번호</th><th width="30%">이름</th><th width="30%">업체</th><th width="20%">수량</th>
	</tr>
<c:if test="${!empty ctFoodDTO }">
<c:forEach var="ctFood" items="${ctFoodDTO }">
	<tr align="center" class="ctFoodList">
		<td>${ctFood.foodNo }</td><td>${ctFood.foodName }</td><td>${ctFood.ccNo }</td><td>${ctFood.foodQty }${ctFood.foodUnit }</td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty ctFoodDTO }">
	<tr align="center">
		<td>등록된 식재료가 없습니다</td>
	</tr>
</c:if>
	<tr>
		<td colspan="4" align="center">
			<select id="selectN">
				<option value=1>번호</option>
				<option value=2>이름</option>
			</select> : <input type="text" id="search" />
		</td>
	</tr>
	<tr>
		<td colspan="4" align="center">
			<input type="button" value="등록" />
			<input type="button" value="뒤로" />
		</td>
	</tr>
</table>
</div>
<aside class="quickBar">
    <a href="ctFoodOrder"><button class="orderBtn">발주신청</button></a>
    <a href="ctFoodImport"><button class="importBtn">입고확인</button></a>
</aside>
</body>
</html>
<%@ include file ="../footer.jsp" %>