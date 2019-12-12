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
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="login" class="navA"> LOGIN</a>   
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeDepCheck eq 'HR' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="logout" class="navA"> LOGOUT</a>   
		  		 <a href="#" class="navA"> HR</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeDepCheck eq 'CT' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="logout" class="navA"> LOGOUT</a>   
		  		 <a href="cafeteriaMain" class="navA"> CT</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeDepCheck eq 'GD' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="logout" class="navA"> LOGOUT</a>   
		  		 <a href="#" class="navA"> GD</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeDepCheck eq 'GF' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="logout" class="navA"> LOGOUT</a>   
		  		 <a href="#" class="navA"> GF</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeDepCheck eq 'GH' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="logout" class="navA"> LOGOUT</a>   
		  		 <a href="#" class="navA"> GH</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeDepCheck eq 'MA' }">
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="logout" class="navA"> LOGOUT</a>   
		  		 <a href="#" class="navA"> MA</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>

<c:if test="${employeeDepCheck eq 'SI' }">	<!-- 관리자 -->
	<div class="navbar" align="center">
		<table class="table1" > 
			<tr>
				<td width="1400px" >
				 <a href="main"><img alt="logo" src="images/crystal_logo.jpg" width="300" align="left" /></a>
		 		 <a href="#" class="navA"> COMPANY</a>
		 		 <a href="#" class="navA"> ARTIST</a> 
		 		 <a href="#" class="navA"> NEWS</a> 
		 		 <a href="#" class="navA"> SCHEDULE</a>
		 		 <a href="audition" class="navA"> AUDITION</a>
		  		 <a href="#" class="navA"> CONTACT US</a>   
		  		 <a href="logout" class="navA"> LOGOUT</a>   
		  		 <a href="#" class="navA"> Admin</a>
				</td>
			</tr>
		</table>
	</div>
</c:if>
</body>
</html>