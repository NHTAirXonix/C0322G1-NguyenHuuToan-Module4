package com.codegym.ss7_c0222g1.repository.customer;

import com.codegym.ss7_c0222g1.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {

}
