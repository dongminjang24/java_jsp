<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
<style>
	table tbody tr{
		background-color:rgb(245 246 246 / 48%) !important;
	}
</style>
</head>
<body class="is-preload">
<%-- 	<c:if test="${sessionId eq null}">
		<script>
			alert("로그인 후 이용하세요.");
			location.replace("${pageContext.request.contextPath}/member/MemberLogin.me");
		</script>
	</c:if> --%>
<!-- c:set에서 내용으로 파라미터 값을 넣으면, 문자열로 변환된 후 저장된다. -->
<!-- c:set value속성에 값을 넣으면, 해당 값의 타입이 그대로 유지된다. -->

	<%-- <c:set var="totalCount" value="${totalCount}"/>
	<c:set var="realEndPage" value="${realEndPage}"/>
	<c:set var="startPage" value="${startPage}"/>
	<c:set var="endPage" value="${endPage}"/>
	<c:set var="nowPage" value="${nowPage}"/>
	<c:set var="boards" value="${boards}"/> --%>

<!-- Page Wrapper -->
	<div id="page-wrapper">
	<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
				<jsp:include page="/app/fix/header.jsp"/>
			</div>
		</div>

	<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">

				<!-- Main -->
					<section class="main">

						<a href="#" class="image main"><img
						src="${pageContext.request.contextPath}/assets/images/boardMain.png"
						alt="" /></a>
						<header class="major">
							<h1>게시판</h1>
							<p>자유 게시판</p>
						</header>

						<div class="table-wrapper">
							<div style="display:flex; justify-content:space-between;">
								<span>글 개수 : <c:out value="${total}"/>개</span>
								<button style="border-radius:0;" onclick="location.href='${pageContext.request.contextPath}/board/boardWrite.bo'">글 쓰기</button>
							</div>
							<table>
								<caption style="text-align:left; margin-bottom:3%;">
									
								</caption>
								<thead>
									<tr>
										<th>번호</th>
										<th>제목</th>
										<th>작성자</th>
										<th>날짜</th>
										<th>조회수</th>
									</tr>
								</thead>
								<tbody>
									<c:choose>
										<c:when test="${not empty boards and fn:length(boards) > 0}">
											<c:forEach var="board" items="${boards}">
												<tr>
													<td><c:out value="${board.getBoardNumber()}"/></td>
													<td><a href="${pageContext.request.contextPath}/board/boardDetail.bo?boardNumber=${board.getBoardNumber()}"><c:out value="${board.getBoardTitle()}"/></a></td>
													<td><c:out value="${board.getMemberId()}"/></td>
													<td><c:out value="${board.getBoardDate()}"/></td>
													<td><c:out value="${board.getBoardReadCount()}"/></td>
												</tr>
											</c:forEach>
										</c:when>
										<c:otherwise>
											<tr>
												<td colspan="5" align="center">등록된 게시물이 없습니다.</td>
											</tr>
										</c:otherwise>
									</c:choose>
								</tbody>
							</table>
							
							<table style="font-size:1.3rem">
								<tr align="center" valign="middle">
								<td class= "web-view">
									<c:if test="${prev}">
										<a href="${pageContext.request.contextPath}/board/boardListOk.bo?page=${startPage-1}">&lt;</a>
									</c:if>
									
									<c:forEach var="i" begin="${startPage}" end="${endPage}">
											<c:choose>
												<c:when test="${not (i eq page)}">
													<a href="${pageContext.request.contextPath}/board/boardListOk.bo?page=${i}">
														<c:out value="${i}"/>&nbsp;&nbsp;
													</a>
												</c:when>
												<c:otherwise>
													<c:out value="${i}"/>&nbsp;&nbsp;
												</c:otherwise>
											</c:choose>
									</c:forEach>
									
									<c:if test="${next}">
										<a href="${pageContext.request.contextPath}/board/boardListOk.bo?page=${endPage+1}">&gt;</a>
									</c:if>
									</td>
								</tr>
							</table> 
						</div>
					</section>

			</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
</html>