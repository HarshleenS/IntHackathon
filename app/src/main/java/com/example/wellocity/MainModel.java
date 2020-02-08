package com.example.wellocity;

public class MainModel {
    Integer medLogo;
    String medName;

    public MainModel(Integer medLogo, String medName){
        this.medLogo = medLogo;
        this.medName = medName;
    }

    public Integer getMedLogo() {
        return medLogo;
    }

    public String getMedName() {
        return medName;
    }
}
