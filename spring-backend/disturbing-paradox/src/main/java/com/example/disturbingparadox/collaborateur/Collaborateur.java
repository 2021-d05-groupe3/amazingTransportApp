package com.example.disturbingparadox.collaborateur;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Collaborateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String name;

    @Column()
    private String firstName;

    @OneToMany(mappedBy = "reservationCovoit")//jointure 1 colaborateur peut avoir plusieurs reservations
    private Set<ReservationCovoit> reservationsCovoits; 

    @OneToMany(mappedBy = "vehiculeEntreprise")//jointure 1 marque peut avoir plusieurs vehicules
    private Set<vehiculeEntreprise> vehiculesEntreprises; 

    public Collaborateur() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
}
