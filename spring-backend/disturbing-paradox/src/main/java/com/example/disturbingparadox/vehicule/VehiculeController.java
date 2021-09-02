package com.example.disturbingparadox.vehicule;
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

	@GetMapping("/Vehicules")
	public List<Vehicule> afficherLesVehicules(){
		return vehiculeService.getVehicules();
	}

	@PostMapping("/Vehicule")
	public Vehicule ajouterVehicule(@RequestBody VehiculeDto vehicule) {
	
		return vehiculeService.addVehicule(vehicule);
	}

	
		

	@DeleteMapping("/Vehicule/{id}")  	
	public String deleteVehicule(@PathVariable("id") Long id) {
		vehiculeService.deleteVehicule(id);
	     return"supression ok";
	}
    
}

