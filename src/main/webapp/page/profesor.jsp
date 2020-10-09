<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/nav_menu.css">
    <link rel="stylesheet" href="../css/list.css">
</head>
<body>


<div id="conntainer">

    <div id="heder">
        <div id="logo_untz"><img src="img/logo.jpeg"></div>
        <div id="untz"><h1>Univerzitet u Tuzli</h1></div>
    </div>


    <div id="content">
        <div id="nav">

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

        </div>

    </div>
</div>
</body>
</html>
