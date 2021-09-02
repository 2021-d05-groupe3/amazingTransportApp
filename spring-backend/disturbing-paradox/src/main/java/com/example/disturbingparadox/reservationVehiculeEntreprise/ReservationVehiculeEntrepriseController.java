package com.example.disturbingparadox.reservationVehiculeEntreprise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ReservationVehiculeEntrepriseController {
    @Autowired
    ReservationVehiculeEntrepriseService reservationVehiculeEntrepriseService;

    @GetMapping("/reservationVehiculeEntreprises")
	public List<ReservationVehiculeEntreprise> afficherLesAnnonces(){
		return reservationVehiculeEntrepriseService.getReservationVehiculeEntreprises();
	}

    @PostMapping("/reservationVehiculeEntreprise")
	public ReservationVehiculeEntreprise ajouterReservationVehiculeEntreprise(@RequestBody ReservationVehiculeEntrepriseDto ReservationVehiculeEntreprise) {
		
		return reservationVehiculeEntrepriseService.addReservationVehiculeEntreprise(ReservationVehiculeEntreprise);
	}

   
}
