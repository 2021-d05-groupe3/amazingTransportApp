package com.example.disturbingparadox.reservationCovoit;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.disturbingparadox.annonceCovoiturage.AnnonceCovoiturage;
import com.example.disturbingparadox.collaborateur.Collaborateur;

@Entity
public class ReservationCovoit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private LocalDateTime dateDeparture;

    @Column()
    private LocalDateTime dateArrival;

    @ManyToOne// jointure plusieurs annonce peuvent avoir 1 vehicule
    @JoinColumn(name = "reservationsCovoits")
    private AnnonceCovoiturage annonceCovoiturage;

    @ManyToOne// jointure plusieurs annonces peuvent avoir 1 collaborateur
    @JoinColumn(name = "id_collaborateur")
    private Collaborateur collaborateur;

    public ReservationCovoit() {
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDateTime dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public LocalDateTime getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(LocalDateTime dateArrival) {
        this.dateArrival = dateArrival;
    }

    

    
}
