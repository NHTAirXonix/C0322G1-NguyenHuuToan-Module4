package com.codegym.ss7_c0222g1.dto.employee;

import com.codegym.ss7_c0222g1.model.employee.Division;
import com.codegym.ss7_c0222g1.model.employee.Education;
import com.codegym.ss7_c0222g1.model.employee.Position;
import com.codegym.ss7_c0222g1.model.login.User;

public class EmployeeDto {

    private Integer employeeId;

    private String employeeName;

    private String employeeBirthDay;

    private String employeeIdCard;

    private Double employeeSalary;

    private String employeePhone;

    private String employeeEmail;

    private String employeeAddress;

    private Position position;

    private Education education;

    private Division division;

    private User user;

    private Integer statusDelete = 0;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer employeeId,
                    String employeeName,
                    String employeeBirthDay,
                    String employeeIdCard,
                    Double employeeSalary,
                    String employeePhone,
                    String employeeEmail,
                    String employeeAddress,
                    Position position,
                    Education education,
                    Division division,
                    User user) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthDay = employeeBirthDay;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.education = education;
        this.division = division;
        this.user = user;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthDay() {
        return employeeBirthDay;
    }

    public void setEmployeeBirthDay(String employeeBirthDay) {
        this.employeeBirthDay = employeeBirthDay;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducationDegree(Education educationDegree) {
        this.education = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }
}
