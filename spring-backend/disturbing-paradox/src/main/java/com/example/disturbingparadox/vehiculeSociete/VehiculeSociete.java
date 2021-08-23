package com.example.disturbingparadox.vehiculeSociete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.disturbingparadox.categorie.Categorie;
import com.example.disturbingparadox.vehicule.Vehicule;

@Entity
public class VehiculeSociete extends Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    Categorie categorieId;
    String statut;

    @ManyToOne// jointure plusieurs vehiculeSociete peuvent avoir 1 categorie
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    
    public VehiculeSociete() {
    }


    public Long getId() {
        return id;
    }


   


    public Categorie getCategorieId() {
        return categorieId;
    }


    public void setCategorieId(Categorie categorieId) {
        this.categorieId = categorieId;
    }


    public String getStatut() {
        return statut;
    }


    public void setStatut(String statut) {
        this.statut = statut;
    }

    
    
}
