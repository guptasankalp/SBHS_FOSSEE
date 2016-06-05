package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Single Board Heater System </title>\n");
      out.write("         <link rel=\"shortcut icon\" href=\"http://vlabs.iitb.ac.in/sbhs/static/img/favicon.ico\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"http://vlabs.iitb.ac.in/sbhs/static/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"http://vlabs.iitb.ac.in/sbhs/static/css/bootstrap-responsive.min.css\">\n");
      out.write("         <script src=\"http://vlabs.iitb.ac.in/sbhs/static/js/jquery-latest.min.js\"></script>\n");
      out.write("         <script src=\"http://vlabs.iitb.ac.in/sbhs/static/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("    <style>\n");
      out.write("    html { margin: 0; height: 100%; }\n");
      out.write("    body { padding-top: 70px; position: relative; margin: 0; min-height: 88%; }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a href=\"/sbhs/\" class=\"brand\">Single Board Heater System Lab</a>\n");
      out.write("\n");
      out.write("            <ul class=\"nav pull-right\">\n");
      out.write("                \n");
      out.write("          \n");
      out.write("  <!-- master_sankalp gupta -->\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                <li><a href=\"index.html\">Login / Register</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <ul class=\"nav pull-right\">\n");
      out.write("                <li><a href=\"/sbhs/info\">SBHS InfoCentre</a></li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("      \n");
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("        <div class=\"span12\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <div class=\"span1\" style=\"margin-left: 0; margin-right: 20px;\">\n");
      out.write("                    <img src=\"http://vlabs.iitb.ac.in/sbhs/static/img/iitbLogo.png\" alt=\"IITB\">\n");
      out.write("                </div>\n");
      out.write("                <h1>Single Board Heater System Lab</h1>\n");
      out.write("                <p>By <a href=\"http://www.iitb.ac.in/\" target=\"_blank\">Indian Institute of Technology, Bombay</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span6\">\n");
      out.write("            <h3>Welcome to Virtual Labs (SBHS)</h3>\n");
      out.write("            <p style=\"text-align: justify;\">The Virtual Labs Project was started as an initiative from the Ministry of Human Resource and Development (MHRD) to create online interactive media which would help students learn and experiment with difficult concepts in various domains. As a part of this initiative, a virtual laboratory for Single Board Heater System (SBHS) has been developed. The objective of this lab is to help students, teachers or in general enthusiasts perform experiments in the Instrumentation and Control System labs virtually, and yet have close to real life experience. The platform is focused on learning aspects as much as on performing the experiments.</p>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span6\">\n");
      out.write("            <h3>Key features of virtual labs</h3>\n");
      out.write("            <ul style=\"text-align: justify;\">\n");
      out.write("                <li>You can remotely access the Single Board Heater Systems (SBHS) hosted at IIT Bombay, and perform various experiments using it.</li>\n");
      out.write("                <li>Single Board Heater system is a lab-in-a-box setup which is primarily used for teaching/studying the theory of control systems. It can be thought of as a plant with a very small time constant (of the order of 60s). You can remotely access this system and perform experiments on it - from tests as simple as Step Tests to complicated closed loop tests!</li>\n");
      out.write("                <li>Users are given two slots of 55 minute duration for performing the tests every day. They can also make use of vacant current slots, if any, in addition to this. The relatively small time constant of the SBHS allows the user to complete one or more experiments within the 55 minute duration.</li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span6\">\n");
      out.write("            <h3>SBHS Discussion Forum</h3>\n");
      out.write("            <p style=\"text-align: justify;\">We provide you extensive documentation and spoken tutorials on the SBHS and how to access it using Virtual Labs. You can find the links in the downloads section. Support is given for Scilab based experiments on the SBHS. The Scilab based experiments on SBHS. Sample Scilab code for Step Test is also available in the downloads section. Join us also in the SBHS discussion forum </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    $('.carousel').carousel();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <br><br><br>\n");
      out.write("    <div class=\"wrapper\" style=\"position: absolute; bottom: 0; right: 0; width: 100%;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("        <ul class=\"nav pull-right\">\n");
      out.write("            <li><a href=\"#\"><b>External links</b></a></li>\n");
      out.write("            <li><a href=\"http://www.iitb.ac.in/\" target=\"_blank\">IIT Bombay</a></li>\n");
      out.write("            <li><a href=\"http://www.vlab.co.in/\" target=\"_blank\">Virtual Labs</a></li>\n");
      out.write("            <li><a href=\"http://www.spoken-tutorial.org/\" target=\"_blank\">Spoken Tutorials</a></li>\n");
      out.write("            <li><a href=\"http://www.co-learn.in/\" target=\"_blank\">Co-learn</a></li>\n");
      out.write("            <li><a href=\"http://www.nex-robotics.com/\" target=\"_blank\">Nex Robotics</a></li>\n");
      out.write("            <li><a href=\"http://sbhs.os-hardware.in/forum\" target=\"_blank\">SBHS Forum</a></li>\n");
      out.write("            <li><a href=\"http://www.cdeep.iitb.ac.in/\" target=\"_blank\">CDEEP</a></li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("        <small style=\"float: right; font-size: 10px; margin: -8px 10px 2px 0;\">Server time: <span id=\"timer\"> Jun 2016 07:42:18 PM</span>. Copyright &copy; 2014 <a href=\"www.iitb.ac.in\" target=\"_blank\">www.iitb.ac.in</a>. Designed and hosted by <a href=\"http://www.cdeep.iitb.ac.in/\" target=\"_blank\">Automation Lab, CDEEP, IIT Bombay</a></small>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("     <p > work on progress _/\\_  </p> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
