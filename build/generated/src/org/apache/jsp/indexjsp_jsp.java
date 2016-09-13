package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header><img src=\"Images/web.png\" width=\"200\" height=\"133\" alt=\"\"/>\n");
      out.write("            <nav><a href=\"index.html\" class=\"navHome\">Home</a> <a class=\"navAnimalGlossary\">AnimalGlossary</a> <a class=\"navTemplateLibrary\">TemplateLibrary</a> <a class=\"navLogNoteLibrary\">LogNoteLibrary</a> <a href=\"login.html\" class=\"navLogin\">Login</a> <a href=\"search.html\" class=\"navSearch\">Search </a></nav>\n");
      out.write("        </header>\n");
      out.write("        <section class=\"sectionLeft\">\n");
      out.write("            <h2>Introduction</h2> <p>With the development of the technology and busy life, people tend to use web based management systems instead of manual systems in every industry.  Scientists and nature lovers feel uncomfortable with the manual log entry system prevailing. We are introducing an Electronic Log Book for Scientists and Nature Lovers to track animal data and maintain check lists instead of the manual system. Our system consisted of a web portal for all users and mobile application which can access Scientists and nature lovers separately according to their needs.\n");
      out.write("\n");
      out.write("            <p>There are electronic log books for birds such as eBird. But there is a need of an electronic logbook for animals. Our system will help to three main parties. They are the Scientists, wildlife researchers and the nature lovers who have interest about the animals.</p>\n");
      out.write("\n");
      out.write("            <p>When we keep manual recordings the level of service is limited.\n");
      out.write("                Since</p>\n");
      out.write("\n");
      out.write("            <ul>1.       The checklists may have the ability to make errors.</ul>\n");
      out.write("            <ul>2.       Leaking of hardly gathered information in field visits.</ul>\n");
      out.write("            <ul>3.       Time consuming and costly to maintain manual checklists.</ul>\n");
      out.write("            <ul>4.       Reduction in sharing information about animals.</ul>\n");
      out.write("            <ul>5.       Duplication of data entry.</ul>\n");
      out.write("            <ul>6.       Difficulty in note down the locations, timing with respective to the animals during scrape situations</ul>\n");
      out.write("            <ul>7.       It takes more effort and physical space to keep track of paper documents, maintain and to find gathered  \t\t\t             information when needed.</ul>\n");
      out.write("\n");
      out.write("            Our electronic log book can serve for thousands of people interested about animals worldwide.\n");
      out.write("            So, the system may help to animal researches and to make people known about the animals and conserve the animal life.</p> \n");
      out.write("    </section>\n");
      out.write("    <section>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer>Copyrights by CURATRIX 2016</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
