<%--
  Created by IntelliJ IDEA.
  User: toanl
  Date: 6/14/2022
  Time: 10:42 AM
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
    <table style="margin: auto; height: 100%">
        <form action="/home" method="post">
            <tr>
                <th colspan="2">
                    <h1>CONVER MONEY PROGRAM</h1>
                </th>
            </tr>
            <tr>
                <th>
                    <input type="text" placeholder="Input your money" id="input1" name="amountMoney"
                           value="${oldValue}">
                </th>
                <th>
                    <input type="text" readonly placeholder="Result" value="${newValue}"></th>
            </tr>
            <tr>
                <th colspan="2">
                    <br>
                    <button type="submit">
                        CALCULATE
                    </button>
                </th>
            </tr>
        </form>
    </table>
</div>
</body>
</html>
