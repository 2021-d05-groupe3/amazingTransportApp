package com.example.disturbingparadox;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.disturbingparadox.vehicule.Vehicule;

@Entity
public class annonceCovoiturage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    int nbrDePlaceRestante;
    LocalDateTime dateHDepart;
    String adresseDepart;
    String adresseArrivée;
    Vehicule vehiculeId;
    
}
