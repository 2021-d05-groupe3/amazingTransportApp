package com.example.disturbingparadox.categorie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    public List<Categorie> getCategorie(String nom) {

		return  categorieRepository.findByNom(nom);
        
		
	}
    
}
