package com.example.disturbingparadox.marque;

public class MarqueDto {
 
    String nom;
    String pays;
    
    public MarqueDto() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "MarqueDto [nom=" + nom + ", pays=" + pays + "]";
    }

    
    
}
