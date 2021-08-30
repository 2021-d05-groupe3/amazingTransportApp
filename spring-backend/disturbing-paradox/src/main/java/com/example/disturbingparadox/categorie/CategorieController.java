package com.example.disturbingparadox.categorie;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorieController {

    @Autowired
	CategorieService categorieService;

    @GetMapping("/categorie/{id}")
    public Categorie  getCategorie(@PathVariable Long id) {
		Optional<Categorie> oCategorie = categorieService.getCategorie(id);
if(oCategorie.isPresent()){
	return oCategorie.get();
}
return null;
		


	}
    
}
