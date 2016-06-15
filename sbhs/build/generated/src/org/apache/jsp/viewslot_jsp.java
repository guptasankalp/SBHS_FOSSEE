package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import bean.user;
import database.database;
import java.util.List;
import java.util.ArrayList;

public final class viewslot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Single Board Heater System &middot; Virtual Labs</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://vlabs.iitb.ac.in/sbhs/static/img/favicon.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://vlabs.iitb.ac.in/sbhs/static/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://vlabs.iitb.ac.in/sbhs/static/css/bootstrap-responsive.min.css\">\n");
      out.write("    <script src=\"http://vlabs.iitb.ac.in/sbhs/static/js/jquery-latest.min.js\"></script>\n");
      out.write("    <script src=\"http://vlabs.iitb.ac.in/sbhs/static/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("    html { margin: 0; height: 100%; }\n");
      out.write("    body { padding-top: 70px; position: relative; margin: 0; min-height: 88%; }\n");
      out.write("    table, td \n");
      out.write("    {\n");
      out.write("    border: 1px solid black;}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a href=\"/sbhs/\" class=\"brand\">Single Board Heater System Lab</a>\n");
      out.write("\n");
      out.write("            <ul class=\"nav pull-right\">\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Welcome, sankalp <b class=\"caret\"></b></a>\n");
      out.write("                    <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dLabel\">\n");
      out.write("                        <li><a href=\"#passwordModal\" role=\"button\" data-toggle=\"modal\">Change Password</a></li>\n");
      out.write("                        <li><a href=\"#machineModal\" role=\"button\" data-toggle=\"modal\">Request machine change</a></li>\n");
      out.write("                        <li><a href=\"/sbhs/logout\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <ul class=\"nav pull-right\">\n");
      out.write("                <li><a href=\"/sbhs/info\">SBHS InfoCentre</a></li>\n");
      out.write("                <li><a href=\"http://sbhs.os-hardware.in/downloads\" target=\"_blank\">Downloads</a></li>\n");
      out.write("                <li><a href=\"/sbhs/theory\">Theory</a></li>\n");
      out.write("                <li><a href=\"/sbhs/procedure\">Procedure</a></li>\n");
      out.write("                <li><a href=\"/sbhs/experiments\">Experiments</a></li>\n");
      out.write("                <li><a href=\"/sbhs/quiz \">Quiz</a></li>\n");
      out.write("                <li><a href=\"/sbhs/feedback\">Feedback / Contact Us</a></li> \n");
      out.write("                <li><a href=\"/sbhs/about\">About Us</a></li>                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span12\">\n");
      out.write("    <ul class=\"nav nav-pills\">\n");
      out.write("        <li><button id=\"home-nav\"><a href=\"/sbhs/home\">Home</a></button></li>\n");
      out.write("        <li><button id=\"book-slot-nav\"><a href=\"/sbhs/slot/new\">Book slot</a></button></li>\n");
      out.write("        <li><button id=\"view-slot-nav\"><a href=\"/sbhs/slot\">View/Delete slot</a></button></li>\n");
      out.write("        <li><button id=\"download-log-nav\"><a href=\"/sbhs/experiment/logs\">Download log files</a></button></li>\n");
      out.write("        <li><button id=\"video-nav\"><a href=\"/sbhs/show_video\">Show video</a></li>\n");
      out.write("        </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("      document.getElementById(\"view-slot-nav\").classList.add(\"active\");\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <div class=\"span12\">\n");
      out.write("        <h3>Your booked slots</h3>\n");
      out.write("<table id=\"myTable\"  class=\"table table-condensed\">\n");
      out.write("  <tr>\n");
      out.write("    <td>Slot time </td>\n");
      out.write("    <td>Slot date </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("      <!-- <button onclick=\"myFunction()\">Try it</button>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--<td><a class=\"btn btn-disabled\" disabled=\"disabled\">Delete</a></td>\n");
      out.write("  -->\n");
      out.write("        </div>\n");
      out.write("                     \n");
      out.write("   \n");
      out.write("  ");


    List<String> stime= new ArrayList<String>(); 
     
 //      for(int i=0;i<stime.size();i++){
    //     System.out.println(stime.get(i));
     
    user us=(user)(request.getSession().getAttribute("user"));
            ///*us.setacc_id(session);*/
            database db;
            db = new database();
            stime=db.userdetails(us);
            int i=0;
            int len=stime.size();
            
            out.println("<table   class='table table-condensed'>");
            for(i=0;i<len-1;i+=2){
                out.print("<tr><td>"+stime.get(i)+"</td><td>"+stime.get(i+1)+"</td><td>'DELETE'</td></tr>");
                
                Date d=new Date();
                
             //   if(stime.get(i+1)>d){
               //     out.println("<button disbled='true'/>");
                 
                //}
               // else
               // {
                  //  out.println("<button />");
                //}
                out.println("<p></p>");
            }
         out.println("</table>");
  
  
      out.write("\n");
      out.write("            \n");
      out.write("             <script>\n");
      out.write("          {\n");
      out.write("    var btn = document.createElement(\"BUTTON\");\n");
      out.write("    var t = document.createTextNode(\"DELETE\");\n");
      out.write("    btn.appendChild(t);\n");
      out.write("    document.body.appendChild(btn);\n");
      out.write("}\n");
      out.write("  </script>\n");
      out.write("        <script>\n");
      out.write("   /*\n");
      out.write("    \n");
      out.write("    window.onload = function() {\n");
      out.write("    var table = document.getElementById(\"myTable\");\n");
      out.write("    \n");
      out.write("    var len=");
      out.print(len);
      out.write(" ;\n");
      out.write("    \n");
      out.write("    for(var i=0;i<len;i++ ){\n");
      out.write("        ");
String s=stime.get(--i);
        System.out.print(s);
        
      out.write("\n");
      out.write("        var xy=");
      out.print(s);
      out.write(";\n");
      out.write("        var row = table.insertRow(i);\n");
      out.write("    var cell1 = row.insertCell(0);\n");
      out.write("    var cell2 = row.insertCell(1);\n");
      out.write("    cell1.innerHTML = xy[i];\n");
      out.write("}\n");
      out.write("    //cell2.innerHTML = \"\"; \n");
      out.write("    \n");
      out.write("            }\n");
      out.write("          //  us.setdate(x);\n");
      out.write("*/\n");
      out.write("      </SCRIPT>\n");
      out.write("     \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("                    \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
      out.write("        <small style=\"float: right; font-size: 10px; margin: -8px 10px 2px 0;\">Server time: <span id=\"timer\">9th Jun 2016 12:47:16 PM</span>. Copyright &copy; 2014 <a href=\"www.iitb.ac.in\" target=\"_blank\">www.iitb.ac.in</a>. Designed and hosted by <a href=\"http://www.cdeep.iitb.ac.in/\" target=\"_blank\">Automation Lab, CDEEP, IIT Bombay</a></small>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("(function(){\n");
      out.write("    var date_string = \"2016-06-09 12:47:16\";\n");
      out.write("    var a = date_string.split(/[^0-9]/);\n");
      out.write("    for(i=0;i<6;i++){a[i]=parseInt(a[i]);}\n");
      out.write("    window.date = new Date(a[0],a[1]-1,a[2],a[3],a[4],a[5]);\n");
      out.write("    window.monthNames = [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"May\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"];\n");
      out.write("    window.ordinalize = function (i) {\n");
      out.write("        var j = i % 10;\n");
      out.write("        if (j == 1 && i != 11) return i + \"st\";\n");
      out.write("        if (j == 2 && i != 12) return i + \"nd\";\n");
      out.write("        if (j == 3 && i != 13) return i + \"rd\";\n");
      out.write("        return i + \"th\";\n");
      out.write("    }\n");
      out.write("    window.num_padding = function(i) {\n");
      out.write("        return i < 10 ? \"0\" + i : i;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    var timer = function() {\n");
      out.write("        window.date.setSeconds(window.date.getSeconds() + 1);\n");
      out.write("        str = window.ordinalize(window.date.getDate()) + \" \" + window.monthNames[window.date.getMonth()] + \" \" + window.date.getFullYear() + \" \" + window.date.toLocaleTimeString().toUpperCase();\n");
      out.write("        document.getElementById(\"timer\").innerHTML = str;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    setInterval(timer, 1000);\n");
      out.write("})();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"modal hide fade\" id=\"passwordModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("        <h3>Change Password</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-body\">\n");
      out.write("        <p>Please click following button to send password change link to your email address.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <a data-dismiss=\"modal\" aria-hidden=\"true\" class=\"btn\">Close</a>\n");
      out.write("        <a href=\"/sbhs/password\" class=\"btn btn-primary\">Send password change link</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal hide fade\" id=\"machineModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("        <h3>Machine change</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-body\">\n");
      out.write("        <p>Please send an email to rupakrokade@iitb.ac.in stating the reasons why machine change is required.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <a data-dismiss=\"modal\" aria-hidden=\"true\" class=\"btn\">Close</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    $(\".alert\").alert();\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
