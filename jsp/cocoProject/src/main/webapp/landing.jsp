<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">

<title>Insert title here</title>
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
        color:white;
    }
</style>


</head>
<!-- #d2a880 -->
<body>
	<div class="bg-coco">
		<img style="width:300px" src="${pageContext.request.contextPath}/assets/images/coco_main.png"/>
		 <div class="right-bottom">
			CoCo Market
		</div>
	</div>
	
</body>
</html>
