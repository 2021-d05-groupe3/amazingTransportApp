package com.example.disturbingparadox.marque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.disturbingparadox.vehicule.Vehicule;

@Entity
public class Marque {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    String nom;
    @Column()
    String pays;

    @OneToMany(mappedBy = "vehiculeMarque")//jointure 1 marque peut avoir plusieurs vehicules
    private Set<Vehicule> vehicules;

    

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

