package com.codegym.ss7_c0222g1.service.service;

import com.codegym.ss7_c0222g1.model.facility.Facility;

import java.util.List;

public interface IServiceService {

    Facility findById(Integer id);

    public List<Facility> searchByName(String serviceName);

    void save(Facility facility);

    void delete (int id);


}
