package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>LO17 - Recherche ADIT</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/res/style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"search\">\r\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/servlet/LanceRequete\" method=\"get\">\r\n");
      out.write("        <input type=\"text\" size=\"30\" name=\"r\" autocomplete=false autofocus=true>\r\n");
      out.write("        <input type=\"submit\" value=\"Rechercher\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write('\r');
      out.write('\n');
 if (request.getAttribute("err") != null) { 
      out.write("\r\n");
      out.write("<div id=\"errors\">\r\n");
      out.write("    ");

        String s = (String) request.getAttribute("err");
        s = s.replaceAll("\n", "<br />\n");
        out.println(s);
    
      out.write("\r\n");
      out.write("</div>\r\n");
 } 
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
 if (request.getAttribute("det") != null) { 
      out.write("\r\n");
      out.write("<div id=\"details\">\r\n");
      out.write("    ");

        String s = (String) request.getAttribute("det");
        s = s.replaceAll("\n", "<br />\n");
        out.println(s);
    
      out.write("\r\n");
      out.write("</div>\r\n");
 } 
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
 if (request.getAttribute("res") != null) { 
      out.write("\r\n");
      out.write("    <div id=\"results\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    ");

                    for (String s : ((List<List<String>>) request.getAttribute("res")).get(0)) {
                        out.println("<th>" + s + "</th>");
                    }
                    ((List<List<String>>) request.getAttribute("res")).remove(0);
                    
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                ");

                for (List<String> l : ((List<List<String>>) request.getAttribute("res"))) {
                    out.println("<tr>");
                    for (String s : l) {
                        out.println("<td>" + s + "</td>");
                    }
                    out.println("</tr>");
                }
                
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
 } 
      out.write("\r\n");
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
