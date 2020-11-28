package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	Hospital sick = new Hospital("Tanmed");
        sick.addPatientToList( new Patient("Алабаев", "Сергей" , "Иванович" , "Россия" , 897896 , 5012, "геморрой"));
        sick.addPatientToList( new Patient("Крепаткин", "Георгий" , "Николаевич" , "Эстония" , 756931 , 7895, "бронхит"));
        sick.addPatientToList( new Patient("Гомобурнов", "Александр" , "Иванович" , "Латвия" , 413069 , 7145, "сколиоз"));
        sick.addPatientToList( new Patient("Ефремов", "Михаил" , "Борисович" , "Россия" , 897369 , 5078, "диабет"));
        sick.addPatientToList( new Patient("Алабаев", "Владимир" , "Иванович" , "Германия" , 967857 , 5017, "геморрой"));

        System.out.println("\n Input diagnosis: ");
        ArrayList<Patient> patList = sick.getDiagnosisList("геморрой");
        for (Patient pat : patList)
        {
            System.out.println(pat.toString());
        }

        System.out.println("\n Input diapason for medcard: ");
        ArrayList<Patient> patDiag = sick.getDiapasonList(5000, 7000);
        for (Patient pat : patDiag)
        {
            System.out.println(pat.toString());
    }
}}
