<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
.body_header {
  font-family: Arial, Helve tica, sans-serif;
  margin-top: 0px;
} 


.navbar {
  width: 100%;
  background-color: white;
  overflow: auto;
  font-weight: bold;

} 

.navbar a.navA{
  float: left;
  padding: 80px 20px 0px;
  color: black;
  text-decoration: none;
  font-size: 22px;
}


.navbar a.navA:hover {
  color: #800000;
}


@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}  


.table1 {
	border-bottom: 1px solid #ddd;
	border-collapse: collapse;
	border-spacing: 0px;
}
</style>
</head>
<body class="body_header">
<c:if test="${empty employeeInfo }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> COMPANY</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> ARTIST</a> 
		 		 <a href="/AngryBirdProject/news" class="navA"> NEWS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> SCHEDULE</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITION</a>
		  		 <a href="/AngryBirdProject/contactUs" class="navA"> CONTACT US</a>   
		  		 <a href="/AngryBirdProject/login" class="navA"> LOGIN</a>   
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'HR' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> COMPANY</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> ARTIST</a> 
		 		 <a href="/AngryBirdProject/news" class="navA"> NEWS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> SCHEDULE</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITION</a>
		  		 <a href="/AngryBirdProject/contactUs" class="navA"> CONTACT US</a>  
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="hr" class="navA"> HR</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'CT' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> COMPANY</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> ARTIST</a> 
		 		 <a href="/AngryBirdProject/news" class="navA"> NEWS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> SCHEDULE</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITION</a>
		  		 <a href="/AngryBirdProject/contactUs" class="navA"> CONTACT US</a>   
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="cafeteriaMain" class="navA"> CT</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'GD' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITIONS</a>
		 		 <a href="/AngryBirdProject/candidates" class="navA"> CANDIDATES</a>    
		  		 <a href="/AngryBirdProject/initialContracts" class="navA"> INITIAL CONTRACTS</a>   
		  		 <a href="/AngryBirdProject/contractors" class="navA"> CONTRACTORS</a>    
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="gdMain" class="navA"> GD</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'GF' && employeeInfo.jobTypeNum eq 'NM' }"> <!-- 인재육성팀 일반사무직 -->
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/contractors" class="navA"> CONTRACTORS</a>
		 		 <a href="/AngryBirdProject/trainings" class="navA"> TRAININGS</a> 
		 		 <a href="/AngryBirdProject/trainingTFs" class="navA"> TRAINING TF</a> 
		 		 <a href="/AngryBirdProject/trainees" class="navA"> TRAINEES</a> 
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="gf" class="navA"> GF</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'GF' && employeeInfo.jobTypeNum eq 'CT' }"> <!-- 인재육성팀 상담사-->
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/schedules" class="navA"> SCHEDULES</a>
		 		 <a href="/AngryBirdProject/counseling" class="navA"> COUNSELING</a> 
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="gf" class="navA"> GF</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'GF' && (employeeInfo.jobTypeNum eq 'DT' || employeeInfo.jobTypeNum eq 'VT') }"> <!-- 인재육성팀 트레이너 모두 포함 -->
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/contractors" class="navA"> MY TF TEAMS</a> <!-- TF 리스트 나오고, TF 클릭하면 TF구성 멤버 나오도록 -->
		 		 <a href="/AngryBirdProject/myTrainingsTrainer" class="navA"> MY TRAININGS</a> <!-- 트레이닝 안에 트레이니들 리스트 나오고, 트레이니 클릭하면 평가입력가능하게, 그동안의 평가리스트 및 차트 나오도록 -->
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="gf" class="navA"> GF</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'GF' && employeeInfo.jobTypeNum eq 'FC' }"> <!-- 인재육성팀 피트니스코치 -->
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/contractors" class="navA"> WLP-REQUESTS</a> <!-- 운동처방 신청목록(체중감량계획) 확인 , 처방하기-->
		 		 <a href="/AngryBirdProject/artist" class="navA"> EXERCISE</a> <!-- 운동목록 업데이트/칼로리변경/ -->
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="gf" class="navA"> GF</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'GH' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> COMPANY</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> ARTIST</a> 
		 		 <a href="/AngryBirdProject/news" class="navA"> NEWS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> SCHEDULE</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITION</a>
		  		 <a href="/AngryBirdProject/jumju" class="navA"> STORE_OWNER_JOIN</a>    
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="gh" class="navA"> GH</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'MA' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> COMPANY</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> ARTIST</a> 
		 		 <a href="/AngryBirdProject/news" class="navA"> NEWS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> SCHEDULE</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITION</a>
		  		 <a href="/AngryBirdProject/contactUs" class="navA"> CONTACT US</a>    
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="ma" class="navA"> MA</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeInfo.deptNum eq 'SI' }">	<!-- 전산 관리자 -->
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> COMPANY</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> ARTIST</a> 
		 		 <a href="/AngryBirdProject/news" class="navA"> NEWS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> SCHEDULE</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITION</a>
		  		 <a href="/AngryBirdProject/contactUs" class="navA"> CONTACT US</a>    
		  		 <a href="/AngryBirdProject/join" class="navA"> JOIN</a>
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="admin" class="navA"> Admin</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${jumjuInfo.codeNum eq 'JJ' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> COMPANY</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> ARTIST</a> 
		 		 <a href="/AngryBirdProject/news" class="navA"> NEWS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> SCHEDULE</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> AUDITION</a>
		  		 <a href="/AngryBirdProject/contactUs" class="navA"> CONTACT US</a>    
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="JumJu" class="navA"> JJ</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${contractorInfo.levelNum == 0 || contractorInfo.levelNum == 1}">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="/AngryBirdProject/main"><img alt="logo" src="/AngryBirdProject/images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="/AngryBirdProject/company" class="navA"> MY CONTRACTS</a>
		 		 <a href="/AngryBirdProject/artist" class="navA"> MY B-PROFILES</a> <!-- B-profile에 체중감량계획, 식단, 운동 모두 나올수 있도록 -->
		 		 <a href="/AngryBirdProject/news" class="navA"> MY TRAININGS</a> 
		 		 <a href="/AngryBirdProject/schedule" class="navA"> MY SCHEDULES</a>
		 		 <a href="/AngryBirdProject/audition" class="navA"> MY COUNSELING</a>
		  		 <a href="/AngryBirdProject/logout" class="navA"> LOGOUT</a>   
		  		 <a href="contractor" class="navA"> CONTRACTOR</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>
</body>
</html>