<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 페이지</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<!-- 나이를 입력받고 만 나이로 계산하여 이름 밑에 출력,만 나이는 그냥 -1로 처리한다.  -->
	<!-- 성별 남자,여자,선택안함 세가지 radio버튼을 구현한 뒤 나이 밑에 성별 출력 -->
	<!-- 추가하기 전에 바로 이전에 추가되었던 회원정보를 삭제하고 추가한다.  -->
	<form action="Hello" method="post">
		<input type="text" name="infoName" placeholder="이름">
		<input type="text" name="infoAge" placeholder="나이">
		<p>
			남자<input type="radio" name="infoGender" value="M" checked>
			여자<input type="radio"  name="infoGender" value="F">
			선택안함<input type="radio"  name="infoGender" value="null">
		</p>
		
		<button>전송</button>
	</form>
	<%-- <p><%= request.getParameter("infoName") %></p>
	<p><%= request.getParameter("infoAge") %></p>
	<p><%= request.getParameter("infoGender") %></p> --%>
	
	<%-- ${empty infoName}
	${empty infoAge}
	${empty infoGender} --%>
		
	${infoName}
	${infoAge}
	${infoGender}
		
	<%-- ${param.infoName}
	${param.infoAge}
	${param.infoGender} --%>
	
	<jsp:include page="footer.jsp"/>
</body>
</html>