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
	<form action="Hello" method="post">
		<input type="text" name="userName" placeholder="이름">
		<input type="number" name="userAge" placeholder="나이">
		<p>
			남자<input type="radio" name="userGender" value="M" checked>
			여자<input type="radio"  name="userGender" value="F">
			선택안함<input type="radio"  name="userGender" value="null">
		</p>
		<button>전송</button>
		<%-- <h2><%= request.getParameter("userName") %></h2> --%>
		<h2><%= request.getAttribute("userName") %></h2>
		<h2>만나이 계산: <%= request.getAttribute("userAge") %></h2>
		<h2>성별: <%= request.getAttribute("userGender") %></h2>
		<jsp:include page="footer.jsp"/>
	</form>
	<h2></h2>
</body>
</html>