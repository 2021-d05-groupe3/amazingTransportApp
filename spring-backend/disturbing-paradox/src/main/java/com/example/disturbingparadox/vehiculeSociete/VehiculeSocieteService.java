package com.example.disturbingparadox.vehiculeSociete;

import java.util.List;
import java.util.Optional;

import com.example.disturbingparadox.annonceCovoiturage.AnnonceCovoiturageRepository;

import com.example.disturbingparadox.categorie.Categorie;
import com.example.disturbingparadox.categorie.CategorieRepository;
import com.example.disturbingparadox.marque.Marque;
import com.example.disturbingparadox.marque.MarqueRepository;
import com.example.disturbingparadox.model.Model;
import com.example.disturbingparadox.model.ModelRepository;

import com.example.disturbingparadox.reservationVehiculeEntreprise.ReservationVehiculeEntrepriseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeSocieteService {

  @Autowired
  VehiculeSocieteRepository vehiculeSocieteRepository;
  @Autowired
  ReservationVehiculeEntrepriseRepository reservationVehiculeEntrepriseRepository;
  @Autowired
  CategorieRepository categorieRepository;
  @Autowired
  MarqueRepository marqueRepository;
  @Autowired
  ModelRepository modelRepository;
  @Autowired
  AnnonceCovoiturageRepository annonceCovoiturageRepository;

  public Optional<VehiculeSociete> getVehiculeSociete(Long id) {

    return vehiculeSocieteRepository.findById(id);
  }

  public List<VehiculeSociete> getVehiculeSocietes() {
    return vehiculeSocieteRepository.findAll();
  }

  public VehiculeSocieteDto addVehiculeSociete(VehiculeSocieteDto nouveauVehiculeSociete) {

    
    VehiculeSociete vehiculeSociete = new VehiculeSociete();
    vehiculeSociete.setStatut(nouveauVehiculeSociete.getStatut());
    vehiculeSociete.setImmatriculation(nouveauVehiculeSociete.getImmatriculation());
   

    
    Optional<Categorie> oCategorie = categorieRepository.findById(nouveauVehiculeSociete.getIdCategorie());
	  if(oCategorie.isPresent()){
		  vehiculeSociete.setCategorie(oCategorie.get());
      
	  }

    Optional<Marque> oMarque = marqueRepository.findById(nouveauVehiculeSociete.getVehiculeMarque());
	  if(oMarque.isPresent()){
		  vehiculeSociete.setVehiculeMarque(oMarque.get());
      
	  }

    Optional<Model> oModel = modelRepository.findById(nouveauVehiculeSociete.getVehiculeModel());
	  if(oModel.isPresent()){
		  vehiculeSociete.setVehiculeModel(oModel.get());
      
	  }
    VehiculeSociete nVehiculeSociete = vehiculeSocieteRepository.save(vehiculeSociete);
    VehiculeSocieteDto nVehiculeSocieteDto = new VehiculeSocieteDto();
    nVehiculeSocieteDto.setIdCategorie(nVehiculeSociete.getCategorie().getId());
    nVehiculeSocieteDto.setImmatriculation(nVehiculeSociete.getImmatriculation());
    nVehiculeSocieteDto.setVehiculeMarque(nVehiculeSociete.getVehiculeMarque().getId());
    nVehiculeSocieteDto.setVehiculeModel(nVehiculeSociete.getVehiculeModel().getId());
    nVehiculeSocieteDto.setIdVehicule(nVehiculeSociete.getId());
    nVehiculeSocieteDto.setStatut(nVehiculeSociete.getStatut());
   return nVehiculeSocieteDto;
  }

  public void deleteVehiculeSociete(Long id) {
    for (VehiculeSociete v : vehiculeSocieteRepository.findAll()) {
      if (id.equals(v.getId()))
      vehiculeSocieteRepository.delete(v);
    }
  }

}
