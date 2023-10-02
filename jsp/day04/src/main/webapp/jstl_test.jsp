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
	<h2>JSTL TEST</h2>
<%-- 	<c:set var="name">홍길동</c:set> --%>
	<c:set var="name" value="홍길동"></c:set>
	<h3><c:out value="${name}"></c:out></h3>
	<h3>${name}</h3><!-- 이건 실행이 된다. -->
</body>
</html>