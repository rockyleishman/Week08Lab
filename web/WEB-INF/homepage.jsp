<%-- 
    Document   : homepage
    Created on : Mar 5, 2020, 5:16:50 PM
    Author     : 814101
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p>Logged in as: $(sessionScope.validated);</p>
        <a href="login?logout">Logout</a>
    </body>
</html>
