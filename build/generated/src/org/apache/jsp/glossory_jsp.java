package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class glossory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Login</title>\n");
      out.write("<link href=\"Styles.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<header><img src=\"file:///C:/Users/Akhila%20Damsari/Desktop/Group%20Project/EZooWeb/web/image/web.png\" width=\"200\" height=\"133\" alt=\"\"/>\n");
      out.write("\t\n");
      out.write("      <nav><a href=\"index.html\" class=\"navHome\">Home</a> <a href=\"glossary.html\" class=\"navAnimalGlossary\">Animal Glossary</a> <a href=\"library.html\" class=\"navTemplateLibrary\">Template Library</a> <a class=\"navLogNoteLibrary\">Log Note Library</a> <a href=\"login.html\" class=\"navLogin\">Login</a> <a href=\"search.html\" class=\"navSearch\">Search </a></nav>\n");
      out.write("</header>\n");
      out.write("        \n");
      out.write("        <table  align=\"center\" cellspacing=10 cellpadding=10>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("        <table width=\"444\" height=\"123\" border=\"0\" align=\"right\" cellpadding=\"5\" cellspacing=\"3\">\n");
      out.write("            <tr> <th width=\"70\">Email </th>\n");
      out.write("                <td width=\"290\"><input type=\"text\" name=\"username\" size=\"50\" maxlength=\"70\"></td>     \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th> Password</th>\n");
      out.write("                <td><input type=\"text\" name=\"password\" size=\"50\" maxlength=\"70\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\">\n");
      out.write("                    <input type=\"submit\" class=\"login\" value=\"Login\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("                \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("        <table align=\"right\" border=\"0\" cellspacing=\"3\" cellpadding=\"5\" >\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <tr><td colspan=\"2\" ><font size=5 class=\"foggotton\" align=\"left\">Forgotton your account? </font></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><th colspan=\"2\" class=\"create\" ><font size=6 align=\"center\"> Create an Account</font></th>\n");
      out.write("        </tr>\n");
      out.write("            <tr>\n");
      out.write("            <td> First Name</td>\n");
      out.write("            <td><input type=text name=name size=50 maxlength=70></td>    \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> Last Name</td>\n");
      out.write("                <td><input type=text name=name size=50 maxlength=70></td>    \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Email-address</td>\n");
      out.write("                <td><input type=text name=name size=50 maxlength=70></td>    \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Are you a?</td>\n");
      out.write("                <td><select name=what class=\"drop\">\n");
      out.write("                <option> Nature Lover</option>\n");
      out.write("                <option>Scientist</option>\n");
      out.write("                </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> Country</td>\n");
      out.write("                <td><input type=text name=name size=50 maxlength=70></td>    \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> Password</td>\n");
      out.write("                <td><input type=text name=name size=50 maxlength=70></td>    \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> Re-enter Password</td>\n");
      out.write("                <td><input type=text name=name size=50 maxlength=70></td>    \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\">\n");
      out.write("                    <input type=\"Submit\" class=\"createAcc\" value= \"Create an account\">\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("          <footer>Copyrights by CURATRIX 2016</footer>\n");
      out.write("</body>\n");
      out.write("    </html>");
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
