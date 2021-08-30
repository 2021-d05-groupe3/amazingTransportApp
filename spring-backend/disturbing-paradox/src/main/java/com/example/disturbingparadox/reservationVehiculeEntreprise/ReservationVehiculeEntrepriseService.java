package com.example.disturbingparadox.reservationVehiculeEntreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReservationVehiculeEntrepriseService {
    @Autowired
    ReservationVehiculeEntrepriseRepository reservationVehiculeEntrepriseRepository;

    public ReservationVehiculeEntreprise addReservationVehiculeEntreprise(ReservationVehiculeEntrepriseDto nouvelleReservationVehiculeEntreprise) {
        ReservationVehiculeEntreprise reservationVehiculeEntreprise = new ReservationVehiculeEntreprise();
        reservationVehiculeEntreprise.setDateDeparture(nouvelleReservationVehiculeEntreprise.getDateDeparture());
        reservationVehiculeEntreprise.setDateArrival(nouvelleReservationVehiculeEntreprise.getDateArrival());
        reservationVehiculeEntreprise.setHasDriver(nouvelleReservationVehiculeEntreprise.isHasDriver());
        
          return reservationVehiculeEntrepriseRepository.save(reservationVehiculeEntreprise);
      }
}
