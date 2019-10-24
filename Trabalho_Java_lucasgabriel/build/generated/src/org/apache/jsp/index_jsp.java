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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cães</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"body_bg\">            \n");
      out.write("            <div class=\"app-container body-tabs-shadow fixed-sidebar fixed-header\">\n");
      out.write("                <header class=\"main_menu single_page_menu\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row align-items-center\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                                    <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                                        <img src=\"img/logo.png\" alt=\"logo\"> </a>\n");
      out.write("                                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                                            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                        <span class=\"menu_icon\">\n");
      out.write("                                            <i class=\"fas fa-bars\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </button>                                                                                                    \n");
      out.write("\n");
      out.write("                                    <div class=\"collapse navbar-collapse main-menu-item\" id=\"navbarSupportedContent\">\n");
      out.write("                                        <ul class=\"navbar-nav\">\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"index.jsp\">Home</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"ListarRaca\">Cadastro</a>\n");
      out.write("                                            </li> \n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"cadastrarraca.jsp\">Cadastrar Raça</a>\n");
      out.write("                                            </li> \n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"ListarCao\">Listar</a>\n");
      out.write("                                            </li> \n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>                                \n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </header> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section class=\"banner_part\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <p class=\"text-center\" style=\"color: #fff;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                    <div class=\"row align-items-center justify-content-between\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-8\">\n");
      out.write("                            <div class=\"banner_text\">\n");
      out.write("                                <div class=\"banner_text_iner\">\n");
      out.write("                                    <h1>Dogs</h1>\n");
      out.write("                                    <p>Cadastre o seu cão aqui!!</p>\n");
      out.write("\n");
      out.write("                                    <a href=\"ListarRaca\" class=\"btn_1\">Cadastrar</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>        \n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-1.12.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
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
