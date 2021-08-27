package com.example.disturbingparadox.vehiculeSociete;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeSocieteService {

    @Autowired
    VehiculeSocieteRepository vehiculeRepository;

    public Optional<VehiculeSociete> getVehiculeSociete(Long id) {
	
		return  vehiculeRepository.findById(id);
        	
	}
    
}
