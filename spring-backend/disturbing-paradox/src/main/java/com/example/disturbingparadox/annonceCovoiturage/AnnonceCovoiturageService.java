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

    public List<AnnonceCovoiturage> getAnnonces() {
        return null;
    }

    public void addAnnonce(AnnonceCovoiturageDto annonceCovoiturage) {
    }

    public void deleteAnnonce(Long id) {
    }

    
}  