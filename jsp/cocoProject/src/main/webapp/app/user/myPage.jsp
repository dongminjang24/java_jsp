<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>내 상점</title>
    <!-- 부트스트랩 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <!-- 부트스트랩 icon -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">

    <!-- 공통 CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/market/common.css">
    <!-- 내 상점 페이지 CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/market/market_my_store.css">
 
    <!-- 파비콘 -->
    <link rel="icon" href="${pageContext.request.contextPath}/assets/images/market/favicon.ico">

</head>
<body>
    <!--건너뛰기 링크-->
    <a id="skipNav" href="?????.html">로그인/회원가입</a>
    <a id="skipNav" href="market_my_store.html">내 상점</a>
    <!--건너뛰기 링크 종료-->

    <div id="wrapper">
        <!-- header 영역 -->
        <jsp:include page="/app/fix/header.jsp"/>
        <!-- // header 영역 -->


        <!-- main_content 영역 -->
        <div id="main_content">
            <!-- 내 상점명 -->
            <div id="my_store_area">
                <div class="my_store_left">
                    <div>
                        <img src="${pageContext.request.contextPath}/assets/images/market/store.svg" alt="내 상점">
                    </div>
                    <div>
                        <p>상점명</p>
                        <p>
                            <img src="${pageContext.request.contextPath}/assets/images/market/star.png" alt="별점">
                            <img src="${pageContext.request.contextPath}/assets/images/market/star.png" alt="별점">
                            <img src="${pageContext.request.contextPath}/assets/images/market/star.png" alt="별점">
                            <img src="${pageContext.request.contextPath}/assets/images/market/star.png" alt="별점">
                            <img src="${pageContext.request.contextPath}/assets/images/market/star.png" alt="별점">
                        </p>
                    </div>
                    <div>
                        <p>
                            <a href="#">내 상점 관리</a>
                        </p>
                    </div>
                </div>

                <div class="my_store_right">
                    <div id="my_store_right_top">
                        <div>
                            <h2>상점명</h2>
                            <button>상점명 수정</button>
                        </div>
                        
                        <div>
                            <p><span>OK</span> 본인인증 완료</p>
                        </div>
                    </div>

                    <div id="my_store_right_mid">
                        <div>
                            <p>
                                <img src="${pageContext.request.contextPath}/assets/images/market/store_open.png" alt="상점 오픈일">
                            </p>
                            <p>
                                상점오픈일 <span>0 일 전</span>
                            </p>
                        </div>
                        <div>
                            <p>
                                <img src="${pageContext.request.contextPath}/assets/images/market/people.png" alt="상점 방문수">
                            </p>
                            <p>
                                상점방문수 <span>0 명</span>
                            </p>
                        </div>
                        <div>
                            <p>
                                <img src="${pageContext.request.contextPath}/assets/images/market/product_sell.png" alt="상품판매">
                            </p>
                            <p>
                                상품판매 <span>0 회</span>
                            </p>
                        </div>
                        <div>
                            <p>
                                <img src="${pageContext.request.contextPath}/assets/images/market/parcel_service.png" alt="택배발송">
                            </p>
                            <p>
                                택배발송 <span>0 회</span>
                            </p>
                        </div>
                    </div>

                    <div id="my_store_right_bot">
                        <div id="intro_modify">
                            <button>소개글 수정</button>
                        </div>

                        <div class="text_area">
                            <textarea></textarea>
                            <button>확인</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- // 내 상점명 -->

            <!-- 내 상점 메뉴 -->
            <div id="my_store_menu">
                <div class="container text-center menu_bar">
                    <div class="row">
                        <div class="col my_store_menus goods_menu">
                            상품 <span>0</span>
                        </div>
                        <div class="col my_store_menus review_menu">
                            상점후기 <span>0</span>
                        </div>
                        <div class="col my_store_menus recommend_menu">
                            찜 <span>0</span>
                        </div>
                        <div class="col my_store_menus following_menu">
                            팔로워 <span>0</span>
                        </div>
                        <div class="col my_store_menus follower_menu">
                            팔로잉 <span>0</span>
                        </div>
                    </div>
                </div>

                <div id="my_store_menu_content">
                    <div id="goods_menu_area" class="common_menu">
                        <div>
                            <p>
                                상품 <span>0</span>
                            </p>
                            <ul id="goods_cate">
                                <li>전체</li>
                                <li class="hidden_menu">전체</li>
                            </ul>
                            <i class="bi bi-chevron-down under_direction under"></i>
                        </div>
                        <div>
                            <p>
                                등록된 상품이 없습니다.
                            </p>
                        </div>
                    </div>

                    <div id="review_menu_area" class="common_menu">
                        <div>
                            <p>
                                상점후기 <span>0</span>
                            </p>
                        </div>
                        <div>
                            <p>
                                상점후기가 없습니다.
                            </p>
                        </div>
                    </div>

                    <div id="recommend_menu_area" class="common_menu">
                        <div>
                            <p>
                                찜 <span>0</span>
                            </p>
                        </div>
                        <div>
                            <p>
                                찜한 상품이 없습니다.
                            </p>
                        </div>
                    </div>

                    <div id="following_menu_area" class="common_menu">
                        <div>
                            <p>
                                팔로잉 <span>0</span>
                            </p>
                        </div>
                        <div>
                            <p>
                                아직 팔로우한 사람이 없습니다.
                            </p>
                        </div>
                    </div>

                    <div id="follower_menu_area" class="common_menu">
                        <div>
                            <p>
                                팔로워 <span>0</span>
                            </p>
                        </div>
                        <div>
                            <p>
                                아직 이 상점을 팔로우한 사람이 없습니다.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- // 내 상점 메뉴 -->
        </div>
        <!-- // main_content 영역 -->


        <!-- footer 영역 -->
               <jsp:include page="/app/fix/footer.jsp"/>
       
        <!-- // footer 영역 -->
    </div>
</body>
  <!-- js -->
    <script>
		let contextPath = "${pageContext.request.contextPath}";
	</script>
	   
   
        <!-- 소개글 수정 -->
    <script src="${pageContext.request.contextPath}/assets/js/market/market_intro_modify.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/market/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/market/menu_hover.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/market/login_modal.js"></script>
    
</html>