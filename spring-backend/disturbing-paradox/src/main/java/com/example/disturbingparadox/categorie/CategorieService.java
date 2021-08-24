package com.example.disturbingparadox.categorie;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    public Optional<Categorie> getCategorie(Long id) {

		return  categorieRepository.findById(id);
        
		
	}
    
}
