package com.codegym.ss7_c0222g1.service.customer;

import com.codegym.ss7_c0222g1.model.customer.CustomerType;
import com.codegym.ss7_c0222g1.repository.customer.CustomerRepository;
import com.codegym.ss7_c0222g1.repository.customer.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
