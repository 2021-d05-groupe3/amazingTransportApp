package com.example.disturbingparadox.vehicule;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.disturbingparadox.annonceCovoiturage.AnnonceCovoiturage;
import com.example.disturbingparadox.categorie.Categorie;


@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    String immatriculation;
   

  
    @ManyToOne// jointure plusieurs vehicule peuvent avoir 1 marque
    @JoinColumn(name = "id_marque")
    private Vehicule vehiculeMarque;

    @ManyToOne// jointure plusieurs vehicule peuvent avoir 1 marque
    @JoinColumn(name = "id_model")
    private Vehicule vehiculeModel;

    @OneToMany(mappedBy = "vehicule")//jointure 1 marque peut avoir plusieurs vehicules
    private Set<AnnonceCovoiturage> annonceCovoiturages;

    @ManyToOne// jointure plusieurs vehicule peuvent avoir 1 categorie
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;

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

 

 

    
    
    
}
