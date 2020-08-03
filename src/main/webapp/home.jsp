<%-- 
    Document   : home
    Created on : Jul 31, 2020, 9:19:21 AM
    Author     : lebinhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String userName = request.getParameter("u").toString();
        %>
        <h1>Hello <%=userName%>!</h1>
    </body>
</html>
