package com.example.disturbingparadox.reservationCovoit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ReservationCovoitController {
    
    @Autowired
    ReservationCovoitService reservationCovoitService;

    @GetMapping("/dashboard")
	public List<ReservationCovoit> afficherLesAnnonces(){
		return reservationCovoitService.getReservations();
	}

    @PostMapping("/covoiturages")
	public ReservationCovoit ajouterReservationCovoit(@RequestBody ReservationCovoitDto reservationCovoit) {
		
		return reservationCovoitService.addModel(reservationCovoit);
	}

}
