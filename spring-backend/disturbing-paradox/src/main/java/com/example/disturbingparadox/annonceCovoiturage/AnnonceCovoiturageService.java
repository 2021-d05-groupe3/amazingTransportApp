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
        return null;
    }


		
        
		
	

  public List<AnnonceCovoiturage> getAnnonces(){
		return annonceCovoiturageRepository.findAll();
	}

  public AnnonceCovoiturage addAnnonce(AnnonceCovoiturageDto nouvelleAnonce) {

	AnnonceCovoiturage annonceCovoiturage = new AnnonceCovoiturage();
	annonceCovoiturage.setNbrDePlaceRestante(nouvelleAnonce.nbrDePlaceRestante);
	annonceCovoiturage.setDateHDepart(nouvelleAnonce.dateHDepart);
	annonceCovoiturage.setAdresseDepart(nouvelleAnonce.adresseDepart);
	annonceCovoiturage.setAdresseArrivée(nouvelleAnonce.adresseArrivee);
	
		return annonceCovoiturageRepository.save(annonceCovoiturage);
	}

	

  public void deleteAnnonce(Long id) {
		for(AnnonceCovoiturage a: annonceCovoiturageRepository.findAll() ) {
			if(id.equals(a.getId()))
      annonceCovoiturageRepository.delete(a);
		}
	}

}  