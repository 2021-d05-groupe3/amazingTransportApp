package com.example.disturbingparadox.annonceCovoiturage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnonceCovoiturageController {
    @Autowired
	AnnonceCovoiturageService annonceCovoiturageService;

   
    
}
