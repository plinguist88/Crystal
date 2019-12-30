<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../publicFile/taglib.jsp" %>
<%@ include file ="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath}/css/css/ctMain.css" rel="stylesheet" >

<style type="text/css">
:lang(ko) {font-family:nanum gothic, sans-serif;}
:lang(en) {font-family: Arial, Helve tica, sans-serif;}

.main{
	border-style: none;
}

.subMain{
	width: 100%;
	height: 750px;
	opacity: 0.3;
}

.foodBox{
	position: absolute;
	top: 40%;
	left: 16%;
 	text-align: center;
	opacity: 0;
	border: 3px solid black;
}

.menuBox{
	position: absolute;
	top: 40%;
	left: 66%;
 	text-align: center;
	opacity: 0;
	border: 3px solid black;
}

table .td1:hover .subMain{
	opacity: 0.8;
}

table .td1:hover .foodBox{
	opacity: 1;
}

table .td2:hover .subMain{
	opacity: 0.8;
}

table .td2:hover .menuBox{
	opacity: 1;
}

.text{
	color: black;
	font-size: 100px;
	font-style: bold; 
	padding: 10px 10px;
}

</style>

<title>ctFood</title>
</head>
<body>
<div class="main">
	<table width="100%" height="100%">
		<tr>
			<td width="50%" class="td1">
				<a href="ctFoodList">
					<img src="images/food1.jpg" alt="ctFoodList" class="subMain" />
					<div class="foodBox">
						<div class="text">
							FOOD
						</div>
					</div>
				</a>
			</td>
			<td width="50%" class="td2">
				<a href="ctMenuList">
					<img src="images/menu1.jpg" alt="ctMenuList" class="subMain" />
					<div class="menuBox">
						<div class="text">
							MENU
						</div>
					</div>
				</a>
			</td>
		</tr>
	</table>
</div>
</body>
</html>
<%@ include file ="../footer.jsp" %>