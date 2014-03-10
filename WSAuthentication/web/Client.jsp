<%-- 
    Document   : Client
    Created on : Feb 21, 2014, 5:39:27 PM
    Author     : Anthoniraj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.vit.lclient.LoginService_Service service = new com.vit.lclient.LoginService_Service();
	com.vit.lclient.LoginService port = service.getLoginServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = request.getParameter("uname");
	java.lang.String pwd = request.getParameter("pwd");
	// TODO process result here
	java.lang.String result = port.compare(name, pwd);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    </h1>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
