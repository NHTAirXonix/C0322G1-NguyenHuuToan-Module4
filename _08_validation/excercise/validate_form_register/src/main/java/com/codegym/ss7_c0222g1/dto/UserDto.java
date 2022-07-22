package com.codegym.ss7_c0222g1.dto;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserDto {

    @NotNull
    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "first_name")
    @NotBlank(message = "Can't blank or empty")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Can't blank or empty")
    private String lastName;

    @Column(name = "user_phone")
    @Pattern(regexp = "^[0-9]{9,10}$",message = "9-10 number and first number is 0")
    private String phone;

    @Column(name = "user_age")
    @NotBlank(message = "not blank")
    @Min(value = 18, message = "Must be greater than 18")
    @Max(value = 100, message = "Must be lower than 100")
    private String age;

    @Column(name = "user_email")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "wrong format")
    private String email;

    public UserDto() {
    }

    public UserDto(Integer idUser, String firstName, String lastName, String phone, String age, String email) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
