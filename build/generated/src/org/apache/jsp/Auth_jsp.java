package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Auth_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"flex justify-center items-center h-screen bg-indigo-600\">\n");
      out.write("        <div class=\"w-96 p-6 shadow-lg bg-white rounded-md\">\n");
      out.write("            <h1 class=\"text-3xl block text-center font-semibold\"><i class=\"fa-solid fa-user\"></i> Login</h1>\n");
      out.write("            <hr class=\"mt-3\">\n");
      out.write("            <div class=\"mt-3\">\n");
      out.write("                <label for=\"username\" class=\"block text-base mb-2\">Username</label>\n");
      out.write("                <input type=\"text\" id=\"username\" class=\"border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600\" placeholder=\"Enter Username...\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mt-3\">\n");
      out.write("                <label for=\"password\" class=\"block text-base mb-2\">Password</label>\n");
      out.write("                <input type=\"password\" id=\"password\" class=\"border w-full text-base px-2 py-1 focus:outline-none focus:ring-0 focus:border-gray-600\" placeholder=\"Enter Password...\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mt-3 flex justify-between items-center\">\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"checkbox\">\n");
      out.write("                    <label>Remember Me</label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"#\" class=\"text-indigo-800 font-semibold\">Forgot Password?</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mt-5\">\n");
      out.write("                <button type=\"submit\" class=\"border-2 border-indigo-700 bg-indigo-700 text-white py-1 w-full rounded-md hover:bg-transparent hover:text-indigo-700 font-semibold\"><i class=\"fa-solid fa-right-to-bracket\"></i>&nbsp;&nbsp;Login</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
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
