package com.example.disturbingparadox.vehicule;
import java.util.List;
import java.util.Optional;


import com.example.disturbingparadox.categorie.CategorieRepository;
import com.example.disturbingparadox.marque.Marque;
import com.example.disturbingparadox.marque.MarqueRepository;
import com.example.disturbingparadox.model.Model;
import com.example.disturbingparadox.model.ModelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehiculeService {
    @Autowired
    VehiculeRepository vehiculeRepository;
	@Autowired
	CategorieRepository categorieRepository;
	@Autowired
	ModelRepository modelRepository;
	@Autowired
	MarqueRepository marqueRepository;

    public Optional<Vehicule> getVehicule(Long id) {
	
		return  vehiculeRepository.findById(id);
        	
	}
  
  public List<Vehicule> getVehicules(){
		return vehiculeRepository.findAll();
	}

  public Vehicule addVehicule(VehiculeDto nouveauVehicule) {
	  Vehicule vehicule = new Vehicule();
	
	  Optional<Marque> oMarque = marqueRepository.findById(nouveauVehicule.getIdMarque());
	  if(oMarque.isPresent()){
		  vehicule.setVehiculeMarque(oMarque.get());
	  }

	  Optional<Model> oModel = modelRepository.findById(nouveauVehicule.getIdModel());
	  if(oModel.isPresent()){
		  vehicule.setVehiculeModel(oModel.get());
	  }
	
		return vehiculeRepository.save(vehicule);
	}


  public void deleteVehicule(Long id) {
		Optional<Vehicule> oVehicule = vehiculeRepository.findById(id);
		if(oVehicule.isPresent()){
			vehiculeRepository.delete(oVehicule.get());
		}
			
      
		
	}
    
}
