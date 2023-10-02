<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="sum" value="/n"/>

	<c:forEach var="i" begin="0" end="4">
		<c:forEach var="j" begin="0" end="${4-i}">
			&nbsp;
		</c:forEach>
		<c:forEach var="j" begin="0" end="${2*i}">
			${"*"}
		</c:forEach>
		<br>
	</c:forEach>
	
	
	<%-- <c:forEach var="j" begin="1" end="10" step="${j=j+3}"> 
	${"*"}<br>
	</c:forEach> --%>
	
	
</body>
</html>