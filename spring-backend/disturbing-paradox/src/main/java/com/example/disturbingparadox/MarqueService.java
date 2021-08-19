package com.example.disturbingparadox;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarqueService {

    @Autowired
    MarqueRepository marqueRepository;

    public List<Marque> getMarque(String nom) {
		System.out.println(" hello coco!");
        System.out.println(" hello jo!");
		return  marqueRepository.findByNom(nom);
        
		
	}
	
    
}
