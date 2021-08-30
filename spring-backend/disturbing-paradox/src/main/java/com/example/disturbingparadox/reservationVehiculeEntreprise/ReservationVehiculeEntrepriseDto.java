package com.example.disturbingparadox.reservationVehiculeEntreprise;

import java.time.LocalDateTime;

public class ReservationVehiculeEntrepriseDto {

    private LocalDateTime dateDeparture;
    private LocalDateTime dateArrival;
    private boolean hasDriver;

    
    public ReservationVehiculeEntrepriseDto() {
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


    @Override
    public String toString() {
        return "ReservationVehiculeEntrepriseDto [dateArrival=" + dateArrival + ", dateDeparture=" + dateDeparture
                + ", hasDriver=" + hasDriver + "]";
    }

    
    
}
