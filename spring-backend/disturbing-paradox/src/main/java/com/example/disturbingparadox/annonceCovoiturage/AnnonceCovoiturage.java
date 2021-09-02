package com.example.disturbingparadox.annonceCovoiturage;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.disturbingparadox.reservationCovoit.ReservationCovoit;
import com.example.disturbingparadox.vehicule.Vehicule;

@Entity
public class AnnonceCovoiturage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column()
    int nbrDePlaceRestante;
    LocalDateTime dateHDepart;
    String adresseDepart;
    String adresseArrivee;
 

    @ManyToOne// jointure plusieurs annonce peuvent avoir 1 vehicule
    @JoinColumn(name = "VEHICULE_ID")
    private Vehicule vehicule;

    @OneToMany(mappedBy = "annonceCovoiturage")//jointure 1 marque peut avoir plusieurs vehicules
    private Set<ReservationCovoit> reservationsCovoits;


    public AnnonceCovoiturage() {
    }
    
    public Long getId() {
        return id;
    }
   
    public int getNbrDePlaceRestante() {
        return nbrDePlaceRestante;
    }
    public void setNbrDePlaceRestante(int nbrDePlaceRestante) {
        this.nbrDePlaceRestante = nbrDePlaceRestante;
    }
    public LocalDateTime getDateHDepart() {
        return dateHDepart;
    }
    public void setDateHDepart(LocalDateTime dateHDepart) {
        this.dateHDepart = dateHDepart;
    }
    public String getAdresseDepart() {
        return adresseDepart;
    }
    public void setAdresseDepart(String adresseDepart) {
        this.adresseDepart = adresseDepart;
    }
    public String getAdresseArrivée() {
        return adresseArrivee;
    }
    public void setAdresseArrivée(String adresseArrivée) {
        this.adresseArrivee = adresseArrivée;
    }
  
   

    

    
    
}
