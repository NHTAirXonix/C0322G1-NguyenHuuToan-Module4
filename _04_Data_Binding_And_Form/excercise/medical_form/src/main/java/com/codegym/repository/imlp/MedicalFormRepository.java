package com.codegym.repository.imlp;

import com.codegym.model.MedicalForm;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalFormRepository implements com.codegym.repository.MedicalFormRepository {
    static List<MedicalForm> medicalFormList = new ArrayList<>();
    String[] year = new String[]{"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"};
    String[] gender = new String[]{"Nam", "Nu", "Khac"};
    String[] country = new String[]{"Viet Nam", "Lao", "Campuchia", "Thai Lan", "America"};
    String[] vehicle = new String[]{"Plane", "Boat", "Car", "Other"};

    String[] city = new String[]{"Da Nang","Ho Chi Minh", "Ha Noi"};
    String[] district = new String[]{"DN-Lien Chieu","DN-Hai Chau","HCM-Quan1","HCM-Quan2", "HN-Ba Dinh","HN-Cau Giay"};
    String[] ward = new String[]{"DN-Hoa Minh","HCM-Ben Nghe", "HN-Duong Do"};

    static {
        medicalFormList.add(new MedicalForm("1","Hao", "1999", "Nam", "Viet Nam", "123321", "Car", "111111", "111", "2022-10-10", "2022-10-10", "Da Nang","Ho Chi Minh","HCM-Quan1","HCM-Ben Nghe","11 Nguyen Tat Thanh","123321","hai@gmail.com","Yes","No","Yes","No","Yes","No","Yes","No","Yes","No"));
        medicalFormList.add(new MedicalForm("2","Hoang", "1999", "Nam", "Viet Nam", "123321", "Car", "222222", "222", "2022-10-10", "2022-10-10", "Da Nang","Ho Chi Minh","HCM-Quan1","HCM-Ben Nghe","11 Nguyen Tat Thanh","123321","hai@gmail.com","Yes","No","Yes","No","Yes","No","Yes","No","Yes","No"));
        medicalFormList.add(new MedicalForm("3","Duy", "1999", "Nam", "Viet Nam", "123321", "Car", "333333", "333", "2022-10-10", "2022-10-10", "Da Nang","Ho Chi Minh","HCM-Quan1","HCM-Ben Nghe","11 Nguyen Tat Thanh","123321","hai@gmail.com","Yes","No","Yes","No","Yes","No","Yes","No","Yes","No"));
        medicalFormList.add(new MedicalForm("4","Toan", "1999", "Nam", "Viet Nam", "123321", "Car", "444444", "444", "2022-10-10", "2022-10-10", "Da Nang","Ho Chi Minh","HCM-Quan1","HCM-Ben Nghe","11 Nguyen Tat Thanh","123321","hai@gmail.com","Yes","No","Yes","No","Yes","No","Yes","No","Yes","No"));
        medicalFormList.add(new MedicalForm("5","Khanh", "1999", "Nam", "Viet Nam", "123321", "Car", "555555", "555", "2022-10-10", "2022-10-10", "Da Nang","Ho Chi Minh","HCM-Quan1","HCM-Ben Nghe","11 Nguyen Tat Thanh","123321","hai@gmail.com","Yes","No","Yes","No","Yes","No","Yes","No","Yes","No"));
    }


    @Override
    public List<MedicalForm> getAll() {
        return medicalFormList;
    }

    @Override
    public void save(MedicalForm medicalForm) {
        medicalFormList.add(medicalForm);
    }

    @Override
    public void update(String id, MedicalForm medicalForm) {
        for (int i =0; i< medicalFormList.size();i++){
            if (id.equals(medicalFormList.get(i).getId())){
                medicalFormList.get(i).setName(medicalForm.getName());
                medicalFormList.get(i).setBirthYear(medicalForm.getBirthYear());
                medicalFormList.get(i).setGender(medicalForm.getGender());
                medicalFormList.get(i).setCountry(medicalForm.getCountry());
                medicalFormList.get(i).setIdCardNumber(medicalForm.getIdCardNumber());
                medicalFormList.get(i).setVerhice(medicalForm.getVerhice());
                medicalFormList.get(i).setVerhiceNumber(medicalForm.getVerhiceNumber());
                medicalFormList.get(i).setVerhiceNumberSlot(medicalForm.getVerhiceNumberSlot());
                medicalFormList.get(i).setDayStart(medicalForm.getDayStart());
                medicalFormList.get(i).setDayEnd(medicalForm.getDayEnd());
                medicalFormList.get(i).setCity(medicalForm.getCity());
                medicalFormList.get(i).setCity2(medicalForm.getCity2());
                medicalFormList.get(i).setDistrict(medicalForm.getDistrict());
                medicalFormList.get(i).setWard(medicalForm.getWard());
                medicalFormList.get(i).setAddress(medicalForm.getAddress());
                medicalFormList.get(i).setPhone(medicalForm.getPhone());
                medicalFormList.get(i).setEmail(medicalForm.getEmail());
                medicalFormList.get(i).setFever(medicalForm.getFever());
                medicalFormList.get(i).setVomit(medicalForm.getVomit());
                medicalFormList.get(i).setCough(medicalForm.getCough());
                medicalFormList.get(i).setDiarrhea(medicalForm.getDiarrhea());
                medicalFormList.get(i).setDifficultyBreathing(medicalForm.getDifficultyBreathing());
                medicalFormList.get(i).setBleeding(medicalForm.getBleeding());
                medicalFormList.get(i).setSoreThroat(medicalForm.getSoreThroat());
                medicalFormList.get(i).setRash(medicalForm.getRash());
                medicalFormList.get(i).setAnimalContact(medicalForm.getAnimalContact());
                medicalFormList.get(i).setPatientContact(medicalForm.getPatientContact());
            }
        }
    }

    @Override
    public String[] getYear() {
        return year;
    }

    @Override
    public String[] getGender() {
        return gender;
    }

    @Override
    public String[] getCountry() {
        return country;
    }

    @Override
    public String[] getVehicle() {
        return vehicle;
    }

    @Override
    public String[] getCity() {
        return city;
    }

    @Override
    public String[] getDistrict() {
        return district;
    }

    @Override
    public String[] getWard() {
        return ward;
    }

    @Override
    public MedicalForm findById(String id) {
        MedicalForm medicalForm = new MedicalForm();
        for (int i = 0; i < medicalFormList.size(); i++) {
            if (id.equals(medicalFormList.get(i).getId())){
                medicalForm =  medicalFormList.get(i);
            }
        }
        return medicalForm;
    }
}


