package com.codegym.ss7_c0222g1.model.customer;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "customer_type")
public class CustomerType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_type_id", columnDefinition = "INT")
    private Integer customerTypeId;

    @Column(name = "customer_type_name", columnDefinition = "VARCHAR(255)")
    private String customerTypeName;

    public CustomerType() {
    }

    public CustomerType(Integer customerTypeId, String customerTypeName) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}