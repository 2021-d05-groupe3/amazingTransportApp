package com.example.disturbingparadox.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ModelController {
    @Autowired
	ModelService modelService;

    @GetMapping("/model/{nom}")
	public List<Model>  getModel(@PathVariable String nom) {
		List<Model> marques = modelService.getModel(nom);

		return marques;


	}

	@PostMapping("/model")
	public Model ajouterMarque(@RequestBody ModelDto model) {
		
		return modelService.addModel(model);
	}
    
}
