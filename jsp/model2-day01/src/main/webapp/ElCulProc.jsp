<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>결과 보기</h2>
		<%
	/* 	String exp1 = request.getParameter("epx1");
		String exp2 = request.getParameter("epx2");
		String exp3 = request.getParameter("epx3"); */
			
		/* int result = 0;
		if(exp2.equals("+")){
			result = Integer.parseInt(exp1)  + Integer.parseInt(exp3);
		} */
		
		/* request.setAttribute("exp1", exp1);
		request.setAttribute("exp2",exp2);
		request.setAttribute("exp3",exp3); */

		
		int result = 0;
		String exp2 = request.getParameter("exp2");
		
		if(exp2.equals("+")){
		%>
		 결과는 ${param.exp1 + param.exp3}
		<% 
		}
		if(exp2.equals("-")){
		%>
		 결과는 ${param.exp1 - param.exp3}
		<% 
		}
		if(exp2.equals("*")){
		%>
		 결과는 ${param.exp1 * param.exp3}
		<% 
		}
		if(exp2.equals("/")){
		%>
		 결과는 ${param.exp1 / param.exp3}
		<% 
		}
		%>
	
<%-- 		결과는 ${param.exp1},${param.exp2},${param.exp3}
 --%>	</center>
</body>
</html>