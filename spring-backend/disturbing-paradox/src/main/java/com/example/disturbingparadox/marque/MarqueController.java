package com.example.disturbingparadox.marque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarqueController {

    @Autowired
	MarqueService marqueService;

    @GetMapping("/marque/{nom}")
	public List<Marque>  getMarque(@PathVariable String nom) {
		List<Marque> marques = marqueService.getMarque(nom);

		return marques;


	}
    
}
