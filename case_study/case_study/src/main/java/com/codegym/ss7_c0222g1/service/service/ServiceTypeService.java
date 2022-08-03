package com.codegym.ss7_c0222g1.service.service;

import com.codegym.ss7_c0222g1.model.facility.FacilityType;
import com.codegym.ss7_c0222g1.repository.Service.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService{

    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
