<%--
  Created by IntelliJ IDEA.
  User: toanl
  Date: 6/16/2022
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/bootstrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
    <link href="/bootstrap413/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: radial-gradient(#0c5460, #e0e0e0);
        }
    </style>
</head>
<body>
<div id="main">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th>Name</th>
            <th>Birthday year</th>
            <th>Gender</th>
            <th>Country</th>
            <th>Id card number</th>
            <th>Vehicle</th>
            <th>Vehicle number</th>
            <th>Vehicle slot number</th>
            <th>Day start</th>
            <th>Day end</th>
            <th>City visited</th>
            <th>City</th>
            <th>District</th>
            <th>Ward</th>
            <th>Edit</th>
        </tr>
        </thead>
        <c:forEach var="temp" items="${medicalFormList}">
            <tr>
                <th>${temp.name}</th>
                <th>${temp.birthYear}</th>
                <th>${temp.gender}</th>
                <th>${temp.country}</th>
                <th>${temp.idCardNumber}</th>
                <th>${temp.verhice}</th>
                <th>${temp.verhiceNumber}</th>
                <th>${temp.verhiceNumberSlot}</th>
                <th>${temp.dayStart}</th>
                <th>${temp.dayEnd}</th>
                <th>${temp.city}</th>
                <th>${temp.city2}</th>
                <th>${temp.district}</th>
                <th>${temp.ward}</th>
                <th>
                    <button>
                        <a href="/edit/${temp.id}">EDIT</a>
                    </button>

                </th>
            </tr>
        </c:forEach>
        <tr>
            <th colspan="11">
                <a href="/create">Create New Medical Form</a>
            </th>
        </tr>
    </table>
</div>
</body>
<script src="/bootstrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/bootstrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
