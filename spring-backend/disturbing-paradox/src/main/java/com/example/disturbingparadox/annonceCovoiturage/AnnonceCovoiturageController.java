package com.example.disturbingparadox.annonceCovoiturage;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
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

	@GetMapping("/afficherAnnonce")
	public List<AnnonceCovoiturage> afficherLesAnnonces(){
		return annonceCovoiturageService.getAnnonces();
	}

	@PostMapping("/ajouterAnnonce")
	public void ajouterAnnonce(AnnonceCovoiturageDto annonceCovoiturage) {
		annonceCovoiturageService.addAnnonce(annonceCovoiturage);
	}

	@DeleteMapping("/suprimerAnnonce/{id}")  	
	public String suprimerAnnonce(@PathVariable("id") Long id) {
		annonceCovoiturageService.deleteAnnonce(id);
	     return"supression ok";
	}
    
}
