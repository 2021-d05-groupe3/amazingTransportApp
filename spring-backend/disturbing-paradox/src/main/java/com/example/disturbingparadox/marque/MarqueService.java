package com.example.disturbingparadox.marque;

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
        System.out.println(" hello jojo!");
		return  marqueRepository.findByNom(nom);
        
		
	}
	
    
}
