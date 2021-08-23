package com.example.disturbingparadox.reservationVehiculeEntreprise;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
