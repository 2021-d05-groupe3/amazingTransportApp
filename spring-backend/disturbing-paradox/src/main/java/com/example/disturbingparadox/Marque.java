package com.example.disturbingparadox;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marque {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;

    @Column()
    String nom;
    
    @Column()
    String pays;


    public Marque() {
    }

    public Long getId() {
        return id;
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

