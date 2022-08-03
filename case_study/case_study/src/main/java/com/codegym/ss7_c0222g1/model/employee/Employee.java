package com.codegym.ss7_c0222g1.model.employee;

import com.codegym.ss7_c0222g1.model.login.AppUser;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", columnDefinition = "INT")
    private Integer employeeId;

    @Column(name = "employee_name", columnDefinition = "VARCHAR(45)")
    @NotEmpty(message = "Can't Empty")
    private String employeeName;

    @Column(name = "employee_birthday", columnDefinition = "DATE")
    private String employeeBirthDay;

    @Column(name = "employee_id_card", columnDefinition = "VARCHAR(45)")
    private String employeeIdCard;

    @Column(name = "employee_salary", columnDefinition = "DOUBLE")
    private Double employeeSalary;

    @Column(name = "employee_phone", columnDefinition = "VARCHAR(45)")
    private String employeePhone;

    @Column(name = "employee_email", columnDefinition = "VARCHAR(45)")
    private String employeeEmail;

    @Column(name = "employee_address", columnDefinition = "VARCHAR(45)")
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "position_id", columnDefinition = "INT")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_id", referencedColumnName = "education_id", columnDefinition = "INT")
    private Education education;

    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "division_id", columnDefinition = "INT")
    private Division division;

    @OneToOne
    @JoinColumn(name = "user_name", referencedColumnName = "user_name", columnDefinition = "VARCHAR(45)")
    private AppUser appUser;

    @Column(name = "status_delete", columnDefinition = "BIT(1)")
    private Integer statusDelete = 0;

    public Employee() {
    }

    public Employee(Integer employeeId,
                    String employeeName,
                    String employeeBirthDay,
                    String employeeIdCard,
                    Double employeeSalary,
                    String employeePhone,
                    String employeeEmail,
                    String employeeAddress,
                    Position position,
                    Education education,
                    Division division
//                    User user
    ) {
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
        this.appUser = appUser;
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

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }
}