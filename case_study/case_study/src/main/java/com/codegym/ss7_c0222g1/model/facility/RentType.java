package com.codegym.ss7_c0222g1.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rent_type_id")
    private int id;
    private String rentType;

    public RentType() {
    }

    public RentType(int id, String rentType) {
        this.id = id;
        this.rentType = rentType;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String type) {
        this.rentType = type;
    }

}