<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2>주문</h2><hr>
	</div>
	<div>
		<h3>주문리스트</h3>
	</div>
	
<form action="payment" method="post" id="frm">
	<table border="1" style="height: auto; width:40%; border:1px">
		<tr>
			<th width="4%">No.</th>
			<th width="15%">상품명</th>
			<th width="4%">수량</th>
			<th width="15%">가격</th>
		</tr>
		<tr>
			
			<td>
			
			</td>
			<td>
			
			</td>
			<td>
			
			</td>
			<td>
			
			</td>
		</tr>
	</table>
</form>
	<input type="button" value="상품관리" onclick="window.open('goodsList')" />
	<!-- <input type="button" id="btn2" value="매출정보" onclick="window.open=('salesRecord')" /> -->
	<!-- <input type="button" id="btn3" value="초기화" onclick="window.open=('reset')" /> -->
	<input type="submit" id="btn4" value="결제" />
</body>
</html>