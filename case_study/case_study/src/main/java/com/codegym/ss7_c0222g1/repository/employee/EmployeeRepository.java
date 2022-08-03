package com.codegym.ss7_c0222g1.repository.employee;

import com.codegym.ss7_c0222g1.model.customer.Customer;
import com.codegym.ss7_c0222g1.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Modifying
    @Query(value = "update  employee set status_delete = 1 where employee_id = :id", nativeQuery = true)
    void deleteStatusSet(@Param("id") Integer id);

    @Query(value = "select * from employee where status_delete = 0 and employee_name like %:name% ", nativeQuery = true)
    Page<Employee> searchByNameEmployee(@Param("name") String name, Pageable pageable);

    @Query(value = "select * from employee where status_delete = 0 ", nativeQuery = true)
    Page<Employee> findAll(Pageable pageable);

    @Query(value = "select * from employee where status_delete = 0 and employee_id = :id", nativeQuery = true)
    Employee findEmployeeById(@Param("id") Integer id);


}
