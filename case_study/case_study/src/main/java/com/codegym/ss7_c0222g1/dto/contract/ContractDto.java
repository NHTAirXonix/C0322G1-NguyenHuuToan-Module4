package com.codegym.ss7_c0222g1.dto.contract;

import com.codegym.ss7_c0222g1.model.customer.Customer;
import com.codegym.ss7_c0222g1.model.employee.Employee;
import com.codegym.ss7_c0222g1.model.facility.Facility;

import javax.persistence.*;

public class ContractDto {

    private int contractId;

    private String startDate;

    private String endDate;

    private Integer statusDelete = 0;

    private String deposit;

    private Employee employee;

    private Customer customer;

    private Facility facility;

    private Double totalPay;

    public ContractDto() {
    }

    public ContractDto(int contractId, String startDate, String endDate, Integer statusDelete, String deposit, Employee employee, Customer customer, Facility facility, Double totalPay) {
        this.contractId = contractId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.statusDelete = statusDelete;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.totalPay = totalPay;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Double totalPay) {
        this.totalPay = totalPay;
    }
}
