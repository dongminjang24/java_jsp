/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-01 08:02:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/Users/hidongmin37/web_1900_hds/jsp/board/src/main/webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1692876955636L));
    _jspx_dependants.put("jar:file:/Users/hidongmin37/web_1900_hds/jsp/board/src/main/webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>게시글 작성</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/main.css\" />\n");
      out.write("<style>\n");
      out.write("	form textarea{\n");
      out.write("		border-radius:0; \n");
      out.write("		resize:none;\n");
      out.write("		color:black !important;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	form div#reply{\n");
      out.write("		display:flex;\n");
      out.write("		margin-bottom:3%;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	input[type='submit']:not(#register), input[type='button'] {border-radius:0;}\n");
      out.write("	\n");
      out.write("	ul.actions li {\n");
      out.write("	    padding: 0 0 0 0.2em;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	input#board_title{\n");
      out.write("		border-radius: 0;\n");
      out.write("		border: none;\n");
      out.write("		text-align: left;\n");
      out.write("		font-size: 1.75em;\n");
      out.write("		font-weight: 500;\n");
      out.write("		line-height: 1.5;\n");
      out.write("		letter-spacing: 0.1em;\n");
      out.write("		padding:0;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	input[type='file']{\n");
      out.write("		display:none;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	div.files{\n");
      out.write("		text-align:center;\n");
      out.write("		margin-right: 3%;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	textarea {\n");
      out.write("		font-size: 1em;\n");
      out.write("  			font-weight: 600;\n");
      out.write("  			letter-spacing: 0.1em;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body class=\"is-preload\">\n");
      out.write("	");
      out.write("\n");
      out.write("	<!-- Page Wrapper -->\n");
      out.write("	<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("		<!-- Wrapper -->\n");
      out.write("		<div class=\"wrapper\">\n");
      out.write("			<div class=\"inner\">\n");
      out.write("				");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/app/fix/header.jsp", out, false);
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("		<!-- Wrapper -->\n");
      out.write("		<div class=\"wrapper\">\n");
      out.write("			<div class=\"inner\">\n");
      out.write("\n");
      out.write("				<!-- Main -->\n");
      out.write("				<section class=\"main\">\n");
      out.write("					<a href=\"#\" class=\"image main\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/boardView.png\" alt=\"\" /></a>\n");
      out.write("					<div class=\"col-12\">\n");
      out.write("						<ul class=\"actions\" style=\"display:flex; justify-content:flex-end;\">\n");
      out.write("							<li><input type=\"button\" value=\"목록\" class=\"primary\" onclick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/BoardListOk.bo'\"/></li>\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("					<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/boardWriteOk.bo\" name=\"writeForm\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("						<header class=\"major\">\n");
      out.write("							<p>\n");
      out.write("								<input id=\"boardTitle\" name=\"boardTitle\" type=\"text\" placeholder=\"제목 입력\">\n");
      out.write("							</p>\n");
      out.write("							<p style=\"text-align:left; margin-bottom:1%; margin-top:-1.75em;\">작성자 : ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("							<input type=\"hidden\" name=\"boardId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("						</header>\n");
      out.write("						<hr style=\"margin-top:0;\">\n");
      out.write("						<div style=\"margin-bottom:2%;\">\n");
      out.write("							첨부파일\n");
      out.write("						</div>\n");
      out.write("						<div style=\"display:flex;\">\n");
      out.write("							<div class=\"files\">\n");
      out.write("								<div>\n");
      out.write("									<label for=\"board_file1\" style=\"display:inline;\">\n");
      out.write("										<img id=\"board_file1Img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/filePlus.png\" width=\"110px\" height=\"110px\" style=\"display:inline;\">\n");
      out.write("									</label>\n");
      out.write("								</div>\n");
      out.write("								<input id=\"board_file1\" name=\"board_file1\" type=\"file\">\n");
      out.write("								<input type=\"button\" onclick=\"cancelFile('board_file1')\" value=\"첨부 삭제\">\n");
      out.write("							</div>\n");
      out.write("							<div class=\"files\">\n");
      out.write("								<div>\n");
      out.write("									<label for=\"board_file2\" style=\"display:inline;\">\n");
      out.write("										<img id=\"board_file2Img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/filePlus.png\" width=\"110px\" height=\"110px\" style=\"display:inline;\">\n");
      out.write("									</label>\n");
      out.write("								</div>\n");
      out.write("								<input id=\"board_file2\" name=\"board_file2\" type=\"file\">\n");
      out.write("								<input type=\"button\" onclick=\"cancelFile('board_file2')\" value=\"첨부 삭제\">\n");
      out.write("							</div>\n");
      out.write("							<div class=\"files\">\n");
      out.write("								<div>\n");
      out.write("									<label for=\"board_file3\" style=\"display:inline;\">\n");
      out.write("										<img id=\"board_file3Img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/filePlus.png\" width=\"110px\" height=\"110px\" style=\"display:inline;\">\n");
      out.write("									</label>\n");
      out.write("								</div>\n");
      out.write("								<input id=\"board_file3\" name=\"board_file3\" type=\"file\">\n");
      out.write("								<input type=\"button\" onclick=\"cancelFile('board_file3')\" value=\"첨부 삭제\">\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						<div style=\"margin-top:3%;\">\n");
      out.write("							<textarea name=\"boardContent\" placeholder=\"내용 작성\" style=\"resize:none;\" rows=\"30\"></textarea>\n");
      out.write("						</div>\n");
      out.write("						<ul class=\"actions\" style=\"display:flex; justify-content:center; margin-top:3%;\">\n");
      out.write("							<li><input type=\"button\" value=\"글쓰기\" class=\"primary\" onclick=\"send()\"/></li>\n");
      out.write("							<li><input type=\"button\" value=\"취소\" onclick=\"history.back()\"/></li>\n");
      out.write("						</ul>\n");
      out.write("					</form>\n");
      out.write("				</section>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/browser.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/breakpoints.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/util.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/main.js\"></script>\n");
      out.write("<script>\n");
      out.write("	function send(){\n");
      out.write("		if(!$(\"input#boardTitle\").val()){\n");
      out.write("			alert(\"제목을 작성해 주세요.\")\n");
      out.write("			return;\n");
      out.write("		}\n");
      out.write("		if(!$(\"textarea[name='boardContent']\").val()){\n");
      out.write("			alert(\"내용을 작성해 주세요.\")\n");
      out.write("			return;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		document.writeForm.submit();\n");
      out.write("	}\n");
      out.write("	/* 변경된다는 이벤트 */\n");
      out.write("	$(\".files\").change(function(e){\n");
      out.write("		/* console.log(e.target.files); */\n");
      out.write("		let file = e.target.files[0];\n");
      out.write("		let img = $(this).find(\"img\");\n");
      out.write("		let reader = new FileReader();\n");
      out.write("		reader.readAsDataURL(file);\n");
      out.write("		reader.onload = function(e){\n");
      out.write("			if(e.target.result.indexOf(\"image\")!=-1){\n");
      out.write("				img.attr(\"src\",e.target.result)\n");
      out.write("			}else{\n");
      out.write("				img.attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/no_img.jpg\");\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("	\n");
      out.write("	//이미지 취소 \n");
      out.write("	function cancelFile(fileName){\n");
      out.write("		$(\"input#\" + fileName).val(\"\");\n");
      out.write("		$(\"img#\"+ fileName + \"Img\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/filePlus.png\");	\n");
      out.write("	}\n");
      out.write("\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /app/board/write.jsp(91,79) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberId}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
