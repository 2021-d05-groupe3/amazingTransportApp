package com.example.disturbingparadox.vehiculeSociete;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeSocieteRepository extends JpaRepository<VehiculeSociete, Long>{
    public List<VehiculeSociete> findByNom(String nom) ;
    
}
