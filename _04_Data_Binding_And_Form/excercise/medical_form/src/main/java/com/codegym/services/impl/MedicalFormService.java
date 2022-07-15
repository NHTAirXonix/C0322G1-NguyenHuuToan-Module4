package com.codegym.services.impl;

import com.codegym.model.MedicalForm;
import com.codegym.repository.MedicalFormRepository;
import com.codegym.services.MedicalFormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalFormService implements MedicalFormServices {
    @Autowired
    private MedicalFormRepository medicalFormRepository;

    @Override
    public List<MedicalForm> getAll() {
        return medicalFormRepository.getAll();
    }

    @Override
    public void save(MedicalForm medicalForm) {
        medicalFormRepository.save(medicalForm);
    }

    @Override
    public void update(String id, MedicalForm medicalForm) {
        medicalFormRepository.update(id, medicalForm);
    }

    @Override
    public String[] getYear() {
        return medicalFormRepository.getYear();
    }

    @Override
    public String[] getGender() {
        return medicalFormRepository.getGender();
    }

    @Override
    public String[] getCountry() {
        return medicalFormRepository.getCountry();
    }

    @Override
    public String[] getVehicle() {
        return medicalFormRepository.getVehicle();
    }

    @Override
    public String[] getCity() {
        return medicalFormRepository.getCity();
    }

    @Override
    public String[] getDistrict() {
        return medicalFormRepository.getDistrict();
    }

    @Override
    public String[] getWard() {
        return medicalFormRepository.getWard();
    }

    @Override
    public MedicalForm findById(String id) {
        return medicalFormRepository.findById(id);
    }
}
