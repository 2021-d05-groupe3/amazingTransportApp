package com.example.disturbingparadox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Model {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    Long id ;
    @Column()
    String nom;


    
    public Model() {
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

    
}
