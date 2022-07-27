package com.codegym.ss7_c0222g1.service.employee;

import com.codegym.ss7_c0222g1.model.employee.Employee;
import com.codegym.ss7_c0222g1.repository.customer.CustomerTypeRepository;
import com.codegym.ss7_c0222g1.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll( pageable);
    }

    @Override
    public Page<Employee> searchByNameEmployee(String name, Pageable pageable) {
        return employeeRepository.searchByNameEmployee(name, pageable);
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public void removeById(Integer id) {
        employeeRepository.deleteStatusSet(id);
    }
}
