package com.example.disturbingparadox.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository <Model, Long> {
    public List<Model> findByNom(String nom) ;
    
}
