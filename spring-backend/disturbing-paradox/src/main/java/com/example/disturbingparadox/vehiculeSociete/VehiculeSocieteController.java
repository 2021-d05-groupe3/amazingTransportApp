package com.example.disturbingparadox.vehiculeSociete;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/VehiculeSociete")
	public List<VehiculeSociete> afficherLesVehiculeSociete(){
		return vehiculeSocieteService.getVehiculeSocietes();
	}

	@PostMapping("/VehiculeSociete")
	public VehiculeSocieteDto ajouterVehicule(@RequestBody VehiculeSocieteDto vehiculeSociete) {

		return vehiculeSocieteService.addVehiculeSociete(vehiculeSociete);
	}

	@DeleteMapping("/VehiculeSociete/{id}")  	
	public String suprimerVehicule(@PathVariable("id") Long id) {
		vehiculeSocieteService.deleteVehiculeSociete(id);
	     return"supression ok";
	}
    
}
