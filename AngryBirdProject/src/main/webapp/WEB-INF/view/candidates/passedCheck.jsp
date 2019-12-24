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
<h2>합격자 조회</h2>
<form action="passedCheck" method="post" id="frm">

<div align="center"> <br />
<table border="1">
<tr>
	<td>지원번호를 입력하세요. <br />
		<input type="text" name="candidateNum" size="20"/><input type="submit" value="조회"/>	
	</td>
</tr>
</table>
<br /><br />	

<c:if test="${! empty audC }">
	지원번호 ${audC.candidateDTO.candidateNum }, ${audC.candidateDTO.candidateName }님은 <br />
	${audC.auditionDTO.title }에 합격하셨습니다! <br />
	축하드립니다. 며칠 내로 인재발굴팀에서 연락 드리겠습니다.

</c:if>
<c:if test="${ empty audC }">
	조회 결과가 없습니다. <br />
</c:if>


<br />
<a href="/AngryBirdProject/main">메인화면</a>

</div>

</form>
</div>
<%@ include file="/WEB-INF/view/footer.jsp"%>
</body>



</html>