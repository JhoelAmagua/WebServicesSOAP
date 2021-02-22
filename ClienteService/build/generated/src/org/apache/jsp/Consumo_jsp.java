package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Consumo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Double s_numtotal;
        

            String s_num1, s_num2, s_num3, s_num4, s_num5, s_num6, s_numhoras;
        

            String s3_num2;
        
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
      out.write("         <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("         <h1>  Ingrese horas trabajadas por día</h1>\n");
      out.write("        <form action=\"Consumo.jsp\" method=\"POST\" >\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txt_nombre\" >Día 1</label> \n");
      out.write("                <input type=\"text\" name=\"txt_num1\" />\n");
      out.write("                <label for=\"txt_nombre\" >Día 2</label> \n");
      out.write("                <input type=\"text\" name=\"txt_num2\" />\n");
      out.write("                <label for=\"txt_nombre\" >Día 3</label> \n");
      out.write("                <input type=\"text\" name=\"txt_num3\" />\n");
      out.write("                <label for=\"txt_nombre\" >Día 4</label> \n");
      out.write("                <input type=\"text\" name=\"txt_num4\" />\n");
      out.write("                <label for=\"txt_nombre\" >Día 5</label> \n");
      out.write("                <input type=\"text\" name=\"txt_num5\" />\n");
      out.write("                <label for=\"txt_nombre\" >Día 6</label> \n");
      out.write("                <input type=\"text\" name=\"txt_num6\" />\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-dark\">Sumar horas</button>\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");
s_num1 = request.getParameter("txt_num1"); 
      out.write("\n");
      out.write("        ");
s_num2 = request.getParameter("txt_num2"); 
      out.write("\n");
      out.write("        ");
s_num3 = request.getParameter("txt_num3"); 
      out.write("\n");
      out.write("        ");
s_num4 = request.getParameter("txt_num4"); 
      out.write("\n");
      out.write("        ");
s_num5 = request.getParameter("txt_num5"); 
      out.write("\n");
      out.write("        ");
s_num6 = request.getParameter("txt_num6"); 
      out.write("\n");
      out.write("\n");
      out.write("        <h1>  Pago por hora</h1>\n");
      out.write("        <form action=\"Consumo.jsp\" method=\"POST\" >\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txt_nombre\" >Ingrese valor</label> \n");
      out.write("                <input type=\"text\" name=\"txt3_num2\" />\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-dark\">Sueldo Total</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");
s3_num2 = request.getParameter("txt3_num2"); 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	 uddi.ServicioOperaciones_Service service = new uddi.ServicioOperaciones_Service();
        uddi.ServicioOperaciones port = service.getServicioOperacionesPort();
        // TODO initialize WS operation arguments here
        double a = Double.parseDouble(s_num1);
        double b = Double.parseDouble(s_num2);
        double c = Double.parseDouble(s_num3);
        double d = Double.parseDouble(s_num4);
        double e = Double.parseDouble(s_num5);
        double f = Double.parseDouble(s_num6);
        // TODO process result here
        double result = port.suma(a, b, c, d, e, f);
        out.println("El total de horas trabajadas a la semana fue: " + result);
        s_numtotal = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	uddi.ServicioOperaciones_Service service = new uddi.ServicioOperaciones_Service();
        uddi.ServicioOperaciones port = service.getServicioOperacionesPort();
        // TODO initialize WS operation arguments here
        double a = s_numtotal;
        double b = Double.parseDouble(s3_num2);
        // TODO process result here
        double result = port.multiplicacion(a, b);
        out.println("El sueldo del empleado es de: " + result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
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
