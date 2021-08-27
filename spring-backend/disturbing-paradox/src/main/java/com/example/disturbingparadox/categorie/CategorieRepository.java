package com.example.disturbingparadox.categorie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository <Categorie, Long> {

    public List<Categorie> findByLibelle(String libelle) ;
    
}
