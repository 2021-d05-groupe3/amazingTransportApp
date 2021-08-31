package com.example.disturbingparadox.vehiculeSociete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeSocieteController {
    
    @Autowired
	VehiculeSocieteService vehiculeSocieteService;

    @GetMapping("/vehiculeSociete/{nom}")
	public List<VehiculeSociete>  getVehiculeSociete(@PathVariable String nom) {
		List<VehiculeSociete> vehiculesSociete = vehiculeSocieteService.getVehiculeSociete(nom);

		return vehiculesSociete;


	}
    
}
