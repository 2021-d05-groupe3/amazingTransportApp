package com.example.disturbingparadox.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
    @Autowired
    ModelRepository modelRepository;

    public List<Model> getModel(String nom) {
	
		return  modelRepository.findByNom(nom);
        
		
	}

	public List<Model> getModels() {
        return modelRepository.findAll();
    }

  public Model addModel(ModelDto nouveauModel) {
	  Model model = new Model();
	  model.setNom(nouveauModel.nom);
	  
		return modelRepository.save(model);
	}
	
    
}
