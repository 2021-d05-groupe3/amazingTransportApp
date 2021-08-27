package com.example.disturbingparadox.reservationCovoit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ReservationCovoitController {
    
    @Autowired
    ReservationCovoitService reservationCovoitService;

    @PostMapping("/reservationCovoit")
	public ReservationCovoit ajouterReservationCovoit(@RequestBody ReservationCovoitDto reservationCovoit) {
		
		return reservationCovoitService.addModel(reservationCovoit);
	}

}
