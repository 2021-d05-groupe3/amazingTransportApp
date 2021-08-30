package com.example.disturbingparadox.vehiculeSociete;

public class VehiculeSocieteDto {

    String statut;

    public VehiculeSocieteDto() {
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "VehiculeSocieteDto [statut=" + statut + "]";
    }

    
    
}
