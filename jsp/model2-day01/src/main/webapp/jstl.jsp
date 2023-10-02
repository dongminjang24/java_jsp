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
<!-- 변수 선언 -->
	<c:set var="sum" value="0"/>
<%-- 	<%
		request.setAttribute("i", 4);
	%> --%>
	<%
		int i =4;
	
	%>
	<c:if test="${i>3 }">
		안녕하세요
	</c:if>
	
	<!-- 반복문 -->
	<c:forEach var="i" begin="1" end="10" step="${i+=2 }">
		점심 시간입니다.<br>
		<c:set var="sum" value="${sum= sum+i }"/>
	</c:forEach>
			${sum }
	
</body>
</html>