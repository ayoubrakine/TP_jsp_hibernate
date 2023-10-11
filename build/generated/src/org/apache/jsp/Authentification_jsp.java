package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Authentification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <title>authentification</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("            <form action=\"AuthentificationController\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   <div class=\"bg-sky-100 justify-items-center \">\n");
      out.write("\n");
      out.write("                <div class=\"\">Login : </div> \n");
      out.write("                <div class=\"\"><input type=\"email\" name=\"email\" value=\"\" required placeholder=\"E-mail adress\" class=\"border-solid border-2 border-gray-900 rounded-md\"/></div>\n");
      out.write("                <div class=\"\">Password :</div>\n");
      out.write("                <div class=\"\"><input type=\"password\" name=\"password\" value=\"\" required placeholder=\"password\" class=\"border-solid border-2 border-gray-900 rounded-md\"/></div>\n");
      out.write("                <div class=\"\"><input type=\"submit\" name=\"submit\" value=\"submit\" class=\"border-solid border-2 border-gray-900 rounded-lg bg-sky-500 hover:bg-sky-700 w-24 h-7 \" /></div>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"col-span-2 flex justify-center\"><a href=\"passoublie.jsp\" class=\" hover:text-sky-400/100 \">Mot de passe oublié</a></div>\n");
      out.write("                <div class=\"col-span-2 flex justify-center\"><a href=\"Inscription.jsp\" class=\"hover:text-sky-400/100 \">Créer un nouveau compte ?</a></div>\n");
      out.write("                <div></div>\n");
      out.write("                \n");
      out.write("                <div></div>\n");
      out.write("\n");
      out.write("                    ");

                        if (request.getParameter("msg") != null) {
      out.write("\n");
      out.write("                        <div class=\"col-span-3 flex justify-center text-red-500\">");
      out.print( request.getParameter("msg"));
      out.write("</div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("\n");
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
