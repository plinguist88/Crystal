<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript">
$(function(){
	/* 부모창의 값을 자식창에 전달하는 방법은 아래와 같다. */
	/* 부모창의 값을 부모창의 script를 이용해서 자식창으로 보내려 했더니 자꾸 값이 한번만 깜짝했다가 사라졌음. 아래 방법으로 해야만 값이 자식창에 보존됨 */
	document.getElementById("height1").value = opener.document.getElementById("height").value;
	document.getElementById("weight1").value = opener.document.getElementById("weight").value;
	document.getElementById("gender1").value = opener.document.getElementById("gender").value;
	document.getElementById("age1").value = opener.document.getElementById('age').value;
	
	/* 기초대사량 계산 */
	$("#btn2").click(function(){ 
		if($("#gender1").val() =='M'){
			var meta1 = Math.round(66.47 + (13.75 * $("#weight1").val()) + (5 * $("#height1").val()) - (6.76 * $("#age1").val()));
			
			$("#metabolism1").val(meta1);
		}else if($("#gender1").val() =='F'){
			var meta2 = Math.round(655.1 + (9.56 * $("#weight1").val()) + (1.85 * $("#height1").val()) - (4.68 * $("#age1").val()));
			$("#metabolism1").val(meta2);
		}
	});
	
	
	
	/* 자식창 값을 부모값으로 전달하기 */
	$("#btn3").click(function(){
		/* $(opener.document).find("#standardWeight").val($("#standardWeight1").val()); */
		$(opener.document).find("#metabolism").val($("#metabolism1").val());
		self.close();
	});
});

</script>
</head>
<body>
<h2>표준몸무게 및 기초대사량 계산</h2>
<!-- <form action="getStandardWeight" method="post" id="frm"> -->
나의 키: <input type="text" name="height1" id="height1" size="3" /> cm <br />
나의 몸무게: <input type="text"  name="weight1" id="weight1" size="3"/> kg<br />
나의 만나이: <input type="text"  name="age1" id="age1" size="3"/> 세<br />
<!-- 나의 성별 --><input type="hidden" name="gender1"  id="gender1"/> <br />

<!-- 표준몸무게: <input type="text" id="standardWeight1" size="3"/><input type="submit" />계산</button><br /> -->
나의 기초대사량:<input type="text" id="metabolism1" size="3"/>kcal <button type="button" id="btn2">계산</button><br />
<button type="button" id="btn3">완료</button>

<!-- </form> -->
</body>
</html>