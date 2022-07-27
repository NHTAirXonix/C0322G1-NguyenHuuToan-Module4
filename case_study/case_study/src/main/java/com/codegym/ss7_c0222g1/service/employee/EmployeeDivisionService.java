package com.codegym.ss7_c0222g1.service.employee;

import com.codegym.ss7_c0222g1.model.employee.Division;
import com.codegym.ss7_c0222g1.repository.customer.CustomerTypeRepository;
import com.codegym.ss7_c0222g1.repository.employee.EmployeeDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDivisionService implements IEmployeeDivisionService {

    @Autowired
    private EmployeeDivisionRepository employeeDivisionRepository;

    @Override
    public List<Division> findAll() {
        return employeeDivisionRepository.findAll();
    }
}
