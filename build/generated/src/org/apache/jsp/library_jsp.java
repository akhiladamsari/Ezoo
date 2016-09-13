package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class library_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("  \t\n");
      out.write("    <title>Curatrix</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!--Google Fonts-->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Duru+Sans|Actor' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!--Bootshape-->\n");
      out.write("    <link href=\"css/bootshape.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <!-- Navigation bar -->\n");
      out.write("    <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\"><span class=\"green\"></span>  Template Library</a>\n");
      out.write("\t\t \n");
      out.write("        </div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("        <nav role=\"navigation\" class=\"collapse navbar-collapse navbar-right\">\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("          <ul class=\"navbar-nav nav\">\n");
      out.write("            <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Animal Glossary</a></li>\n");
      out.write("            <li><a href=\"#\">Template Library</a></li>\n");
      out.write("            <li><a href=\"#\">Log Note Library</a></li>\n");
      out.write("            <li><a href=\"login.html\">Log In</a></li>\n");
      out.write("\t\t\t <input type=\"text\" placeholder=\"search\"/>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div><!-- End Navigation bar -->\n");
      out.write("    <!-- Thumbnails -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"site-search\">\n");
      out.write("\t <tr>\n");
      out.write("    <td><strong>SELECT CATEGARY</strong></span></td>\n");
      out.write("    <td></span>\n");
      out.write("\t</td>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("    <td>\n");
      out.write("    <select style=\"width: 250px;\" id=\"SELECT\">\n");
      out.write("\t<option selected=\"selected\" value=\"SELECT\">SELECT</option>\n");
      out.write("\t<option>A</option>\n");
      out.write("\t<option>B</option>\n");
      out.write("\t<option>C</option>\n");
      out.write("\t<option>D</option>\n");
      out.write("\t<option>E</option>\n");
      out.write("\t<option>F</option>\n");
      out.write("\t</select>\n");
      out.write("    </span></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("    <div class=\"container thumbs\">\n");
      out.write("      <div class=\"col-sm-6 col-md-4\">\n");
      out.write("        <div class=\"thumbnail\">\n");
      out.write("          <img src=\"image/pic11.jpg\" alt=\"\" class=\"img-box\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("           \n");
      out.write("              <div class=\"btn-toolbar text-center\">\n");
      out.write("              <a href=\"#\" role=\"button\" class=\"btn btn-success\">Eagle</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-sm-6 col-md-4\">\n");
      out.write("        <div class=\"thumbnail\">\n");
      out.write("          <img src=\"image/pic12.jpg\" alt=\"\" class=\"img-box\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("           \n");
      out.write("             <div class=\"btn-toolbar text-center\">\n");
      out.write("              <a href=\"#\" role=\"button\" class=\"btn btn-success\">Parrot</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-sm-6 col-md-4\">\n");
      out.write("        <div class=\"thumbnail\">\n");
      out.write("          <img src=\"image/pic13.jpg\" alt=\"\" class=\"img-box\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("         \n");
      out.write("             <div class=\"btn-toolbar text-center\">\n");
      out.write("              <a href=\"#\" role=\"button\" class=\"btn btn-success\">Pigeon</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\t   <div class=\"col-sm-6 col-md-4\">\n");
      out.write("        <div class=\"thumbnail\">\n");
      out.write("          <img src=\"image/pic14.jpg\"  alt=\"\" class=\"img-box\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("           \n");
      out.write("             <div class=\"btn-toolbar text-center\">\n");
      out.write("              <a href=\"#\" role=\"button\" class=\"btn btn-success\">Owl</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\t   <div class=\"col-sm-6 col-md-4\">\n");
      out.write("        <div class=\"thumbnail\">\n");
      out.write("          <img src=\"image/pic15.jpg\"  alt=\"\" class=\"img-box\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("           \n");
      out.write("             <div class=\"btn-toolbar text-center\">\n");
      out.write("              <a href=\"#\" role=\"button\" class=\"btn btn-success\">Fowl</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\t   <div class=\"col-sm-6 col-md-4\">\n");
      out.write("        <div class=\"thumbnail\">\n");
      out.write("          <img src=\"image/pic16.jpg\"alt=\"\" class=\"img-box\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            \n");
      out.write("             <div class=\"btn-toolbar text-center\">\n");
      out.write("              <a href=\"#\" role=\"button\" class=\"btn btn-success\">Stork</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\t  \n");
      out.write("    </div><!-- End Thumbnails -->\n");
      out.write("    <!-- Content -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h3 class=\"text-center\">Welcome to E Zoo</h3>\n");
      out.write("       </div><!-- End Content -->\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <div class=\"footer text-center\">\n");
      out.write("          </div><!-- End Footer -->\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <!-- // <script src=\"https://code.jquery.com/jquery.js\"></script> -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootshape.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
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
