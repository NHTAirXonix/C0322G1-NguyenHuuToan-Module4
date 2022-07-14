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
      height: 200px;
      background-color: white;
    }
    input {
      border-radius: 5px;
      font-size: 15px;
      margin-top: 5px;
    }
    th{
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
          <h1>SANDWICH CONDIMENT</h1>
        </th>
      </tr>
      <tr>
        <th>
          <input type="checkbox" id="vehicle1" name="listCondiment" value="Lettuce">Lettuce
        </th>
        <th>
          <input type="checkbox" id="vehicle2" name="listCondiment" value="Tomato">Tomato
        </th>
        <th>
          <input type="checkbox" id="vehicle3" name="listCondiment" value="Mustard">Mustard
        </th>
        <th>
          <input type="checkbox" id="vehicle4" name="listCondiment" value="Sprouts">Sprouts
        </th>
      </tr>
      <tr>
        <th colspan="4">
          <button type="submit">
            SHOW LIST CONDIMENT
          </button>
        </th>
      </tr>
    </form>
  </table>
</div>
</body>
</html>
