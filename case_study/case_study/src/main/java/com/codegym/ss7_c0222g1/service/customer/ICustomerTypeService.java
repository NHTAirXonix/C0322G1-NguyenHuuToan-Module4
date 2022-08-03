package com.codegym.ss7_c0222g1.service.customer;

import com.codegym.ss7_c0222g1.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
