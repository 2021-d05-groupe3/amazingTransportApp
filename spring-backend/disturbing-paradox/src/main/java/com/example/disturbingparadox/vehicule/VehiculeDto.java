package com.example.disturbingparadox.vehicule;

public class VehiculeDto {
    String immatriculation;

    public VehiculeDto() {
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    @Override
    public String toString() {
        return "VehiculeDto [immatriculation=" + immatriculation + "]";
    }

    
}
