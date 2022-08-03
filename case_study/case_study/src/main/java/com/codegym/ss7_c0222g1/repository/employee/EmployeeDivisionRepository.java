package com.codegym.ss7_c0222g1.repository.employee;

import com.codegym.ss7_c0222g1.model.employee.Division;
import com.codegym.ss7_c0222g1.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeDivisionRepository extends JpaRepository<Division,Integer> {
}
