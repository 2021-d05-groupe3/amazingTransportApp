package com.example.disturbingparadox.reservationVehiculeEntreprise;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.disturbingparadox.collaborateur.Collaborateur;
import com.example.disturbingparadox.vehiculeSociete.VehiculeSociete;

@Entity
public class ReservationVehiculeEntreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private LocalDateTime dateDeparture;

    @Column
    private LocalDateTime dateArrival;

    @Column
    private boolean hasDriver;

    @OneToOne
    private VehiculeSociete vehiculeSociete;

    @ManyToOne// jointure plusieurs annonces peuvent avoir 1 collaborateur
    @JoinColumn(name = "id_collaborateur")
    private Collaborateur collaborateur;

    public ReservationVehiculeEntreprise() {
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

    public boolean isHasDriver() {
        return hasDriver;
    }

    public void setHasDriver(boolean hasDriver) {
        this.hasDriver = hasDriver;
    }

    
    
}
