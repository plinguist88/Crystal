<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/view/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<meta charset="UTF-8">
<title>디자이너 소개 페이지</title>
</head>
<body>
		<div>
			<br />
			<br />
		</div>
		<div class="a" align="center">
			<h2>디자이너 소개 페이지</h2>
		</div>
			<br />
	<div id="root">
		<header>
		<h1>게시판</h1>
		</header>
		<hr />

		<nav> 홈-글작성 </nav>
		<hr />

		<div class="b" align="center">
			<form action="designerPro" name="frm" id="frm" method="post"
				commandName="designerCommand">
				<table>
					<tbody>
						<tr>
							<td><label for="title">제목</label><input type="text"
								id="title" name="title" /></td>
						</tr>
						<tr>
							<td><label for="content">내용</label>
							<textarea id="content" name="content"></textarea></td>
						</tr>
						<tr>
							<td><label for="writer">작성자</label><input type="text"
								id="writer" name="writer" /></td>
						<tr>
							<td>
								<button type="submit">작성</button>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
			<hr />
		</div>
	</div>
</body>
</html>