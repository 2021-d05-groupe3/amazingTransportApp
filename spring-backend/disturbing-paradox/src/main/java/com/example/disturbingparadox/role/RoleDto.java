package com.example.disturbingparadox.role;

public class RoleDto {

    String libelle;

    public RoleDto() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "RoleDto [libelle=" + libelle + "]";
    }

    
    
}
