package com.example.disturbingparadox.categorie;

public class CategorieDto {

   public String libelle;

   

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
