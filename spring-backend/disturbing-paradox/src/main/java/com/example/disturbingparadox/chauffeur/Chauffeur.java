package com.example.disturbingparadox.chauffeur;

import javax.persistence.Entity;

import com.example.disturbingparadox.collaborateur.Collaborateur;

@Entity
public class Chauffeur extends Collaborateur{
    

    private String numberLicence;

    private String driverPicture;

    

    public Chauffeur(String numberLicence, String driverPicture) {
        super();
        this.numberLicence = numberLicence;
        this.driverPicture = driverPicture;
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
