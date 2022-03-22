<%-- 
    Document   : home
    Created on : Mar 17, 2022, 5:10:54 PM
    Author     : 761450
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Welcome</h1>
        
        <h2> Hello 
            ${username}</h2>
        
        <%
            if(session.getAttribute("username") == null) {
                session.invalidate();
                response.sendRedirect("login");
            }
        %>
        
        
        <a href="login?action=logout" name="logout" value="loggingout">Logout</a>
        
    </body>
</html>
