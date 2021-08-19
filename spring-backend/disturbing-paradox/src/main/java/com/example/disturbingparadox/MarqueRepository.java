package com.example.disturbingparadox;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Long> {
    public List<Marque> findByNom(String nom) ;
    
}
