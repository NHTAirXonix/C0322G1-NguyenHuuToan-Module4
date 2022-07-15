package com.codegym.services;

import com.codegym.model.MedicalForm;

import java.util.List;

public interface MedicalFormServices {
    List<MedicalForm> getAll();
    void save(MedicalForm medicalForm);
    void update(String id,MedicalForm medicalForm);
    String[] getYear();
    String[] getGender();
    String[] getCountry();
    String[] getVehicle();
    String[] getCity();
    String[] getDistrict();
    String[] getWard();
    MedicalForm findById(String id);
}
