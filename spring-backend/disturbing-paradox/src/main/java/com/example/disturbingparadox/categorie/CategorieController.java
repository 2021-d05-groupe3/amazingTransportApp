package com.example.disturbingparadox.categorie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/afficherCategorie")
	public List<Categorie> afficherLesCategories(){
		return categorieService.getCategories();
	}

	@PostMapping("/categorie")
	public Categorie ajouterCategorie(@RequestBody CategorieDto categorie) {
		System.out.print("nouvelle categorie: " + categorie);
		return categorieService.addCategorie(categorie);
	}

	@DeleteMapping("/suprimeCategorie/{id}")  	
	public String supprimeCategorie(@PathVariable("id") Long id) {
		categorieService.deleteCategorie(id);
	     return"supression ok";
	}
    
}
