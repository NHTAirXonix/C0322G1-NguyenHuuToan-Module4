package com.codegym.ss7_c0222g1.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_type_id")
    private int id;
    private String name;

    @OneToMany(mappedBy = "facilityType")
    @JsonBackReference
    private Set<Facility> serviceSet;

    public FacilityType() {
    }

    public FacilityType(int id, String name, Set<Facility> serviceSet) {
        this.id = id;
        this.name = name;
        this.serviceSet = serviceSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Facility> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<Facility> serviceSet) {
        this.serviceSet = serviceSet;
    }
}
