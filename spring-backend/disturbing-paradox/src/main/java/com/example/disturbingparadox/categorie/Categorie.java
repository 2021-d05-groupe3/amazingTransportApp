package com.example.disturbingparadox.categorie;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.disturbingparadox.vehicule.Vehicule;
import com.example.disturbingparadox.vehiculeSociete.VehiculeSociete;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    String libelle;

    @OneToMany(mappedBy = "categorie")//jointure 1 marque peut avoir plusieurs vehicules
    private Set<VehiculeSociete> vehiculesSociete;

    @OneToMany(mappedBy = "categorie",cascade = CascadeType.ALL)//jointure 1 categorie peut avoir plusieurs vehicules
    private Set<Vehicule> vehicules;

    
    public Categorie() {
    }


    public Long getId() {
        return id;
    }


    


    public String getLibelle() {
        return libelle;
    }


    public void setLibelle(String libelle) {
        this.libelle = libelle;
    } 

    
    
}
