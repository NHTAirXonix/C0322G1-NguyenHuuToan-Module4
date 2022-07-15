<%--
  Created by IntelliJ IDEA.
  User: toanl
  Date: 6/16/2022
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        #main {
            background-image: linear-gradient(to right, #00a3ff, #90ceb7);
            border-radius: 10px;
            margin: auto;
            margin-top: 150px;
            width: 50%;
            font-family: Arial, serif;
            padding: 10px;
        }
    </style>
</head>
<body>
<div id="main">


    <table border="1px" style="width: 100%">
        <tr>
            <th>Languages</th>
            <th>Page Size</th>
            <th>Spams filter</th>
            <th>Signature</th>
        </tr>
        <c:forEach var="temp" items="${mailSettingsList}">
            <tr>
                <th>${temp.languages}</th>
                <th>${temp.pageSize}</th>
                <th>${temp.spamFilter}</th>
                <th>${temp.signature}</th>
            </tr>
        </c:forEach>
        <tr>
            <th colspan="4">
                <a href="/create">Create New MailBox Settings</a>
            </th>
        </tr>
    </table>
</div>
</body>
</html>
