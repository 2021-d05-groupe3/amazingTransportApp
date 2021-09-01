package com.example.disturbingparadox.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.disturbingparadox.vehicule.Vehicule;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    String nom;

    @OneToMany(mappedBy = "vehiculeModel")//jointure 1 marque peut avoir plusieurs vehicules
    private Set<Vehicule> vehicules;


    
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
