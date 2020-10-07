<%--
  Created by IntelliJ IDEA.
  User: oki
  Date: 20.8.20.
  Time: 07:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogIn</title>
    <link rel="stylesheet" href="css/LogIn.css">
</head>
<body>
<div id="container">
<div id="login_box">
<table>
    <form method="post" action="main">
        <tr>
            <td><label for="user_name">Korisninicko ime: </label></td>
            <td> <input type="text" name="name" id="user_name"></td>
        </tr>
        <tr>
            <td><label for="user_pass">Lozinka: </label></td>
            <td> <input type="password" name="pass" id="user_pass"></td>
        </tr>
        <tr>
            <td><input type="submit"></td>
        </tr>
    </form>
        </div>
</table>
</div>


</body>
</html>
