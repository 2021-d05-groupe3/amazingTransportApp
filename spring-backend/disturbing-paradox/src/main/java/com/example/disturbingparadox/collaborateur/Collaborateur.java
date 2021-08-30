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

import com.example.disturbingparadox.reservationCovoit.ReservationCovoit;
import com.example.disturbingparadox.reservationVehiculeEntreprise.ReservationVehiculeEntreprise;

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

    @Column()
    private String email;

 

    @OneToMany(mappedBy = "collaborateur")//jointure 1 colaborateur peut avoir plusieurs reservations
    private Set<ReservationCovoit> reservationsCovoits; 

    @OneToMany(mappedBy = "collaborateur")//jointure 1 collaborateur peut avoir plusieurs reservations
    private Set<ReservationVehiculeEntreprise> reservationVehiculeEntreprises; 

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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Collaborateur [email=" + email + ", firstName=" + firstName + ", id=" + id + ", name=" + name + "]";
    }

    

    
}
