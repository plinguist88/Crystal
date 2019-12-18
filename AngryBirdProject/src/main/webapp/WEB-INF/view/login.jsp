<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width; initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet">
<head>
<style>
body{
    display: table-cell;
    vertical-align: middle;
    background-color: white;
}

html {
    display: table;
    margin: auto;
}

html, body {
    height: 100%;
}

.medium-small {
    font-size: 0.9rem;
    margin: 0;
    padding: 0;
}

.login-form {
    width: 280px;
}

.login-form-text {
    text-transform: uppercase;
    letter-spacing: 2px;
    font-size: 0.8rem;
}

.login-text {
    margin-top: -6px;
    margin-left: -6px !important;
}

.margin {
    margin: 0 !important;
}

.pointer-events {
    pointer-events: auto !important;
}

.input-field >.material-icons  {
    padding-top:10px;
}

.input-field div.error{
    position: relative;
    top: -1rem;
    left: 3rem;
    font-size: 0.8rem;
    color:#FF4081;
    -webkit-transform: translateY(0%);
    -ms-transform: translateY(0%);
    -o-transform: translateY(0%);
    transform: translateY(0%);
}
</style>
<title>JSP 게시판 웹 사이트</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#username").blur(function(){
		if($("#username").val()==""){
			$("#emplNum").text("ID를 입력하세요.");
			$("#emplNum").css('color','red');
			
		} else {
			$("#emplNum").text('');
		}
	});
	
	$("#userpw").blur(function(){
		if($("#userpw").val()==""){
			$("#emplPw").text("Password를 입력하세요.");
			$("#emplPw").css('color','red');
			
		} else {
			$("#emplPw").text('');
		}
	});
});

</script>
</head>
<body>
	
	
<div id="login-page" class="row">
	<div class="col s12 z-depth-4 card-panel">
		<form:form method="post" action="loginAction" commandName="loginCommand">
		<div class="row">
			<div class="input-field col s12 center">
			<!-- <img src="images/login-logo.png" alt="" class="circle responsive-img valign profile-image-login"/> -->
				<p class="center login-form-text"><strong size="30">LOGIN</strong></p>
			</div>
		</div>
		<div class="row margin">
			<div class="input-field col s12">
			<!-- <i class="mdi-social-person-outline prefix"></i> -->
			<i class="material-icons prefix">account_circle</i>
			<form:input id="username" path="employeeNum" style="background-image: url(&quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR4nGP6zwAAAgcBApocMXEAAAAASUVORK5CYII=&quot;); cursor: auto;"/>
			<form:errors id="emplNum" path="employeeNum"/>
			<label for="username" data-error="wrong" class="left-align">User ID</label>
			</div>
		</div>
		<div class="row margin">
			<div class="input-field col s12">
				<!-- <i class="mdi-action-lock-outline prefix"></i> -->
				<i class="material-icons prefix">vpn_key</i>
				<form:password id="userpw" path="employeePw" style="background-image: url(&quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR4nGP6zwAAAgcBApocMXEAAAAASUVORK5CYII=&quot;);"/>
				<form:errors id="emplPw" path="employeePw"/>
				<label for="password">User Password</label>
			</div>
		</div>

		<div class="row">
			<div class="input-field col s12 login-text">
				<form:checkbox path="idStore" id="test6" checked="checked"/>
				<label for="test6" class="pointer-events">Auto Remember me</label>
			</div>
		</div>

		<div class="row">
			<div class="input-field col s12">
				<button type="submit" class="btn waves-effect waves-light col s12">Login</button>
			</div>
		<c:if test="${employeeInfo.deptNum eq 'SI' }">
			<div class="input-field col s12">
				<a href="si/join" class="btn waves-effect waves-light col s12 light-blue darken-4">Register Now!</a><!-- 회원가입 -->
			</div>
		</c:if>
		</div>

		<div class="row" align="center">
			<!-- <div class="input-field col s6 m6 l6">
				<p class="margin medium-small"><a href="#">Register Now!</a></p>회원가입
			</div> -->
			<div class="input-field col s6 m6 l6">
				<p class="margin center-align medium-small"><a href="#">Forgot password</a></p><!-- 비번잊음? -->
			</div>
		</div>
		</form:form>
	</div>
</div>
	
</body>
</html>
<!--$(function() {
	$(".loginForm").validate({
		rules: {
			username: {
				required: true,
				minlength: 4
			},
			password: {
				required: true,
				minlength: 5
			}
		},
		//For custom messages
		messages: {
			username:{
				required: "Enter a username",
				minlength: "Enter at least 4 characters"
			}
		},
		errorElement : 'div',
			errorPlacement: function(error, element) {
				
				var placement = $(element).data('error');
				if (placement) {
					$(placement).append(error)
					
				} else {
					error.insertAfter(element);
				}
		}
	});
});-->