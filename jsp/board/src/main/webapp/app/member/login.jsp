<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
<style>
	input[type='button'], input[type='submit']{border-radius:0;}
	textarea{resize:none;}
	label{margin-top:3%;}
	div.preview{overflow:hidden;}
	div.preview img{width:90%; object-fit:cover; margin-left:10%;}
</style>
</head>

<body class="is-preload">
<!-- 아이디 또는 비밀번호가 없다는건 로그인이 실패라면 파라미터 code를 넘기면 실패해서 돌아온걸 알게된다. -->
	<c:if test="${not empty param.login}">
		<script>
			alert("아이디 또는 비밀번호를 다시 확인해주세요.");
		</script>
	</c:if>
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
				<header class="major">
					<a href="#" class="image main"><img src="${pageContext.request.contextPath}/assets/images/login01.png" alt="" /></a>
					<h1>로그인</h1>
				</header>
				<hr />
				<form method="post" action="${pageContext.request.contextPath}/member/loginOk.me" name="loginForm">
					<div style="display:flex; justify-content:space-evenly;">
						<div style="width:40%">
								<div>
									<div class="col-6 col-12-xsmall" style="width:100%">
										<p style="margin:0;">아이디 </p>
										<input type="text" name="memberId" id="memberId" value="${memberId}"/>
										<br>
										<p style="margin:0;">비밀번호</p>
										<input type="password" name="memberPw" id="memberPw" value=""/>
										<div style="text-align:center; margin-top:9%">
											<a href="${pageContext.request.contextPath}/member/MemberFindId.me">아이디 찾기</a><span>&nbsp;|&nbsp;</span><a href="#">비밀번호 찾기</a>
										</div>
									</div>
								</div>
								<div class="col-12" style="display:flex;justify-content:flex-start;">
									<div>
										<input type="checkbox" id="saveId" name="saveId" value="saveId"/>
										<label for="saveId">아이디 저장</label>
									</div>
								</div>
								<div class="col-12">
									<ul class="actions" style="display:block; text-align:center; margin-top:9%">
										<li><input type="button" value="로그인" class="primary" style="width:100%; font-size:1em;" onclick="check()"/></li>
										<li><input type="button" value="회원가입" style="width:100%; font-size:1em;" onclick="location.href='${pageContext.request.contextPath}/member/join.me'"/></li>
									</ul>
								</div>
							</div>
							<div class="preview" style="width:40%">
								<img src="${pageContext.request.contextPath}/assets/images/login02.png">
							</div>
						</div>
					</form>
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
<script src="${pageContext.request.contextPath}/assets/js/login.js"></script>
<script>
	let saveId = "${saveId}";
	if (saveId){
		$("input#saveId").prop("checked",true);
	}
	
	
	
</script>
</html>