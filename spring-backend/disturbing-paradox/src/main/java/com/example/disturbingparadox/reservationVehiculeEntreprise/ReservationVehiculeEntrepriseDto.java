package com.example.disturbingparadox.reservationVehiculeEntreprise;

import java.time.LocalDateTime;

public class ReservationVehiculeEntrepriseDto {

    private LocalDateTime dateDeparture;
    private LocalDateTime dateArrival;
    private boolean hasDriver;
    Long idVehiculeSociete;
    Long idCollaborateur;

    
    public ReservationVehiculeEntrepriseDto() {
    }


    public LocalDateTime getDateDeparture() {
        return dateDeparture;
    }


    public void setDateDeparture(LocalDateTime dateDeparture) {
        this.dateDeparture = dateDeparture;
    }


    public Long getIdVehiculeSociete() {
        return idVehiculeSociete;
    }


    public void setIdVehiculeSociete(Long idVehiculeSociete) {
        this.idVehiculeSociete = idVehiculeSociete;
    }


    public Long getIdCollaborateur() {
        return idCollaborateur;
    }


    public void setIdCollaborateur(Long idCollaborateur) {
        this.idCollaborateur = idCollaborateur;
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
