/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.10
 * Generated at: 2021-09-30 03:34:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resource.about;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resource/common/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".box-items {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background: white;\r\n");
      out.write("	border-right: 2px solid black;\r\n");
      out.write("	border-bottom: 2px solid black;\r\n");
      out.write("	\r\n");
      out.write("	position:absolute;\r\n");
      out.write("	z-index: -8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h4, p {\r\n");
      out.write("	color: black;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("	color: black;\r\n");
      out.write("	text-align: justify;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h4 {\r\n");
      out.write("	font-weight: bolder;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p:hover {\r\n");
      out.write("	color: black;\r\n");
      out.write("	text-align: justify;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h4:hover {\r\n");
      out.write("	font-weight: bolder;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@keyframes zoomIn {\r\n");
      out.write("  from { transform: scale(0.9); }\r\n");
      out.write("  to   { transform: scale(1) translate(0px,50%);}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* The element to apply the animation to */\r\n");
      out.write(".img1{\r\n");
      out.write("position:relative;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    animation-delay: 1s;\r\n");
      out.write("    animation-name: zoomIn;\r\n");
      out.write("    animation-duration: 10s;\r\n");
      out.write("    animation-fill-mode: forwards;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"text-center p-5\">\r\n");
      out.write("			<h></h>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"box-items col-sm-12 col-md-6 col-xl-6\">\r\n");
      out.write("				<h3>Vision</h3>\r\n");
      out.write("				<div>\r\n");
      out.write("					<p style=\"font-size:25px; color:orange; font-weight:bolder;\">AT THE FOREFRONT OF MEDICAL EXCELLENCE, DEFINING THE FUTURE\r\n");
      out.write("						OF SRI LANKAN HEALTHCARE.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"box-items col-sm-12 col-md-6 col-xl-6\">\r\n");
      out.write("				<h3>Mission</h3>\r\n");
      out.write("				<div>\r\n");
      out.write("					<p style=\"font-size:25px; color:#570000; font-weight:bolder;\">To enhance the lives of our community at large, by unfolding\r\n");
      out.write("						a paradigm shift in all service tiers and excelling in\r\n");
      out.write("						preventative and compassionate patient care.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"box-items col-sm-12 col-md-7 col-xl-7\">\r\n");
      out.write("				<div class=\"img1\">\r\n");
      out.write("					<img style=\"width:100%; height:auto;\" alt=\"\"\r\n");
      out.write("						src=\"https://www.durdans.com/wp-content/uploads/2016/02/Hospital-Low-res-copy-scaled.jpg\"/>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"box-items col-sm-12 col-md-5 col-xl-5\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<p>Abc Hospital has been a trusted name in Sri Lankan\r\n");
      out.write("						healthcare for more than seven Decades. Since our foundation in\r\n");
      out.write("						1946, we have built a reputation for regional leadership in\r\n");
      out.write("						medical excellence and innovation, based on a simple philosophy:\r\n");
      out.write("						that improving the health of our community should be driven by\r\n");
      out.write("						passion as well as compassion. Durdans Hospital offers 260 beds ??????\r\n");
      out.write("						including 60 in our critical care department ?????? across a range of\r\n");
      out.write("						spacious, modern rooms. We offer the best consultants, specialists\r\n");
      out.write("						and employees, all of whom are dedicated to providing exceptional\r\n");
      out.write("						clinical outcomes and utmost customer satisfaction. With\r\n");
      out.write("						cutting-edge technology, we have evolved into a world-class\r\n");
      out.write("						tertiary care institute. Our facilities include an ultramodern\r\n");
      out.write("						theatre complex comprising eight theatres and state-of-the-art\r\n");
      out.write("						intensive care units (ICUs).\r\n");
      out.write("					<p>We also offer a modern radiology unit, fully equipped\r\n");
      out.write("						physiotherapy unit and two catheterisation laboratories. Durdans\r\n");
      out.write("						Hospital is also proud to offer the industry-leading Heart Command\r\n");
      out.write("						Centre and Heart Station, supported by the country??????s finest\r\n");
      out.write("						cardiologists and cardiac surgeons. With 15 beds and world-class\r\n");
      out.write("						facilities, the centre offers a comprehensive range of diagnostic\r\n");
      out.write("						tests, advanced surgical treatments, cardiac rehabilitation and\r\n");
      out.write("						post-operative counselling. Abc Hospital proudly employs more than\r\n");
      out.write("						2,000 dedicated and</p>\r\n");
      out.write("					<p>talented professionals across our departments, all of whom\r\n");
      out.write("						serve customers and their families with empathy and compassion.\r\n");
      out.write("						The team includes 350 specialist consultants, 15 resident\r\n");
      out.write("						consultants and approximately 50 senior medical officers with\r\n");
      out.write("						support provided by highly trained nurses, paramedics and\r\n");
      out.write("						non-medical staff. Abc Hospital is the first healthcare\r\n");
      out.write("						institution in Sri Lanka to be endorsed by Joint Commission\r\n");
      out.write("						International (JCI) for meeting the Gold Standard in Global\r\n");
      out.write("						Healthcare. In 2017, we were re-accredited with the Gold Seal of\r\n");
      out.write("						Approval by JCI, the world??????s leading accreditation organisation,\r\n");
      out.write("						based in the United States of America.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"box-items col-sm-12 col-md-8 col-xl-8\">\r\n");
      out.write("                  <h>Careers</h>\r\n");
      out.write("				<div>\r\n");
      out.write("					<p>At Abc Hospital, we aim to build a talent pool of friendly\r\n");
      out.write("						and passionate team members who are as dedicated as we are to\r\n");
      out.write("						providing world-class care and support services. We work hard to\r\n");
      out.write("						ensure our staff are as proud of us as we are of them. The\r\n");
      out.write("						standards we set for care and service are high. Our team members\r\n");
      out.write("						rise to the challenge, going above and beyond to meet and exceed\r\n");
      out.write("						those standards every time. We value ideas and feedback. Our teams\r\n");
      out.write("						and departments are organised in a way that opens up communication\r\n");
      out.write("						channels from the bottom up, and we empower staff across all\r\n");
      out.write("						levels to share their insights. We invest in our team, encouraging\r\n");
      out.write("						career growth and long-term personal and professional development.\r\n");
      out.write("						Knowing we support them, each of our team members is a proud\r\n");
      out.write("						ambassador for our brand, confident that working with us enhances\r\n");
      out.write("						their career. The Abc Hospital team ensures that everyone who\r\n");
      out.write("						visits us enjoys exceptional healthcare in a welcoming and\r\n");
      out.write("						supportive environment..</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"box-items col-sm-12 col-md-4 col-xl-4\">\r\n");
      out.write("				<div class=\"img1\">\r\n");
      out.write("					<img style=\"width: 100%; height: auto;\" alt=\"\"\r\n");
      out.write("						src=\"https://www.durdans.com/wp-content/uploads/2017/06/Why_work_for_us_image_1.png\"></img>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"./resource/common/js/bootstrap.min.js\"></script>\r\n");
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
