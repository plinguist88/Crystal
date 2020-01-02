<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Child</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
$(function() {
	document.getElementById("childInput").value = opener.document.getElementById("from").value;
	document.getElementById("childInput2").value = opener.document.getElementById("to").value;
});	
</script>
</head>
<body>
	<br>
	<div align="center">
		<b><font size="5" color="gray">대여가능차량확인</font></b>
		<br>
		<hr>
		<br>
		<br> <input type="text" id="childInput">
		<br> <input type="text" id="childInput2"><br>
		<br> <input type="button" value="창닫기" onclick="window.close()">
	</div>
</body>
</html>
