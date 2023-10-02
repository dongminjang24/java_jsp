<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>번개장터</title>
    <link rel="shortcut icon" href="images/market/favicon.ico">

    <!--아이콘-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />

    <!-- 부트스트랩 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <!-- 부트스트랩 icon -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
    <!-- 부트스트랩 js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    
    <!--css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/market/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/market/join.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/market/market_category.css">

 

</head>
<body>
    <a id="skipNav" href="#contents-area">본문 바로가기</a>

    <div id="wrapper">
         <!-- header 영역 -->
        <jsp:include page="/app/fix/header.jsp"/>
        <!-- // header 영역 -->


        <!--로그인/회원가입 모달창-->
        <div class="join_modal_wrap hidden">
            <div class="join_bg bg"></div>
            <div class="join_content">
                <button class="btn_join_close">
                    <img src="${pageContext.request.contextPath}/assets/images/market/thunder_join_close.png" alt="번개장터 로그인 창 닫기 버튼" width="24px" height="24px">
                </button>
                <div class="join_main">
                    <img src="${pageContext.request.contextPath}/assets/images/market/app.png" alt="번개장터 앱 로고">
                    <p>번개장터로 중고 거래 시작하기</p>
                    <p>간편하게 가입하고 상품을 확인하세요</p>
                    <div class="join_button_area">
                        <button class="join_kakao">
                            <div class="join_kakao_logo"></div>
                            카카오로 이용하기
                        </button>
                        <button class="join_naver">
                            <div class="join_naver_logo"></div>
                            네이버로 이용하기
                        </button>
                        <button class="join_google">
                            <div class="join_google_logo"></div>
                            구글로 이용하기
                        </button>
                    </div>
                    <div class="join_footer">
                        도움이 필요하시면 <span class="join_footer_email">이메일</span> 또는 고객센터 <span class="join_footer_cs">1670-2910</span>로 문의 부탁드립니다.<br>
                        고객센터 운영시간: 09~18시 (점심시간 12~13시, 주말/공휴일 제외)
                    </div>
                </div>
            </div>
        </div>

        <!-- main_content 영역 -->
        <div id="background_main">
            <div id="main_content">
                <!-- 카테고리 -->
                <div id="category">
                    <p id="home">
                        <span>
                            <img src="${pageContext.request.contextPath}/assets/images/market/home.png" alt="home">
                        </span>
                        <span>홈</span>
                    </p>
                    <p id="entire">
                        <span>
                            <i class="bi bi-chevron-right"></i>
                        </span>
                        <span>
                            <ul class="entire_bar">
                                <li><a href="#">의류</a></li>
                                <li class="hidden_menu"><a href="#">악세서리</a></li>
                            </ul>
                            <i class="bi bi-chevron-down under_direction"></i>
                        </span>
                    </p>
                    <p id="category_clothes">
                        <span>
                            <i class="bi bi-chevron-right"></i>
                        </span>
                        <span>
                            <ul class="category_clothes_bar">
                                <li><a href="#">남성의류</a></li>
                                <li class="hidden_menu"><a href="#">여성의류</a></li>
                            </ul>
                            <i class="bi bi-chevron-down under_direction"></i>
                        </span>
                    </p>
                </div>
                
                <!--하위 카테고리 (중분류 선택된 경우만 표시, 하위카테고리 선택시 표시 X)-->
                <div class="category_under">
                    <div class="category_box">
                        <a href="전체보기">전체보기
                            <span><i class="bi bi-chevron-right"></i></span></a>
                    </div>
                    <div class="category_box"><a href="#">하위 카테고리</a></div>
                    <div class="category_box"><a href="#">하위 카테고리</a></div>
                    <div class="category_box"></div> <!--자리 남아도 5개 유지-->
                    <div class="category_box"></div>
                </div>

                <!--상품 영역-->
                <section class="main_goods">
                    <div class="goods_wrap">
                        <div class="goods">
                            <a href="goods_product_detail.html">
                                <div class="goods_image">
                                    <img src="${pageContext.request.contextPath}/assets/images/goods_ex.jpg" width="194" height="194" alt="상품 이미지">
                                    <img src="${pageContext.request.contextPath}/assets/images/market/thunder_pay_mark.svg" alt="번개페이">
                                    <span>배송비포함</span>
                                </div>
                                <div class="goods_info">
                                    <p class="goods_title">상품명</p>
                                    <div class="goods_price_date">
                                        <span class="goods_price">가격</span>
                                        <span class="goods_date_before">4일 전</span>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="goods">
                            <a href="goods_product_detail.html">
                                <div class="goods_image">
                                    <img src="${pageContext.request.contextPath}/assets/images/goods_ex.jpg" width="194" height="194" alt="상품 이미지">
                                </div>
                                <div class="goods_info">
                                    <p class="goods_title">상품명</p>
                                    <div class="goods_price_date">
                                        <span class="goods_price">가격</span>
                                        <span class="goods_date_before">4일 전</span>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                </section>
            </div>
        </div>
        <!-- // main_content 영역 -->



        <!-- footer 영역 -->
               <jsp:include page="/app/fix/footer.jsp"/>
       
        <!-- // footer 영역 -->
    </div>
</body>
  	<script>
		let contextPath = "${pageContext.request.contextPath}";
	</script>
	   <!--js-->
    <script src="${pageContext.request.contextPath}/assets/js/market/login_modal.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/goods/goods_detail_menu.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/market/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/market/menu_hover.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/goods/goods_detail_menu.js"></script>
</html>