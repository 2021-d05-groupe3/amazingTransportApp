package com.example.disturbingparadox.categorie;

public class CategorieDto {
    String libelle;

    public CategorieDto() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "CategorieDto [libelle=" + libelle + "]";
    }

    

    
}
