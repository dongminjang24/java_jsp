<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코코마켓 회원가입</title>
</head>
<style>

    *, *:before, *:after { /* 모든 요소에 box-sizing 적용 */
        box-sizing: border-box;
    }

    html, body {
        padding: 0;
        margin: 0;
        height: 100%;
        width: 100%;
        font-family: 'Noto Sans KR', sans-serif;
        
    }

  

    .bg-coco {
        background-color: #f1cea3;
        height: 100%;
        width: 100%;
        display:flex;
        justify-content:center;
        align-items:center;
    }

    .right-bottom {
        text-align: right;
        vertical-align: bottom;
        font-size: 80px;
    }
    .sign-up-form{
    	background-color:white;
    	border-radius:8px;
    	width:480px;
    	height:340px;
        justify-content:center;
        align-items:center;
        display:flex;
        
    }
    .sign-up-input{
	width:100%;
	border-radius:8px;
	border:1px solid #A9A9A9;
	height:36px;
	margin-bottom:20px;
	font-size:18px;
	
	}
	.input-label{
		color:black;
		font-size:16px;
		display:block;
		margin-bottom:4px;
	}
.div-form-container{
	width:80%
}
.sign-up-btn{
	text-align:center;
	margin:0 auto;
	width:100%;
	border:none;
	border-radius:8px;
	height:56px;
	color:white;
	font-size:16px;
	background-color:#c69966;
	margin-top:15px;
	
}

.div-site-title-bottom{
	display:flex;
	justify-content:center;
	align-items:flex-end;
}
.title-text{
	margin-left:30px;
	margin-bottom:0;
	vertical-align: bottom;
	line-height:100%;
	height:30px;
	color:white;
	font-size:24px;
}
.login-title{
	font-size:18px;
}
</style>



<body>
<div class="bg-coco">

<div style="display:flex">

	<form method="post"  class="sign-up-form"  action="${pageContext.request.contextPath}/signInOk.usr" name="signUpForm">
		<div class="div-form-container">
			<p class="login-title">로그인</p>
		
			<label class="input-label">이메일</label>
			<input  name="userEmail" class="sign-up-input"></input>


			<label class="input-label">비밀번호</label>
			<input  name="userPassword" class="sign-up-input"></input>

		
		<div style="width:100%">
			<button type="submit" class="sign-up-btn">로그인</button>
		</div>
		</div>
		
	</form>
	<div class="div-site-title-bottom">
		<p class="title-text">코코마켓</p>
	</div>

</div>

</div>

</body>
</html>