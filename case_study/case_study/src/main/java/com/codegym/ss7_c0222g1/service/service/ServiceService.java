package com.codegym.ss7_c0222g1.service.service;


import com.codegym.ss7_c0222g1.model.facility.Facility;
import com.codegym.ss7_c0222g1.repository.Service.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Facility findById(Integer id) {
        return serviceRepository.findById2(id);
    }

    @Override
    public List<Facility> searchByName(String serviceName ) {
        return serviceRepository.searchByName(serviceName);
    }

    @Override
    public void save(Facility facility) {
        serviceRepository.save(facility);
    }

    @Override
    public void delete(int id) {
        serviceRepository.delete(id);
    }

}
