<%-- 
    Document   : Consumo
    Created on : 22/02/2021, 18:21:37
    Author     : JHOEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
        <title>JSP Page</title>
        
    </head>
    <body>
        <%!
            Double s_numtotal;
        %>
         <h1>  Ingrese horas trabajadas por día</h1>
        <form action="Consumo.jsp" method="POST" >
            <div class="form-group">
                <label for="txt_nombre" >Día 1</label> 
                <input type="text" name="txt_num1" />
                <label for="txt_nombre" >Día 2</label> 
                <input type="text" name="txt_num2" />
                <label for="txt_nombre" >Día 3</label> 
                <input type="text" name="txt_num3" />
                <label for="txt_nombre" >Día 4</label> 
                <input type="text" name="txt_num4" />
                <label for="txt_nombre" >Día 5</label> 
                <input type="text" name="txt_num5" />
                <label for="txt_nombre" >Día 6</label> 
                <input type="text" name="txt_num6" />
            </div>
            <div>
                <button type="submit" class="btn btn-dark">Sumar horas</button>
            </div>
            <br/>
        </form>

        <%!
            String s_num1, s_num2, s_num3, s_num4, s_num5, s_num6, s_numhoras;
        %>

        <%s_num1 = request.getParameter("txt_num1"); %>
        <%s_num2 = request.getParameter("txt_num2"); %>
        <%s_num3 = request.getParameter("txt_num3"); %>
        <%s_num4 = request.getParameter("txt_num4"); %>
        <%s_num5 = request.getParameter("txt_num5"); %>
        <%s_num6 = request.getParameter("txt_num6"); %>

        <h1>  Pago por hora</h1>
        <form action="Consumo.jsp" method="POST" >
            <div class="form-group">
                <label for="txt_nombre" >Ingrese valor</label> 
                <input type="text" name="txt3_num2" />
            </div>
            <div>
                <button type="submit" class="btn btn-dark">Sueldo Total</button>
            </div>
        </form>

        <%!
            String s3_num2;
        %>

        <%s3_num2 = request.getParameter("txt3_num2"); %>
    </body>
</html>


    <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
