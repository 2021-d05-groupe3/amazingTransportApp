package com.example.disturbingparadox.annonceCovoiturage;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceCovoiturageService {
    @Autowired
    AnnonceCovoiturageRepository annonceCovoiturageRepository;

    public Optional<AnnonceCovoiturage> getAnnonceCovoiturage(Long id) {

		return  annonceCovoiturageRepository.findById(id);
        
		
	}
}  