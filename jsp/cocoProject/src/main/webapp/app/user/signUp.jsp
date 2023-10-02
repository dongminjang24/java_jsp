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
    	height:640px;
        justify-content:center;
        align-items:center;
        display:flex;
        
    }
    .sign-up-input{
	width:100%;
	border-radius:8px;
	border:1px solid #A9A9A9;
	height:36px;
	font-size:16px;
	
	}
	.input-label{
		margin-top:20px;
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
	cursor:pointer;
	
}
.address-input{
	height:36px;
	border-radius:8px;
	border:1px solid #A9A9A9;
	width:80%;
	margin-bottom:20px;
		font-size:16px;
	
}
.address-btn{
	margin-left:8px;
	height:40px;
	width:60px;
	background-color:#d0ac7f;
	border:none;
	border-radius:8px;
	color:white;
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
</style>



<body>
<div class="bg-coco">

<div style="display:flex">

	<form method="post"  class="sign-up-form"  action="${pageContext.request.contextPath}/signUpOk.usr" name="signUpForm">
		<div class="div-form-container">
			<label class="input-label">이메일</label>
			<input id="userEmail"  name="userEmail" class="sign-up-input"></input>
			<span id="email_check" style="font-size:0.7em;"></span>
		
			<label class="input-label">비밀번호</label>
			<input type="password" id="userPassword" name="userPassword" class="sign-up-input"></input>
			<span id="password_check" style="font-size:0.7em;"></span>


			<label class="input-label">비밀번호 확인</label>
			<input type="password" id="userPasswordConfirm" class="sign-up-input"></input>
			<span id="password_confirm_check" style="font-size:0.7em;"></span>

			<label class="input-label">닉네임</label>
			<input name="userNickname" class="sign-up-input"></input>
			<label class="input-label">주소지</label>
			<input name="userAddress"  type="text" id="address" placeholder="도로명주소" class="address-input" ></input>
			<input type="button" onclick="findAddress()"  class="address-btn" value="찾기"><br>
			<label class="input-label">연락처</label>
			<input name="userPhoneNumber" class="sign-up-input"></input>
		
		<div style="width:100%">
			<button type="submit" class="sign-up-btn">회원가입</button>
		</div>
		</div>
		
	</form>
	<div class="div-site-title-bottom">
		<p class="title-text">코코마켓</p>
	</div>

</div>

</div>

</body>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function findAddress() {
        new daum.Postcode({
            oncomplete: function(data) {
        
                let roadAddr = data.roadAddress; // 도로명 주소 변수
                let extraRoadAddr = ''; // 참고 항목 변수

              
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById("address").value = roadAddr;
                
            }
        }).open();
    }
</script>

<script>
$('.sign-up-btn').prop('disabled', true);
$('.sign-up-btn').css("backgroundColor","#D9D9D9");

let check = false;



$("#userPassword").on("blur", () => {
    const passwordVal = $("#userPassword").val();

    if (passwordVal.search(/[0-9]/g) === -1 || passwordVal.search(/[a-z]/ig) === -1 || passwordVal.length < 8) {
		$("#password_check").css("color","red");
        $("#password_check").text("비밀번호가 형식에 맞지 않습니다.");
    } else {
        $("#password_check").text("");
    }
    const passwordConfirmVal = $("#userPasswordConfirm").val();

    if (passwordVal!=passwordConfirmVal) {
		$("#password_confirm_check").css("color","red");
        $("#password_confirm_check").text("비밀번호가 일치하지 않습니다.");
    } else {
        $("#password_confirm_check").text("");
    }
});
$("#userPasswordConfirm").on("blur", () => {
    const passwordVal = $("#userPassword").val();
    const passwordConfirmVal = $("#userPasswordConfirm").val();

    if (passwordVal!=passwordConfirmVal) {
		$("#password_confirm_check").css("color","red");
        $("#password_confirm_check").text("비밀번호가 일치하지 않습니다.");
    } else {
        $("#password_confirm_check").text("");
    }
});


$("#userEmail").on("blur",function(){checkEmail($(this).val());});


function checkEmail(userEmail){
	check= false;
	if(!userEmail){
		$("#email_check").css("color","red");
		$("#email_check").text("아이디를 확인해주세요.");
		return;
	}
	$.ajax({
		url: "/checkEmail.usr",
		data:{"userEmail": userEmail},
		success:function(result){
			if(result == "true"){
				$("#email_check").text("사용 가능");
				$("#email_check").css("color","blue");
				check = true;
			}else{
				$("#email_check").text("중복된 아이디입니다.");
				$("#email_check").css("color","red");
			}
		},
		error:function(){
			console.log("오류");
		}
	});
}
function checkAllFields() {
    // 각 필드의 유효성 검사
    let isEmailValid = check && $("#email_check").text() === "사용 가능";
    let isPasswordValid = $("#password_check").text() === "";
    let isPasswordConfirmValid = $("#password_confirm_check").text() === "";
    let isUserEmailFilled = $("#userEmail").val() !== "";
    let isUserPasswordFilled = $("#userPassword").val() !== "";
    let isUserPasswordConfirmFilled = $("#userPasswordConfirm").val() !== "";
    let isUserNicknameFilled = $("input[name='userNickname']").val() !== "";
    let isUserAddressFilled = $("#address").val() !== "";
    let isUserPhoneNumberFilled = $("input[name='userPhoneNumber']").val() !== "";
    
    if (isEmailValid && 
        isPasswordValid && 
        isPasswordConfirmValid && 
        isUserEmailFilled && 
        isUserPasswordFilled && 
        isUserPasswordConfirmFilled && 
        isUserNicknameFilled && 
        isUserAddressFilled && 
        isUserPhoneNumberFilled) {
        $('.sign-up-btn').prop('disabled', false);
        $('.sign-up-btn').css("backgroundColor","#c69966");

    } else {
        $('.sign-up-btn').prop('disabled', true);

    }
}
$('input').on('blur', checkAllFields);

</script>

</html>