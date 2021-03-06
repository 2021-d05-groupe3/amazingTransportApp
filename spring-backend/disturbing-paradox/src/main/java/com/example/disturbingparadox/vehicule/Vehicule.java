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
import com.example.disturbingparadox.marque.Marque;
import com.example.disturbingparadox.model.Model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


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
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Marque vehiculeMarque;

    @ManyToOne// jointure plusieurs vehicule peuvent avoir 1 marque
    @JoinColumn(name = "id_model")
    private Model vehiculeModel;

    @OneToMany(mappedBy = "vehicule")//jointure 1 marque peut avoir plusieurs vehicules
    private Set<AnnonceCovoiturage> annonceCovoiturages;



    public Vehicule() {
    }

    public Long getId() {
        return id;
    }

    public Marque getVehiculeMarque() {
        return vehiculeMarque;
    }

    public void setVehiculeMarque(Marque vehiculeMarque) {
        this.vehiculeMarque = vehiculeMarque;
    }

    public Model getVehiculeModel() {
        return vehiculeModel;
    }

    public void setVehiculeModel(Model vehiculeModel) {
        this.vehiculeModel = vehiculeModel;
    }

    public Set<AnnonceCovoiturage> getAnnonceCovoiturages() {
        return annonceCovoiturages;
    }

    public void setAnnonceCovoiturages(Set<AnnonceCovoiturage> annonceCovoiturages) {
        this.annonceCovoiturages = annonceCovoiturages;
    }

  

  

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

 

 

    
    
    
}
