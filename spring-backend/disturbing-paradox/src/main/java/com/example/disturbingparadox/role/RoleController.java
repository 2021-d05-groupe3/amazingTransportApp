package com.example.disturbingparadox.role;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RoleController {
    @Autowired
	RoleService roleService;

    @GetMapping("/vehicule/{nom}")
	public List<Role>  getVehicule(@PathVariable String nom) {
		List<Role> roles = roleService.getVehicule(nom);

		return roles;


	}
    
}
