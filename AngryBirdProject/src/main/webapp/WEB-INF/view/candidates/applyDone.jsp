<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" 
			src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">

/* $(function(){
	  
}); */


</script>
<link href="${pageContext.request.contextPath}/css/css/style.css" rel="stylesheet" >

<title>applyDone</title>
</head>
<%@ include file="/WEB-INF/view/header.jsp"%>
<body>
<div class="container">
<h2>참가 완료</h2>
<form:form action="participateGo" method="post" id="frm">

<div align="center">
오디션 지원이 완료되었습니다. <br />
${cdto.candidateName } 님의 지원번호는 ${cdto.candidateNum } 입니다. <br />
합격여부는 홈페이지에서 지원번호를 통해 확인가능합니다. <br /><br /><br />
<a href="/AngryBirdProject/main">메인화면</a>

</div>

</form:form>
</div>
<%@ include file="/WEB-INF/view/footer.jsp"%>
</body>



</html>