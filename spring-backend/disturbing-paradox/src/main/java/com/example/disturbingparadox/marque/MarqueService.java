package com.example.disturbingparadox.marque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarqueService {

    @Autowired
    MarqueRepository marqueRepository;

    public List<Marque> getMarque(String nom) {
	
		return  marqueRepository.findByNom(nom);
        
		
	}

  public Marque addCategorie(MarqueDto nouvelleCategorie) {
	  Marque marque = new Marque();
	  marque.setNom(marque.nom);
	  marque.setPays(marque.pays);
		return marqueRepository.save(marque);
	}
	
    
}
