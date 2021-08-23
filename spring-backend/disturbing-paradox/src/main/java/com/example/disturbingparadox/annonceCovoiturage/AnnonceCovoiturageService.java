package com.example.disturbingparadox.annonceCovoiturage;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceCovoiturageService {
    @Autowired
    AnnonceCovoiturageRepository annonceCovoiturageRepository;

    public List<AnnonceCovoiturage> getAnnonceCovoiturage(String nom) {

		return  annonceCovoiturageRepository.findByNom(nom);
        
		
	}
}  