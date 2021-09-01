package com.example.disturbingparadox.annonceCovoiturage;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class AnnonceCovoiturageController {
    @Autowired
	AnnonceCovoiturageService annonceCovoiturageService;
    
}
