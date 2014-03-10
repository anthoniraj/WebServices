<%-- 
    Document   : MClient
    Created on : Feb 20, 2014, 4:34:18 PM
    Author     : Anthoniraj
--%>

<%@page import="com.vit.rclient.MyClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             MyClient m = new MyClient();
            String input = request.getParameter("school");
            out.println("<h1>" + m.getHtml(input) + "</h1>");
            
          %>
    </body>
</html>
