package com.company;

class Patient {

private static int GenId = 0;
private final int id = GenId++;
private String surname;
private String name;
private String patronymic;
private String address;
private int phone;
private int medCard;
private String diagnosis;

    public Patient(String surname, String name, String patronymic, String address, int phone, int medCard, String diagnosis) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.medCard = medCard;
        this.diagnosis = diagnosis;
    }

    public static int getGenId() {
        return GenId;
    }

    public static void setGenId(int genId) {
        GenId = genId;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        if (medCard > 0){
        this.medCard = medCard;}
        else System.out.println("Error input!");
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient {" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", medCard=" + medCard +
                ", diagnosis=" + diagnosis +
                '}';
    }
}
