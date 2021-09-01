package com.example.disturbingparadox.annonceCovoiturage;


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

	@GetMapping("/annonce")
	public List<AnnonceCovoiturage> afficherLesAnnonces(){
		return annonceCovoiturageService.getAnnonces();
	}

	@PostMapping("/annonce")
	public void ajouterAnnonce(@RequestBody AnnonceCovoiturageDto annonceCovoiturage) {
		annonceCovoiturageService.addAnnonce(annonceCovoiturage);
	}

	@DeleteMapping("/annonce/{id}")  	
	public String suprimerAnnonce(@PathVariable("id") Long id) {
		annonceCovoiturageService.deleteAnnonce(id);
	     return"supression ok";
	}
    
}
