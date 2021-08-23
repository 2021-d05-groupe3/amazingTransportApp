package com.example.disturbingparadox.categorie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorieController {

    @Autowired
	CategorieService categorieService;

    @GetMapping("/categorie/{nom}")
    public List<Categorie>  getCategorie(@PathVariable String nom) {
		List<Categorie> categories = categorieService.getCategorie(nom);

		return categories;


	}
    
}
