package com.example.disturbingparadox.categorie;


import java.util.List;
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

  
  public List<Categorie> getCategories(){
		return categorieRepository.findAll();
	}

  public void addCategorie(Categorie nouvelleCategorie) {
		categorieRepository.save(nouvelleCategorie);
	}

  public void deleteCategorie(Long id) {
		for(Categorie c: categorieRepository.findAll() ) {
			if(id.equals(c.getId()))
      categorieRepository.delete(c);
		}
	}
    
}
