package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>LO17 - Recherche ADIT</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/res/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/res/css/todc-bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/res/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-masthead navbar-inverse navbar-fixed-top\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\r\n");
      out.write("                    aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">LO17 Requestator</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-collapse collapse navbar-right\">\r\n");
      out.write("            <p class=\"navbar-text\">UTC, P16 - Florian Impellettieri, Jean Vintache</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"jumbotron\">\r\n");
      out.write("    <div id=\"search\" class=\"container\">\r\n");
      out.write("        <h2>Rechercher parmi les bulletins &eacute;lectroniques de l'ADIT</h2>\r\n");
      out.write("        <form class=\"form-inline\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/servlet/LanceRequete\" method=\"get\">\r\n");
      out.write("            <div class=\"input-group input-group-lg\">\r\n");
      out.write("                <input type=\"text\" name=\"r\" class=\"form-control\"\r\n");
      out.write("                       placeholder=\"Rechercher...\" size=\"50\" autofocus=\"true\" autocomplete=\"false\"\r\n");
      out.write("                ");
 if (request.getParameter("r") != null) out.print("value=\""+(String) request.getParameter("r")+"\""); 
      out.write("\r\n");
      out.write("                />\r\n");
      out.write("                <div class=\"input-group-btn\">\r\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
 if (request.getAttribute("err") != null) { 
      out.write("\r\n");
      out.write("        <div id=\"errors\" class=\"alert alert-danger col-sm-4 col-sm-offset-1\">\r\n");
      out.write("            <strong>Erreur</strong>\r\n");
      out.write("            <div class=\"collapsed\">\r\n");
      out.write("                ");

                    String s = (String) request.getAttribute("err");
                    s = s.replaceAll("\n", "<br />\n");
                    out.println(s);
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
 if (request.getAttribute("det") != null) { 
      out.write("\r\n");
      out.write("        <div class=\"alert alert-info col-sm-5 col-sm-offset-1\">\r\n");
      out.write("            <a data-toggle=\"collapse\" href=\"#details\" aria-expanded=\"false\" aria-controls=\"details\"><strong>D&eacute;tails...</strong></a>\r\n");
      out.write("            <div class=\"collapse\" id=\"details\">\r\n");
      out.write("            ");

                String s = (String) request.getAttribute("det");
                s = s.replaceAll("\n", "<br />\n");
                out.println(s);
            
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
 if (request.getAttribute("res") != null) { 
      out.write("\r\n");
      out.write("    <div id=\"results\">\r\n");
      out.write("        <table class=\"table table-bordered table-striped table-condensed\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");

                    for (String s : ((List<List<String>>) request.getAttribute("res")).get(0)) {
                        out.println("<th>" + s + "</th>");
                    }
                    ((List<List<String>>) request.getAttribute("res")).remove(0);
                
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

                for (List<String> l : ((List<List<String>>) request.getAttribute("res"))) {
                    out.println("<tr>");
                    for (String s : l) {
                        // add links if possible
                        Pattern p = Pattern.compile("(\\w+\\.htm)");
                        Matcher m = p.matcher(s);
                        if (m.find()) {
                            // replace first number with "number" and second number with the first
                            s = m.replaceFirst("<a href=\"" + request.getContextPath() + "/res/BULLETINS/$1\">"+ s +"</a>");
                        }
                        out.println("<td>" + s + "</td>");
                    }
                    out.println("</tr>");
                }
            
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core JavaScript\r\n");
      out.write("================================================== -->\r\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/res/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
