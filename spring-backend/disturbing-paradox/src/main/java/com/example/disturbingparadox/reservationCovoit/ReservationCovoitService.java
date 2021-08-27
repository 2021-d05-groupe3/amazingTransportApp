package com.example.disturbingparadox.reservationCovoit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReservationCovoitService {

    @Autowired
    ReservationCovoitRepository reservationCovoitRepository;

    public ReservationCovoit addModel(ReservationCovoitDto nouvelleReservationCovoit) {
        ReservationCovoit reservationCovoit = new ReservationCovoit();
        reservationCovoit.setDateDeparture(nouvelleReservationCovoit.getDateDeparture());
        reservationCovoit.setDateArrival(nouvelleReservationCovoit.getDateArrival());
        
          return reservationCovoitRepository.save(reservationCovoit);
      }
    
}
