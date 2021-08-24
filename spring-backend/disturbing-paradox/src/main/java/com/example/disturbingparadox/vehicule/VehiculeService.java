package com.example.disturbingparadox.vehicule;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehiculeService {
    @Autowired
    VehiculeRepository vehiculeRepository;

    public Optional<Vehicule> getVehicule(Long id) {
	
		return  vehiculeRepository.findById(id);
        
		
	}
    
}
