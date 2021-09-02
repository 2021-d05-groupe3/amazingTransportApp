package com.example.disturbingparadox.marque;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.disturbingparadox.vehicule.Vehicule;

@Entity
public class Marque {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;

    @Column()
    String nom;
    String pays;


    @OneToMany(mappedBy = "vehiculeMarque", cascade = CascadeType.ALL)//jointure 1 marque peut avoir plusieurs vehicules
    private Set<Vehicule> vehicules;    


    public Marque() {
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Marque [id=" + id + ", nom=" + nom + ", pays=" + pays + ", vehicules=" + vehicules + "]";
    }

    
    
}

