package com.codegym.ss7_c0222g1.model.facility;

import com.codegym.ss7_c0222g1.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT")
    private int id;

    private String name;
    private int area;
    private double cost;
    private int amountCustomer;
    private String standardRoom;
    private String description;
    private int poolArea;
    private int floor;
    private String freeService;
    @ColumnDefault("0")
    private int status;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "rent_type_id")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "service_type_id", referencedColumnName = "service_type_id")
    private FacilityType facilityType;

    @OneToMany(mappedBy = "facility")
    private Set<Contract> contract;

    public Facility() {
    }

    public Facility(int id, String name, int area, double cost, int amountCustomer, String standardRoom, String description, int poolArea, int floor, String freeService, int status, RentType rentType, FacilityType facilityType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.amountCustomer = amountCustomer;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.floor = floor;
        this.freeService = freeService;
        this.status = status;
        this.rentType = rentType;
        this.facilityType = facilityType;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountCustomer() {
        return amountCustomer;
    }

    public void setAmountCustomer(int amountCustomer) {
        this.amountCustomer = amountCustomer;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }
}