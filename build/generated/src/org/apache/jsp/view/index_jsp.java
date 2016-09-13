package org.apache.jsp.view;

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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Home</title>\n");
      out.write("<link href=\"Styles.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<header><img src=\"Images/web.png\" width=\"200\" height=\"133\" alt=\"\"/>\n");
      out.write("\t\n");
      out.write("    <nav><a href=\"index.html\" class=\"navHome\">Home</a> <a href=\"glossary.html\" class=\"navAnimalGlossary\">Animal Glossary</a> <a href=\"library.html\" class=\"navTemplateLibrary\">Template Library</a> <a class=\"navLogNoteLibrary\">Log Note Library</a> <a href=\"login.html\" class=\"navLogin\">Login</a> <a href=\"search.html\" class=\"navSearch\">Search </a></nav>\n");
      out.write("    \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<aside class=\"asideLeft\">\n");
      out.write("  <h1>Introduction</h1>\n");
      out.write("   <p>With the development of the technology and busy life, people tend to use web based management systems instead of manual systems in every industry.  Scientists and nature lovers feel uncomfortable with the manual log entry system prevailing. We are introducing an Electronic Log Book for Scientists and Nature Lovers to track birds data and maintain check lists instead of the manual system. Our system consisted of a web portal for all users and mobile application which can access Scientists and nature lovers separately according to their needs.\n");
      out.write("    \n");
      out.write("    <p>Our system will help to three main parties. They are the <b>Scientists</b>, <b>Wildlife researchers</b> and the <b>Nature lovers</b> who have interest about the animals.\n");
      out.write("    \n");
      out.write("  <p>When we keep manual recordings the level of service is limited.\n");
      out.write("    Since\n");
      out.write("    \n");
      out.write("\t<ol><li>The checklists may have the ability to make errors.\n");
      out.write("    \t<li>Leaking of hardly gathered information in field visits.\n");
      out.write("    \t<li>Time consuming and costly to maintain manual checklists.\n");
      out.write("    \t<li>Reduction in sharing information about animals.\n");
      out.write("    \t<li>Duplication of data entry.\n");
      out.write("    \t<li>Difficulty in note down the locations, timing with respective to the animals during scrape situations\n");
      out.write("    \t<li>It takes more effort and physical space to keep track of paper documents, maintain and to find gathered  \t\t\t             information when needed.</ol>\n");
      out.write("    \n");
      out.write("    Our electronic log book can serve for thousands of people interested about birds in <b><i>South asia</i></b>.\n");
      out.write("    So, the system may help to animal researches and to make people known about the animals and conserve the animal life.</p> \n");
      out.write("</aside>\n");
      out.write("\n");
      out.write("<section class=\"sectionRight\">\n");
      out.write("<style>\n");
      out.write(" #map {\n");
      out.write("   width: 100%;\n");
      out.write("   height: 400px;\n");
      out.write("   background-color: grey;\n");
      out.write(" }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("  <h3>South Asia Map</h3>\n");
      out.write("  <div id=\"map\">\n");
      out.write("   <script>\n");
      out.write("\n");
      out.write("      function initMap() {\n");
      out.write("        var mapDiv = document.getElementById('map');\n");
      out.write("        var map = new google.maps.Map(mapDiv, {\n");
      out.write("\n");
      out.write("           center: {lat: 7.8731, lng: 80.7718},\n");
      out.write("          zoom: 8\n");
      out.write("\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?callback=initMap\"\n");
      out.write("        async defer></script></div>\n");
      out.write("</section>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("    <footer>Copyrights by CURATRIX 2016</footer>\n");
      out.write("</body>\n");
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
