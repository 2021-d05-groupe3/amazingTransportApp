package com.example.disturbingparadox.vehiculeSociete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.disturbingparadox.categorie.Categorie;
import com.example.disturbingparadox.reservationVehiculeEntreprise.ReservationVehiculeEntreprise;
import com.example.disturbingparadox.vehicule.Vehicule;

@Entity
public class VehiculeSociete extends Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    
    String statut;

    @ManyToOne// jointure plusieurs vehiculeSociete peuvent avoir 1 categorie
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @OneToOne
    private ReservationVehiculeEntreprise reservationVehiculeEntreprise;

    
    public VehiculeSociete() {
    }


    public Long getId() {
        return id;
    }



    public String getStatut() {
        return statut;
    }


    public void setStatut(String statut) {
        this.statut = statut;
    }

    
    
}
