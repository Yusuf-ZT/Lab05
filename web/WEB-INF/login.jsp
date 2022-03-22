<%-- 
    Document   : login
    Created on : Mar 17, 2022, 5:11:05 PM
    Author     : 761450
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form method="post" action="login">
            Username: <input type="text" name="username"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" value="login">
        </form>
        

        
        <p>${invalidMessage}</p>
        
    </body>
</html>
