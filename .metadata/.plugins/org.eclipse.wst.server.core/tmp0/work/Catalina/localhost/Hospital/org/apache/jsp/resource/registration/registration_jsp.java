/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.10
 * Generated at: 2021-09-30 04:56:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resource.registration;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>ABC HOSPITAL</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap');\r\n");
      out.write("\r\n");
      out.write("*{\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("    min-height: 100vh;\r\n");
      out.write("    padding: 40px 0;\r\n");
      out.write("    background-color: #ecedef;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card{\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    max-width: 375px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    animation: big 0.5s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card h2{\r\n");
      out.write("    font-size: 27px;\r\n");
      out.write("    margin-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputs{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputs label{\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputs input{\r\n");
      out.write("    display: block;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    border-radius: 7px;\r\n");
      out.write("    border: 1px solid #464277;\r\n");
      out.write("    background-color: #f4f8fb;\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text-right{\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    text-align: right;\r\n");
      out.write("    display: block;\r\n");
      out.write("    color: #212121;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-login{\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    background-color: #212121;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    line-height: 40px;\r\n");
      out.write("    border-radius: 7px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-login:hover{\r\n");
      out.write("    transform: translateY(-5px);\r\n");
      out.write("    box-shadow: 2px 2px 5px rgba(0,0,0,0.4);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text{\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: #888;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text-long{\r\n");
      out.write("    color: #212121;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons a{\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    width: 50px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons a:hover{\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    transform: translateY(-5px);\r\n");
      out.write("    box-shadow: 2px 2px 10px rgba(0,0,0,0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons .google{\r\n");
      out.write("    background: #feecea;\r\n");
      out.write("    color: #9d4843;\r\n");
      out.write("}\r\n");
      out.write(".social-icons .twitter{\r\n");
      out.write("    background: #ecf4ff;\r\n");
      out.write("    color: #34a8f1;\r\n");
      out.write("}\r\n");
      out.write(".social-icons .facebook{\r\n");
      out.write("    background: #edf1fa;\r\n");
      out.write("    color: #5e83b0;\r\n");
      out.write("}\r\n");
      out.write(".social-icons .apple{\r\n");
      out.write("    background: #e9e9e9;\r\n");
      out.write("    color: #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons a i{\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes big {\r\n");
      out.write("    from {\r\n");
      out.write("        transform: scale(0.7);\r\n");
      out.write("      }\r\n");
      out.write("    \r\n");
      out.write("      to {\r\n");
      out.write("        transform: scale(1);\r\n");
      out.write("      }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"card\">\r\n");
      out.write("       <h2>Welcome To Registration</h2>\r\n");
      out.write("       <div class=\"inputs\">\r\n");
      out.write("           <label>Email</label>\r\n");
      out.write("           <input type=\"email\">\r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"inputs\">\r\n");
      out.write("           <label>Password</label>\r\n");
      out.write("           <input type=\"password\">\r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"inputs\">\r\n");
      out.write("           <label>Re - Password </label>\r\n");
      out.write("           <input type=\"password\">\r\n");
      out.write("       </div>\r\n");
      out.write("       <a target=\"_blank\" href=\"#\" class=\"text-right\"></a>\r\n");
      out.write("       <a  target=\"_blank\" href=\"#\" class=\"btn-login\">RegistrationIn</a>\r\n");
      out.write("       <p class=\"text\">OR</p>\r\n");
      out.write("        <a  target=\"_blank\" href=\"../../index.jsp\" class=\"btn-login\">Home</a>\r\n");
      out.write("     \r\n");
      out.write("       <p class=\"long-text\">Join Magic Pattern with your social media account</p>\r\n");
      out.write("       <div class=\"social-icons\">\r\n");
      out.write("           <a  target=\"_blank\" href=\"#\" class=\"social-icon google\">\r\n");
      out.write("               <i class=\"fa fa-google\"></i>\r\n");
      out.write("           </a>\r\n");
      out.write("           <a  target=\"_blank\" href=\"#\" class=\"social-icon twitter\">\r\n");
      out.write("               <i class=\"fa fa-twitter\"></i>\r\n");
      out.write("           </a>\r\n");
      out.write("           <a  target=\"_blank\" href=\"#\" class=\"social-icon facebook\">\r\n");
      out.write("               <i class=\"fa fa-facebook-f\"></i>\r\n");
      out.write("           </a>\r\n");
      out.write("           <a  target=\"_blank\" href=\"#\" class=\"social-icon apple\">\r\n");
      out.write("               <i class=\"fa fa-apple\"></i>\r\n");
      out.write("           </a>\r\n");
      out.write("       </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
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
