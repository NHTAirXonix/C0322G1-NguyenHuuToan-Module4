package com.codegym.ss7_c0222g1.service.employee;

import com.codegym.ss7_c0222g1.model.employee.Position;
import com.codegym.ss7_c0222g1.repository.customer.CustomerTypeRepository;
import com.codegym.ss7_c0222g1.repository.employee.EmployeePositonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePositionService implements IEmployeePositionService {

    @Autowired
    private EmployeePositonRepository employeePositonRepository;

    @Override
    public List<Position> findAll() {
        return employeePositonRepository.findAll();
    }
}
