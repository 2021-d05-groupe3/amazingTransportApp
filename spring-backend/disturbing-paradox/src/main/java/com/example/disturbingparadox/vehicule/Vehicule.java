package com.example.disturbingparadox.vehicule;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.disturbingparadox.marque.Marque;

@Entity
public class Vehicule {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    Long id ;
    @Column()
    String immatriculation;
    Marque marqueId;
    Categorie categorieId;
    String statut;

    public Vehicule() {
    }

    public Long getId() {
        return id;
    }



    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Marque getMarqueId() {
        return marqueId;
    }

    public void setMarqueId(Marque marqueId) {
        this.marqueId = marqueId;
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
