package com.example.disturbingparadox.vehicule;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeController {

    @Autowired
	VehiculeService vehiculeService;

    @GetMapping("/vehicule/{nom}")
	public List<Vehicule>  getVehicule(@PathVariable String nom) {
		List<Vehicule> vehicules = vehiculeService.getVehicule(nom);

		return vehicules;


	}
    
}

