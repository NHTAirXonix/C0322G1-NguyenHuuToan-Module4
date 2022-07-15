package com.codegym.repository;

import com.codegym.model.MedicalForm;

import java.util.List;

public interface MedicalFormRepository {
    List<MedicalForm> getAll();

    void save(MedicalForm medicalForm);

    void update(String id, MedicalForm medicalForm);

    MedicalForm findById(String id);

    String[] getYear();

    String[] getGender();

    String[] getCountry();

    String[] getVehicle();

    String[] getCity();

    String[] getDistrict();

    String[] getWard();


}
