package com.example.disturbingparadox.annonceCovoiturage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceCovoiturageRepository extends JpaRepository<AnnonceCovoiturage, Long>{
    public List<AnnonceCovoiturage> findByNom(String nom);
}
