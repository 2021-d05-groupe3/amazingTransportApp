package com.example.disturbingparadox.annonceCovoiturage;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnonceCovoiturageController {
    @Autowired
	AnnonceCovoiturageService annonceCovoiturageService;

    @GetMapping("/annonceCovoiturage/{nom}")
    public List<AnnonceCovoiturage>  getCategorie(@PathVariable String nom) {
		List<AnnonceCovoiturage> annonceCovoiturages = annonceCovoiturageService.getAnnonceCovoiturage(nom);

		return annonceCovoiturages;


	}
    
}
