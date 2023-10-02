<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shop</title>
</head>
<body>
	<p onclick="getData()">
	음료수 드릴까요?</p>
	<div>
		<span id="juice">
			
		</span>
		<span> 나왔습니다.</span>
	</div>
</body>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script>
function getData(){
		$.ajax({
			url:"juice.jsp",
			success: function(result){
					$("#juice").html(result)},
			error:function(a,b,c){console.log(a,b,c);}
			
		});
	}
	
</script>
</html>