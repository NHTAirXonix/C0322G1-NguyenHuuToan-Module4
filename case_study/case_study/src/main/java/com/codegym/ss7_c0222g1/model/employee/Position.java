package com.codegym.ss7_c0222g1.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id", columnDefinition = "INT")
    private Integer positionId;

    @Column(name = "position_name", columnDefinition = "VARCHAR(45)")
    private String positionName;

    public Position() {
    }

    public Position(Integer positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
