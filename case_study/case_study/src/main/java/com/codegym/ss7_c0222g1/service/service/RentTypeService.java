package com.codegym.ss7_c0222g1.service.service;

import com.codegym.ss7_c0222g1.model.facility.RentType;
import com.codegym.ss7_c0222g1.repository.Service.RentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
