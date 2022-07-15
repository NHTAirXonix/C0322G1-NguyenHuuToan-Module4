<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: toanl
  Date: 6/15/2022
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #main {
            font-family: Arial, serif;
            width: 50%;
            margin: auto;
            margin-top: 100px;
            border-radius: 20px;
            height: 500px;
            background-color: white;
        }

        input {
            border-radius: 5px;
            font-size: 15px;
            margin-top: 5px;
        }

        th {
            padding: 5px;
            height: 50px;
        }

        body {
            background-image: radial-gradient(#0c5460, #e0e0e0);
        }
    </style>
</head>
<body>
<div id="main">
    <table style="margin: auto;width: 100%">
        <tr>
            <th><h1>SANDWICH CONDIMENT</h1></th>
        </tr>
        <c:forEach items="${listCondiment}" var="condiment">
            <tr>
                <th>${condiment}</th>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
