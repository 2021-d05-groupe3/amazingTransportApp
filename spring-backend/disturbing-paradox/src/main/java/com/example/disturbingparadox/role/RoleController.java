package com.example.disturbingparadox.role;


import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RoleController {
    @Autowired
	RoleService roleService;

    @GetMapping("/role/{id}")
	public Role  getRole(@PathVariable Long id) {
		Optional<Role> oRole = roleService.getRole(id);
		if(oRole.isPresent()){
			return oRole.get();
		}

		return null;


	}

	@PostMapping("/role")
	public Role ajouterModel(@RequestBody RoleDto nouveauRole) {
		
		return roleService.addRole(nouveauRole);
	}
    
}
