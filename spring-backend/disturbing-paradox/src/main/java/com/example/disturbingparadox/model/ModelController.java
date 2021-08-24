package com.example.disturbingparadox.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ModelController {
    @Autowired
	ModelService modelService;

    @GetMapping("/model/{nom}")
	public List<Model>  getModel(@PathVariable String nom) {
		List<Model> marques = modelService.getModel(nom);

		return marques;


	}
    
}
