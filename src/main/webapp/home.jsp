<%@ page import="models.User" %><%--
  Created by IntelliJ IDEA.
  User: oki
  Date: 23.8.20.
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/nav_menu.css">
</head>
<body>
<%
String sessionID=null;
User user = (User) request.getSession().getAttribute("user" );
sessionID = request.getSession().getId();
if (sessionID==null){
    response.sendRedirect("login.jsp");
}
%>

<div id="conntainer">

    <div id="heder">
        <div id="logo_untz"><img src="img/logo.jpeg"></div>
        <div id="untz"><h1>Univerzitet u Tuzli</h1></div>
    </div>


    <div id="content">
        <div id="nav">
            <%=user.getfName()%>
            <%=user.getlName()%>
            <div id="listFak">
                <select name="category">
                    <option value="category_id">name</option>
                    <option value="category_id">name</option>
                    <option value="category_id">name</option>
                </select>
            </div>
            <div id="logut_btn">
                <a href="<%=request.getContextPath()%>/index?page=logout">Log Out</a>
            </div>

        </div>
    </div>

    <div id="footer">
        <div id="about_autor">
            <h1>Autor: Osman Hadzic</h1>
            <footer>&copy; Copyright 2020 </footer>
            <%=sessionID%>
        </div>

    </div>
</div>
</body>
</html>
