<%--
  Created by IntelliJ IDEA.
  User: oki
  Date: 6.10.20.
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UNTZ</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/wrapper.css">
</head>
<body>

<div id="conntainer">

    <div id="heder">
        <div id="logo_untz"><img src="img/logo.jpeg"></div>
        <div id="untz"><h1>Univerzitet u Tuzli</h1></div>
    </div>
    <div class="wrapper">
        <ul>
            <li>Home</li>
            <li>Vjesti</li>
            <li><a href="<%=request.getContextPath()%>/index?page=login">Studentska sluzba</a></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>

    <div id="content">


    </div>

    <div id="footer">
        <div id="about_autor">
            <h1>Autor: Osman Hadzic</h1>
            <footer>&copy; Copyright 2020 </footer>
        </div>

    </div>
</div>


</body>
</html>
