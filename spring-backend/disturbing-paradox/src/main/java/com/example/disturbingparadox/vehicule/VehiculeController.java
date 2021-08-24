package com.example.disturbingparadox.vehicule;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeController {

    @Autowired
	VehiculeService vehiculeService;

    @GetMapping("/vehicule/{id}")
	public Vehicule  getVehicule(@PathVariable Long id) {
		Optional<Vehicule> oVehicule = vehiculeService.getVehicule(id);
if(oVehicule.isPresent()){
	return oVehicule.get();
}
		return null;


	}
    
}

