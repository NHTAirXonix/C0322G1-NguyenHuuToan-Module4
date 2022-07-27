package com.codegym.ss7_c0222g1.service.employee;

import com.codegym.ss7_c0222g1.model.employee.Employee;
import com.codegym.ss7_c0222g1.model.login.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> searchByNameEmployee(String name, Pageable pageable);

    void create (Employee employee);

    List<Employee> findAllList();

    Employee findEmployeeById(Integer id);

    void removeById(Integer id);
}
