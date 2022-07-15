package com.codegym.model;

public class MedicalForm {
    private String id;
    private String name;
    private String birthYear;
    private String gender;
    private String country;
    private String idCardNumber;
    private String verhice;
    private String verhiceNumber;
    private String verhiceNumberSlot;
    private String dayStart;
    private String dayEnd;
    private String city;

    private String city2;
    private String district;
    private String ward;

    private String address;
    private String phone;
    private String email;

    private String fever;
    private String vomit;
    private String cough;
    private String diarrhea;
    private String difficultyBreathing;
    private String bleeding;
    private String soreThroat;
    private String rash;
    private String animalContact;
    private String patientContact;


    public MedicalForm() {
    }

    public MedicalForm(String id, String name, String birthYear, String gender, String country, String idCardNumber, String verhice, String verhiceNumber, String verhiceNumberSlot, String dayStart, String dayEnd, String city, String city2, String district, String ward, String address, String phone, String email, String fever, String vomit, String cough, String diarrhea, String difficultyBreathing, String bleeding, String soreThroat, String rash, String animalContact, String patientContact) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.country = country;
        this.idCardNumber = idCardNumber;
        this.verhice = verhice;
        this.verhiceNumber = verhiceNumber;
        this.verhiceNumberSlot = verhiceNumberSlot;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.city = city;
        this.city2 = city2;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.fever = fever;
        this.vomit = vomit;
        this.cough = cough;
        this.diarrhea = diarrhea;
        this.difficultyBreathing = difficultyBreathing;
        this.bleeding = bleeding;
        this.soreThroat = soreThroat;
        this.rash = rash;
        this.animalContact = animalContact;
        this.patientContact = patientContact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getVerhice() {
        return verhice;
    }

    public void setVerhice(String verhice) {
        this.verhice = verhice;
    }

    public String getVerhiceNumber() {
        return verhiceNumber;
    }

    public void setVerhiceNumber(String verhiceNumber) {
        this.verhiceNumber = verhiceNumber;
    }

    public String getVerhiceNumberSlot() {
        return verhiceNumberSlot;
    }

    public void setVerhiceNumberSlot(String verhiceNumberSlot) {
        this.verhiceNumberSlot = verhiceNumberSlot;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getVomit() {
        return vomit;
    }

    public void setVomit(String vomit) {
        this.vomit = vomit;
    }

    public String getCough() {
        return cough;
    }

    public void setCough(String cough) {
        this.cough = cough;
    }

    public String getDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(String diarrhea) {
        this.diarrhea = diarrhea;
    }

    public String getDifficultyBreathing() {
        return difficultyBreathing;
    }

    public void setDifficultyBreathing(String difficultyBreathing) {
        this.difficultyBreathing = difficultyBreathing;
    }

    public String getBleeding() {
        return bleeding;
    }

    public void setBleeding(String bleeding) {
        this.bleeding = bleeding;
    }

    public String getSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(String soreThroat) {
        this.soreThroat = soreThroat;
    }

    public String getRash() {
        return rash;
    }

    public void setRash(String rash) {
        this.rash = rash;
    }

    public String getAnimalContact() {
        return animalContact;
    }

    public void setAnimalContact(String animalContact) {
        this.animalContact = animalContact;
    }

    public String getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(String patientContact) {
        this.patientContact = patientContact;
    }
}
