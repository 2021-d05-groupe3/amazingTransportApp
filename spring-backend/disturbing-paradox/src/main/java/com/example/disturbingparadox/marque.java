package com.example.disturbingparadox;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marque {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    Long id ;
    @Column()
    String nom, pays;

    public Long getId() {
        return id;
    }

   

    public Marque() {
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

    
    
}
