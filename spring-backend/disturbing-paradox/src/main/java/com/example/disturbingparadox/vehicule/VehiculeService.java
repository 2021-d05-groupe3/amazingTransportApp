package com.example.disturbingparadox.vehicule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehiculeService {
    @Autowired
    VehiculeRepository vehiculeRepository;

    public List<Vehicule> getVehicule(String nom) {
	
		return  vehiculeRepository.findByNom(nom);
        
		
	}
    
}
