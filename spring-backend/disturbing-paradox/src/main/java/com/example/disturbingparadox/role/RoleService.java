package com.example.disturbingparadox.role;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getVehicule(String nom) {
	
		return  roleRepository.findByNom(nom);
        
		
	} 
}
