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
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function() {
	$("#btn").click(function() {
		if( $("#frm").css("display") == "none") {
			$("#frm").css("display", "block");
			
		} else {
			$("#frm").css("display", "none");
			
		}
	});
});
</script>
</head>
<body>
	<table border="1" style="height: auto; width:20%; border:1px">
		<c:if test="${!empty goodsList }">
		
			<tr>
				<c:forEach var="goods" items="${goodsList }" varStatus="i">
					
					
					<c:if test="${i.count % 5 == 0}">
						<tr></tr>
					</c:if>
					
					<th align="center" valign="bottom" >${goods.itemsName }<hr>${goods.itemsCount }</th>
					
				</c:forEach>
			</tr>
			
		</c:if>
	</table>
	<b>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ</b>
	<div><input type="button" id="btn" value="상품등록" /></div>  <!-- onclick="window.open('goodsListDetail')" -->
	
	<form:form action="insertGoods" method="post" commandName="goodsCommand" id="frm" style="display:none">
		<table id="table">
			<tr>
				<td>
					상품 번호 : 
				</td>
				<td>
					<form:hidden path="itemsNo" id="itemsNo" placeholder="상품번호" />
				</td>
			</tr>
			<tr>
				<td>
					상품 이름 :
				</td>
				<td>
					<form:input path="itemsName" id="itemsName" placeholder="상품명" />
				</td>
			</tr>
			<tr>
				<td>
					상품 종류 : 
				</td>
				<td>
					<form:input path="itemsSort" id="itemsSort" placeholder="상품종류" />
				</td>
			</tr>
			<tr>
				<td>
					상품 개수 : 
				</td>
				<td>
					<form:input path="itemsCount" id="itemsCount" placeholder="상품개수" />
				</td>
			</tr>
			<tr>
				<td>
					상품 판매 가격 :
				</td>
				<td>
					<form:hidden path="itemsPrice" id="itemsPrice" placeholder="상품판매가격" />
				</td>
			</tr>
			<tr>
				<td>
					상품 단가 금액 :
				</td>
				<td>
					<form:input path="itemsUnitPrice" id="itemsUnitPrice" placeholder="상품단가금액" />
				</td>
			</tr>
			<tr>
				<td>
					상품 가격 책정 :
				</td>
				<td>
					<form:hidden path="itemsProtrait" id="itemsProtrait" placeholder="상품개수" />
				</td>
			</tr>
			<tr>
				<td>
					상품 가격 책정2 :
				</td>
				<td>
					<form:hidden path="itemsMarjin" id="itemsMarjin" placeholder="상품개수" />
				</td>
			</tr>
			<tr>
				<td>
					계약자번호 : 
				</td>
				<td>
					<form:hidden path="contractorNum" id="contractorNum" placeholder="상품개수" />
				</td>
			</tr>
			<tr>
				<td>
					계약자타입 : 
				</td>
				<td>
					<form:hidden path="contractorType" id="contractorType" placeholder="상품개수" />
				</td>
			</tr>
			<tr>
				<td>
					계약자이름 : 
				</td>
				<td>
					<form:hidden path="contractorName" id="contractorName" placeholder="상품개수" />
				</td>
			</tr>
			<tr>
				<td>
					계약자ID :
				</td>
				<td>
					<form:hidden path="contractorId" id="contractorId" placeholder="상품개수" />
				</td>
			</tr>
		</table>
		
		<input type="submit" name="sbm" value="등록" />
	</form:form>
</body>
</html>