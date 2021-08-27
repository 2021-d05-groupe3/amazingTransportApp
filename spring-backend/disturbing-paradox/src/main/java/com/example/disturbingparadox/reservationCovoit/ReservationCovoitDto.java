package com.example.disturbingparadox.reservationCovoit;

import java.time.LocalDateTime;

public class ReservationCovoitDto {

    private LocalDateTime dateDeparture;
    private LocalDateTime dateArrival;

    
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

    
    @Override
    public String toString() {
        return "ReservationCovoitDto [dateArrival=" + dateArrival + ", dateDeparture=" + dateDeparture + "]";
    }

    
    
}
