package com.codegym.ss7_c0222g1.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "division")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id", columnDefinition = "INT")
    private Integer divisionId;

    @Column(name = "division_name", columnDefinition = "VARCHAR(45)")
    private String divisionName;

    public Division() {
    }

    public Division(Integer divisionId, String divisionName) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

}