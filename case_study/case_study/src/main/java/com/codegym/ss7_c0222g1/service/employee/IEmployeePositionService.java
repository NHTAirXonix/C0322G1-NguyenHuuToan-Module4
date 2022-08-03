package com.codegym.ss7_c0222g1.service.employee;

import com.codegym.ss7_c0222g1.model.customer.CustomerType;
import com.codegym.ss7_c0222g1.model.employee.Position;

import java.util.List;

public interface IEmployeePositionService {
    List<Position> findAll();
}
