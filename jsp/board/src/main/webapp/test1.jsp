<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p id="result"></p>
</body>
	 <script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script>
	$.ajax({
		url: "test2.jsp",
		type: "get",
		success: function(result){
			$("#result").html(result);
		}
	});
</script>
</html>