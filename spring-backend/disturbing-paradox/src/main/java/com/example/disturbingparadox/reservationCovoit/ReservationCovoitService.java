package com.example.disturbingparadox.reservationCovoit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ReservationCovoitService {

    @Autowired
    ReservationCovoitRepository reservationCovoitRepository;

    public List<ReservationCovoit> getReservationCovoit() {

        return reservationCovoitRepository.findAll();

    }
    
}
