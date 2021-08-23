package com.example.disturbingparadox.vehicule;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.example.disturbingparadox.marque.Marque;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    String immatriculation;
    Marque marqueId;
    String statut;

  
    @ManyToOne// jointure plusieurs vehicule peuvent avoir 1 marque
    @JoinColumn(name = "id_marque")
    private Vehicule vehiculeMarque;

    @ManyToOne// jointure plusieurs vehicule peuvent avoir 1 marque
    @JoinColumn(name = "id_model")
    private Vehicule vehiculeModel;

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

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    
    
    
}
