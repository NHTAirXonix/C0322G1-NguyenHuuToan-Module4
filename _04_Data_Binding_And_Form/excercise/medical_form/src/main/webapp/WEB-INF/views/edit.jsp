<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/bootstrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
    <style>
        #main {
            background-color: white;
            border-radius: 10px;
            margin: auto;
            margin-top: 100px;
            width: 70%;
            font-family: Arial, serif;
            padding: 15px;
        }

        body {
            background-image: radial-gradient(#0c5460, #e0e0e0);
        }
    </style>
</head>
<body>
<div id="main">
    <form:form modelAttribute="medicalForm" action="/update" method="post">
        <h1 style="text-align: center">MEDICAL FORM</h1>
        <table width="100%">
            <tr>
                <th colspan="6">
                    <p>
                        <b>This is a important, your information will help health authorities contact to infectious
                            disease prevention
                        </b>
                    </p>
                </th>
            </tr>
            <tr>
                <th colspan="6">
                    <p style="color: red"><b>Caution: You will be in jail if the information you provide is wrong</b>
                    </p>
                </th>
            </tr>
            <tr>
                <td colspan="6">
                    ID
                    <form:input cssStyle="width: 100%" path="id"></form:input>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    Your Name
                    <form:input cssStyle="width: 100%" path="name"></form:input>
                </td>
            </tr>
            <tr>
                <td cssStyle="width: 100%" colspan="2">
                    Year of Birthday
                    <form:select cssStyle="width: 100%" colspan="2" path="birthYear" items="${listYear}">
                        <form:option value="${listYear}">${listYear}</form:option>
                    </form:select>
                </td>
                <td cssStyle="width: 100%" colspan="2">
                    Gender
                    <form:select cssStyle="width: 100%" colspan="2" path="gender" items="${listGender}">
                        <form:option value="${listGender}">value="${listGender}</form:option>
                    </form:select>
                </td>
                <td cssStyle="width: 100%" colspan="2">
                    Country
                    <form:select cssStyle="width: 100%" colspan="2" path="country" items="${listCountry}">
                        <form:option value="${listCountry}">value="${listCountry}</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    Your ID Card Number
                    <form:input cssStyle="width: 100%" path="idCardNumber"></form:input>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    Choose your vehicle:
                    <form:radiobuttons items="${listVehicle}" path="verhice" required="required"/>
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    Vehicle Number
                    <form:input cssStyle="width: 100%" path="verhiceNumber"></form:input>
                </td>
                <td colspan="3">
                    Vehicle Slot Number
                    <form:input cssStyle="width: 100%" path="verhiceNumberSlot"></form:input>
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    Date Start:
                    <form:input type="date" cssStyle="width: 100%" path="dayStart"></form:input>
                </td>
                <td colspan="3">
                    Date End:
                    <form:input type="date" cssStyle="width: 100%" path="dayEnd"></form:input>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    City visited:
                    <form:input type="text" cssStyle="width: 100%" path="city"></form:input>
                </td>
            </tr>
            <tr>
                <td cssStyle="width: 100%" colspan="2">
                    City
                    <form:select cssStyle="width: 100%" colspan="2" path="city2" items="${listCity}">
                        <form:option value="${listCity}">value="${listCity}</form:option>
                    </form:select>
                </td>
                <td cssStyle="width: 100%" colspan="2">
                    District
                    <form:select cssStyle="width: 100%" colspan="2" path="district" items="${listDistrict}">
                        <form:option value="${listDistrict}">value=${listDistrict}</form:option>
                    </form:select>
                </td>
                <td cssStyle="width: 100%" colspan="2">
                    Ward
                    <form:select cssStyle="width: 100%" colspan="2" path="ward" items="${listWard}">
                        <form:option value="${listWard}">value="${listWard}</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    Address
                    <form:input cssStyle="width: 100%" path="address"></form:input>
                </td>

            </tr>
            <tr>
                <td colspan="3">
                    Phone
                    <form:input cssStyle="width: 100%" path="phone"></form:input>
                </td>
                <td colspan="3">
                    Email
                    <form:input cssStyle="width: 100%" path="email"></form:input>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    <p><b>Have you had any of the following symptoms in the past 14 days?</b></p>
                </td>
            </tr>
            <tr>
                <td>
                    Fever
                </td>
                <td>
                    <form:radiobutton  path="fever" name="fever" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton  path="fever" name="fever" value="No" />No
                </td>
                <td>
                    Vomit
                </td>
                <td>
                    <form:radiobutton  path="vomit" name="vomit" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton path="vomit" name="vomit" value="No" />No
                </td>
            </tr>
            <tr>
                <td>
                    Cough
                </td>
                <td>
                    <form:radiobutton  path="cough" name="cough" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton  path="cough" name="cough" value="No" />No
                </td>
                <td>
                    Diarrhea
                </td>
                <td>
                    <form:radiobutton  path="diarrhea" name="diarrhea" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton path="diarrhea" name="diarrhea" value="No" />No
                </td>
            </tr>
            <tr>
                <td>
                    Difficulty Breathing
                </td>
                <td>
                    <form:radiobutton  path="difficultyBreathing" name="difficultyBreathing" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton  path="difficultyBreathing" name="difficultyBreathing" value="No" />No
                </td>
                <td>
                    Bleeding
                </td>
                <td>
                    <form:radiobutton  path="bleeding" name="bleeding" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton path="bleeding" name="bleeding" value="No" />No
                </td>
            </tr>
            <tr>
                <td>
                    Sore Throat
                </td>
                <td>
                    <form:radiobutton  path="soreThroat" name="soreThroat" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton  path="soreThroat" name="soreThroat" value="No" />No
                </td>
                <td>
                    Rash
                </td>
                <td>
                    <form:radiobutton  path="rash" name="rash" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton path="rash" name="rash" value="No" />No
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    <p><b>Exposure history</b></p>
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    Animal Contact
                </td>
                <td>
                    <form:radiobutton  path="animalContact" name="animalContact" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton  path="animalContact" name="animalContact" value="No" />No
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    Patient Contact
                </td>
                <td>
                    <form:radiobutton  path="patientContact" name="patientContact" value="Yes" />Yes
                </td>
                <td>
                    <form:radiobutton path="patientContact" name="patientContact" value="No" />No
                </td>
            </tr>
            <tr>
                <th colspan="3">
                    <form:button type="submit">SUBMIT</form:button>
                </th>
                <th colspan="3">

                    <a href="/list">SHOW LIST</a>
                </th>
            </tr>

        </table>
    </form:form>
</div>
</body>
<script src="/bootstrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/bootstrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
