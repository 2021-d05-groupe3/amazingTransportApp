package com.example.disturbingparadox.vehiculeSociete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeSocieteService {

    @Autowired
    VehiculeSocieteRepository vehiculeRepository;

    public List<VehiculeSociete> getVehiculeSociete(String nom) {
	
		return  vehiculeRepository.findByNom(nom);
        
		
	}
    
}
