package com.codegym.ss7_c0222g1.model.contract;

import com.codegym.ss7_c0222g1.model.customer.Customer;
import com.codegym.ss7_c0222g1.model.employee.Employee;
import com.codegym.ss7_c0222g1.model.facility.Facility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity(name="contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id", columnDefinition = "INT")
    private int contractId;

    @Column(name = "contract_start_date", columnDefinition = "DATE")
    private String startDate;

    @Column(name = "contract_end_date", columnDefinition = "DATE")
    private String endDate;

    @Column(name = "status_delete", columnDefinition = "BIT(1)")
    private Integer statusDelete;

    @Column(name = "contract_deposit", columnDefinition = "DOUBLE")
    private String deposit;


    @ManyToOne
    @JoinColumn(name = "employee_id", columnDefinition = "INT", referencedColumnName = "employee_id")
    @JsonBackReference("employee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id", columnDefinition = "VARCHAR(45)", referencedColumnName = "customer_id")
    @JsonBackReference("customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id", columnDefinition = "INT", referencedColumnName = "id")
    @JsonBackReference("facility")
    private Facility facility;

    @OneToMany(mappedBy = "contract")
    @JsonBackReference("contract")
    private List<ContractDetail> contractDetailList;

    public Contract() {
    }

    public Contract(int contractId,
                    String startDate,
                    String endDate,
                    Integer statusDelete,
                    String deposit,
                    Employee employee,
                    Customer customer,
                    Facility facility,
                    List<ContractDetail> contractDetailList) {
        this.contractId = contractId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.statusDelete = statusDelete;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.contractDetailList = contractDetailList;
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

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
