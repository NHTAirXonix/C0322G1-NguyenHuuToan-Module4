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
            height: 250px;
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
            background-image: radial-gradient(#0c5460,#e0e0e0);
        }
    </style>
</head>
<body>
<div id="main">
    <table style="margin: auto;width: 100%">
        <form action="/home" method="post">
            <tr>
                <th colspan="4">
                    <h1>CALCULATOR PROGRAM</h1>
                </th>
            </tr>
            <tr>
                <th colspan="2">
                    <input type="text" id="firstInput" name="firstInput" placeholder="First Input" value="${firstInput}">
                </th>
                <th colspan="2">
                    <input type="text" id="secondInput" name="secondInput" placeholder="Second Input" value="${secondInput}">
                </th>
            </tr>
            <tr>
                <th colspan="2">
                    <select name="calculation">
                        <option value="Summation">Summation (+)</option>
                        <option value="Subtraction">Subtraction (-)</option>
                        <option value="Multiplication">Multiplication (*)</option>
                        <option value="Division">Division (/)</option>
                    </select>
                <th colspan="2">
                    <input type="text" value="${result}" placeholder="Result" readonly>
                </th>
                </th>
            </tr>
            <tr>
                <th colspan="4">
                    <button type="submit">START CALCULATE</button>
                </th>
            </tr>
        </form>
    </table>
</div>
</body>
</html>
