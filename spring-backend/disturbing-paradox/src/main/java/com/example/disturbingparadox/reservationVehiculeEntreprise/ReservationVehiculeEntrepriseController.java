package com.example.disturbingparadox.reservationVehiculeEntreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ReservationVehiculeEntrepriseController {
    @Autowired
    ReservationVehiculeEntrepriseService reservationVehiculeEntrepriseService;

    @PostMapping("/reservationVehiculeEntreprise")
	public ReservationVehiculeEntreprise ajouterReservationVehiculeEntreprise(@RequestBody ReservationVehiculeEntrepriseDto ReservationVehiculeEntreprise) {
		
		return reservationVehiculeEntrepriseService.addReservationVehiculeEntreprise(ReservationVehiculeEntreprise);
	}

   
}
