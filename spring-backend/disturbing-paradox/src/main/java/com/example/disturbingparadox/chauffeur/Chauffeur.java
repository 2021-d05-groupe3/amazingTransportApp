package com.example.disturbingparadox.chauffeur;

import javax.persistence.Entity;

import com.example.disturbingparadox.collaborateur.Collaborateur;

@Entity
public class Chauffeur extends Collaborateur{
    

    private String numberLicence;

    private String driverPicture;

    public Chauffeur() {
    }

    public String getNumberLicence() {
        return numberLicence;
    }

    public void setNumberLicence(String numberLicence) {
        this.numberLicence = numberLicence;
    }

    public String getDriverPicture() {
        return driverPicture;
    }

    public void setDriverPicture(String driverPicture) {
        this.driverPicture = driverPicture;
    }

    

    
}
