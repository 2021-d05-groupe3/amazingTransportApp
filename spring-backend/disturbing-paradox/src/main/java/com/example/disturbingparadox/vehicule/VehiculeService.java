package com.example.disturbingparadox.vehicule;
import java.util.List;
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
  
  public List<Vehicule> getVehicules(){
		return vehiculeRepository.findAll();
	}

  public void addVehicule(Vehicule nouveauVehicule) {
		vehiculeRepository.save(nouveauVehicule);
	}

  public void deleteVehicule(Long id) {
		for(Vehicule v: vehiculeRepository.findAll() ) {
			if(id.equals(v.getId()))
      vehiculeRepository.delete(v);
		}
	}
    
}
