package com.example.disturbingparadox.annonceCovoiturage;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnonceCovoiturageController {
    @Autowired
	AnnonceCovoiturageService annonceCovoiturageService;

    @GetMapping("/annonceCovoiturage/{id}")
    public AnnonceCovoiturage  getCategorie(@PathVariable Long id) {
		Optional<AnnonceCovoiturage> oAnnonceCovoiturage = annonceCovoiturageService.getAnnonceCovoiturage(id);
		if(oAnnonceCovoiturage.isPresent()){
			return oAnnonceCovoiturage.get();
		} 
		return null;

		


	}
    
}
