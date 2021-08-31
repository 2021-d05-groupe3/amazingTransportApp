package com.example.disturbingparadox.vehicule;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository <Vehicule, Long>{
    public List<Vehicule> findByNom(String nom) ;
    
}
