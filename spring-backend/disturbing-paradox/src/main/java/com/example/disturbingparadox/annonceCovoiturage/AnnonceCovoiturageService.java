package com.example.disturbingparadox.annonceCovoiturage;


import java.util.List;
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

  public List<AnnonceCovoiturage> getAnnonces(){
		return annonceCovoiturageRepository.findAll();
	}

  public void addAnnonce(AnnonceCovoiturage nouvelleAnonce) {
		annonceCovoiturageRepository.save(nouvelleAnonce);
	}

  public void deleteAnnonce(Long id) {
		for(AnnonceCovoiturage a: annonceCovoiturageRepository.findAll() ) {
			if(id.equals(a.getId()))
      annonceCovoiturageRepository.delete(a);
		}
	}
}  