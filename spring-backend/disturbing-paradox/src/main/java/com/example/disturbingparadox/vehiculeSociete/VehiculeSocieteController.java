package com.example.disturbingparadox.vehiculeSociete;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeSocieteController {
    
    @Autowired
	VehiculeSocieteService vehiculeSocieteService;

    @GetMapping("/vehiculeSociete/{id}")
	public VehiculeSociete  getVehiculeSociete(@PathVariable Long id) {
		Optional<VehiculeSociete> oVehiculesSociete = vehiculeSocieteService.getVehiculeSociete(id);
		if(oVehiculesSociete.isPresent()){
			return oVehiculesSociete.get();
		}

		return null;


	}
    
}
