package com.example.disturbingparadox.reservationCovoit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class ReservationCovoitController {
    
    @Autowired
    ReservationCovoitService reservationCovoitService;

    @GetMapping("/reservation-covoiturage")
    public List<ReservationCovoit> getReservations() {
        return reservationCovoitService.getReservationCovoit();
    }

}
