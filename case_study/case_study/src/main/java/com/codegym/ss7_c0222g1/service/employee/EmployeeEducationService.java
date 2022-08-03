package com.codegym.ss7_c0222g1.service.employee;

import com.codegym.ss7_c0222g1.model.employee.Education;
import com.codegym.ss7_c0222g1.repository.customer.CustomerTypeRepository;
import com.codegym.ss7_c0222g1.repository.employee.EmployeeEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeEducationService implements IEmployeeEducationService {

    @Autowired
    private EmployeeEducationRepository employeeEducationRepository;

    @Override
    public List<Education> findAll() {
        return employeeEducationRepository.findAll();
    }
}
