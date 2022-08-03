package main.service.customer;

import main.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
