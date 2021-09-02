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

	public List<Marque> getMarques() {
        return marqueRepository.findAll();
    }

  public Marque addCategorie(MarqueDto nouvelleMarque) {
	  Marque marque = new Marque();
	  marque.setNom(nouvelleMarque.nom);
	  marque.setPays(nouvelleMarque.pays);
		return marqueRepository.save(marque);
	}
	
    
}
