/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.10
 * Generated at: 2021-09-30 03:34:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resource.welcomeHospital;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class welcomeHospital_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resource/common/css/bootstrap.min.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write(".pad {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: auto;\r\n");
      out.write("	position:relative;\r\n");
      out.write("	top:200px;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pad p {\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	color: grey;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("	text-align: justify;\r\n");
      out.write("	font-weight: bolder;\r\n");
      out.write("	color: black;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bgimage {\r\n");
      out.write("	background-image:url(\"./resource/common/bgimage.jpg\");\r\n");
      out.write("	background-repeat: no;\r\n");
      out.write("	background-position: center;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: auto;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bgimage:hover {\r\n");
      out.write("	animation-delay: 1s;\r\n");
      out.write("    animation-name: zoomIn1;\r\n");
      out.write("    animation-duration: 10s;\r\n");
      out.write("    animation-fill-mode: forwards;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@keyframes zoomIn1{\r\n");
      out.write("  from { transform: scale(1.2); }\r\n");
      out.write("  to   { transform: scale(1) translate(0px, -10px);}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media all and (max-width: 600px) {\r\n");
      out.write("	.pad h1{\r\n");
      out.write("		font-size:30px;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media all and (min-width: 600px) {\r\n");
      out.write("	.pad h1{\r\n");
      out.write("		font-size:100px;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container-fluid  pad bgimage\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-sm-12 col-md-6 col-xl-6\">\r\n");
      out.write("				<h1 style=\"color:white; width:100%; font-style:italic; font-family:fantasy;\r\n");
      out.write("	height:auto;\">Welcome\r\n");
      out.write("				to ABC Hospital</h1>\r\n");
      out.write("				<h style=\"color:black;font-size:35px; width:100%;\r\n");
      out.write("	height:auto;\">Compassion,\r\n");
      out.write("				Innovation , Excellence</h>\r\n");
      out.write("				<h style=\"color:#ff9f1c;font-size:35px;\">Dedicated to you</h>\r\n");
      out.write("				<p>ABC Hospital has been a trusted name in Sri Lankan healthcare\r\n");
      out.write("					for more than seven decades. Since our foundation in 1945, we have\r\n");
      out.write("					built a reputation for regional leadership in medical excellence\r\n");
      out.write("					and innovation, based on a simple philosophy: that improving the\r\n");
      out.write("					health of our community should be driven by passion as well as\r\n");
      out.write("					compassion.</p>\r\n");
      out.write("				<p style=\"font-size: 20px; text-align: justify;\">ABC Hospital\r\n");
      out.write("					offers 260 beds including 60 in our critical care department ,\r\n");
      out.write("					across a range of spacious, modern rooms. We offer the best\r\n");
      out.write("					consultants, specialists and employees, all of whom are dedicated\r\n");
      out.write("					to providing exceptional clinical outcomes and utmost customer\r\n");
      out.write("					satisfaction.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"./resource/common/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./resource/common/js/popper.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"./resource/common/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"./resource/common/js/jquery.sticky.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./resource/common/js/main.js\"></script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
