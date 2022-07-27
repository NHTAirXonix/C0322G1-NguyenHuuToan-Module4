package com.codegym.ss7_c0222g1.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id", columnDefinition = "INT")
    private Integer educationId;

    @Column(name = "education_name", columnDefinition = "VARCHAR(45)")
    private String educationName;

    public Education() {
    }

    public Education(Integer educationId, String educationName) {
        this.educationId = educationId;
        this.educationName = educationName;
    }

    public Integer getEducationDegreeId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationDegreeName() {
        return educationName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationName = educationDegreeName;
    }
}
