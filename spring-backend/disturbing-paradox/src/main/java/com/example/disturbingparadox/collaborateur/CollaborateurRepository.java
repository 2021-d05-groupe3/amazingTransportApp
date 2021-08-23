package com.example.disturbingparadox.collaborateur;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long>{
    
    public List<Collaborateur> findByName(String name);
    
}
