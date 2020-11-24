package com.company;

import java.util.ArrayList;

class Hospital {
    private String medName;
    private ArrayList<Patient> patientsList = new ArrayList<>();

    Hospital (String medName) {
        this.medName = medName;
    }
    void addPatientToList(Patient patient)
    {
        patientsList.add(patient);
    }

    public String getMedName() {
        return medName;
    }

    ArrayList<Patient> getDiagnosisList (String diagnosis){
    ArrayList<Patient> patList = new ArrayList<>();
    for (Patient pat:patientsList){
        if (pat.getDiagnosis().equals(diagnosis))
        {
            patList.add(pat);
        }
    } return patList;
    }
    ArrayList<Patient> getDiapasonList (int diapasonA , int diapasonB){
        ArrayList<Patient> patList = new ArrayList<>();
        for (Patient pat:patientsList){
            if (pat.getMedCard() >= diapasonA && pat.getMedCard() <= diapasonB)
            {
                patList.add(pat);
            }
        } return patList;
    }
}
