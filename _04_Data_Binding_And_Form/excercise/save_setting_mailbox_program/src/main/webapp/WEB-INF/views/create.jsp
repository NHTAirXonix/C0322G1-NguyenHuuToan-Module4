<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
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
    <form:form modelAttribute="mailSettings" action="/create" method="post">
        <h1 style="text-align: center">SETTINGS</h1>
        <table width="100%">
            <tr>
                <td>
                    <p>Languages</p>
                </td>
                <td>
                    <form:select path="languages">
                        <form:option value="English">English</form:option>
                        <form:option value="Vietnamese">Vietnamese</form:option>
                        <form:option value="Japanese">Japanese</form:option>
                        <form:option value="Chinese">Chinese</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Page Size</p>
                </td>
                <td>
                    Show
                    <form:select path="pageSize">
                        <form:option value="5">5</form:option>
                        <form:option value="10">10</form:option>
                        <form:option value="15">15</form:option>
                        <form:option value="25">25</form:option>
                        <form:option value="50">50</form:option>
                        <form:option value="100">100</form:option>
                    </form:select>
                    emails per page
                </td>
            </tr>
            <tr>
                <td>
                    <p>Spams filter</p>
                </td>
                <td>
                    <form:checkbox value="" path="spamFilter"/> Enable spams filer
                </td>
            </tr>
            <tr>
                <td>
                    <p>Signature:</p>
                </td>
                <td>
                    <form:textarea path="signature" cols="30" rows="10"></form:textarea>
                </td>
            </tr>
            <tr>
                <th colspan="2">
                    <form:button type="submit">Submit</form:button>
                </th>
            </tr>
            <tr>
                <th colspan="2">
                    <a href="/list">SHOW LIST</a>
                </th>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
