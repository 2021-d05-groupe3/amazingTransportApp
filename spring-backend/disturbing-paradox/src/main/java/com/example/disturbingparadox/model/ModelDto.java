package com.example.disturbingparadox.model;

public class ModelDto {
    String nom;

    public ModelDto() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "ModelDto [nom=" + nom + "]";
    }

    
}
