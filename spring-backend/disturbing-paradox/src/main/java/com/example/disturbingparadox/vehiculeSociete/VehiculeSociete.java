package com.example.disturbingparadox.vehiculeSociete;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


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

  

    @OneToMany(mappedBy = "vehiculeSociete", cascade = CascadeType.ALL)//jointure 1 marque peut avoir plusieurs vehicules
    private Set<ReservationVehiculeEntreprise> reservationVehiculeEntreprises;

    
    public VehiculeSociete() {
    }


    public Long getId() {
        return id;
    }



    public Categorie getCategorie() {
        return categorie;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }


  


    public Set<ReservationVehiculeEntreprise> getReservationVehiculeEntreprises() {
        return reservationVehiculeEntreprises;
    }


    public void setReservationVehiculeEntreprises(Set<ReservationVehiculeEntreprise> reservationVehiculeEntreprises) {
        this.reservationVehiculeEntreprises = reservationVehiculeEntreprises;
    }


    public String getStatut() {
        return statut;
    }

    


 


    @Override
    public String toString() {
        return "VehiculeSociete [categorie=" + categorie + ", id=" + id + ", reservationVehiculeEntreprises="
                + reservationVehiculeEntreprises + ", statut=" + statut + "]";
    }


    public void setStatut(String statut) {
        this.statut = statut;
    }

    
    
}
