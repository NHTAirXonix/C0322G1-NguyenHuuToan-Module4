<%--
  Created by IntelliJ IDEA.
  User: toanl
  Date: 6/14/2022
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        #main {
            font-family: Arial, serif;
            width: 50%;
            margin: auto;
            margin-top: 100px;
            border-radius: 20px;
            height: 150px;
            background-color: white;
            color: black;
            padding: 5px;
        }

        input {
            border-radius: 5px;
            font-size: 15px;
            height: 30px;
        }

        body {
            background-image: radial-gradient(#0c5460, #e0e0e0);
        }
    </style>
</head>
<body>
<div id="main">
    <table style="margin: auto">
        <form action="/" method="post">
            <tr>
                <th colspan="2">
                    <h1>DICTIONARY PROGRAM</h1>
                </th>
            </tr>
            <tr>
                <th>
                    <input type="text" placeholder="Input your word" id="input1" name="inputWord" value="${oldValue}">
                </th>
                <th>
                    <input readonly type="text" readonly placeholder="Result" value="${newValue}">
                </th>
            </tr>
            <tr>
                <th colspan="2">
                    <br>
                    <button type="submit">SEARCH</button>
                </th>
            </tr>
        </form>

    </table>
</div>
</body>
</html>
