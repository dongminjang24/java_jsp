/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-13 14:49:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoryList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>번개장터</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/market/favicon.ico\">\n");
      out.write("\n");
      out.write("    <!--아이콘-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css\" />\n");
      out.write("\n");
      out.write("    <!-- 부트스트랩 -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- 부트스트랩 icon -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css\">\n");
      out.write("    <!-- 부트스트랩 js -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("    <!--css-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/market/common.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/market/join.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/market/market_category.css\">\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <a id=\"skipNav\" href=\"#contents-area\">본문 바로가기</a>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("         <!-- header 영역 -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/app/fix/header.jsp", out, false);
      out.write("\n");
      out.write("        <!-- // header 영역 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--로그인/회원가입 모달창-->\n");
      out.write("        <div class=\"join_modal_wrap hidden\">\n");
      out.write("            <div class=\"join_bg bg\"></div>\n");
      out.write("            <div class=\"join_content\">\n");
      out.write("                <button class=\"btn_join_close\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/market/thunder_join_close.png\" alt=\"번개장터 로그인 창 닫기 버튼\" width=\"24px\" height=\"24px\">\n");
      out.write("                </button>\n");
      out.write("                <div class=\"join_main\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/market/app.png\" alt=\"번개장터 앱 로고\">\n");
      out.write("                    <p>번개장터로 중고 거래 시작하기</p>\n");
      out.write("                    <p>간편하게 가입하고 상품을 확인하세요</p>\n");
      out.write("                    <div class=\"join_button_area\">\n");
      out.write("                        <button class=\"join_kakao\">\n");
      out.write("                            <div class=\"join_kakao_logo\"></div>\n");
      out.write("                            카카오로 이용하기\n");
      out.write("                        </button>\n");
      out.write("                        <button class=\"join_naver\">\n");
      out.write("                            <div class=\"join_naver_logo\"></div>\n");
      out.write("                            네이버로 이용하기\n");
      out.write("                        </button>\n");
      out.write("                        <button class=\"join_google\">\n");
      out.write("                            <div class=\"join_google_logo\"></div>\n");
      out.write("                            구글로 이용하기\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"join_footer\">\n");
      out.write("                        도움이 필요하시면 <span class=\"join_footer_email\">이메일</span> 또는 고객센터 <span class=\"join_footer_cs\">1670-2910</span>로 문의 부탁드립니다.<br>\n");
      out.write("                        고객센터 운영시간: 09~18시 (점심시간 12~13시, 주말/공휴일 제외)\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- main_content 영역 -->\n");
      out.write("        <div id=\"background_main\">\n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <!-- 카테고리 -->\n");
      out.write("                <div id=\"category\">\n");
      out.write("                    <p id=\"home\">\n");
      out.write("                        <span>\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/market/home.png\" alt=\"home\">\n");
      out.write("                        </span>\n");
      out.write("                        <span>홈</span>\n");
      out.write("                    </p>\n");
      out.write("                    <p id=\"entire\">\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"bi bi-chevron-right\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <ul class=\"entire_bar\">\n");
      out.write("                                <li><a href=\"#\">의류</a></li>\n");
      out.write("                                <li class=\"hidden_menu\"><a href=\"#\">악세서리</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <i class=\"bi bi-chevron-down under_direction\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </p>\n");
      out.write("                    <p id=\"category_clothes\">\n");
      out.write("                        <span>\n");
      out.write("                            <i class=\"bi bi-chevron-right\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        <span>\n");
      out.write("                            <ul class=\"category_clothes_bar\">\n");
      out.write("                                <li><a href=\"#\">남성의류</a></li>\n");
      out.write("                                <li class=\"hidden_menu\"><a href=\"#\">여성의류</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <i class=\"bi bi-chevron-down under_direction\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!--하위 카테고리 (중분류 선택된 경우만 표시, 하위카테고리 선택시 표시 X)-->\n");
      out.write("                <div class=\"category_under\">\n");
      out.write("                    <div class=\"category_box\">\n");
      out.write("                        <a href=\"전체보기\">전체보기\n");
      out.write("                            <span><i class=\"bi bi-chevron-right\"></i></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category_box\"><a href=\"#\">하위 카테고리</a></div>\n");
      out.write("                    <div class=\"category_box\"><a href=\"#\">하위 카테고리</a></div>\n");
      out.write("                    <div class=\"category_box\"></div> <!--자리 남아도 5개 유지-->\n");
      out.write("                    <div class=\"category_box\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--상품 영역-->\n");
      out.write("                <section class=\"main_goods\">\n");
      out.write("                    <div class=\"goods_wrap\">\n");
      out.write("                        <div class=\"goods\">\n");
      out.write("                            <a href=\"goods_product_detail.html\">\n");
      out.write("                                <div class=\"goods_image\">\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/goods_ex.jpg\" width=\"194\" height=\"194\" alt=\"상품 이미지\">\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/market/thunder_pay_mark.svg\" alt=\"번개페이\">\n");
      out.write("                                    <span>배송비포함</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"goods_info\">\n");
      out.write("                                    <p class=\"goods_title\">상품명</p>\n");
      out.write("                                    <div class=\"goods_price_date\">\n");
      out.write("                                        <span class=\"goods_price\">가격</span>\n");
      out.write("                                        <span class=\"goods_date_before\">4일 전</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"goods\">\n");
      out.write("                            <a href=\"goods_product_detail.html\">\n");
      out.write("                                <div class=\"goods_image\">\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/goods_ex.jpg\" width=\"194\" height=\"194\" alt=\"상품 이미지\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"goods_info\">\n");
      out.write("                                    <p class=\"goods_title\">상품명</p>\n");
      out.write("                                    <div class=\"goods_price_date\">\n");
      out.write("                                        <span class=\"goods_price\">가격</span>\n");
      out.write("                                        <span class=\"goods_date_before\">4일 전</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- // main_content 영역 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer 영역 -->\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/app/fix/footer.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("        <!-- // footer 영역 -->\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("  	<script>\n");
      out.write("		let contextPath = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("	</script>\n");
      out.write("	   <!--js-->\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/market/login_modal.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/goods/goods_detail_menu.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/market/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/market/menu_hover.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/goods/goods_detail_menu.js\"></script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}