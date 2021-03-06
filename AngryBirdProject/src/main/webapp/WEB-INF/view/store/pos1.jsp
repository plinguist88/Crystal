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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script>
		var arr = new Array();
		var all = "";
		$(document).ready(function() {
			
		});
		
		function addMenu(menuId) {
			
			var itIdx = "";
			var cnt = 0;
			var price = "";
			
			if (arr != null) {
				$(arr).each(function(idx, data) {
					if (data.itNo === menuId) {
						arr.splice(idx, 1);
						itIdx = idx;
						cnt = data.itCnt;
						price = data.itPrice;
						console.log("itIdx : " + itIdx + ", cnt : " + cnt + ", price : " + price);
					}
					
				});
			}
			
			var obj = new Object();
			
			switch (menuId) {
				case "0":
					console.log("reset");
					$("#orderList tbody").remove();
					location.reload();
				//	obj.itNo = $('#num').removeAttr('value');
				//	obj.itName = document.getElementById("name").removeAttribute("name");
				//	obj.itCnt = document.getElementById("cnt").removeAttribute("name");
				//	obj.itPrice = document.getElementById("pri").removeAttribute("name");
					break;
					
				case "1":
					var a = $("#itemsNo_" + menuId).val();
					var b = $("#itemsName_" + menuId).val();
					var c = $("#itemsPrice_" + menuId).val();
					obj.itNo = a;
					obj.itName = b;
					obj.itCnt = cnt + 1;
					obj.itPrice = c * obj.itCnt;
					break;
					
				case "2":
					var a = $("#itemsNo_" + menuId).val();
					var b = $("#itemsName_" + menuId).val();
					var c = $("#itemsPrice_" + menuId).val();
					console.log("상품2");
					obj.itNo = a;
					obj.itName = b;
					obj.itCnt = cnt + 1;
					obj.itPrice = c * obj.itCnt;
					break;
					
				case "3":
					var a = $("#itemsNo_" + menuId).val();
					var b = $("#itemsName_" + menuId).val();
					var c = $("#itemsPrice_" + menuId).val();
					console.log("상품3");
					obj.itNo = a;
					obj.itName = b;
					obj.itCnt = cnt + 1;
					obj.itPrice = c * obj.itCnt;
					break;
					
				case "4":
					var a = $("#itemsNo_" + menuId).val();
					var b = $("#itemsName_" + menuId).val();
					var c = $("#itemsPrice_" + menuId).val();
					console.log("상품4");
					obj.itNo = a;
					obj.itName = b;
					obj.itCnt = cnt + 1;
					obj.itPrice = c * obj.itCnt;
					break;
					
				case "5":
					var a = $("#itemsNo_" + menuId).val();
					var b = $("#itemsName_" + menuId).val();
					var c = $("#itemsPrice_" + menuId).val();
					console.log("상품5");
					obj.itNo = a;
					obj.itName = b;
					obj.itCnt = cnt + 1;
					obj.itPrice = c * obj.itCnt;
					break;
				
				case "6":
					console.log("상품6");
					break;
				
				case "7":
					console.log("상품7");
					break;
					
				case "8":
					console.log("상품8");
					break;
					
				case "9":
					console.log("상품9");
					break;
					
				case "10":
					console.log("상품10");
					break;
					
				case "11":
					console.log("상품11");
					break;
					
				case "12":
					console.log("상품12");
					break;
					
				case "13":
					console.log("상품13");
					break;
					
				case "14":
					console.log("상품14");
					break;
					
				case "15":
					console.log("상품15");
					break;
				
			}
			arr.push(obj);
			
			var tbl = "";
			if (arr != null) {
				console.log(arr);
				$("#orderList > tbody").empty();
				
				$(arr).each(function(idx, data) {
					tbl += "<tr>";
					tbl += 		"<td>&nbsp;&nbsp;&nbsp;<input type='text' name=" + "'itemsNo' id=" + "'num' value=" + "'" + data.itNo + "'" + " style='width:20px;border:none;' /></td>";
					tbl += 		"<td><input type='text' name=" + "'itemsName' id=" + "'name' value=" + "'" + data.itName + "'" + " style='width:50px;border:none;' /></td>";
					tbl += 		"<td>&nbsp;&nbsp;&nbsp;<input type='text' name=" + "'itemsCount' id=" + "'cnt' value=" + "'" + data.itCnt + "'" + " style='width:20px;border:none;' /></td>";
					tbl += 		"<td><input type='text' name=" + "'itemsPrice' id=" + "'pri' value=" + "'" + data.itPrice + "'" + " style='width:50px;border:none;' /></td>";
					tbl += "</tr>";
				});
				
				$("#orderList tbody").append(tbl);
			}
		}
		
		//결제
		function payment() {
			alert("결제");
			$.ajax({
					type : "POST",
					 url : "payment",
					data : $("#frmOrder").serialize(),
				dataType : "json",
				 success : function(data) {
					alert("통신 데이터 값 : " + data);
					
				 },
				 error : function() {
					alert("통신 실패!!");
				 }
			 
			});
			$("#orderList tbody").removeItem('goodsList');
			setTimeout(function(){
				location.reload();
			},1000);
			
			
		}
		
		//매출정보
		function salesRecord() {
			alert("매출정보");
			$.ajax({
					type : "POST",
					 url : "",
				//	data : $("#frmOrder").serialize(),
				dataType : "html",
				 success : function(data) {
					alert("통신 데이터 값 : " + data);
				 },
				 error : function() {
					alert("통신 실패!!");
				 }
			 
			});
		}
		
		
	</script>
</head>
<body>
	<div style="width: 30%; float: left; box-sizing: border-box;">
		<h2>주문 리스트</h2>
		<table>
			<tr>
				<td>
					<input type="button" value="결제" onclick="payment();" />
				</td>
				<td>
					<input type="button" value="매출정보" onclick="salesRecord();" />
				</td>
				<td>
					<input type="button" value="상품관리" onclick="goods();" />
				</td>
				<td>
					<input type="button" value="초기화" onclick="addMenu('0');">
				</td>
			</tr>
		</table>
		
		<form id="frmOrder">
			<table id="orderList">
				<thead>
					<th width="25%">No.</th>
					<th width="25%">상품명</th>
					<th width="25%">수량</th>
					<th width="25%">가격</th>
				</thead>
				<tbody>
				
				</tbody>
			</table>
		</form>
	</div>
	
	<div style="width: 30%; float: left; box-sizing: border-box;">
		<h2>상품명</h2>
		<table>
			<tr>
				<td>
					<input type="button" value="상품1" onclick="addMenu('1');">
				</td>
				<td>
					<input type="button" value="상품2" onclick="addMenu('2');">
				</td>
				<td>
					<input type="button" value="상품3" onclick="addMenu('3');">
				</td>
				<td>
					<input type="button" value="상품4" onclick="addMenu('4');">
				</td>
				<td>
					<input type="button" value="상품5" onclick="addMenu('5');">
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="상품6" onclick="addMenu('6');">
				</td>
				<td>
					<input type="button" value="상품7" onclick="addMenu('7');">
				</td>
				<td>
					<input type="button" value="상품8" onclick="addMenu('8');">
				</td>
				<td>
					<input type="button" value="상품9" onclick="addMenu('9');">
				</td>
				<td>
					<input type="button" value="상품10" onclick="addMenu('10');">
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="상품11" onclick="addMenu('11');">
				</td>
				<td>
					<input type="button" value="상품12" onclick="addMenu('12');">
				</td>
				<td>
					<input type="button" value="상품13" onclick="addMenu('13');">
				</td>
				<td>
					<input type="button" value="상품14" onclick="addMenu('14');">
				</td>
				<td>
					<input type="button" value="상품15" onclick="addMenu('15');">
				</td>
			</tr>
		</table>
		
	</div>
	
	<div style="width: 30%; float: right; box-sizing: border-box;">
		<h2>상품목록</h2>
		<table id="goodsList">
			<c:if test="${!empty goodsList }">
				<tr>
					<c:forEach var="goods" items="${goodsList }" varStatus="i">
						<input type="hidden" id="itemsNo_${goods.itemsNo }" value="${goods.itemsNo }" style="width:50px;border:none;" readonly="readonly"/>
						<input type="text" id="itemsName_${goods.itemsNo }" value="${goods.itemsName }" style="width:50px;border:none;" readonly="readonly"/> | &nbsp;
						<input type="text" id="itemsCount_${goods.itemsNo }" value="${goods.itemsCount }" style="width:50px;border:none;" readonly="readonly"/> | &nbsp; 
						<input type="text" id="itemsPrice_${goods.itemsNo }" value="${goods.itemsPrice }" style="width:50px;border:none;" readonly="readonly"/><br/><br/>
					</c:forEach>
				</tr>
				
			</c:if>
		</table>
		<b>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ</b>
	<div><input type="button" id="btn" value="상품주문" /></div>  <!-- onclick="window.open('goodsListDetail')" -->
	
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
					주문 개수 : 
				</td>
				<td>
					<form:input path="itemsCount" id="itemsCount" placeholder="상품개수" />
				</td>
			</tr>
		</table>
		
		<input type="submit" name="sbm" value="등록" />
	</form:form>
	</div>
</body>
</html>