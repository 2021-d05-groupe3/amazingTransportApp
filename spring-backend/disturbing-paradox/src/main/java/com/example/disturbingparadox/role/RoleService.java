package com.example.disturbingparadox.role;


import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getRole(Long id) {
	
		return  roleRepository.findById(id);
        
		
	} 

  public Role addRole(RoleDto nouveauRole) {
	  Role role = new Role();
	  role.setLibelle(nouveauRole.getLibelle());
	  
		return roleRepository.save(role);
	}
}
