<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script>
		var arr = new Array();
		
		$(document).ready(function() {
			
		});
		
		function addMenu(menuId) {
			var itemsIdx = "";
			var count = 0;
			var price = 0;
			
			if (arr != null) {
				$(arr).each(function(idx, data) {
					if (data.itemsNo === menuId) {
						arr.splice(idx, 1);
						itemsIdx = idx;
						count = data.itemsCount;
						price = data.itemsPrice;
						console.log("itemsIdx : " + itemsIdx + ", count : " + count + ", price : " + price);
					}
				});
			}
			
			var obj = new Object();
			
			switch (menuId) {
				case "0":
					console.log("초기화");
					break;
					
				case "1":
					console.log("상품1");
					obj.itemsNo = '1';
					obj.itemsName = '상품1';
					obj.itemsCount = count + 1;
					obj.itemsPrice = price + 30000;
					break;
					
				case "2":
					console.log("상품2");
					obj.itemsNo = '2';
					obj.itemsName = '상품2';
					obj.itemsCount = count + 1;
					obj.itemsPrice = price + 30000;
					break;
					
				case "3":
					console.log("상품3");
					obj.itemsNo = '3';
					obj.itemsName = '상품3';
					obj.itemsCount = count + 1;
					obj.itemsPrice = price + 30000;
					break;
					
				case "4":
					console.log("상품4");
					obj.itemsNo = '4';
					obj.itemsName = '상품4';
					obj.itemsCount = count + 1;
					obj.itemsPrice = price + 30000;
					break;
					
				case "5":
					console.log("상품5");
					obj.itemsNo = '5';
					obj.itemsName = '상품5';
					obj.itemsCount = count + 1;
					obj.itemsPrice = price + 30000;
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
					tbl += 		"<td><input type='text' name=" + "'itemsNo' value=" + "'" + data.itemsNo + "' /></td>";
					tbl += 		"<td><input type='text' name=" + "'itemsName' value=" + "'" + data.itemsName + "' /></td>";
					tbl += 		"<td><input type='text' name=" + "'itemsCount' value=" + "'" + data.itemsCount + "' /></td>";
					tbl += 		"<td><input type='text' name=" + "'itemsPrice' value=" + "'" + data.itemsPrice + "' /></td>";
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
		
		//상품관리
		function goods() {
			alert("상품관리");
			$.ajax({
					type : "POST",
					 url : "goodsList",
			//		data : $("#frmOrder").serialize(),
				dataType : "html",
				 success : function(data) {
					//alert("통신 데이터 값 : " + data);
					$("#goodsList1").html(data);
				 },
				 error : function() {
					alert("통신 실패!!");
				 }
			 
			});
		}
		
	</script>
</head>
<body>
	<div style="width: 50%; float: left; box-sizing: border-box;">
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
	
	<div style="width: 50%; float: right; box-sizing: border-box;">
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
		<h2>상품관리</h2>
		<table id="goodsList1">
		
		</table>
	</div>
	
	<div style="width: 50%; float: right; box-sizing: border-box;">
		<table id="">
		
		</table>
	</div>
</body>
</html>