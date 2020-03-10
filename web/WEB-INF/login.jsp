<%-- 
    Document   : login
    Created on : Mar 5, 2020, 4:35:22 PM
    Author     : 814101
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST">
            Username: <input type="text" name="username"/><br/>
            Password: <input type="text" name="password"/><br/>
            <input type="submit" name="login" value="Login"/>
        </form>
    </body>
</html>
