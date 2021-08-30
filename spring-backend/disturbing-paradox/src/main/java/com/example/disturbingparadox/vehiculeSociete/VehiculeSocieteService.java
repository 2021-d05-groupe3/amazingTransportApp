package com.example.disturbingparadox.vehiculeSociete;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeSocieteService {

  @Autowired
  VehiculeSocieteRepository vehiculeSocieteRepository;

  public Optional<VehiculeSociete> getVehiculeSociete(Long id) {

    return vehiculeSocieteRepository.findById(id);
  }

  public List<VehiculeSociete> getVehiculeSocietes() {
    return vehiculeSocieteRepository.findAll();
  }

  public VehiculeSociete addVehiculeSociete(VehiculeSociete nouveauVehiculeSociete) {
   return vehiculeSocieteRepository.save(nouveauVehiculeSociete);
  }

  public void deleteVehiculeSociete(Long id) {
    for (VehiculeSociete v : vehiculeSocieteRepository.findAll()) {
      if (id.equals(v.getId()))
      vehiculeSocieteRepository.delete(v);
    }
  }

}
