/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-13 14:29:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.fix;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/hidongmin37/web_1900_hds/jsp/cocoProject/src/main/webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1692876955000L));
  }

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
      out.write("\n");
      out.write(" <!-- footer 영역 -->\n");
      out.write("        <footer>\n");
      out.write("            <div id=\"top_footer_border_area\">\n");
      out.write("                <div id=\"top_footer_area\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>회사소개</li>\n");
      out.write("                        <li>이용약관</li>\n");
      out.write("                        <li>운영정책</li>\n");
      out.write("                        <li>개인정보처리방침</li>\n");
      out.write("                        <li>청소년보호정책</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"mid_footer_area\" class=\"container text-center\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col mid_footer_areas\">\n");
      out.write("                        <div class=\"mid_footer_left\">\n");
      out.write("                            <p>번개장터(주) 사업자정보</p>\n");
      out.write("                            <p>\n");
      out.write("                                대표이사 : 최재화, 강승현 | 개인정보보호책임자 : 문제근<br>\n");
      out.write("                                사업자등록번호 : 113-86-45836 | 통신판매업신고 : 2019-서울서초-1126<br>\n");
      out.write("                                호스팅서비스 제공자 : Amazon Web Services (AWS)<br>\n");
      out.write("                                EMAIL : help@bunjang.co.kr | FAX : 02-598-8241<br>\n");
      out.write("                                주소 : 서울특별시 서초구 서초대로 38길 12, 7, 10층<br>\n");
      out.write("                                (서초동, 마제스타시티, 힐스테이트 서리풀)<br>\n");
      out.write("                                <span>사업자정보 확인</span>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mid_footer_left2\">\n");
      out.write("                            <div>\n");
      out.write("                                <p>\n");
      out.write("                                    <b>번개장터(주)더현대서울점</b> | 최재화, 강승현 | 365-85-01581<br>\n");
      out.write("                                    서울특별시 영등포구 여의대로 108, 지하2층(여의도동, 파크원)<br>\n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    <b>번개장터(주)코엑스점</b> | 최재화, 강승현 | 142-85-27412<br>\n");
      out.write("                                    서울특별시 강남구 영동대로 513, 쇼핑몰동 B1층 C102호(삼성동, 코엑스)<br>\n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    <b>번개장터(주)센터필드점</b> | 최재화, 강승현 | 808-85-01905<br>\n");
      out.write("                                    서울특별시 강남구 테헤란로 231, 쇼핑몰동 1층 W124호(역삼동)(역삼동, 센터필드)<br>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col mid_footer_right_area\">\n");
      out.write("                        <div class=\"mid_footer_right\">\n");
      out.write("                            <p>고객센터 ></p>\n");
      out.write("                            <p>1670-2910</p>\n");
      out.write("                            <p>운영시간 9시 - 18시 (주말/공휴일 휴무, 점심시간 12시 - 13시)</p>\n");
      out.write("                            <span>공지사항</span> <span>문의하기</span><span>자주 묻는 질문</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"mid_footer_right2\">\n");
      out.write("                            <p>우리은행 채무지급보증 안내</p>\n");
      out.write("                            <p>\n");
      out.write("                                번개장터㈜는 “BGZT Digital”, “BGZT Lab”, “BGZT Lab 1”, “BGZT Lab 2”, “BGZT 컬렉션” 상점이 판매한\n");
      out.write("                                상품에 한해, 고객님이 현금 결제한 금액에 대해 우리은행과 채무지급보증 계약을 체결하여 안전거래를 보장하고 있습니다.\n");
      out.write("                            </p>\n");
      out.write("                            <p>서비스 가입사실 확인</p>\n");
      out.write("                            <p>Ⓒ Bungaejangter. Inc All rights reserved.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"bot_footer_area\">\n");
      out.write("                        <div class=\"bot_footer_left\">\n");
      out.write("                            <div>\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/market/footer_img.png\" alt=\"footer이미지\">\n");
      out.write("                            </div>\n");
      out.write("                            <p>\n");
      out.write("                                [인증범위] 번개장터 중고거래 플랫폼 서비스 운영(심사받지 않은 물리적 인프라 제외)<br>\n");
      out.write("                                [유효기간] 2021.05.18 ~ 2024.05.17\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bot_footer_right\">\n");
      out.write("                            <p>“BGZT Digital”, “BGZT Lab”, “BGZT Lab 1”, “BGZT Lab 2”, “BGZT 컬렉션” 상점의 판매상품을 제외한 모든 상품들\n");
      out.write("                                에 대하여, 번개장터㈜는 통신판매중개자로서 중고거래마켓 번개장터의 거래당사자가 아니며, 입점판매자가 등록한\n");
      out.write("                                상품정보 및 거래에 대해 책임을 지지 않습니다.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- // footer 영역 -->");
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
